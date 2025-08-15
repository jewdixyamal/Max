package defpackage;

import java.util.Collections;

/* renamed from: wy2  reason: default package */
public final /* synthetic */ class wy2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ wy2(jz2 jz2, long j, int i) {
        this.a = i;
        this.b = jz2;
        this.c = j;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                p82 l = this.b.l();
                long j = this.c;
                e52 F = l.F(j);
                if (F != null && (F.C() || F.R())) {
                    return F;
                }
                return l.b(j92.a, Collections.singletonList(Long.valueOf(j)), (String) null, (String) null);
            default:
                return this.b.l().z(this.c);
        }
    }
}
