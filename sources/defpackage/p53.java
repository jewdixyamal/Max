package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: p53  reason: default package */
public final class p53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ p53(q53 q53, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = q53;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                p53.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                p53.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
