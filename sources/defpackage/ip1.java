package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* renamed from: ip1  reason: default package */
public final class ip1 extends FrameLayout implements dra {
    public static final /* synthetic */ int z0 = 0;
    public final khe a = new khe(new dk1(15));
    public final Handler b = new Handler(Looper.getMainLooper());
    public TextureViewRenderer c;
    public gp1 o;
    public k56 s0;
    public haf t0;
    public boolean u0;
    public llf v0;
    public final je7 w0 = tu0.r(3, new md1(4, this));
    public boolean x0;
    public boolean y0;

    public ip1(Context context) {
        super(context, (AttributeSet) null, 0);
        ugf videoLayoutUpdatesController;
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new qq0(3, this));
        if (isLaidOut() && this.c != null && (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) != null) {
            videoLayoutUpdatesController.a(this, this.v0);
        }
    }

    public static void a(ip1 ip1) {
        ip1.b.post(ip1.getUpdateWhenReadyRunnable());
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.x0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.w0.getValue();
    }

    private final era getVideoController() {
        return (era) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final ugf getVideoLayoutUpdatesController() {
        k56 k56 = this.s0;
        if (k56 != null) {
            return (ugf) k56.invoke();
        }
        return null;
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            llf llf = this.v0;
            if (llf != null) {
                ((fra) getVideoController()).removeParticipantView(llf.b, textureViewRenderer);
            }
            ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((fra) getVideoController()).releaseParticipantView(textureViewRenderer);
            removeAllViews();
        }
        gp1 gp1 = this.o;
        if (gp1 != null) {
            gp1.a(false);
        }
        this.v0 = null;
        this.c = null;
        this.y0 = false;
        this.b.removeCallbacks(getUpdateWhenReadyRunnable());
        ((fra) getVideoController()).X.remove(this);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, mec] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r5 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            haf r0 = r8.t0
            boolean r1 = r8.u0
            r2 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            boolean r3 = r0.b
            boolean r4 = r0.g
            if (r3 == 0) goto L_0x0011
            if (r4 == 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            llf r3 = r0.d
            boolean r5 = r0.c
            if (r1 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
        L_0x0019:
            r2 = r3
            goto L_0x0023
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            llf r2 = r0.h
            goto L_0x0023
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0031
            boolean r4 = r0.e
            if (r4 == 0) goto L_0x0031
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0031
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x003a
            boolean r4 = r2.a
            if (r4 == 0) goto L_0x003a
            r4 = r1
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            if (r4 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r3
        L_0x0042:
            if (r0 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x00f5
            llf r4 = r8.v0
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r5 = r2.b
            if (r4 != 0) goto L_0x004d
            goto L_0x007e
        L_0x004d:
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            if (r6 == 0) goto L_0x007e
            ugf r7 = r8.getVideoLayoutUpdatesController()
            if (r7 == 0) goto L_0x005a
            r7.c(r6)
        L_0x005a:
            boolean r7 = r4.equals(r2)
            if (r7 != 0) goto L_0x0075
            era r7 = r8.getVideoController()
            fra r7 = (defpackage.fra) r7
            r7.getClass()
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r4 = r4.b
            r7.removeParticipantView(r4, r6)
            era r4 = r8.getVideoController()
            r4.setParticipantView(r5, r6)
        L_0x0075:
            ugf r4 = r8.getVideoLayoutUpdatesController()
            if (r4 == 0) goto L_0x007e
            r4.a(r6, r2)
        L_0x007e:
            mec r4 = new mec
            r4.<init>()
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            r4.a = r6
            if (r6 != 0) goto L_0x00f2
            era r6 = r8.getVideoController()
            android.content.Context r7 = r8.getContext()
            fra r6 = (defpackage.fra) r6
            ru.ok.android.externcalls.sdk.ui.RendererView r6 = r6.createVideoViewInstance(r7)
            r4.a = r6
            android.view.View r6 = (android.view.View) r6
            android.widget.FrameLayout$LayoutParams r7 = r8.getParams()
            r8.addView(r6, r3, r7)
            era r6 = r8.getVideoController()
            java.lang.Object r7 = r4.a
            ru.ok.android.externcalls.sdk.ui.RendererView r7 = (ru.ok.android.externcalls.sdk.ui.RendererView) r7
            r6.setParticipantView(r5, r7)
            ugf r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00ba
            java.lang.Object r6 = r4.a
            android.view.View r6 = (android.view.View) r6
            r5.a(r6, r2)
        L_0x00ba:
            java.lang.Object r5 = r4.a
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r5 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r5
            r8.c = r5
            boolean r5 = r8.isLaidOut()
            if (r5 == 0) goto L_0x00dc
            boolean r5 = r8.isLayoutRequested()
            if (r5 != 0) goto L_0x00dc
            ugf r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00e5
            java.lang.Object r6 = r4.a
            android.view.View r6 = (android.view.View) r6
            llf r7 = r8.v0
            r5.a(r6, r7)
            goto L_0x00e5
        L_0x00dc:
            hp1 r5 = new hp1
            r6 = 0
            r5.<init>(r8, r6, r4)
            r8.addOnLayoutChangeListener(r5)
        L_0x00e5:
            java.lang.Object r4 = r4.a
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r4 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r4
            bk r5 = new bk
            r6 = 4
            r5.<init>(r6, r8)
            r4.setFrameSizeListener(r5)
        L_0x00f2:
            r8.v0 = r2
            goto L_0x0104
        L_0x00f5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0101:
            r8.c()
        L_0x0104:
            gp1 r2 = r8.o
            if (r2 == 0) goto L_0x0113
            boolean r4 = r8.y0
            if (r4 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r1 = r3
        L_0x0110:
            r2.a(r1)
        L_0x0113:
            era r0 = r8.getVideoController()
            fra r0 = (defpackage.fra) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r0.X
            r0.add(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip1.d():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.v0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        c();
    }

    public final void setFullScreen(boolean z) {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(getParams());
                textureViewRenderer.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.x0 = z;
    }

    public final void setListener(gp1 gp1) {
        this.o = gp1;
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56) {
        this.s0 = k56;
    }
}
