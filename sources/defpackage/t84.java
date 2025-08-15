package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: t84  reason: default package */
public final class t84 extends u84 implements p43, kre {
    public final j0e X;
    public boolean Y;
    public final ContextScope Z;
    public Drawable o;

    public t84(Drawable drawable, w7c w7c, cx7 cx7) {
        this.o = drawable;
        this.X = w7c;
        ContextScope a = j1e.a(cx7);
        this.Z = a;
        od2.L(new zn5(w7c, new lq0(2, this, t84.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/OneMeTheme;)V", 4, 16), 5), a);
    }

    public final Drawable J() {
        Drawable drawable = this.o;
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        if (mutate != drawable) {
            mutate.setBounds(drawable.getBounds());
        }
        if (mutate instanceof kre) {
            ((kre) mutate).onThemeChanged((fka) this.X.getValue());
        }
        return mutate;
    }

    public final void close() {
        j1e.i(this.Z, (CancellationException) null);
        Drawable drawable = this.o;
        Closeable closeable = drawable instanceof Closeable ? (Closeable) drawable : null;
        if (closeable != null) {
            closeable.close();
        }
        this.o = null;
        this.Y = true;
    }

    public final int getHeight() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicHeight());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    public final int getWidth() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final boolean isClosed() {
        return this.Y;
    }

    public final boolean isStateful() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    public final void onThemeChanged(fka fka) {
        Drawable drawable = this.o;
        kre kre = drawable instanceof kre ? (kre) drawable : null;
        if (kre != null) {
            kre.onThemeChanged(fka);
        }
    }
}
