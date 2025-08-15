package defpackage;

import java.util.List;

/* renamed from: bx5  reason: default package */
public final /* synthetic */ class bx5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;
    public final /* synthetic */ wja c;

    public /* synthetic */ bx5(x30 x30, wja wja, int i) {
        this.a = i;
        this.b = x30;
        this.c = wja;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                x30 x30 = this.b;
                List list = (List) x30.s0;
                if (list != null) {
                    this.c.k();
                    ((iv) x30.t0).b(list, (Runnable) null);
                }
                x30.s0 = null;
                return e5f.a;
            default:
                x30 x302 = this.b;
                cx5 cx5 = (cx5) x302.c;
                if (cx5 != null) {
                    this.c.l(cx5);
                }
                x302.c = null;
                x302.o = null;
                iv ivVar = (iv) x302.t0;
                x302.s0 = ivVar.f;
                ivVar.b((List) null, (Runnable) null);
                return e5f.a;
        }
    }
}
