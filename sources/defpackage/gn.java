package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: gn  reason: default package */
public final class gn {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static gn c;
    public oic a;

    public static synchronized gn a() {
        gn gnVar;
        synchronized (gn.class) {
            try {
                if (c == null) {
                    d();
                }
                gnVar = c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return gnVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (gn.class) {
            g = oic.g(i, mode);
        }
        return g;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [gn, java.lang.Object] */
    public static synchronized void d() {
        synchronized (gn.class) {
            if (c == null) {
                ? obj = new Object();
                c = obj;
                obj.a = oic.c();
                oic oic = c.a;
                q40 q40 = new q40();
                synchronized (oic) {
                    oic.e = q40;
                }
            }
        }
    }

    public static void e(Drawable drawable, qh3 qh3, int[] iArr) {
        PorterDuff.Mode mode = oic.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = qh3.c;
            if (z || qh3.b) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? (ColorStateList) qh3.d : null;
                PorterDuff.Mode mode2 = qh3.b ? (PorterDuff.Mode) qh3.e : oic.f;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = oic.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
