package defpackage;

import android.view.View;

/* renamed from: yk9  reason: default package */
public final /* synthetic */ class yk9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl9 b;

    public /* synthetic */ yk9(dl9 dl9, int i) {
        this.a = i;
        this.b = dl9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.n(new fj0(28));
                return;
            default:
                this.b.n(new al9(1));
                return;
        }
    }
}
