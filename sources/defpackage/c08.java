package defpackage;

import java.util.Comparator;

/* renamed from: c08  reason: default package */
public final class c08 implements Comparator {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ c08(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final int compare(Object obj, Object obj2) {
        Long l;
        switch (this.a) {
            case 0:
                e08 e08 = (e08) obj2;
                return ((e08) obj).c == this.b ? -1 : 0;
            case 1:
                kzc kzc = (kzc) obj2;
                e52 e52 = kzc.o;
                Long l2 = null;
                long j = this.b;
                if (e52 == null || !e52.b.f(j)) {
                    e52 e522 = kzc.o;
                    l = e522 != null ? Long.valueOf(e522.m()) : null;
                } else {
                    l = Long.MAX_VALUE;
                }
                kzc kzc2 = (kzc) obj;
                e52 e523 = kzc2.o;
                if (e523 == null || !e523.b.f(j)) {
                    e52 e524 = kzc2.o;
                    if (e524 != null) {
                        l2 = Long.valueOf(e524.m());
                    }
                } else {
                    l2 = Long.MAX_VALUE;
                }
                return xfg.f(l, l2);
            default:
                long j2 = this.b;
                return xfg.f(new ft4(((urf) obj2).b(j2)), new ft4(((urf) obj).b(j2)));
        }
    }
}
