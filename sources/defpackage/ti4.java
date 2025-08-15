package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ti4  reason: default package */
public final class ti4 extends ri4 {
    public static int m = -1;
    public static Size n;
    public final u8e g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public t9f k;
    public final AtomicReference l = new AtomicReference((Object) null);

    public ti4(Context context, m7b m7b, u8e u8e, je7 je7, je7 je72, je7 je73) {
        super(context, m7b, je73);
        this.g = u8e;
        this.h = je7;
        this.i = je72;
        this.j = je73;
    }

    public static Size i(Context context) {
        Size size = n;
        if (size == null) {
            size = new Size(s5c.G(context).getWidth(), s5c.G(context).getHeight());
        }
        n = size;
        return size;
    }

    public final boolean c() {
        lqf lqf = (lqf) this.j.getValue();
        return lqf != null && lqf.h > 0;
    }

    public final void e() {
        je7 je7 = this.h;
        ((x6a) je7.getValue()).getClass();
        ((x6a) je7.getValue()).getClass();
    }

    public final void f(String str) {
        lqf lqf = (lqf) this.j.getValue();
        if (lqf != null) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "lqf", "onForegroundServiceStarted:".concat(str), (Throwable) null);
            }
            lqf.h++;
        }
    }

    public final void g(String str) {
        int i2;
        lqf lqf = (lqf) this.j.getValue();
        if (lqf != null) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "lqf", "onForegroundServiceStropped:".concat(str), (Throwable) null);
            }
            int i3 = lqf.h;
            if (i3 <= 0) {
                i2 = 0;
            } else {
                i2 = i3 - 1;
                lqf.h = i2;
            }
            lqf.h = i2;
        }
    }

    public final t9f h() {
        String str;
        p7b p7b = (p7b) this.b;
        p7b.a.j.getClass();
        bcf.a.b().getClass();
        ((x6a) this.h.getValue()).getClass();
        t9f t9f = this.k;
        if (!tpa.f(t9f != null ? t9f.b : null, "25.8.1")) {
            this.k = null;
        }
        t9f t9f2 = this.k;
        if (t9f2 == null) {
            String format = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
            String r = p7b.a.r();
            if (oag.t(r)) {
                r = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            }
            String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            String j2 = rh4.j(Build.MANUFACTURER, " ", Build.MODEL);
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int i2 = displayMetrics.densityDpi;
            if (i2 == 120) {
                str = "ldpi";
            } else if (i2 == 160) {
                str = "mdpi";
            } else if (i2 == 240) {
                str = "hdpi";
            } else if (i2 == 320) {
                str = "xhdpi";
            } else if (i2 == 480) {
                str = "xxhdpi";
            } else if (i2 != 640) {
                str = i2 + "dpi";
            } else {
                str = "xxxhdpi";
            }
            this.g.getClass();
            t9f2 = new t9f(format, r, language, j2, str + " " + i2 + "dpi " + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
            this.k = t9f2;
        }
        return t9f2;
    }

    public final int j() {
        int i2 = m;
        if (i2 != -1) {
            return i2;
        }
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        m = dimensionPixelSize;
        return dimensionPixelSize;
    }
}
