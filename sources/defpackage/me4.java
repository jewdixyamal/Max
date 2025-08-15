package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: me4  reason: default package */
public final class me4 extends h0f {
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    public me4(Context context) {
        i(context);
        j(context);
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }

    public final void a(c0f c0f) {
        this.A.put(c0f.a, c0f);
    }

    public final j0f b() {
        return new oe4(this);
    }

    public final h0f c() {
        super.c();
        return this;
    }

    public final h0f f(int i, int i2) {
        super.f(i, i2);
        return this;
    }

    public final void g() {
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
    }

    public final h0f h(String[] strArr) {
        this.n = h0f.e(strArr);
        return this;
    }

    public final void i(Context context) {
        CaptioningManager captioningManager;
        int i = oaf.a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.u = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.t = zw6.n(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
    }

    public final void j(Context context) {
        Point point;
        int i = oaf.a;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        int displayId = display.getDisplayId();
        int i2 = oaf.a;
        if (displayId == 0 && oaf.P(context)) {
            String G2 = i2 < 28 ? oaf.G("sys.display-size") : oaf.G("vendor.display-size");
            if (!TextUtils.isEmpty(G2)) {
                try {
                    String[] split = G2.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            f(point.x, point.y);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                z04.u("Invalid display size: " + G2);
            }
            if ("Sony".equals(oaf.c) && oaf.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                f(point.x, point.y);
            }
        }
        point = new Point();
        if (i2 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        f(point.x, point.y);
    }

    public me4(oe4 oe4) {
        d(oe4);
        this.C = oe4.i0;
        this.D = oe4.j0;
        this.E = oe4.k0;
        this.F = oe4.l0;
        this.G = oe4.m0;
        this.H = oe4.n0;
        this.I = oe4.o0;
        this.J = oe4.p0;
        this.K = oe4.q0;
        this.L = oe4.r0;
        this.M = oe4.s0;
        this.N = oe4.t0;
        this.O = oe4.u0;
        this.P = oe4.v0;
        this.Q = oe4.w0;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = oe4.x0;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.R = sparseArray;
                this.S = oe4.y0.clone();
                return;
            }
        }
    }

    public me4() {
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }
}
