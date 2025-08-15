package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: j53  reason: default package */
public final class j53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ j53(k53 k53, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = k53;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                j53.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                j53.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
