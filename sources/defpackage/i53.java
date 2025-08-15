package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: i53  reason: default package */
public final class i53 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ k53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ i53(k53 k53, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = k53;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                i53.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                i53.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
