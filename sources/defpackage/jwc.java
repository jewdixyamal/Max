package defpackage;

import android.view.View;

/* renamed from: jwc  reason: default package */
public final /* synthetic */ class jwc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwc b;

    public /* synthetic */ jwc(rwc rwc, int i) {
        this.a = i;
        this.b = rwc;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a.invoke();
                return;
            case 1:
                this.b.c.invoke();
                return;
            default:
                this.b.s0.invoke();
                return;
        }
    }
}
