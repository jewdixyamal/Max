package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Collections;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

public class AttachPhotoView extends ZoomableDraweeView implements qz {
    public static final /* synthetic */ int U0 = 0;
    public final ed3 G0 = vl.b();
    public final GestureDetector H0;
    public r00 I0;
    public final rz J0;
    public es8 K0;
    public l20 L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public wv6 P0;
    public boolean Q0;
    public e52 R0;
    public a6d S0;
    public final qqd T0;

    public AttachPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(0, this));
        this.H0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6 = new ma6(getResources());
        ma6.l = ssc.o;
        ma6.b = 0;
        setHierarchy(ma6.a());
        this.J0 = new rz(this, this);
        this.T0 = new qqd(22, (Object) (uuc) ((y8a) this.G0).getAccessor().c(uuc.class));
    }

    private Animatable getAnimatable() {
        if (getController() != null) {
            return ((k0) getController()).c();
        }
        return null;
    }

    public final void a(l20 l20) {
        s(d20.b);
    }

    public final void b(l20 l20) {
        n46 u1;
        if (this.Q0) {
            au8 l = ((y8a) this.G0).l();
            cu8 cu8 = this.K0.a;
            l.getClass();
            l.t(cu8, l20.r, new l01());
        } else if (TextUtils.isEmpty(l20.b.t0) || !TextUtils.isEmpty(l20.s) || getAnimatable() != null) {
            if (getAnimatable() == null) {
                setController(this.J0.c(getController(), true, false, false).a());
                r00 r00 = this.I0;
                if (r00 != null) {
                    ((FrgAttachPhoto) r00).E1(false);
                }
            } else if (getAnimatable().isRunning()) {
                getAnimatable().stop();
            } else {
                getAnimatable().start();
            }
            invalidate();
        } else {
            r00 r002 = this.I0;
            if (r002 != null) {
                FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r002;
                qj9 qj9 = frgAttachPhoto.K1;
                if (!(qj9 == null || !qj9.b() || (u1 = frgAttachPhoto.r1()) == null)) {
                    ((ActAttachesView) u1).e();
                }
                frgAttachPhoto.F1(true);
            }
        }
    }

    public final void c(l20 l20) {
        if (!l20.o.e()) {
            s(d20.a);
        } else {
            setController(this.J0.c(getController(), true, false, s5c.U(l20, this.K0)).a());
        }
    }

    public final void d(l20 l20) {
    }

    public final void e(l20 l20, es8 es8) {
        r00 r00 = this.I0;
        if (r00 != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00;
            s8g u = frgAttachPhoto.q1.u();
            cu8 cu8 = frgAttachPhoto.C1.a;
            long j = cu8.t0;
            xxc xxc = mg4.o;
            u.a(new k8d(j, Collections.singletonList(Long.valueOf(cu8.b)), (da3) null, true, cu8.U0));
        }
    }

    public final boolean j(l20 l20) {
        return getAnimatable() != null && getAnimatable().isRunning();
    }

    public final void n(Throwable th) {
        super.n(th);
        hm9.p("ru.ok.messages.media.attaches.AttachPhotoView", "Set photo attach failed, messageId " + this.K0.a.b, th);
        if (!(th instanceof NullPointerException)) {
            s(d20.o);
        }
    }

    public final void o(ru6 ru6) {
        boolean z;
        super.o(ru6);
        if (ru6 instanceof j43) {
            c37.e((j43) ru6, this.L0);
        }
        if (!s5c.K(this.L0)) {
            if (!this.L0.f() || TextUtils.isEmpty(this.L0.b.t0)) {
                iv6 o = s36.o();
                wv6 wv6 = this.P0;
                if (wv6 == null) {
                    o.getClass();
                    z = false;
                } else {
                    o43 o43 = o.f.get(o.h.b(wv6, (Object) null));
                    try {
                        z = o43.n0(o43);
                    } finally {
                        o43.S(o43);
                    }
                }
                if (z && !this.L0.o.c()) {
                    s(d20.c);
                    if (((y8a) this.G0).n().c.g.getBoolean("app.media.save.to.gallery", false)) {
                        p00 p00 = new p00(this, 0, ru6);
                        xw0 xw0 = new xw0(22);
                        hle q = ((y8a) this.G0).q();
                        q.getClass();
                        cqc.a(p00, ((jle) q).a(), (f6) null, xw0, (ztc) null);
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.J0;
        if (rzVar != null) {
            rzVar.i();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.J0;
        if (rzVar != null) {
            cqc.b(rzVar.t);
        }
    }

    public final void onDraw(Canvas canvas) {
        a6d a6d;
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        if (!this.L0.o.c()) {
            this.J0.b(canvas, getDrawable().getBounds(), this.Q0);
        }
        if (this.Q0 && (a6d = this.S0) != null) {
            a6d.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        l20 l20;
        boolean N = s5c.N(this.L0);
        if (!this.M0 || (!this.L0.f() && !N)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || (l20 = this.L0) == null) {
            super.onMeasure(i, i2);
            return;
        }
        x10 x10 = N ? l20.j.d.b : l20.b;
        int[] G = j47.G(size, size2, x10.c, x10.o);
        setMeasuredDimension(G[0], G[1]);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a6d a6d = this.S0;
        if (a6d != null) {
            a6d.setBounds(0, 0, i, i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.H0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.L0.o.c()) {
            return true;
        }
        if (this.L0.f() && this.L0.b.X) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.l20 r8, defpackage.es8 r9) {
        /*
            r7 = this;
            l20 r0 = r7.L0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r8.r
            java.lang.String r0 = r0.r
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x001b
            l20 r0 = r7.L0
            d20 r0 = r0.o
            d20 r3 = r8.o
            if (r0 == r3) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            l20 r3 = r7.L0
            boolean r3 = defpackage.s5c.U(r3, r9)
            boolean r4 = defpackage.s5c.U(r8, r9)
            if (r3 == r4) goto L_0x002a
            r3 = r1
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            l20 r4 = r7.L0
            if (r4 == 0) goto L_0x0051
            d20 r5 = r8.o
            d20 r4 = r4.o
            if (r4 == r5) goto L_0x0051
            boolean r4 = r5.c()
            if (r4 == 0) goto L_0x0051
            l20 r4 = r7.L0
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0051
            l20 r4 = r7.L0
            x10 r4 = r4.b
            java.lang.String r4 = r4.t0
            boolean r4 = defpackage.oag.t(r4)
            if (r4 != 0) goto L_0x0051
            r4 = r1
            goto L_0x0052
        L_0x0051:
            r4 = r2
        L_0x0052:
            if (r0 != 0) goto L_0x005b
            if (r4 != 0) goto L_0x005b
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            r7.K0 = r9
            r7.L0 = r8
            rz r4 = r7.J0
            r5 = 0
            r4.u = r5
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r4 = r4.s
            if (r4 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r4.setCorners(r5)
        L_0x006d:
            rz r4 = r7.J0
            e52 r5 = r7.R0
            r4.f(r8, r9, r5)
            rz r4 = r7.J0
            rq4 r5 = r7.getHierarchy()
            la6 r5 = (defpackage.la6) r5
            ssc r6 = defpackage.ssc.o
            r4.a(r5, r6)
            if (r0 == 0) goto L_0x0111
            l20 r0 = r7.L0
            boolean r9 = defpackage.s5c.U(r0, r9)
            r7.Q0 = r9
            rz r9 = r7.J0
            mq4 r0 = r7.getController()
            boolean r4 = r7.Q0
            e2b r9 = r9.c(r0, r2, r2, r4)
            boolean r0 = r7.Q0
            if (r0 == 0) goto L_0x00b7
            a6d r0 = new a6d
            android.content.Context r4 = r7.getContext()
            r5 = 48
            int r5 = defpackage.fk4.b(r5)
            r0.<init>(r4, r5)
            r7.S0 = r0
            int r4 = r7.getMeasuredWidth()
            int r5 = r7.getMeasuredHeight()
            r0.setBounds(r2, r2, r4, r5)
        L_0x00b7:
            android.content.Context r0 = r7.getContext()
            boolean r2 = r7.O0
            boolean r4 = r7.N0
            r1 = r1 ^ r4
            defpackage.tfg.b(r0, r8, r9, r2, r1)
            boolean r0 = r7.N0
            if (r0 == 0) goto L_0x00fb
            l20 r0 = r7.L0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fb
            l20 r0 = r7.L0
            x10 r0 = r0.b
            java.lang.String r0 = r0.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fb
            l20 r0 = r7.L0
            x10 r0 = r0.b
            java.lang.String r0 = r0.a
            kk0 r1 = defpackage.kk0.b
            jk0 r2 = defpackage.jk0.b
            java.lang.String r0 = defpackage.ju0.t(r0, r1, r2)
            java.lang.String r0 = defpackage.j47.O(r0)
            android.net.Uri r0 = defpackage.kk5.r(r0)
            xv6 r0 = defpackage.xv6.d(r0)
            wv6 r0 = r0.a()
            r9.f = r0
        L_0x00fb:
            java.lang.Object r0 = r9.e
            wv6 r0 = (defpackage.wv6) r0
            r7.P0 = r0
            d2b r9 = r9.a()
            r7.setController(r9)
            if (r3 == 0) goto L_0x0111
            boolean r9 = r7.Q0
            if (r9 != 0) goto L_0x0111
            r7.b(r8)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AttachPhotoView.r(l20, es8):void");
    }

    public final void s(d20 d20) {
        es8 u = ((y8a) this.G0).l().u(this.K0.a, this.L0.r, d20);
        this.K0 = u;
        r00 r00 = this.I0;
        int i = 0;
        if (r00 != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00;
            if (frgAttachPhoto.r1() != null) {
                ((ActAttachesView) frgAttachPhoto.r1()).n0(u);
            }
            frgAttachPhoto.C1 = u;
            int i2 = 0;
            while (true) {
                if (i2 >= frgAttachPhoto.C1.a.z0.i()) {
                    break;
                } else if (frgAttachPhoto.C1.a.z0.h(i2).r.equals(frgAttachPhoto.D1.r)) {
                    frgAttachPhoto.D1 = frgAttachPhoto.C1.a.z0.h(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        while (true) {
            if (i >= this.K0.a.z0.i()) {
                i = -1;
                break;
            } else if (this.K0.a.z0.h(i).r.equals(this.L0.r)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            r(this.K0.a.z0.h(i), this.K0);
        }
    }

    public void setListener(r00 r00) {
        this.I0 = r00;
    }

    public void setWrapContentMeasure(boolean z) {
        l20 l20;
        this.M0 = z;
        boolean N = s5c.N(this.L0);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (l20 = this.L0) == null || (!l20.f() && !N)) {
            requestLayout();
            return;
        }
        x10 x10 = N ? this.L0.j.d.b : this.L0.b;
        int[] G = j47.G(getMeasuredWidth(), getMeasuredHeight(), x10.c, x10.o);
        int i = G[0] / 2;
        int i2 = G[1] / 2;
        layout((getMeasuredWidth() / 2) - i, (getMeasuredHeight() / 2) - i2, (getMeasuredWidth() / 2) + i, (getMeasuredHeight() / 2) + i2);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
