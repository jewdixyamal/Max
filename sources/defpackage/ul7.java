package defpackage;

/* renamed from: ul7  reason: default package */
public final class ul7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl7 b;

    public /* synthetic */ ul7(wl7 wl7, int i) {
        this.a = i;
        this.b = wl7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                es4 es4 = this.b.c;
                if (es4 != null) {
                    es4.setListSelectionHidden(true);
                    es4.requestLayout();
                    return;
                }
                return;
            default:
                wl7 wl7 = this.b;
                es4 es42 = wl7.c;
                if (es42 != null && es42.isAttachedToWindow() && wl7.c.getCount() > wl7.c.getChildCount() && wl7.c.getChildCount() <= wl7.x0) {
                    wl7.K0.setInputMethodMode(2);
                    wl7.f();
                    return;
                }
                return;
        }
    }
}
