package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: r5a  reason: default package */
public final class r5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ r5a(s5a s5a, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = s5a;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                r5a.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                r5a.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
