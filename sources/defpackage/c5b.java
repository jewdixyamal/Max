package defpackage;

import java.util.ArrayList;

/* renamed from: c5b  reason: default package */
public final /* synthetic */ class c5b implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5b b;

    public /* synthetic */ c5b(d5b d5b, int i) {
        this.a = i;
        this.b = d5b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ga6 ga6 = this.b.b;
                return ga6 != null ? ga6.c() : ote.c;
            case 1:
                return j1e.j(this.b.b != null ? new ArrayList(0) : null);
            default:
                d5b d5b = this.b;
                return Integer.valueOf(nu0.r(d5b, (r6d[]) d5b.j.getValue()));
        }
    }
}
