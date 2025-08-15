package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: q5a  reason: default package */
public final class q5a implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ q5a(s5a s5a, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = s5a;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                q5a.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                q5a.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
