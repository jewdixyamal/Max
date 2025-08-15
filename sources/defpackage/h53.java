package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: h53  reason: default package */
public final class h53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k53 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ h53(k53 k53, Drawable drawable, int i) {
        this.a = i;
        this.b = k53;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                h53.super.invalidateDrawable(this.c);
                return;
            default:
                h53.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
