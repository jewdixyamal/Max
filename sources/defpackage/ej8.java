package defpackage;

import java.util.List;

/* renamed from: ej8  reason: default package */
public final /* synthetic */ class ej8 implements pj8, qj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ej8(sj8 sj8, int i, int i2) {
        this.a = i2;
        this.b = sj8;
        this.c = i;
    }

    public void b(x4b x4b, oh8 oh8, List list) {
        switch (this.a) {
            case 1:
                x4b.d0(this.b.J0(oh8, x4b, this.c), list);
                return;
            case 2:
                sj8 sj8 = this.b;
                sj8.getClass();
                int size = list.size();
                int i = this.c;
                if (size == 1) {
                    x4b.A0(sj8.J0(oh8, x4b, i), (tb8) list.get(0));
                    return;
                } else {
                    x4b.s0(list, sj8.J0(oh8, x4b, i), sj8.J0(oh8, x4b, i + 1));
                    return;
                }
            default:
                x4b.d0(this.b.J0(oh8, x4b, this.c), list);
                return;
        }
    }

    public void f(x4b x4b, oh8 oh8) {
        switch (this.a) {
            case 0:
                x4b.Z(this.b.J0(oh8, x4b, this.c));
                return;
            default:
                x4b.S(this.b.J0(oh8, x4b, this.c));
                return;
        }
    }
}
