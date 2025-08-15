package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ed5  reason: default package */
public final class ed5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ fd5 c;

    public /* synthetic */ ed5(fd5 fd5, List list, int i) {
        this.a = i;
        this.c = fd5;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                fd5 fd5 = this.c;
                ilc ilc = fd5.a;
                ilc.c();
                try {
                    fd5.b.B(this.b);
                    ilc.r();
                    ilc.l();
                    return null;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                StringBuilder l = au1.l("DELETE FROM favorite_sticker_sets WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                a14.c(l, list == null ? 1 : list.size());
                l.append(")");
                String sb = l.toString();
                fd5 fd52 = this.c;
                q36 d = fd52.a.d(sb);
                if (list == null) {
                    d.W(1);
                } else {
                    for (Long l2 : list) {
                        if (l2 == null) {
                            d.W(i);
                        } else {
                            d.j(i, l2.longValue());
                        }
                        i++;
                    }
                }
                ilc ilc2 = fd52.a;
                ilc2.c();
                try {
                    d.n();
                    ilc2.r();
                    ilc2.l();
                    return null;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
        }
    }
}
