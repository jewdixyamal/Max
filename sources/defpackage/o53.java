package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: o53  reason: default package */
public final class o53 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ o53(q53 q53, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = q53;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                o53.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                o53.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
