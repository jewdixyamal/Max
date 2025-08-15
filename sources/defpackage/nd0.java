package defpackage;

import android.content.Context;

/* renamed from: nd0  reason: default package */
public final /* synthetic */ class nd0 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nd0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                fka fka = (fka) obj;
                qp4.u0.b(this.b).i().getIcon();
                return -1;
            case 1:
                fka fka2 = (fka) obj;
                qp4.u0.b(this.b).i().b();
                return -1728053248;
            default:
                CharSequence b2 = ((jqe) obj).b(this.b);
                return b2 == null ? "" : b2;
        }
    }
}
