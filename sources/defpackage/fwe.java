package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: fwe  reason: default package */
public final /* synthetic */ class fwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ fwe(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                iwe iwe = this.b.a1;
                br8 br8 = iwe == null ? null : iwe.b;
                if (br8 != null) {
                    br8.collapseActionView();
                    return;
                }
                return;
            default:
                this.b.n();
                return;
        }
    }
}
