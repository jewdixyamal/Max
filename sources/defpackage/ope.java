package defpackage;

import android.view.View;

/* renamed from: ope  reason: default package */
public final /* synthetic */ class ope implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ppe b;

    public /* synthetic */ ope(ppe ppe, int i) {
        this.a = i;
        this.b = ppe;
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
