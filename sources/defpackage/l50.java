package defpackage;

import android.view.View;

/* renamed from: l50  reason: default package */
public final /* synthetic */ class l50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p50 b;
    public final /* synthetic */ k50 c;

    public /* synthetic */ l50(p50 p50, k50 k50, int i) {
        this.a = i;
        this.b = p50;
        this.c = k50;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k50 k50 = this.c;
                this.b.a.invoke(new b19(k50.b, k50));
                return;
            default:
                k50 k502 = this.c;
                this.b.a.invoke(new b19(k502.b, k502));
                return;
        }
    }
}
