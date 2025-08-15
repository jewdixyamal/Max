package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: p5a  reason: default package */
public final class p5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ p5a(s5a s5a, Drawable drawable, int i) {
        this.a = i;
        this.b = s5a;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                p5a.super.invalidateDrawable(this.c);
                return;
            default:
                p5a.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
