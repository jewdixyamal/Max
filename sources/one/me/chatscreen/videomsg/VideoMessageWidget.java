package one.me.chatscreen.videomsg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ bc7[] y0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a = new x27(3, (yq0) null);
    public final je7 b;
    public final je7 c;
    public final q7c o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public ViewPropertyAnimator v0;
    public ScaleGestureDetector w0;
    public vxd x0;

    static {
        Class<VideoMessageWidget> cls = VideoMessageWidget.class;
        hob hob = new hob(cls, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0);
        oec oec = nec.a;
        y0 = new bc7[]{hob, zr6.e(oec, cls, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0), zr6.f(cls, "timerView", "getTimerView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "durationView", "getDurationView()Lone/me/messages/list/ui/view/videomsg/VideoMessageDurationSlider;", 0, oec)};
    }

    public VideoMessageWidget() {
        super((Bundle) null, 0, 3, (z84) null);
        je7 je7 = so2.a;
        this.b = to2.a.getAccessor().d(ygf.class);
        this.c = createViewModelLazy(ljf.class, new nhd(14, new bse(14)));
        this.o = viewBinding(t8a.t);
        this.X = viewBinding(t8a.x);
        this.Y = viewBinding(t8a.w);
        this.Z = viewBinding(t8a.u);
        this.s0 = tu0.r(3, new bse(15));
        this.t0 = tu0.r(3, new mjf(this, 0));
        this.u0 = tu0.r(3, new mjf(this, 1));
    }

    public static final void m0(VideoMessageWidget videoMessageWidget, FrameLayout frameLayout, int i, m56 m56) {
        videoMessageWidget.getClass();
        ImageView imageView = new ImageView(frameLayout.getContext());
        float f = (float) 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(G, G, G, G);
        v3c.y(new ze2(3, (Continuation) null, 9), imageView);
        m56.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public static final void n0(VideoMessageWidget videoMessageWidget, int i, int i2, g8b g8b) {
        videoMessageWidget.getClass();
        bc7[] bc7Arr = y0;
        bc7 bc7 = bc7Arr[3];
        q7c q7c = videoMessageWidget.Z;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        ((ohf) q7c.T0(videoMessageWidget, bc7)).setLayoutParams(layoutParams);
        ((ohf) q7c.T0(videoMessageWidget, bc7Arr[3])).setVisibility(0);
        vxd vxd = videoMessageWidget.x0;
        if (vxd == null || !vxd.isActive()) {
            videoMessageWidget.x0 = j47.T(videoMessageWidget.getViewLifecycleScope(), (lx3) null, (vx3) null, new pjf(videoMessageWidget, i, i2, g8b, (Continuation) null), 3);
        }
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final ygf o0() {
        return (ygf) this.b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.content.Context r11 = r10.getContext()
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r13 = -1
            r12.<init>(r13, r13)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r11)
            r0.setLayoutParams(r12)
            qjf r11 = defpackage.qjf.b
            r0.setOnTouchListener(r11)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r13, r13)
            r0.setLayoutParams(r11)
            q8b r11 = new q8b
            android.content.Context r12 = r0.getContext()
            r11.<init>(r12)
            int r12 = defpackage.t8a.t
            r11.setId(r12)
            boolean r12 = r0.isLaidOut()
            r13 = 17
            r1 = 0
            r2 = 0
            r3 = 16
            if (r12 == 0) goto L_0x00d8
            boolean r12 = r0.isLayoutRequested()
            if (r12 != 0) goto L_0x00d8
            float r12 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r12
            int r4 = defpackage.tu0.G(r4)
            android.content.Context r5 = r11.getContext()
            int r5 = defpackage.br7.D(r5)
            int r4 = r4 * 2
            int r5 = r5 - r4
            r6 = 40
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r12 = defpackage.rh4.c(r12, r7, r6)
            android.view.ViewParent r6 = r0.getParent()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0085
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x0086
        L_0x0085:
            r6 = r2
        L_0x0086:
            if (r6 == 0) goto L_0x0099
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0093
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0094
        L_0x0093:
            r6 = r2
        L_0x0094:
            if (r6 == 0) goto L_0x0099
            int r6 = r6.bottomMargin
            goto L_0x009a
        L_0x0099:
            r6 = r1
        L_0x009a:
            int r7 = r0.getMeasuredHeight()
            int r8 = r0.getPaddingBottom()
            int r7 = r7 - r8
            int r8 = r0.getPaddingTop()
            int r7 = r7 - r8
            int r7 = r7 - r6
            int r7 = r7 - r12
            int r7 = r7 - r4
            int r12 = java.lang.Math.min(r5, r7)
            if (r12 != 0) goto L_0x00c3
            r12 = 352(0x160, float:4.93E-43)
            float r12 = (float) r12
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r12 = r12 * r4
            int r12 = defpackage.tu0.G(r12)
        L_0x00c3:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r12, r12)
            r4.gravity = r13
            r11.setLayoutParams(r4)
            r11.setVisibility(r1)
            g8b r4 = r11.getSurfaceProvider()
            n0(r10, r12, r12, r4)
            goto L_0x00e1
        L_0x00d8:
            hp1 r12 = new hp1
            r4 = 6
            r12.<init>(r11, r4, r10)
            r0.addOnLayoutChangeListener(r12)
        L_0x00e1:
            ei1 r12 = new ei1
            r4 = 6
            r12.<init>(r4, r10)
            r11.setOnTouchListener(r12)
            r12 = 1
            r11.setKeepScreenOn(r12)
            r11.setClipToOutline(r12)
            e62 r12 = new e62
            r12.<init>(r11, r4)
            r11.setOutlineProvider(r12)
            r0.addView(r11)
            ohf r12 = new ohf
            android.content.Context r4 = r0.getContext()
            r12.<init>(r4)
            int r4 = defpackage.t8a.u
            r12.setId(r4)
            r12.setPausingEnabled(r1)
            r1 = 8
            r12.setVisibility(r1)
            r0.addView(r12)
            sp0 r12 = new sp0
            android.content.Context r5 = r0.getContext()
            r7 = 1092616192(0x41200000, float:10.0)
            r8 = 0
            r6 = 0
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            rjf r4 = new rjf
            r5 = 0
            r4.<init>(r11, r5)
            r12.i = r4
            rjf r4 = new rjf
            r5 = 1
            r4.<init>(r11, r5)
            r12.j = r4
            r0.setBackground(r12)
            float r11 = (float) r3
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = defpackage.tu0.G(r11)
            tjf r12 = new tjf
            r3 = 0
            r12.<init>(r10, r3)
            m0(r10, r0, r11, r12)
            r11 = 72
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = defpackage.tu0.G(r11)
            tjf r12 = new tjf
            r3 = 1
            r12.<init>(r10, r3)
            m0(r10, r0, r11, r12)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r12 = r0.getContext()
            r11.<init>(r12)
            int r12 = defpackage.t8a.w
            r11.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r12.<init>(r3, r3)
            r3 = 81
            r12.gravity = r3
            r3 = 24
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.tu0.G(r3)
            r12.bottomMargin = r3
            r11.setLayoutParams(r12)
            r11.setGravity(r13)
            je7 r12 = r10.s0
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.InsetDrawable r12 = (android.graphics.drawable.InsetDrawable) r12
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r12, r2, r2, r2)
            kqe r12 = defpackage.i4f.p
            r12.b(r11, defpackage.du4.b)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            r3 = 1086324736(0x40c00000, float:6.0)
            float r13 = r13 * r3
            r12.setCornerRadius(r13)
            r11.setBackground(r12)
            float r12 = (float) r1
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = defpackage.tu0.G(r12)
            int r13 = r11.getPaddingLeft()
            int r3 = r11.getPaddingTop()
            int r4 = r11.getPaddingBottom()
            r11.setPadding(r13, r3, r12, r4)
            r11.setVisibility(r1)
            r1b r12 = new r1b
            r13 = 20
            r12.<init>((java.lang.Object) r10, (kotlin.coroutines.Continuation) r2, (int) r13)
            defpackage.v3c.y(r12, r11)
            r0.addView(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.videomsg.VideoMessageWidget.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        ((ejf) o0()).B0 = null;
        ejf ejf = (ejf) o0();
        ejf.getClass();
        hm9.m(ejf.class.getName(), "releaseAll videoMessage", new Object[0]);
        bx1 bx1 = ejf.K0;
        if (bx1 != null) {
            bx1.b.d(eg7.ON_DESTROY);
        }
        ejf.K0 = null;
        ejf.G0.m((Object) null, Boolean.FALSE);
        ejf.x0 = null;
        k9b k9b = ejf.Z;
        if (k9b != null) {
            k9b.f();
        }
        ejf.Z = null;
        ejf.z0 = null;
        ejf.y0 = null;
        ejf.v0 = null;
        zgf zgf = ejf.w0;
        if (zgf != null) {
            ((sif) zgf.e).release();
        }
        ejf.w0 = null;
        ejf.L0.compareAndSet(true, false);
        ejf.M0.o1(ejf, ejf.N0[0], (Object) null);
        ViewPropertyAnimator viewPropertyAnimator = this.v0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.w0 = null;
        vxd vxd = this.x0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.x0 = null;
    }

    public final void onViewCreated(View view) {
        this.w0 = new ScaleGestureDetector(getContext(), new njf(this));
        eh7 eh7 = ((ejf) o0()).K0;
        if (eh7 == null) {
            eh7 = getViewLifecycleOwner();
        }
        ((q8b) this.o.T0(this, y0[0])).getPreviewStreamState().e(eh7, new dy1(1, new rpc(15, this)));
        w7c w7c = ((ejf) o0()).E0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new ujf((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((ljf) this.c.getValue()).c, getViewLifecycleOwner().Q(), fg7), new vjf((Continuation) null, this), 5), getViewLifecycleScope());
        ((ejf) o0()).B0 = new gte(12, (Object) this);
    }
}
