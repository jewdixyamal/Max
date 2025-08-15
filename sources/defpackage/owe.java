package defpackage;

import android.view.View;

/* renamed from: owe  reason: default package */
public final /* synthetic */ class owe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qka b;

    public /* synthetic */ owe(qka qka, int i) {
        this.a = i;
        this.b = qka;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((kka) this.b).a.invoke(view);
                return;
            case 1:
                ((lka) this.b).a.invoke(view);
                return;
            default:
                ((vka) ((oka) this.b).a).b.invoke(view);
                return;
        }
    }
}
