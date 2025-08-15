package defpackage;

import android.view.View;

/* renamed from: pwe  reason: default package */
public final /* synthetic */ class pwe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ska b;

    public /* synthetic */ pwe(ska ska, int i) {
        this.a = i;
        this.b = ska;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((rka) this.b).a.invoke(view);
                return;
            case 1:
                ((mka) this.b).a.invoke(view);
                return;
            default:
                ((lka) this.b).a.invoke(view);
                return;
        }
    }
}
