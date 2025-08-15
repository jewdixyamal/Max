package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;
import ru.ok.tamtam.util.HandledException;

/* renamed from: ts8  reason: default package */
public class ts8 extends ViewGroup implements GestureDetector.OnGestureListener, qz, hc7, kj9, s00 {
    public static final Drawable V0 = ngg.u(gpc.e0, -1, vl.o);
    public static final int W0 = ((int) vl.o.getResources().getDimension(jtb.attach_drawable));
    public static final float X0 = vl.o.getResources().getDimension(jtb.divider_item_collage);
    public fd7 A0;
    public u2 B0;
    public l20 C0;
    public TextPaint D0;
    public Paint E0;
    public TextPaint F0;
    public Paint G0;
    public boolean H0;
    public boolean I0;
    public boolean J0 = true;
    public View K0;
    public Drawable L0;
    public o20 M0;
    public dz N0;
    public qqd O0;
    public e52 P0;
    public boolean Q0;
    public a6d R0;
    public Drawable S0;
    public final xpb T0 = new xpb();
    public sd7 U0;
    public ed3 a;
    public bk4 b;
    public int c;
    public final ar0 o = new ar0();
    public kk5 s0;
    public float[] t0;
    public List u0;
    public int v0 = 0;
    public k8g w0;
    public l20 x0;
    public es8 y0;
    public ps8 z0;

    public ts8(Context context) {
        super(context);
        z();
    }

    public static boolean H(l20 l20, l20 l202) {
        d20 d20;
        d20 d202 = l202.o;
        d20 d203 = l20.o;
        return (d202 != d203 && !d203.c()) || (l20.f() && !TextUtils.isEmpty(l20.b.t0) && l202.o != (d20 = l20.o) && d20.c());
    }

    private float[] getCornersForVideo() {
        float[] w = w(0);
        if (w != null) {
            for (int i = 0; i < w.length; i++) {
                float f = w[i];
                if (f > 0.0f) {
                    w[i] = f - ((float) this.b.a);
                }
            }
        }
        return w;
    }

    public static void l(la6 la6, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        vl vlVar = vl.o;
        bk4.b();
        float b2 = (float) fk4.b((int) 11.0f);
        float f3 = 0.0f;
        if (i2 != 1) {
            float f4 = (i == 0 && z3 && i3 == 1) ? b2 : 0.0f;
            f2 = f4;
            if (i == 0 && z3 && f4 == 0.0f) {
                f4 = b2;
            }
            if (i == 1 && i3 > 1 && !z && z3) {
                f2 = b2;
            }
            int i4 = i2 - 1;
            if (i == i4 && i3 == 1) {
                f = b2;
                f3 = f;
            } else {
                f = 0.0f;
            }
            if (i == i4 && i3 > 1) {
                f = b2;
            }
            if (i == i2 - 2 && !z2) {
                f3 = b2;
            }
            b2 = f4;
        } else if (z3) {
            f = b2;
            f3 = f;
            f2 = f3;
        } else {
            f = b2;
            f2 = 0.0f;
            b2 = 0.0f;
            f3 = f;
        }
        wnc a2 = wnc.a(b2, f2, f, f3);
        a2.h = true;
        la6.n(a2);
    }

    /* access modifiers changed from: private */
    public void setCornersForCollage(List<b53> list) {
        for (int i = 0; i < list.size(); i++) {
            if (this.w0.h(((c53) list.get(i).get(0)).c) != null) {
                O(list, i, ((c53) list.get(i).get(0)).c);
                if (list.get(i).size() > 1 && this.w0.h(((c53) list.get(i).get(1)).c) != null) {
                    O(list, i, ((c53) list.get(i).get(1)).c);
                }
            }
        }
    }

    public final void A(int i) {
        ar0 ar0 = this.o;
        Rect bounds = (i >= ((ArrayList) ar0.b).size() || ((ArrayList) ar0.b).size() <= 1) ? null : ar0.i(i).e().getBounds();
        if (bounds != null) {
            View view = new View(getContext());
            this.K0 = view;
            view.setLeft(bounds.left);
            this.K0.setTop(bounds.top);
            this.K0.setRight(bounds.right);
            this.K0.setBottom(bounds.bottom);
            addView(this.K0);
            return;
        }
        this.K0 = this;
    }

    public final boolean B() {
        l20 a2 = this.y0.a.a(g20.u0);
        if (s5c.P(a2) || s5c.N(a2)) {
            return true;
        }
        return TextUtils.isEmpty(this.y0.a.s0) && this.y0.c == null && !this.H0 && !this.I0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [jk9, u2] */
    public final boolean B0(int i, KeyEvent keyEvent) {
        ? r0 = this.B0;
        if (r0 == 0) {
            return false;
        }
        return r0.B0(i, keyEvent);
    }

    public final boolean C() {
        l20 k = this.w0.k(g20.c);
        l20 k2 = this.w0.k(g20.o);
        return ((k != null && k.b.s0 > 0) || (k2 != null && k2.d.a > 0)) && this.y0.a.s();
    }

    public final boolean D(l20 l20) {
        boolean isEmpty = TextUtils.isEmpty(l20.b.u0);
        x10 x10 = l20.b;
        File n = !isEmpty ? this.s0.n(x10.u0) : null;
        if (n == null || !n.exists()) {
            n = this.s0.k(x10.s0);
        }
        return l20.o.c() && n.exists();
    }

    public final boolean E(int i) {
        return !this.w0.h(i).t && (this.w0.h(i).a == g20.c || this.w0.h(i).a == g20.o);
    }

    public final boolean F(l20 l20) {
        if ((this.w0.i() <= 1 && this.J0 && !this.y0.a.s()) || this.z0 == null) {
            return false;
        }
        A(u(l20));
        this.z0.getClass();
        return true;
    }

    public final void G() {
    }

    public final boolean I() {
        return (!((y8a) this.a).k().q() || this.y0 == null || ((y8a) this.a).e().C(this.y0.a.t0) == null) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r0v5, types: [jk9, u2] */
    public final void J() {
        if (this.B0 != null) {
            if (this.w0.i() == 1) {
                this.B0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            } else {
                this.B0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824));
            }
        }
    }

    public final void L() {
    }

    public final void M(int i) {
        if (this.z0 != null) {
            A(i);
            l20 h = this.w0.h(i);
            if (this.w0.i() != 1 || !h.i()) {
                ps8 ps8 = this.z0;
                this.w0.h(i);
                ps8.getClass();
                return;
            }
            d(h);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r0v3, types: [jk9, u2] */
    public final void N() {
        if (this.B0 != null) {
            hm9.m("ts8", "removeVideoView: ", new Object[0]);
            this.B0.l1(false);
            removeView(this.B0.u1());
            this.B0 = null;
            R();
            this.x0 = null;
            this.C0 = null;
            requestLayout();
        }
    }

    public final void O(List list, int i, int i2) {
        rq4 rq4 = t(this.y0, i2, this.w0.h(i2)).o;
        rq4.getClass();
        l((la6) rq4, i2, this.w0.i(), ((b53) list.get(i)).size(), ((b53) list.get(0)).size() == 1, ((b53) list.get(list.size() - 1)).size() == 1, B());
    }

    public final void Q(l20 l20, sz szVar, boolean z) {
        mq4 mq4 = szVar.X;
        boolean U = s5c.U(l20, this.y0);
        this.Q0 = U;
        boolean z2 = true;
        e2b c2 = szVar.Z.c(mq4, z, true, U);
        Context context = getContext();
        k8g k8g = this.w0;
        if (k8g == null || (k8g.i() <= 1 && lz7.q(vl.o) != vi4.c)) {
            z2 = false;
        }
        tfg.b(context, l20, c2, z2, false);
        if (l20.a == g20.c || s5c.N(l20)) {
            c2.h = new rs8(this, this.y0, l20);
        } else {
            this.Q0 = false;
        }
        if (this.y0.a.s()) {
            tp0 a2 = vl.b().a(9, 10);
            wv6 wv6 = (wv6) c2.e;
            if (wv6 != null) {
                xv6 b2 = xv6.b(wv6);
                b2.l = a2;
                c2.e = b2.a();
            }
            c2.j = false;
        }
        szVar.i(c2.a());
    }

    public final void R() {
        int u;
        l20 l20 = this.x0;
        if (l20 != null && (u = u(l20)) >= 0) {
            rz rzVar = ((sz) this.o.i(u)).Z;
            rzVar.o = true;
            VideoInfoTextView videoInfoTextView = rzVar.m;
            if (videoInfoTextView != null) {
                videoInfoTextView.setVisibility(0);
            }
            VideoPlayerSeekBar videoPlayerSeekBar = rzVar.n;
            if (videoPlayerSeekBar != null) {
                videoPlayerSeekBar.setVisibility(0);
            }
            if (rzVar.s != null && s5c.b0(((y8a) vl.b()).n(), rzVar.i)) {
                rzVar.s.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [jk9, u2] */
    public final void S() {
        if (this.B0 != null) {
            hm9.m("ts8", "switchVideoToFullScreen", new Object[0]);
            this.B0.X0();
            nd7.R(new os8(this, 1), ((y8a) this.a).c().a.b());
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [jk9, u2] */
    public final void T() {
        if (this.B0 != null) {
            if (!I()) {
                ? r0 = this.B0;
                if ((r0 instanceof lj9) && !r0.z0.a) {
                    r0.k1(true);
                    return;
                }
            }
            S();
        }
    }

    public final void U(es8 es8, l20 l20, d20 d20, boolean z) {
        if (u(l20) >= 0) {
            es8 u = ((y8a) this.a).l().u(es8.a, l20.r, d20);
            if (z) {
                m(u);
            }
        }
    }

    public final void W() {
        int u = this.w0.i() == 1 ? 0 : u(this.x0);
        ps8 ps8 = this.z0;
        this.w0.h(u);
        ps8.getClass();
    }

    public final void X() {
        post(new os8(this, 1));
    }

    public final void Y(Throwable th) {
        N();
        a14.N(0, getContext(), zqe.b(getContext(), th));
    }

    public final void a(l20 l20) {
        U(this.y0, l20, d20.b, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.l20 r8) {
        /*
            r7 = this;
            boolean r0 = r7.Q0
            if (r0 == 0) goto L_0x001e
            ed3 r0 = r7.a
            y8a r0 = (defpackage.y8a) r0
            au8 r0 = r0.l()
            es8 r7 = r7.y0
            cu8 r7 = r7.a
            r0.getClass()
            java.lang.String r8 = r8.r
            l01 r1 = new l01
            r1.<init>()
            r0.t(r7, r8, r1)
            return
        L_0x001e:
            int r0 = r7.u(r8)
            if (r0 < 0) goto L_0x0127
            ar0 r1 = r7.o
            java.lang.Object r2 = r1.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0127
            x10 r2 = r8.b
            java.lang.String r2 = r2.t0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = r8.s
            if (r2 != 0) goto L_0x004c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x004c
            android.graphics.drawable.Animatable r2 = r7.q(r0)
            if (r2 != 0) goto L_0x004c
            r2 = r3
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x005f
            int r6 = defpackage.pag.d
            java.lang.String r6 = ".mp4"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x005f
            r5 = r3
            goto L_0x0060
        L_0x005f:
            r5 = r4
        L_0x0060:
            if (r2 != 0) goto L_0x00c2
            if (r5 == 0) goto L_0x0065
            goto L_0x00c2
        L_0x0065:
            android.graphics.drawable.Animatable r8 = r7.q(r0)
            sq4 r1 = r1.i(r0)
            if (r8 == 0) goto L_0x00b6
            boolean r2 = r8.isRunning()
            if (r2 == 0) goto L_0x00b1
            r8.stop()
            r8 = r1
            sz r8 = (defpackage.sz) r8
            rz r8 = r8.Z
            float[] r2 = r7.getCornersForVideo()
            r8.u = r2
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r8.s
            if (r3 != 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r3.setCorners(r2)
        L_0x008b:
            k8g r2 = r7.w0
            l20 r2 = r2.h(r0)
            es8 r3 = r7.y0
            e52 r5 = r7.P0
            r8.f(r2, r3, r5)
            rq4 r2 = r1.o
            r2.getClass()
            la6 r2 = (defpackage.la6) r2
            ssc r3 = defpackage.ssc.l
            r8.a(r2, r3)
            k8g r8 = r7.w0
            l20 r8 = r8.h(r0)
            sz r1 = (defpackage.sz) r1
            r7.Q(r8, r1, r4)
            goto L_0x0127
        L_0x00b1:
            r8.start()
            goto L_0x0127
        L_0x00b6:
            k8g r8 = r7.w0
            l20 r8 = r8.h(r0)
            sz r1 = (defpackage.sz) r1
            r7.Q(r8, r1, r3)
            goto L_0x0127
        L_0x00c2:
            es8 r0 = r7.y0
            cu8 r0 = r0.a
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x00d2
            ps8 r7 = r7.z0
            r7.getClass()
            goto L_0x0127
        L_0x00d2:
            boolean r0 = r7.D(r8)
            if (r0 == 0) goto L_0x0124
            boolean r0 = r7.F(r8)
            if (r0 != 0) goto L_0x0127
            boolean r0 = r8.t
            if (r0 == 0) goto L_0x00e3
            goto L_0x0127
        L_0x00e3:
            r7.N()
            fl9 r0 = new fl9
            android.content.Context r1 = r7.getContext()
            float[] r2 = r7.getCornersForVideo()
            r0.<init>(r1, r2)
            qj9 r1 = new qj9
            kk5 r2 = r7.s0
            r3 = 0
            r1.<init>(r0, r3, r2, r7)
            r7.B0 = r1
            android.view.View r0 = r1.u1()
            r7.addView(r0)
            r7.C0 = r8
            u2 r7 = r7.B0
            qj9 r7 = (defpackage.qj9) r7
            wc6 r0 = new wc6
            zi5 r1 = r7.o
            r0.<init>(r1, r8)
            r7.Y = r0
            we8 r8 = r7.c
            bq7 r8 = (defpackage.bq7) r8
            r8.s(r0, r7)
            java.lang.Object r8 = r7.b
            kk9 r8 = (defpackage.kk9) r8
            pl9 r8 = (defpackage.pl9) r8
            r8.b(r7)
            goto L_0x0127
        L_0x0124:
            r7.o(r8)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.b(l20):void");
    }

    public final void c(l20 l20) {
        if (!l20.o.e()) {
            U(this.y0, l20, d20.a, true);
            return;
        }
        int u = u(l20);
        if (u >= 0) {
            ar0 ar0 = this.o;
            if (((ArrayList) ar0.b).size() > u) {
                Q(l20, (sz) ar0.i(u), true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [jk9, u2] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (android.text.TextUtils.equals(r15.r, r14.x0.r) != false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.l20 r18) {
        /*
            r17 = this;
            r14 = r17
            r15 = r18
            l20 r0 = r14.x0
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r0 = r17.F(r18)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r15.t
            if (r0 == 0) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            p7b r0 = r0.n()
            boolean r1 = defpackage.s5c.P(r18)
            k20 r2 = r15.d
            s10 r3 = r15.j
            if (r1 == 0) goto L_0x002b
            l20 r1 = r3.d
            k20 r1 = r1.d
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            boolean r0 = defpackage.s5c.Q(r0, r1)
            if (r0 == 0) goto L_0x0035
        L_0x0032:
            r7 = r15
            goto L_0x012d
        L_0x0035:
            l20 r0 = r14.x0
            if (r0 == 0) goto L_0x0050
            u2 r0 = r14.B0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0050
            l20 r0 = r14.x0
            java.lang.String r0 = r0.r
            java.lang.String r1 = r15.r
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0050
            goto L_0x0032
        L_0x0050:
            r17.N()
            boolean r0 = defpackage.s5c.P(r18)
            if (r0 == 0) goto L_0x005d
            l20 r0 = r3.d
            k20 r2 = r0.d
        L_0x005d:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x007e
            boolean r0 = r2.o
            if (r0 != 0) goto L_0x007e
            mk9 r0 = new mk9
            android.content.Context r1 = r17.getContext()
            ed3 r2 = r14.a
            y8a r2 = (defpackage.y8a) r2
            tg r2 = r2.c()
            float[] r3 = r17.getCornersForVideo()
            r0.<init>(r1, r2, r3)
        L_0x007c:
            r1 = r0
            goto L_0x0094
        L_0x007e:
            kl9 r0 = new kl9
            android.content.Context r1 = r17.getContext()
            ed3 r2 = r14.a
            y8a r2 = (defpackage.y8a) r2
            tg r2 = r2.c()
            float[] r3 = r17.getCornersForVideo()
            r0.<init>(r1, r2, r3)
            goto L_0x007c
        L_0x0094:
            lj9 r13 = new lj9
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            dlf r3 = r0.s()
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            hle r4 = r0.q()
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            v4 r0 = r0.getAccessor()
            java.lang.Class<ef7> r2 = defpackage.ef7.class
            java.lang.Object r0 = r0.c(r2)
            r5 = r0
            ef7 r5 = (defpackage.ef7) r5
            o20 r6 = r14.M0
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            au8 r7 = r0.l()
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            p7b r8 = r0.n()
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            o45 r10 = r0.g()
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            ti4 r11 = r0.f()
            r2 = 0
            r12 = 1
            r16 = 0
            r0 = r13
            r9 = r17
            r15 = r13
            r13 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.B0 = r15
            android.view.View r0 = r15.u1()
            r14.addView(r0)
            r7 = r18
            r14.x0 = r7
            r14.C0 = r7
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            p82 r0 = r0.e()
            es8 r1 = r14.y0
            cu8 r1 = r1.a
            long r1 = r1.t0
            e52 r0 = r0.C(r1)
            r14.P0 = r0
            if (r0 == 0) goto L_0x0111
            k92 r0 = r0.b
            long r0 = r0.a
        L_0x010f:
            r2 = r0
            goto L_0x0114
        L_0x0111:
            r0 = 0
            goto L_0x010f
        L_0x0114:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x011d
            r0 = 3
        L_0x011b:
            r5 = r0
            goto L_0x011f
        L_0x011d:
            r0 = 2
            goto L_0x011b
        L_0x011f:
            u2 r0 = r14.B0
            lj9 r0 = (defpackage.lj9) r0
            es8 r1 = r14.y0
            cu8 r4 = r1.a
            r6 = 1
            r1 = r18
            r0.Z1(r1, r2, r4, r5, r6)
        L_0x012d:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x014f
            ed3 r0 = r14.a
            y8a r0 = (defpackage.y8a) r0
            au8 r0 = r0.l()
            es8 r1 = r14.y0
            cu8 r1 = r1.a
            r0.getClass()
            java.lang.String r2 = r7.r
            l01 r3 = new l01
            r4 = 0
            r5 = 11
            r3.<init>(r4, r5)
            r0.t(r1, r2, r3)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.d(l20):void");
    }

    public final void e(l20 l20, es8 es8) {
        ((y8a) this.a).p().getClass();
        jyc jyc = (jyc) jke.b();
        au8 n = jyc.n();
        n.getClass();
        cqc.a(new vt8(n, es8, l20.r, (jy8) jyc.getAccessor().c(jy8.class)), n.h, (f6) null, new hj8(12), (ztc) null);
    }

    public final void g() {
        invalidate();
    }

    public List<View> getClickableChildren() {
        return l6d.i0(l6d.Z(lz7.m(this), new g27(17)));
    }

    public final boolean j(l20 l20) {
        int u = u(l20);
        if (u < 0) {
            return false;
        }
        ar0 ar0 = this.o;
        return ((ArrayList) ar0.b).size() > u && ar0.i(u).X != null && ((k0) ar0.i(u).X).c() != null && ((k0) ar0.i(u).X).c().isRunning();
    }

    public final void k(String str) {
        N();
        hm9.V(getContext(), str);
    }

    public void m(es8 es8) {
        float[] fArr;
        e52 e52;
        k20 k20;
        int i;
        int i2;
        x10 x10;
        w1a t = this.T0.t(1000, TimeUnit.MILLISECONDS);
        z16 z16 = new z16(28, this);
        oz7 oz7 = ft.f;
        r66 r66 = ft.d;
        sd7 sd7 = new sd7(z16, oz7, r66);
        t.a(sd7);
        this.U0 = sd7;
        View view = this.K0;
        if (view != null && !view.equals(this)) {
            removeView(this.K0);
            this.K0 = null;
        }
        es8 es82 = this.y0;
        k8g k8g = es8.a.z0;
        this.w0 = k8g;
        this.y0 = es8;
        int i3 = k8g.i();
        g20 g20 = g20.o;
        if (i3 == 1) {
            fArr = s36.c;
        } else {
            float[] fArr2 = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                l20 h = k8g.h(i4);
                if (h != null) {
                    g20 g202 = g20.c;
                    g20 g203 = h.a;
                    float f = 1.0f;
                    if (g203 != g202 ? !(g203 != g20 || (i = (k20 = h.d).f) == 0 || (i2 = k20.e) == 0) : !((i = (x10 = h.b).o) == 0 || (i2 = x10.c) == 0)) {
                        f = ((float) i2) / ((float) i);
                    }
                    fArr2[i4] = f;
                } else {
                    fArr2[i4] = 0.0f;
                }
            }
            fArr = fArr2;
        }
        this.t0 = fArr;
        es8 es83 = this.y0;
        boolean z = es82 == null || es82.a.b != es83.a.b || s5c.h(es82, es83);
        if (this.w0.i() == 1) {
            l20 h2 = this.w0.h(0);
            if (h2.a == g20 || s5c.P(h2)) {
                y00 y00 = this.M0.b;
                y00.getClass();
                if (!y00.d.containsKey(h2.r)) {
                    k28 k28 = new k28(new w00(y00, h2, 2));
                    hle hle = y00.a;
                    hle.getClass();
                    jle jle = (jle) hle;
                    a38 f2 = k28.h(jle.a()).f(jle.b());
                    xw0 xw0 = new xw0(23);
                    g28 g28 = new g28(new w00(y00, h2, 1), new x00(y00), r66);
                    Objects.requireNonNull(g28, "observer is null");
                    try {
                        f2.a(new cb3(g28, 1, xw0));
                        y00.f.a(g28);
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        c37.B(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                }
                e52 C = ((y8a) this.a).e().C(this.y0.a.t0);
                this.P0 = C;
                if (C != null) {
                    long j = this.P0.b.a;
                    long j2 = this.y0.a.c;
                    ((ikf) ((y8a) this.a).getAccessor().c(ikf.class)).getClass();
                }
                this.N0.a(this.y0.a);
            }
        }
        for (int i5 = 0; i5 < this.w0.i(); i5++) {
            l20 h3 = this.w0.h(i5);
            sz t2 = t(es8, i5, h3);
            int i6 = this.w0.i();
            ssc ssc = ssc.l;
            if (i6 == 1) {
                if (s5c.P(h3)) {
                    rq4 rq4 = t2.o;
                    rq4.getClass();
                    ((la6) rq4).h(ssc.o);
                } else {
                    rq4 rq42 = t2.o;
                    rq42.getClass();
                    ((la6) rq42).h(ssc);
                }
                rq4 rq43 = t2.o;
                rq43.getClass();
                l((la6) rq43, i5, this.w0.i(), 1, false, false, B());
            } else {
                rq4 rq44 = t2.o;
                rq44.getClass();
                ((la6) rq44).h(ssc);
            }
            e52 C2 = ((y8a) this.a).e().C(this.y0.a.t0);
            boolean z2 = (C2 == null || es82 == null || s5c.U(h3, this.y0) == s5c.U(es82.a.z0.h(i5), this.y0)) ? false : true;
            boolean z3 = (C2 == null || (e52 = this.P0) == null || !e52.M() || this.P0.l().a.c.k == C2.l().a.c.k) ? false : true;
            this.P0 = C2;
            if (z3 || z2 || z || es82 == null || H(h3, es82.a.z0.h(i5))) {
                Q(h3, t2, false);
            }
        }
        List list = this.u0;
        if (list == null) {
            this.u0 = new ArrayList();
        } else {
            list.clear();
        }
        if (z) {
            N();
            ((y8a) this.a).p().getClass();
            if (((ge2) ((jyc) jke.b()).getAccessor().c(ge2.class)).b(true)) {
                for (int i7 = 0; i7 < this.w0.i(); i7++) {
                    l20 h4 = this.w0.h(i7);
                    boolean f3 = h4.f();
                    x10 x102 = h4.b;
                    boolean z4 = f3 && !TextUtils.isEmpty(x102.u0) && this.s0.n(x102.u0).exists();
                    if (h4.f() && !TextUtils.isEmpty(x102.t0) && !z4) {
                        d20 d20 = h4.o;
                        if (d20.e() || d20.b() || !D(h4)) {
                            o(h4);
                        }
                    }
                }
            }
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r0v5, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r1v6, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r1v7, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r1v8, types: [jk9, u2] */
    public final void n() {
        Context context = getContext();
        String[] strArr = wmd.d;
        if (context == null ? false : Settings.canDrawOverlays(context)) {
            ? r0 = this.B0;
            if (r0 != 0 && this.x0 != null) {
                View u1 = r0.u1();
                Rect rect = mpf.a;
                mpf.d(rect, u1);
                this.B0.F1();
                this.P0 = ((y8a) this.a).e().C(this.y0.a.t0);
                j10 j = this.x0.j();
                tpa.I(j, this.B0.k(), this.B0.c(), this.B0.c0());
                this.x0 = j.a();
                ((y8a) this.a).k().u0.d(getContext(), this.P0, this.y0, this.x0, rect, true);
                R();
                N();
                return;
            }
            return;
        }
        hm9.p("ts8", "Pip request listener is null", (Throwable) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [one, java.lang.Object] */
    public final void o(l20 l20) {
        U(this.y0, l20, d20.X, true);
        ? obj = new Object();
        obj.a = this.y0.a.b;
        obj.b = l20.r;
        x10 x10 = l20.b;
        obj.e = x10.s0;
        obj.g = x10.t0;
        obj.h = true;
        ((rf5) ((y8a) this.a).getAccessor().c(rf5.class)).a(new pne(obj));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.p();
        this.M0.g.add(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ar0 ar0 = this.o;
        ar0.r();
        for (int i = 0; i < ((ArrayList) ar0.b).size(); i++) {
            cqc.b(((sz) ar0.i(i)).Z.t);
        }
        N();
        this.M0.g.remove(this);
        sd7 sd7 = this.U0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onDraw(Canvas canvas) {
        String str;
        a6d a6d;
        Canvas canvas2 = canvas;
        int i = this.w0.i();
        ar0 ar0 = this.o;
        if (i != 1) {
            for (b53 it : this.u0) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    c53 c53 = (c53) it2.next();
                    if (this.w0.h(c53.c) != null) {
                        int i2 = c53.c;
                        boolean E = E(i2);
                        Rect rect = c53.d;
                        if (!E) {
                            p(canvas, y(i2), rect.left, rect.top, rect.right, rect.bottom, c53.c);
                        } else {
                            umc e = ar0.i(i2).e();
                            if (e != null) {
                                e.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                                e.draw(canvas2);
                                boolean U = s5c.U(this.w0.h(i2), this.y0);
                                if (U) {
                                    int i3 = rect.left;
                                    int intrinsicWidth = this.S0.getIntrinsicWidth();
                                    int i4 = c53.a;
                                    int i5 = ((i4 - intrinsicWidth) / 2) + i3;
                                    int i6 = rect.top;
                                    int intrinsicHeight = this.S0.getIntrinsicHeight();
                                    int i7 = c53.b;
                                    this.S0.setBounds(i5, ((i7 - intrinsicHeight) / 2) + i6, rect.right - ((i4 - this.S0.getIntrinsicWidth()) / 2), rect.bottom - ((i7 - this.S0.getIntrinsicHeight()) / 2));
                                    this.S0.draw(canvas2);
                                }
                                if (!C()) {
                                    ((sz) ar0.i(i2)).Z.b(canvas2, e.getBounds(), U);
                                }
                            }
                        }
                    }
                }
            }
        } else if (E(0) || ((!this.w0.h(0).t && s5c.P(this.w0.h(0))) || (!this.w0.h(0).t && s5c.N(this.w0.h(0))))) {
            umc e2 = ar0.i(0).e();
            if (e2 != null) {
                e2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                e2.draw(canvas2);
                if (this.Q0 && (a6d = this.R0) != null) {
                    a6d.draw(canvas2);
                }
                if (!C()) {
                    ((sz) ar0.i(0)).Z.b(canvas2, e2.getBounds(), this.Q0);
                }
            }
        } else {
            p(canvas, y(0), 0, 0, getMeasuredWidth(), getMeasuredHeight(), 0);
        }
        if (C()) {
            if (this.G0 == null) {
                Paint paint = new Paint();
                this.G0 = paint;
                Context context = getContext();
                khe khe = sme.a0;
                paint.setColor(fm9.R(context).r);
                this.G0.setStyle(Paint.Style.FILL);
                this.G0.setAntiAlias(true);
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            canvas2.drawCircle(f, f2, ((float) W0) / 2.0f, this.G0);
            if (this.y0.a.N0 == 0) {
                if (this.F0 == null) {
                    TextPaint textPaint = new TextPaint();
                    this.F0 = textPaint;
                    textPaint.setTextSize(getContext().getResources().getDimension(fpc.a));
                    TextPaint textPaint2 = this.F0;
                    Context context2 = getContext();
                    khe khe2 = sme.a0;
                    textPaint2.setColor(fm9.R(context2).t);
                    this.F0.setTypeface(Typeface.DEFAULT);
                    this.F0.setTextAlign(Paint.Align.CENTER);
                    this.F0.setAntiAlias(true);
                }
                Context context3 = getContext();
                int i8 = this.y0.a.M0;
                int i9 = zqe.a;
                if (i8 < 60) {
                    str = context3.getString(jpc.Z2);
                } else {
                    str = context3.getString(jpc.Y2);
                    i8 = (int) TimeUnit.SECONDS.toMinutes((long) i8);
                }
                canvas2.drawText(context3.getString(jpc.a3, new Object[]{Integer.valueOf(i8), str}), f, (float) ((int) (f2 - ((this.F0.ascent() + this.F0.descent()) / 2.0f))), this.F0);
                return;
            }
            if (this.L0 == null) {
                Drawable b2 = kt3.b(getContext(), gpc.w0);
                this.L0 = b2;
                Context context4 = getContext();
                khe khe3 = sme.a0;
                b2.setColorFilter(fm9.R(context4).t, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable = this.L0;
            if (drawable != null) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight2 = this.L0.getIntrinsicHeight() / 2;
                this.L0.setBounds(measuredWidth - intrinsicWidth2, measuredHeight - intrinsicHeight2, measuredWidth + intrinsicWidth2, measuredHeight + intrinsicHeight2);
                this.L0.draw(canvas2);
            }
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.o.p();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [jk9, u2] */
    /* JADX WARNING: type inference failed for: r1v8, types: [jk9, u2] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.B0 != null && this.C0 != null) {
            if (this.w0.i() == 1) {
                this.B0.u1().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int u = u(this.C0);
            int i5 = (u % 2) * measuredWidth;
            int i6 = (u / 2) * measuredWidth;
            this.B0.u1().layout(i5, i6, i5 + measuredWidth, measuredWidth + i6);
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        mi6.VIRTUAL_KEY.b(this);
        if (this.z0 != null) {
            int v = this.w0.i() == 1 ? 0 : v(motionEvent);
            if (v < this.w0.i()) {
                ps8 ps8 = this.z0;
                this.w0.h(v);
                ps8.getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            k8g r1 = r0.w0
            if (r1 == 0) goto L_0x0245
            int r1 = r1.i()
            if (r1 != 0) goto L_0x000e
            goto L_0x0245
        L_0x000e:
            k8g r1 = r0.w0
            int r1 = r1.i()
            r2 = 1
            ar0 r3 = r0.o
            r4 = 0
            if (r1 != r2) goto L_0x0062
            super.onMeasure(r25, r26)
            k8g r1 = r0.w0
            l20 r1 = r1.h(r4)
            g20 r1 = r1.a
            g20 r2 = defpackage.g20.c
            if (r1 == r2) goto L_0x004d
            k8g r1 = r0.w0
            l20 r1 = r1.h(r4)
            g20 r1 = r1.a
            g20 r2 = defpackage.g20.o
            if (r1 == r2) goto L_0x004d
            k8g r1 = r0.w0
            l20 r1 = r1.h(r4)
            boolean r1 = defpackage.s5c.P(r1)
            if (r1 != 0) goto L_0x004d
            k8g r1 = r0.w0
            l20 r1 = r1.h(r4)
            boolean r1 = defpackage.s5c.N(r1)
            if (r1 == 0) goto L_0x0248
        L_0x004d:
            sq4 r1 = r3.i(r4)
            sz r1 = (defpackage.sz) r1
            rz r1 = r1.Z
            int r2 = r24.getMeasuredWidth()
            int r3 = r24.getMeasuredHeight()
            r1.d(r2, r3)
            goto L_0x0248
        L_0x0062:
            int r1 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = r0.v0
            int r5 = java.lang.Math.max(r5, r4)
            r0.setMeasuredDimension(r1, r5)
            java.util.List r1 = r0.u0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01fa
            float[] r1 = r0.t0
            int r5 = r24.getMeasuredWidth()
            b53 r6 = new b53
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r1[r4]
            float r5 = (float) r5
            r9 = 1058642330(0x3f19999a, float:0.6)
            float r9 = r9 * r5
            r10 = 1055286886(0x3ee66666, float:0.45)
            float r10 = r10 * r5
            float r8 = r10 / r8
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x009a
            r8 = r9
            goto L_0x009f
        L_0x009a:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x009f
            r8 = r10
        L_0x009f:
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            r11 = r4
            r12 = r11
            r13 = r12
            r15 = r13
            r14 = 0
        L_0x00a9:
            int r2 = r1.length
            float r4 = X0
            if (r12 >= r2) goto L_0x01dc
            r2 = r1[r12]
            float r2 = r2 * r8
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r17 = 0
            r18 = r1[r17]
            r19 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 <= 0) goto L_0x00c7
            if (r12 != 0) goto L_0x00c7
            r26 = r8
            r18 = 1
            goto L_0x00cb
        L_0x00c7:
            r26 = r8
            r18 = 0
        L_0x00cb:
            int r8 = r1.length
            r16 = 1
            int r8 = r8 + -1
            r19 = r3
            if (r12 != r8) goto L_0x00d7
            r8 = r16
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            if (r18 != 0) goto L_0x012a
            if (r8 == 0) goto L_0x00dd
            goto L_0x012a
        L_0x00dd:
            int r8 = r12 + 1
            int r3 = r1.length
            int r3 = r3 + -1
            if (r8 > r3) goto L_0x00fc
            r3 = r1[r12]
            r8 = r1[r8]
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00fc
            int r3 = r6.size()
            if (r3 != 0) goto L_0x00fc
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r5 / r2
        L_0x00f6:
            r8 = r26
            r18 = r5
            r3 = 0
            goto L_0x0137
        L_0x00fc:
            float r3 = r5 - r14
            float r8 = r3 - r2
            r18 = 1053609165(0x3ecccccd, float:0.4)
            float r18 = r18 * r5
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x011e
        L_0x0109:
            float r8 = r3 - r2
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f6
            r8 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r8
            int r8 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x0109
            r8 = r26
            r2 = r3
        L_0x011a:
            r18 = r5
            r3 = 1
            goto L_0x0137
        L_0x011e:
            int r3 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f6
            r8 = r26
            r2 = r18
            r3 = 0
            r18 = r5
            goto L_0x0137
        L_0x012a:
            if (r18 == 0) goto L_0x0132
            int r2 = r1.length
            r3 = 3
            if (r2 <= r3) goto L_0x0132
            r8 = r9
            goto L_0x0134
        L_0x0132:
            r8 = r26
        L_0x0134:
            float r2 = r5 - r14
            goto L_0x011a
        L_0x0137:
            int r5 = r6.size()
            r0 = 1
            if (r5 != r0) goto L_0x0143
            if (r3 != 0) goto L_0x0143
            r16 = r0
            goto L_0x0145
        L_0x0143:
            r16 = r3
        L_0x0145:
            c53 r3 = new c53
            int r5 = java.lang.Math.round(r2)
            int r0 = java.lang.Math.round(r8)
            r20 = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            int r21 = java.lang.Math.round(r2)
            r22 = r10
            int r10 = r21 + r11
            int r21 = java.lang.Math.round(r8)
            r23 = r1
            int r1 = r21 + r15
            r9.<init>(r11, r15, r10, r1)
            r3.<init>(r5, r0, r12, r9)
            float r0 = r2 + r4
            int r0 = (int) r0
            int r11 = r11 + r0
            r6.add(r3)
            int r0 = r6.size()
            r1 = 3
            if (r0 != r1) goto L_0x019d
            java.util.Locale r0 = java.util.Locale.UK
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Three items in Collage in one row. PossibleWidth: %f, RowWidth: %f, ShouldCompleteRow: %b"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            r3 = 0
            java.lang.String r9 = "CollageHelper"
            defpackage.hm9.k0(r9, r3, r0, r2)
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            float r0 = (float) r5
            float r0 = r0 + r4
            float r0 = r0 + r14
            if (r16 == 0) goto L_0x01ca
            float r8 = r8 + r4
            int r0 = (int) r8
            int r15 = r15 + r0
            r7.add(r6)
            int r13 = r13 + r0
            r0 = r23[r12]
            float r10 = r22 / r0
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b5
            r10 = r20
            goto L_0x01bb
        L_0x01b5:
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            r10 = r22
        L_0x01bb:
            int r0 = java.lang.Math.round(r10)
            float r0 = (float) r0
            b53 r2 = new b53
            r2.<init>()
            r8 = r0
            r11 = r1
            r6 = r2
            r14 = 0
            goto L_0x01cb
        L_0x01ca:
            r14 = r0
        L_0x01cb:
            int r12 = r12 + 1
            r0 = r24
            r4 = r1
            r5 = r18
            r3 = r19
            r9 = r20
            r10 = r22
            r1 = r23
            goto L_0x00a9
        L_0x01dc:
            r19 = r3
            r1 = 0
            int r0 = (int) r4
            int r13 = r13 - r0
            r0 = r24
            r0.u0 = r7
            r0.v0 = r13
            int r2 = r24.getMeasuredWidth()
            int r3 = r0.v0
            r0.setMeasuredDimension(r2, r3)
            os8 r2 = new os8
            r3 = 0
            r2.<init>(r0, r3)
            r0.post(r2)
            goto L_0x01fd
        L_0x01fa:
            r19 = r3
            r1 = r4
        L_0x01fd:
            r2 = r1
        L_0x01fe:
            java.util.List r3 = r0.u0
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0248
            java.util.List r3 = r0.u0
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L_0x020f:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x0240
            java.lang.Object r5 = r3.get(r4)
            c53 r5 = (defpackage.c53) r5
            int r6 = r5.c
            r7 = r19
            java.lang.Object r8 = r7.b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r6 < r8) goto L_0x022a
            goto L_0x023b
        L_0x022a:
            int r6 = r5.c
            sq4 r6 = r7.i(r6)
            sz r6 = (defpackage.sz) r6
            rz r6 = r6.Z
            int r8 = r5.a
            int r5 = r5.b
            r6.d(r8, r5)
        L_0x023b:
            int r4 = r4 + 1
            r19 = r7
            goto L_0x020f
        L_0x0240:
            r7 = r19
            int r2 = r2 + 1
            goto L_0x01fe
        L_0x0245:
            super.onMeasure(r25, r26)
        L_0x0248:
            r24.J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.onMeasure(int, int):void");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.w0.i() != 0) {
            int v = this.w0.i() == 1 ? 0 : v(motionEvent);
            if (v < this.w0.i()) {
                ar0 ar0 = this.o;
                if (v < ((ArrayList) ar0.b).size()) {
                    umc e = ar0.i(v).e();
                    if (!((sz) ar0.i(v)).Z.e(e.getBounds().centerX(), e.getBounds().centerY(), motionEvent)) {
                        this.T0.e(Integer.valueOf(v));
                    }
                }
            }
        }
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a6d a6d = this.R0;
        if (a6d != null) {
            a6d.setBounds(0, 0, i, i2);
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.o.r();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.A0.a).onTouchEvent(motionEvent);
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 && this.B0 != null) {
            N();
        }
    }

    public final void p(Canvas canvas, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Canvas canvas2 = canvas;
        String str2 = str;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        if (this.D0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.D0 = textPaint;
            textPaint.setTextSize(getContext().getResources().getDimension(fpc.c));
            this.D0.setColor(getContext().getResources().getColor(epc.f));
            this.D0.setTypeface(Typeface.DEFAULT);
        }
        if (this.E0 == null) {
            Paint paint = new Paint(1);
            this.E0 = paint;
            paint.setColor(getContext().getResources().getColor(epc.d));
            this.E0.setStyle(Paint.Style.FILL);
        }
        float[] w = w(i5);
        if (w == null) {
            canvas.drawRect((float) i7, (float) i8, (float) i9, (float) i10, this.E0);
        } else {
            Path path = new Path();
            path.addRoundRect((float) i7, (float) i8, (float) i9, (float) i10, w, Path.Direction.CW);
            canvas2.drawPath(path, this.E0);
        }
        int i11 = i9 - i7;
        int i12 = i11 - (this.c * 2);
        if (i12 < 0) {
            ((cba) ((y8a) this.a).g()).c(new HandledException("when draw unknown attach, width < 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i12 = i7 - i9;
        }
        if (i12 < 0) {
            ((cba) ((y8a) this.a).g()).c(new HandledException("when draw unknown attach, width < 0, return 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i6 = 0;
        } else {
            i6 = i12;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.D0, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i13 = this.b.x;
        Drawable drawable = V0;
        drawable.setBounds(0, 0, i13, i13);
        int height = staticLayout.getHeight();
        bk4 bk4 = this.b;
        int i14 = (bk4.d * 2) + height + bk4.x;
        canvas.save();
        int i15 = (i11 / 2) + i;
        int i16 = ((i4 - i2) / 2) + i2;
        int i17 = i14 / 2;
        canvas2.translate((float) (i15 - (this.b.x / 2)), (float) (i16 - i17));
        drawable.draw(canvas2);
        canvas.restore();
        canvas.save();
        canvas2.translate((float) (i15 - (staticLayout.getWidth() / 2)), (float) ((i16 + i17) - staticLayout.getHeight()));
        staticLayout.draw(canvas2);
        canvas.restore();
    }

    public final Animatable q(int i) {
        ar0 ar0 = this.o;
        if (((ArrayList) ar0.b).size() <= i || ar0.i(i).X == null) {
            return null;
        }
        return ((k0) ar0.i(i).X).c();
    }

    public final void s() {
        S();
    }

    public void setAttachClickListener(ps8 ps8) {
        this.z0 = ps8;
    }

    public void setAttachVideoListener(qs8 qs8) {
    }

    public void setEmbeddedPlayer(boolean z) {
        this.J0 = z;
    }

    public void setForwarded(boolean z) {
        this.I0 = z;
    }

    public void setPipRequestListener(ss8 ss8) {
    }

    public void setSenderVisible(boolean z) {
        this.H0 = z;
    }

    public final sz t(es8 es8, int i, l20 l20) {
        sz szVar = (sz) x(i);
        rz rzVar = szVar.Z;
        float[] cornersForVideo = getCornersForVideo();
        rzVar.u = cornersForVideo;
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = rzVar.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.setCorners(cornersForVideo);
        }
        szVar.Z.f(l20, es8, this.P0);
        rz rzVar2 = szVar.Z;
        rq4 rq4 = szVar.o;
        rq4.getClass();
        rzVar2.a((la6) rq4, ssc.l);
        if (C()) {
            rq4 rq42 = szVar.o;
            rq42.getClass();
            ((la6) rq42).m(-0.1f, true);
        }
        return szVar;
    }

    public int u(l20 l20) {
        for (int i = 0; i < this.w0.i(); i++) {
            if (this.w0.h(i).r.equals(l20.r)) {
                return i;
            }
        }
        return -1;
    }

    public final int v(MotionEvent motionEvent) {
        if (this.u0.size() == 0) {
            return 0;
        }
        int y = (int) (motionEvent.getY() / ((float) (getMeasuredHeight() / this.u0.size())));
        if (y >= this.u0.size()) {
            hm9.m("ts8", "getAttachPosition: wrong calculated row: %d", Integer.valueOf(y));
            y = this.u0.size() - 1;
        }
        if (((b53) this.u0.get(y)).size() == 0) {
            return 0;
        }
        int x = (int) (motionEvent.getX() / ((float) (getMeasuredWidth() / ((b53) this.u0.get(y)).size())));
        if (x >= ((b53) this.u0.get(y)).size()) {
            hm9.m("ts8", "getAttachPosition: wrong calculated column: %d", Integer.valueOf(x));
            x = ((b53) this.u0.get(y)).size() - 1;
        }
        return ((c53) ((b53) this.u0.get(y)).get(x)).c;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        int i = 0;
        while (true) {
            ar0 ar0 = this.o;
            if (i >= ((ArrayList) ar0.b).size()) {
                return super.verifyDrawable(drawable);
            }
            if (ar0.i(i).e() == drawable) {
                return true;
            }
            i++;
        }
    }

    public final float[] w(int i) {
        if (i < 0 || ((ArrayList) this.o.b).size() <= 0) {
            return null;
        }
        rq4 rq4 = x(i).o;
        rq4.getClass();
        wnc wnc = ((la6) rq4).c;
        if (wnc != null) {
            return wnc.c;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [sq4, sz] */
    public final sq4 x(int i) {
        ar0 ar0 = this.o;
        if (((ArrayList) ar0.b).size() > i) {
            return ar0.i(i);
        }
        ma6 ma6 = new ma6(getContext().getResources());
        ma6.b = 0;
        la6 a2 = ma6.a();
        getContext();
        ? sq4 = new sq4(a2);
        sq4.e().setCallback(this);
        sq4.Z = new rz(this, this);
        ar0.b(sq4);
        return sq4;
    }

    public final String y(int i) {
        if (!this.w0.h(i).t) {
            return getContext().getString(jpc.h3);
        }
        Context context = getContext();
        l20 h = this.w0.h(i);
        int i2 = zqe.a;
        g20 g20 = h.a;
        return g20 == g20.o ? context.getString(jpc.V) : g20 == g20.c ? context.getString(jpc.U) : context.getString(jpc.T);
    }

    public final void z() {
        this.a = vl.b();
        getContext();
        this.b = bk4.b();
        this.s0 = ((y8a) this.a).h();
        this.M0 = ((y8a) this.a).d();
        ((y8a) this.a).p().getClass();
        this.N0 = (dz) ((jyc) jke.b()).getAccessor().c(dz.class);
        this.c = this.b.i;
        this.O0 = new qqd(22, (Object) (uuc) ((y8a) this.a).getAccessor().c(uuc.class));
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.A0 = new fd7(getContext(), (GestureDetector.OnGestureListener) this);
        this.R0 = new a6d(getContext(), this.b.j);
        Drawable b2 = kt3.b(getContext(), gpc.g0);
        this.S0 = b2;
        b2.setTint(-1);
    }

    public ts8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z();
    }
}
