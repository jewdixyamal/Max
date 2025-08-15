package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: ke  reason: default package */
public final class ke extends Animatable2.AnimationCallback {
    public final /* synthetic */ le a;

    public ke(le leVar) {
        this.a = leVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
