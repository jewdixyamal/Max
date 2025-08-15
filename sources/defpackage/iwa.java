package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: iwa  reason: default package */
public final class iwa extends ZoomableDraweeView {
    public final String G0 = iwa.class.getName();
    public final GestureDetector H0;
    public hwa I0;
    public yt6 J0;
    public boolean K0;

    public iwa(Context context) {
        super(context);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(15, this));
        this.H0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6 = new ma6(getResources());
        ma6.l = ssc.o;
        ma6.b = 0;
        setHierarchy(ma6.a());
    }

    private final e2b getControllerBuilder() {
        e2b a = s36.a.get();
        yt6 yt6 = this.J0;
        boolean z = false;
        if (yt6 != null && yt6.e) {
            z = true;
        }
        a.j = z;
        Uri uri = yt6 != null ? yt6.b : null;
        if (uri != null) {
            a.e = xv6.d(uri).a();
        } else {
            a.e = null;
        }
        a.k = true;
        a.l = getController();
        return a;
    }

    public final boolean getFailure() {
        return this.K0;
    }

    public final void n(Throwable th) {
        super.n(th);
        this.K0 = true;
        hm9.p(this.G0, "Set photo attach failed", th);
        hwa hwa = this.I0;
        if (hwa != null) {
            hwa.n();
        }
    }

    public final void o(ru6 ru6) {
        super.o(ru6);
        this.K0 = false;
        hwa hwa = this.I0;
        if (hwa != null) {
            hwa.b();
        }
    }

    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H0.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void r(yt6 yt6, boolean z) {
        boolean z2 = !yt6.equals(this.J0) || z;
        this.J0 = yt6;
        this.K0 = false;
        if (z2) {
            e2b controllerBuilder = getControllerBuilder();
            Uri uri = yt6.h;
            if (uri != null) {
                controllerBuilder.f = xv6.d(uri).a();
            }
            wv6 wv6 = (wv6) controllerBuilder.e;
            setController(controllerBuilder.a());
        }
    }

    public final void setListener(hwa hwa) {
        this.I0 = hwa;
    }
}
