package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: h2a  reason: default package */
public class h2a extends TextView {
    public aof a;

    public h2a(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final aof getObserverSpanListener() {
        return this.a;
    }

    public final void onWindowVisibilityChanged(int i) {
        aof aof;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            aof aof2 = this.a;
            if (aof2 != null) {
                aof2.onViewAttachedToWindow(this);
            }
        } else if (i == 8 && (aof = this.a) != null) {
            aof.onViewDetachedFromWindow(this);
        }
    }

    public final void setObserverSpanListener(aof aof) {
        this.a = aof;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
