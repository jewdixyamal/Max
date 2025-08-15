package ru.ok.messages.video.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.ArrayList;

public class FloatingVideoView extends FrameLayout {
    public static final /* synthetic */ int E0 = 0;
    public kn5 A0;
    public final WindowManager.LayoutParams B0;
    public final tg C0;
    public VelocityTracker D0;
    public final int a;
    public final int b;
    public final int c;
    public int o;
    public int s0;
    public final int t0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public final WindowManager u0 = nd7.z(getContext());
    public int v0;
    public int w0;
    public float x0;
    public float y0;
    public AnimatorSet z0;

    public FloatingVideoView(Context context) {
        super(context);
        getContext();
        bk4 b2 = bk4.b();
        this.C0 = ((y8a) vl.b()).c();
        this.a = fk4.b((int) 140.0f);
        int i = b2.h;
        this.b = i;
        this.c = i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 0, 0, 2038, 16779016, -3);
        this.B0 = layoutParams;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    public final void a() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet == null || !animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = this.z0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.z0.removeAllListeners();
                this.z0 = null;
            }
            ArrayList arrayList = new ArrayList();
            WindowManager.LayoutParams layoutParams = this.B0;
            int i = (layoutParams.width / 2) + layoutParams.x;
            int i2 = this.o;
            arrayList.add(ObjectAnimator.ofInt(this, "x", new int[]{this.B0.x, i < i2 / 2 ? getLeftMargin() : (i2 - getRightMargin()) - this.B0.width}));
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.z0 = animatorSet3;
                animatorSet3.setInterpolator(this.C0.a.l());
                this.z0.setDuration(120);
                this.z0.playTogether(arrayList);
                this.z0.addListener(new mf(4, (Object) this));
                this.z0.start();
                return;
            }
            t33 t33 = vl.o.a().a;
            WindowManager.LayoutParams layoutParams2 = this.B0;
            int i3 = layoutParams2.x;
            int i4 = layoutParams2.y;
            t33.k(i3, "app.video.pip.pos.x");
            t33.k(i4, "app.video.pip.pos.y");
            return;
        }
        hm9.m("ru.ok.messages.video.widgets.FloatingVideoView", "Frontier animation is already started", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r6 = r1.y;
        r2 = r1.height;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.getLeftMargin()
            int r1 = r5.getRightMargin()
            android.view.WindowManager$LayoutParams r2 = r5.B0
            int r3 = r2.x
            if (r3 >= r0) goto L_0x0011
            r2.x = r0
            goto L_0x001c
        L_0x0011:
            int r0 = r2.width
            int r3 = r3 + r0
            int r4 = r5.o
            int r4 = r4 - r1
            if (r3 <= r4) goto L_0x001c
            int r4 = r4 - r0
            r2.x = r4
        L_0x001c:
            int r0 = r5.getTopMargin()
            android.view.WindowManager$LayoutParams r1 = r5.B0
            int r2 = r1.y
            if (r2 >= r0) goto L_0x0028
            r1.y = r0
        L_0x0028:
            if (r6 == 0) goto L_0x0037
            int r6 = r1.y
            int r2 = r1.height
            int r6 = r6 + r2
            int r5 = r5.s0
            int r5 = r5 - r0
            if (r6 <= r5) goto L_0x0037
            int r5 = r5 - r2
            r1.y = r5
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.b(boolean):void");
    }

    public final void c(int i, int i2) {
        int i3;
        int min = (int) (((double) Math.min(this.o, this.s0)) * 0.62d);
        if (i <= 0) {
            i = this.a;
        }
        if (i2 <= 0) {
            i2 = this.a;
        }
        if (i > i2) {
            i3 = (i2 * min) / i;
        } else {
            int i4 = (i * min) / i2;
            i3 = min;
            min = i4;
        }
        int i5 = this.a;
        if (min < i5) {
            i3 = (i3 * i5) / min;
            min = i5;
        }
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.width = min;
        layoutParams.height = i3;
        post(new dd4(23, this));
    }

    public int getLeftMargin() {
        return this.b;
    }

    public int getRightMargin() {
        return this.b;
    }

    public int getTopMargin() {
        return ((y8a) vl.b()).f().j() + this.c;
    }

    public int getWindowHeight() {
        return this.B0.height;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return this.B0;
    }

    public int getWindowWidth() {
        return this.B0.width;
    }

    public int getXPos() {
        return this.B0.x;
    }

    public int getYPos() {
        return this.B0.y;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.z0.removeAllListeners();
            this.z0 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, u2, pj9] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Action "
            r0.<init>(r1)
            int r1 = r15.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ru.ok.messages.video.widgets.FloatingVideoView"
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            int r0 = r15.getAction()
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 5
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 6
            if (r0 != r1) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14.x0 = r15
            r14.y0 = r15
            goto L_0x0127
        L_0x0036:
            int r0 = r14.v0
            if (r0 <= 0) goto L_0x0111
            float r0 = r14.y0
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0111
            float r1 = r14.x0
            double r3 = (double) r1
            double r0 = (double) r0
            float r5 = r15.getRawX()
            double r5 = (double) r5
            float r15 = r15.getRawY()
            double r7 = (double) r15
            double r3 = r3 - r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r0 = r0 - r7
            double r0 = java.lang.Math.pow(r0, r5)
            double r0 = r0 + r3
            double r0 = java.lang.Math.sqrt(r0)
            int r15 = (int) r0
            int r0 = r14.t0
            if (r15 <= r0) goto L_0x0127
            kn5 r15 = r14.A0
            r0 = 1
            if (r15 == 0) goto L_0x0110
            android.content.Context r14 = r14.getContext()
            o1b r15 = (defpackage.o1b) r15
            pj9 r1 = r15.E0
            if (r1 == 0) goto L_0x0076
            goto L_0x0110
        L_0x0076:
            android.view.WindowManager r1 = defpackage.nd7.z(r14)
            int[] r3 = r15.a(r14)
            android.view.Display r4 = r1.getDefaultDisplay()
            int r4 = r4.getRotation()
            if (r4 == r0) goto L_0x008e
            r5 = 3
            if (r4 != r5) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r4 = r2
            goto L_0x008f
        L_0x008e:
            r4 = r0
        L_0x008f:
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r5 = r3[r2]
            ti4 r6 = r15.c
            if (r4 == 0) goto L_0x009c
            int r7 = r6.j()
            goto L_0x009d
        L_0x009c:
            r7 = r2
        L_0x009d:
            int r5 = r5 + r7
            int r7 = r5 + 1
            r3 = r3[r0]
            int r5 = r6.j()
            int r5 = r5 + r3
            if (r4 != 0) goto L_0x00c4
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.view.Display r8 = r1.getDefaultDisplay()
            r8.getMetrics(r3)
            int r8 = r3.heightPixels
            android.view.Display r9 = r1.getDefaultDisplay()
            r9.getRealMetrics(r3)
            int r3 = r3.heightPixels
            if (r3 <= r8) goto L_0x00c4
            int r3 = r3 - r8
            goto L_0x00c5
        L_0x00c4:
            r3 = r2
        L_0x00c5:
            int r3 = r3 + r5
            if (r4 != 0) goto L_0x00cc
            int r2 = r6.j()
        L_0x00cc:
            r9 = r2
            r11 = 67384(0x10738, float:9.4425E-41)
            r12 = -3
            r8 = 0
            r10 = 2038(0x7f6, float:2.856E-42)
            r5 = r13
            r6 = r7
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            uk9 r2 = new uk9
            tg r3 = r15.X
            r2.<init>(r14, r3)
            pj9 r14 = new pj9
            u00 r3 = new u00
            r4 = 21
            r3.<init>((java.lang.Object) r15, (java.lang.Object) r1, (java.lang.Object) r2, (int) r4)
            r4 = 0
            r14.<init>((int) r4, (java.lang.Object) r2)
            r14.c = r3
            r2.r(r14)
            r15.E0 = r14
            java.lang.Object r14 = r2.c
            android.view.View r14 = (android.view.View) r14
            r1.addView(r14, r13)
            pj9 r14 = r15.E0
            java.lang.Object r14 = r14.b
            kk9 r14 = (defpackage.kk9) r14
            uk9 r14 = (defpackage.uk9) r14
            android.widget.TextView r15 = r14.X
            tg r1 = r14.o
            r1.i(r15)
            android.view.View r14 = r14.Y
            r1.j(r14)
        L_0x0110:
            return r0
        L_0x0111:
            android.view.WindowManager$LayoutParams r0 = r14.B0
            int r1 = r0.x
            r14.v0 = r1
            int r0 = r0.y
            r14.w0 = r0
            float r0 = r15.getRawX()
            r14.x0 = r0
            float r15 = r15.getRawY()
            r14.y0 = r15
        L_0x0127:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pj9 pj9;
        es8 es8;
        l20 l20;
        if (this.D0 == null) {
            this.D0 = VelocityTracker.obtain();
        }
        this.D0.addMovement(motionEvent);
        this.D0.computeCurrentVelocity(1);
        float abs = Math.abs(this.D0.getYVelocity());
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            this.B0.x = this.v0 + ((int) (motionEvent.getRawX() - this.x0));
            this.B0.y = this.w0 + ((int) (motionEvent.getRawY() - this.y0));
            b(false);
            this.u0.updateViewLayout(this, this.B0);
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams = this.B0;
                if (layoutParams.y + layoutParams.height > this.s0) {
                    kn5 kn5 = this.A0;
                    if (kn5 != null) {
                        ((o1b) kn5).c(true);
                    }
                }
            }
            kn5 kn52 = this.A0;
            if (kn52 != null) {
                ((o1b) kn52).c(false);
            }
        } else {
            this.x0 = -1.0f;
            this.y0 = -1.0f;
            VelocityTracker velocityTracker = this.D0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.D0 = null;
            }
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams2 = this.B0;
                if (layoutParams2.y + layoutParams2.height > this.s0) {
                    kn5 kn53 = this.A0;
                    if (kn53 != null) {
                        o1b o1b = (o1b) kn53;
                        ef7 ef7 = o1b.b;
                        if (ef7.get() != null) {
                            ((ad) ef7.get()).e(SystemClock.elapsedRealtime() - o1b.J0, "ACTION_PIP_DURATION", (String) null);
                        }
                        lj9 lj9 = o1b.B0;
                        if (!(lj9 == null || (es8 = o1b.G0) == null || (l20 = o1b.F0) == null)) {
                            long k = lj9.k();
                            long c2 = o1b.B0.c();
                            boolean c0 = o1b.B0.c0();
                            au8 au8 = o1b.Y;
                            au8.getClass();
                            au8.t(es8.a, l20.r, new zt8(k, c2, c0));
                        }
                        o1b.e(true);
                    }
                    return true;
                }
            }
            kn5 kn54 = this.A0;
            if (!(kn54 == null || (pj9 = ((o1b) kn54).E0) == null)) {
                uk9 uk9 = (uk9) ((kk9) pj9.b);
                TextView textView = uk9.X;
                tg tgVar = uk9.o;
                tgVar.g(textView);
                tgVar.m(uk9.Y).u(new tk9(0, uk9));
            }
            a();
        }
        return true;
    }

    public void setListener(kn5 kn5) {
        this.A0 = kn5;
    }

    @Keep
    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.x = i;
        this.u0.updateViewLayout(this, layoutParams);
    }

    @Keep
    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.y = i;
        this.u0.updateViewLayout(this, layoutParams);
    }
}
