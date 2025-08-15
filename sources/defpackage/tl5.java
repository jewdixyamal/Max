package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: tl5  reason: default package */
public final class tl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl5 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ wl5 o;

    public /* synthetic */ tl5(yl5 yl5, TextView textView, wl5 wl5, int i) {
        this.a = i;
        this.b = yl5;
        this.c = textView;
        this.o = wl5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                yl5 yl5 = this.b;
                boolean z = yl5.b;
                wl5 wl5 = this.o;
                TextView textView = this.c;
                if (z) {
                    pla.a(textView, new tl5((View) textView, textView, yl5, wl5));
                    return;
                }
                textView.invalidate();
                wl5.c.set(false);
                return;
            case 1:
                yl5 yl52 = this.b;
                boolean z2 = yl52.b;
                wl5 wl52 = this.o;
                TextView textView2 = this.c;
                if (z2) {
                    pla.a(textView2, new tl5((View) textView2, textView2, yl52, wl52));
                    return;
                }
                textView2.invalidate();
                wl52.c.set(false);
                return;
            default:
                qqe.b(this.c, this.b);
                this.o.c.set(false);
                return;
        }
    }

    public tl5(View view, TextView textView, yl5 yl5, wl5 wl5) {
        this.a = 2;
        this.c = textView;
        this.b = yl5;
        this.o = wl5;
    }
}
