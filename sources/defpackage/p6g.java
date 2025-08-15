package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: p6g  reason: default package */
public abstract class p6g extends v6g {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public v27[] d;
    public v27 e = null;
    public x6g f;
    public v27 g;

    public p6g(x6g x6g, WindowInsets windowInsets) {
        super(x6g);
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private v27 r(int i2, boolean z) {
        v27 v27 = v27.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                v27 = v27.a(v27, s(i3, z));
            }
        }
        return v27;
    }

    private v27 t() {
        x6g x6g = this.f;
        return x6g != null ? x6g.a.h() : v27.e;
    }

    private v27 u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                w();
            }
            Method method = i;
            if (!(method == null || j == null || k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect != null) {
                        return v27.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    e2.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
        h = true;
    }

    public void d(View view) {
        v27 u = u(view);
        if (u == null) {
            u = v27.e;
        }
        x(u);
    }

    public v27 f(int i2) {
        return r(i2, false);
    }

    public final v27 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = v27.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public boolean n() {
        return this.c.isRound();
    }

    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !v(i3)) {
                return false;
            }
        }
        return true;
    }

    public void p(v27[] v27Arr) {
        this.d = v27Arr;
    }

    public void q(x6g x6g) {
        this.f = x6g;
    }

    public v27 s(int i2, boolean z) {
        int i3;
        if (i2 == 1) {
            return z ? v27.b(0, Math.max(t().b, j().b), 0, 0) : v27.b(0, j().b, 0, 0);
        }
        v27 v27 = null;
        if (i2 != 2) {
            v27 v272 = v27.e;
            if (i2 == 8) {
                v27[] v27Arr = this.d;
                if (v27Arr != null) {
                    v27 = v27Arr[3];
                }
                if (v27 != null) {
                    return v27;
                }
                v27 j2 = j();
                v27 t = t();
                int i4 = j2.d;
                if (i4 > t.d) {
                    return v27.b(0, 0, 0, i4);
                }
                v27 v273 = this.g;
                return (v273 == null || v273.equals(v272) || (i3 = this.g.d) <= t.d) ? v272 : v27.b(0, 0, 0, i3);
            } else if (i2 == 16) {
                return i();
            } else {
                if (i2 == 32) {
                    return g();
                }
                if (i2 == 64) {
                    return k();
                }
                if (i2 != 128) {
                    return v272;
                }
                x6g x6g = this.f;
                tl4 e2 = x6g != null ? x6g.a.e() : e();
                if (e2 == null) {
                    return v272;
                }
                DisplayCutout displayCutout = e2.a;
                return v27.b(sl4.d(displayCutout), sl4.f(displayCutout), sl4.e(displayCutout), sl4.c(displayCutout));
            }
        } else if (z) {
            v27 t2 = t();
            v27 h2 = h();
            return v27.b(Math.max(t2.a, h2.a), 0, Math.max(t2.c, h2.c), Math.max(t2.d, h2.d));
        } else {
            v27 j3 = j();
            x6g x6g2 = this.f;
            if (x6g2 != null) {
                v27 = x6g2.a.h();
            }
            int i5 = j3.d;
            if (v27 != null) {
                i5 = Math.min(i5, v27.d);
            }
            return v27.b(j3.a, 0, j3.c, i5);
        }
    }

    public boolean v(int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                return false;
            }
            if (!(i2 == 8 || i2 == 128)) {
                return true;
            }
        }
        return !s(i2, false).equals(v27.e);
    }

    public void x(v27 v27) {
        this.g = v27;
    }
}
