package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.services.PipWorker;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: o1b  reason: default package */
public final class o1b implements ComponentCallbacks, kn5, kj9 {
    public final o45 A0;
    public lj9 B0;
    public FloatingVideoView C0;
    public jn5 D0;
    public pj9 E0;
    public l20 F0;
    public es8 G0;
    public e52 H0;
    public final HashSet I0 = new HashSet();
    public long J0;
    public volatile boolean K0 = false;
    public final tg X;
    public final au8 Y;
    public final dlf Z;
    public final Context a;
    public final ef7 b;
    public final ti4 c;
    public final p7b o;
    public final bk4 s0;
    public final hle t0;
    public final ke7 u0;
    public final o20 v0;
    public final k1b w0;
    public final y1b x0;
    public final av0 y0;
    public final p82 z0;

    public o1b(Context context, ef7 ef7, ti4 ti4, p7b p7b, tg tgVar, au8 au8, dlf dlf, hle hle, qz7 qz7, o20 o20, y1b y1b, av0 av0, p82 p82, o45 o45) {
        this.a = context;
        this.b = ef7;
        this.c = ti4;
        this.o = p7b;
        this.X = tgVar;
        this.Y = au8;
        this.Z = dlf;
        this.t0 = hle;
        this.u0 = qz7;
        this.v0 = o20;
        this.x0 = y1b;
        this.w0 = new k1b(context, this);
        this.y0 = av0;
        this.z0 = p82;
        this.A0 = o45;
        this.s0 = bk4.b();
        context.registerComponentCallbacks(this);
    }

    public final void G() {
        e(true);
    }

    public final void L() {
    }

    public final void P(int i, int i2, int i3) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            floatingVideoView.c(i, i2);
        }
    }

    public final void T() {
        lj9 lj9 = this.B0;
        if (lj9 != null) {
            lj9.k1(true);
        }
    }

    public final void X() {
        if (this.H0 != null && this.F0 != null) {
            this.K0 = false;
        }
    }

    public final void Y(Throwable th) {
        Context context = this.a;
        a14.N(0, context, zqe.b(context, th));
    }

    public final int[] a(Context context) {
        int i;
        int i2;
        WindowManager z = nd7.z(context);
        this.c.getClass();
        Size i3 = ti4.i(context);
        int rotation = z.getDefaultDisplay().getRotation();
        if (rotation == 1 || rotation == 3) {
            i = i3.getHeight();
            i2 = i3.getWidth();
        } else {
            i = i3.getWidth();
            i2 = i3.getHeight();
        }
        return new int[]{i, i2};
    }

    public final void b(int i) {
        if (this.B0 != null && this.H0 != null) {
            int s = au1.s(i);
            if (s == 0) {
                this.B0.S0();
                this.K0 = true;
            } else if (s == 1) {
                this.B0.pause();
                this.K0 = false;
            } else if (s == 2) {
                e(true);
            }
        }
    }

    public final void c(boolean z) {
        pj9 pj9 = this.E0;
        if (pj9 != null) {
            uk9 uk9 = (uk9) ((kk9) pj9.b);
            if (uk9.Z != z) {
                if (z) {
                    mi6.VIRTUAL_KEY.b(uk9.Y);
                }
                uk9.Z = z;
                uk9.c();
            }
        }
    }

    public final void d(Context context, e52 e52, es8 es8, l20 l20, Rect rect, boolean z) {
        lj9 lj9;
        Context context2 = context;
        e52 e522 = e52;
        es8 es82 = es8;
        l20 l202 = l20;
        Rect rect2 = rect;
        e(false);
        this.J0 = SystemClock.elapsedRealtime();
        this.F0 = l202;
        this.G0 = es82;
        this.H0 = e522;
        WindowManager z2 = nd7.z(context);
        FloatingVideoView floatingVideoView = new FloatingVideoView(context2);
        this.C0 = floatingVideoView;
        floatingVideoView.setListener(this);
        int[] a2 = a(context);
        FloatingVideoView floatingVideoView2 = this.C0;
        int i = a2[0];
        int i2 = a2[1];
        floatingVideoView2.o = i;
        floatingVideoView2.s0 = i2;
        s36.o().f(wv6.b((s5c.P(l20) ? l202.j.d.d : l202.d).d), (t68) null);
        float f = (float) this.s0.f;
        kl9 kl9 = new kl9(context2, this.X, new float[]{f, f, f, f, f, f, f, f});
        o45 o45 = this.A0;
        ti4 ti4 = this.c;
        dlf dlf = this.Z;
        hle hle = this.t0;
        ef7 ef7 = this.b;
        o45 o452 = o45;
        lj9 lj92 = r0;
        dlf dlf2 = dlf;
        kl9 kl92 = kl9;
        kl9 kl93 = kl92;
        WindowManager windowManager = z2;
        es8 es83 = es82;
        lj9 lj93 = new lj9(kl9, (we8) this.u0.get(), dlf2, hle, ef7, this.v0, this.Y, this.o, this, o452, ti4, false, true);
        lj9 lj94 = lj92;
        this.B0 = lj94;
        lj94.Z1(l20, e522.b.a, es8.a, 1, true);
        this.C0.setVisibility(4);
        this.C0.addView((View) kl93.c);
        this.C0.c(this.B0.R(), this.B0.M0());
        int width = rect.width();
        int height = rect.height();
        if (!(this.C0 == null || (lj9 = this.B0) == null)) {
            int R = lj9.R();
            int M0 = this.B0.M0();
            if (R > 0 && M0 > 0) {
                width = R;
                height = M0;
            }
            this.C0.c(width, height);
        }
        p7b p7b = this.o;
        t33 t33 = p7b.a;
        t33.getClass();
        ne7 ne7 = t33.g;
        Point point = new Point(ne7.getInt("app.video.pip.pos.x", 0), ne7.getInt("app.video.pip.pos.y", 0));
        if (point.x == 0 && point.y == 0) {
            point.x = this.C0.getLeftMargin();
            point.y = this.C0.getTopMargin();
        }
        FloatingVideoView floatingVideoView3 = this.C0;
        int i3 = point.x;
        int i4 = point.y;
        WindowManager.LayoutParams layoutParams = floatingVideoView3.B0;
        layoutParams.x = i3;
        layoutParams.y = i4;
        floatingVideoView3.b(true);
        FloatingVideoView floatingVideoView4 = this.C0;
        WindowManager windowManager2 = windowManager;
        windowManager2.addView(floatingVideoView4, floatingVideoView4.getWindowManagerLayoutParams());
        Uri a3 = this.v0.a(l20);
        if (!p7b.c.u() || a3 == null || !z) {
            Context context3 = context;
            g(false);
        } else {
            this.C0.setVisibility(4);
            jn5 jn5 = new jn5(context);
            this.D0 = jn5;
            Rect rect3 = rect;
            jn5.b(a3, rect3.left, rect3.top, rect.width(), rect.height());
            this.D0.setListener(new n1b(this));
            jn5 jn52 = this.D0;
            windowManager2.addView(jn52, jn52.getWindowLayoutParams());
            this.D0.a(this.C0.getXPos(), this.C0.getYPos(), this.C0.getWindowWidth(), this.C0.getWindowHeight());
        }
        context.getApplicationContext();
        hm9.m("PIP_WORKER", "start", new Object[0]);
        ((v7g) ((y8a) vl.b()).getAccessor().c(v7g.class)).b("PIP_WORKER", h65.b, (rla) ((qla) new qla(PipWorker.class).setExpedited(jna.a)).build(), true).l();
        k1b k1b = this.w0;
        if (!k1b.d) {
            z7.N(k1b.a, k1b, k1b.c, (String) null, 4);
            k1b.d = true;
        }
        try {
            this.y0.d(this);
        } catch (Exception unused) {
        }
    }

    public final void e(boolean z) {
        hm9.m("PIP_WORKER", "stop", new Object[0]);
        ((v7g) ((y8a) vl.b()).getAccessor().c(v7g.class)).c("PIP_WORKER");
        f(z);
        jn5 jn5 = this.D0;
        if (jn5 != null) {
            jn5.setListener((in5) null);
            ValueAnimator valueAnimator = this.D0.v0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            try {
                nd7.z(this.D0.getContext()).removeView(this.D0);
            } catch (Exception unused) {
            }
            this.D0 = null;
        }
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        Iterator it = this.I0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void f(boolean z) {
        lj9 lj9 = this.B0;
        if (lj9 != null) {
            lj9.l1(z);
            this.B0 = null;
        }
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            try {
                nd7.z(floatingVideoView.getContext()).removeView(this.C0);
            } catch (Exception unused) {
            }
            this.C0 = null;
        }
        pj9 pj9 = this.E0;
        if (pj9 != null) {
            View view = (View) ((uk9) ((kk9) pj9.b)).c;
            if (view != null) {
                try {
                    nd7.z(view.getContext()).removeView(view);
                } catch (Exception unused2) {
                }
            }
            this.E0 = null;
        }
        k1b k1b = this.w0;
        if (k1b.d) {
            k1b.a.unregisterReceiver(k1b);
            k1b.d = false;
        }
        try {
            this.y0.f(this);
        } catch (Exception unused3) {
        }
    }

    public final void g(boolean z) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            floatingVideoView.setVisibility(0);
        }
        jn5 jn5 = this.D0;
        if (jn5 != null) {
            if (z) {
                this.X.g(jn5).u(new tk9(1, this));
                return;
            }
            try {
                ValueAnimator valueAnimator = jn5.v0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nd7.z(this.D0.getContext()).removeView(this.D0);
            } catch (Exception unused) {
            }
            this.D0 = null;
        }
    }

    public final void h() {
        if (this.G0 != null && this.F0 != null && this.H0 != null && this.B0 != null) {
            this.K0 = false;
        }
    }

    public final void i() {
        if (this.G0 != null && this.F0 != null && this.H0 != null && this.B0 != null) {
            this.K0 = true;
        }
    }

    public final void k(String str) {
    }

    public final void n() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            int[] a2 = a(floatingVideoView.getContext());
            FloatingVideoView floatingVideoView2 = this.C0;
            int i = a2[0];
            int i2 = a2[1];
            floatingVideoView2.o = i;
            floatingVideoView2.s0 = i2;
            floatingVideoView2.b(true);
            floatingVideoView2.u0.updateViewLayout(floatingVideoView2, floatingVideoView2.B0);
            floatingVideoView2.a();
        }
    }

    @uae
    public void onEvent(re9 re9) {
        es8 es8 = this.G0;
        if (es8 != null && this.F0 != null && this.H0 != null && this.B0 != null && re9.X.contains(Long.valueOf(es8.a.b))) {
            e(false);
        }
    }

    public final void onLowMemory() {
    }

    public final void s() {
        if (this.B0 != null && this.C0 != null && this.F0 != null && this.G0 != null) {
            ef7 ef7 = this.b;
            if (ef7.get() != null) {
                ((ad) ef7.get()).e(SystemClock.elapsedRealtime() - this.J0, "ACTION_PIP_DURATION", (String) null);
            }
            this.B0.X0();
            WindowManager.LayoutParams windowManagerLayoutParams = this.C0.getWindowManagerLayoutParams();
            if (this.o.c.u()) {
                Uri a2 = this.v0.a(this.F0);
                if (a2 != null) {
                    WindowManager z = nd7.z(this.C0.getContext());
                    Display defaultDisplay = z.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    jn5 jn5 = new jn5(this.C0.getContext());
                    this.D0 = jn5;
                    jn5.b(a2, windowManagerLayoutParams.x, windowManagerLayoutParams.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int[] G = j47.G(point.x, point.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int i = G[0];
                    int i2 = G[1];
                    es8 es8 = this.G0;
                    l20 l20 = this.F0;
                    f(false);
                    this.D0.setListener(new n1b(this, es8, l20));
                    jn5 jn52 = this.D0;
                    z.addView(jn52, jn52.getWindowLayoutParams());
                    this.D0.a((point.x / 2) - (i / 2), (point.y / 2) - (i2 / 2), i, i2);
                    return;
                }
                this.C0.getContext();
                e(true);
                return;
            }
            this.C0.getContext();
            e(true);
        }
    }

    @uae
    public void onEvent(vc2 vc2) {
        e52 e52;
        if (this.G0 != null && this.F0 != null && (e52 = this.H0) != null && this.B0 != null && vc2.b == e52.a) {
            e(false);
        }
    }

    @uae
    public void onEvent(vz2 vz2) {
        e52 e52;
        if (this.G0 != null && this.F0 != null && (e52 = this.H0) != null && this.B0 != null && vz2.b.contains(Long.valueOf(e52.a))) {
            i92 i92 = this.z0.C(this.H0.a).b.c;
            if (i92 == i92.o || i92 == i92.X) {
                e(false);
            }
        }
    }
}
