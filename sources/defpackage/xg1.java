package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: xg1  reason: default package */
public final class xg1 extends FrameLayout {
    public static final /* synthetic */ bc7[] x0;
    public final je7 a = tu0.r(3, new k11(23));
    public final khe b;
    public final je7 c;
    public x1b o;
    public final PointF s0;
    public final wg1 t0;
    public final wg1 u0;
    public vg1 v0;
    public final wg1 w0;

    static {
        Class<xg1> cls = xg1.class;
        x0 = new bc7[]{new oi9(cls, "boundariesOffset", "getBoundariesOffset()Lone/me/calls/ui/ui/pip/fake/boundaries/PipBoundariesOffset;"), rh4.g(nec.a, cls, "pipTheme", "getPipTheme()Lone/me/sdk/design/OneMeTheme;"), new oi9(cls, "pipMode", "getPipMode()Lone/me/calls/ui/view/pip/CallPipView$Companion$PipMode;")};
    }

    public xg1(Context context) {
        super(context, (AttributeSet) null);
        this.b = new khe(new a5(context, this));
        this.c = zi1.a.c();
        this.o = v1b.a;
        this.s0 = new PointF();
        this.t0 = new wg1(new j1b(0, 0), this);
        this.u0 = new wg1(this, 0);
        this.w0 = new wg1(this, 1);
        setLayoutParams(new FrameLayout.LayoutParams(tu0.G(((float) 118) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 174) * fk4.d().getDisplayMetrics().density)));
        addView(getFakePipView());
    }

    /* access modifiers changed from: private */
    public final ap1 getFakePipView() {
        return (ap1) this.b.getValue();
    }

    private final int getFlag() {
        return ((Number) this.a.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final aa1 getPipPositionMediator() {
        return (aa1) this.c.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i2;
        this.o.j(f, f2, i3 - i, i4 - i2, getBoundariesOffset());
        PointF pointF = this.s0;
        if (!(!(pointF.x == 0.0f || pointF.y == 0.0f))) {
            pointF = null;
        }
        if (pointF != null) {
            this.o.i(pointF.x - f, pointF.y - f2);
        }
    }

    public final void d(qma qma) {
        ap1 fakePipView = getFakePipView();
        CharSequence charSequence = qma.j;
        bc7[] bc7Arr = ap1.l1;
        fakePipView.J((String) null, charSequence);
        fakePipView.setAvatar(qma.a);
        fakePipView.setButtonAction(qma.h);
        fakePipView.G(qma.d);
        fakePipView.F(qma.f);
        fakePipView.setOpponentVideo(qma.g);
    }

    public final vg1 getApplicationPipDepended() {
        return this.v0;
    }

    public final j1b getBoundariesOffset() {
        bc7 bc7 = x0[0];
        return (j1b) this.t0.b;
    }

    public final ug1 getPipMode() {
        bc7 bc7 = x0[2];
        return (ug1) this.w0.b;
    }

    public final fka getPipTheme() {
        bc7 bc7 = x0[1];
        return (fka) this.u0.b;
    }

    public final WindowManager.LayoutParams getWindowsViewLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(tu0.G(((float) 118) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 174) * fk4.d().getDisplayMetrics().density), 1000, getFlag(), -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.o.e(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(i, i2, i3, i4);
    }

    public final void setApplicationPipDepended(vg1 vg1) {
        this.v0 = vg1;
    }

    public final void setBackgroundCorners(float f) {
        getFakePipView().setBackgroundCorners(f);
    }

    public final void setBoundariesOffset(j1b j1b) {
        this.t0.o1(this, x0[0], j1b);
    }

    public final void setListener(xo1 xo1) {
        ap1 fakePipView = getFakePipView();
        fakePipView.h1 = gg1.c;
        fakePipView.b1 = xo1;
    }

    public final void setPipMode(ug1 ug1) {
        this.w0.o1(this, x0[2], ug1);
    }

    public final void setPipTheme(fka fka) {
        this.u0.o1(this, x0[1], fka);
    }

    public final void setStartPosition(PointF pointF) {
        if (pointF != null) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.s0;
            pointF2.x = f;
            pointF2.y = f2;
        }
        c(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56) {
        getFakePipView().setVideoLayoutUpdatesControllerProvider(k56);
    }
}
