package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cy8  reason: default package */
public final /* synthetic */ class cy8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ cy8(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                dy8.setStartDrawable$lambda$6(this.b);
                return;
            default:
                ((AnimationDrawable) this.b).start();
                return;
        }
    }
}
