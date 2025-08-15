package defpackage;

import android.content.Context;

/* renamed from: ma1  reason: default package */
public final /* synthetic */ class ma1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7b b;

    public /* synthetic */ ma1(h7b h7b, int i) {
        this.a = i;
        this.b = h7b;
    }

    public final Object invoke(Object obj) {
        fka fka = (fka) obj;
        switch (this.a) {
            case 0:
                return Integer.valueOf(qp4.u0.b((Context) this.b.b).i().getText().g);
            default:
                return Integer.valueOf(qp4.u0.b((Context) this.b.b).i().getText().j);
        }
    }
}
