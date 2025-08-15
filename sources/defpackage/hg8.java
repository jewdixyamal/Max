package defpackage;

import android.view.View;

/* renamed from: hg8  reason: default package */
public final class hg8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg8 b;

    public /* synthetic */ hg8(pg8 pg8, int i) {
        this.a = i;
        this.b = pg8;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return;
            default:
                pg8 pg8 = this.b;
                if (pg8.t0.g()) {
                    pg8.Y.getClass();
                    eh8.g(2);
                }
                pg8.dismiss();
                return;
        }
    }
}
