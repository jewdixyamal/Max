package defpackage;

import android.view.View;

/* renamed from: wkd  reason: default package */
public final /* synthetic */ class wkd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xkd b;

    public /* synthetic */ wkd(xkd xkd, int i) {
        this.a = i;
        this.b = xkd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((View) this.b.getParent()).performClick();
                return;
            default:
                ((View) this.b.getParent()).performClick();
                return;
        }
    }
}
