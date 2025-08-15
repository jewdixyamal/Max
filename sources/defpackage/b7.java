package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: b7  reason: default package */
public final class b7 extends ir8 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ e7 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b7(e7 e7Var, Context context, wq8 wq8, View view) {
        super(vsb.actionOverflowMenuStyle, 0, wq8, context, view, true);
        this.n = e7Var;
        this.g = 8388613;
        qqd qqd = e7Var.H0;
        this.i = qqd;
        gr8 gr8 = this.j;
        if (gr8 != null) {
            gr8.g(qqd);
        }
    }

    public final void c() {
        switch (this.m) {
            case 0:
                this.n.E0 = null;
                super.c();
                return;
            default:
                e7 e7Var = this.n;
                wq8 wq8 = e7Var.c;
                if (wq8 != null) {
                    wq8.c(true);
                }
                e7Var.D0 = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b7(e7 e7Var, Context context, qae qae, View view) {
        super(vsb.actionOverflowMenuStyle, 0, qae, context, view, false);
        this.n = e7Var;
        if (!qae.L0.f()) {
            View view2 = e7Var.t0;
            this.f = view2 == null ? (View) e7Var.s0 : view2;
        }
        qqd qqd = e7Var.H0;
        this.i = qqd;
        gr8 gr8 = this.j;
        if (gr8 != null) {
            gr8.g(qqd);
        }
    }
}
