package defpackage;

import android.view.View;

/* renamed from: bh7  reason: default package */
public final class bh7 implements eh7, View.OnAttachStateChangeListener {
    public gh7 a;

    public final gh7 Q() {
        return this.a;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == fg7.a) {
            this.a = new gh7(this);
        }
        this.a.d(eg7.ON_START);
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(fg7.c)) {
            this.a.d(eg7.ON_DESTROY);
        }
    }
}
