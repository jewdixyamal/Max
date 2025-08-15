package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: n53  reason: default package */
public final class n53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ n53(q53 q53, Drawable drawable, int i) {
        this.a = i;
        this.b = q53;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                n53.super.invalidateDrawable(this.c);
                return;
            default:
                n53.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
