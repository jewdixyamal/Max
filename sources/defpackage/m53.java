package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: m53  reason: default package */
public final class m53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ m53(q53 q53, Drawable drawable, int i) {
        this.a = i;
        this.b = q53;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                m53.super.invalidateDrawable(this.c);
                return;
            default:
                m53.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
