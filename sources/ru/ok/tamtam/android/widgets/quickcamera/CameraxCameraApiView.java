package ru.ok.tamtam.android.widgets.quickcamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;", "Landroid/widget/FrameLayout;", "Lhv1;", "", "getStatusBarHeight", "()I", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "Lcrb;", "sizeSelector", "Le5f;", "setPictureSize", "(Lcrb;)V", "Lkkf;", "videoQuality", "setVideoQuality", "(Lkkf;)V", "Lcx1;", "cameraListener", "setCameraListener", "(Lcx1;)V", "", "flash", "setFlash", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class CameraxCameraApiView extends FrameLayout implements hv1 {
    public static final /* synthetic */ int u0 = 0;
    public final Executor a;
    public final q8b b;
    public final ig7 c;
    public final bx1 o;
    public cx1 s0;
    public cdc t0;

    public CameraxCameraApiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets f;
        Window window;
        Context context = getContext();
        View view = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            view = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        } else if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null || (f = rootWindowInsets.getInsets(1)) == null) {
            return 0;
        } else {
            return f.top;
        }
    }

    public final void a(File file) {
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        hm9.m(cls.getName(), "startRecordVideo", new Object[0]);
        if (z7.c(getContext(), "android.permission.RECORD_AUDIO") != 0) {
            hm9.m0(cls.getName(), "No permission to record audio", new Object[0]);
            return;
        }
        hi5 v = new y8(file).v();
        cy1 cy1 = new cy1(0, this);
        ig7 ig7 = this.c;
        ig7.getClass();
        kq0.e();
        c54.p("Camera not initialized.", ig7.i());
        kq0.e();
        boolean z = false;
        c54.p("VideoCapture disabled.", (ig7.b & 4) != 0);
        kq0.e();
        cdc cdc = ig7.g;
        if (cdc != null && !cdc.a.get()) {
            z = true;
        }
        c54.p("Recording video. Only one recording can be active at a time.", !z);
        Context context = ig7.B;
        kw1 kw1 = new kw1(ig7, ot3.a(context), cy1);
        nx0 nx0 = new nx0(context, (adc) ig7.f.L(), v);
        if (ngg.m(context, "android.permission.RECORD_AUDIO") != -1) {
            nx0.x();
            cdc u = nx0.u(this.a, kw1);
            ig7.h.put(kw1, u);
            ig7.g = u;
            this.t0 = u;
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [pw1, java.lang.Exception] */
    public final void b() {
        try {
            this.c.l(1);
        } catch (IllegalStateException e) {
            hm9.p(CameraxCameraApiView.class.getName(), "failed to enable photo-mode", e);
            cx1 cx1 = this.s0;
            if (cx1 != null) {
                ((rxd) cx1).b0(new Exception(e));
            }
        }
    }

    public final void c() {
        hm9.m(CameraxCameraApiView.class.getName(), "destroyCamera", new Object[0]);
        ig7 ig7 = this.c;
        ig7.getClass();
        kq0.e();
        ig7.E = null;
        ig7.m = null;
        l9b l9b = ig7.n;
        if (l9b != null) {
            l9b.a.f();
        }
        this.o.b.d(eg7.ON_DESTROY);
    }

    public final void d(ExecutorService executorService) {
        hm9.m(CameraxCameraApiView.class.getName(), "takePicture", new Object[0]);
        ey1 ey1 = new ey1(0, this);
        ig7 ig7 = this.c;
        ig7.getClass();
        kq0.e();
        c54.p("Camera not initialized.", ig7.i());
        kq0.e();
        boolean z = true;
        if ((ig7.b & 1) == 0) {
            z = false;
        }
        c54.p("ImageCapture disabled.", z);
        kq0.e();
        if (ig7.d.H() == 3 && (ig7.f() == null || ig7.f().b == null)) {
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        ig7.d.J(executorService, ey1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [pw1, java.lang.Exception] */
    public final void e() {
        bx1 bx1 = this.o;
        ig7 ig7 = this.c;
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        hm9.m(cls.getName(), "startPreviewCamera", new Object[0]);
        try {
            ig7.getClass();
            kq0.e();
            ig7.E = bx1;
            ig7.q((Runnable) null);
            bx1.b.d(eg7.ON_RESUME);
        } catch (IllegalStateException e) {
            hm9.p(cls.getName(), "failed to bind camera controller, start preview aborted", e);
            ig7.getClass();
            kq0.e();
            ig7.E = null;
            ig7.m = null;
            l9b l9b = ig7.n;
            if (l9b != null) {
                l9b.a.f();
            }
            cx1 cx1 = this.s0;
            if (cx1 != null) {
                ((rxd) cx1).b0(new Exception(e));
            }
        }
    }

    public final void f(boolean z) {
        this.c.k(z ? px1.b : px1.c);
    }

    public final void g() {
        hm9.m(CameraxCameraApiView.class.getName(), "stopRecordVideo", new Object[0]);
        cdc cdc = this.t0;
        if (cdc != null) {
            cdc.close();
        }
        this.t0 = null;
    }

    public View getRootView() {
        return this;
    }

    public final void h() {
        hm9.m(CameraxCameraApiView.class.getName(), "stopPreviewCamera", new Object[0]);
        this.o.b.d(eg7.ON_STOP);
    }

    public final void i() {
        this.c.l(4);
    }

    public final boolean j() {
        ig7 ig7 = this.c;
        ig7.getClass();
        kq0.e();
        hg7 hg7 = ig7.m;
        fjc fjc = hg7 == null ? null : hg7.c.C0;
        return fjc != null && fjc.a.g() == 0;
    }

    public void setCameraListener(cx1 cx1) {
        this.s0 = cx1;
    }

    public void setFlash(String str) {
        int ordinal = gv1.valueOf(str).ordinal();
        int i = 2;
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 0;
                if (!(ordinal == 2 || ordinal == 3)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = i2;
        }
        this.c.m(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPictureSize(crb crb) {
    }

    public void setVideoQuality(kkf kkf) {
        int ordinal = kkf.ordinal();
        ig7 ig7 = this.c;
        switch (ordinal) {
            case 0:
                ig7.n(b9b.k(mb0.h));
                return;
            case 1:
                ig7.n(b9b.k(mb0.i));
                return;
            case 2:
                ig7.n(b9b.k(mb0.h));
                return;
            case 3:
                ig7.n(b9b.k(mb0.d));
                return;
            case 4:
                ig7.n(b9b.k(mb0.e));
                return;
            case 5:
                ig7.n(b9b.k(mb0.f));
                return;
            case 6:
                ig7.n(b9b.k(mb0.g));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [lw1, ig7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraxCameraApiView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.a = ot3.a(context);
        q8b q8b = new q8b(context);
        this.b = q8b;
        ? lw1 = new lw1(context);
        this.c = lw1;
        bx1 bx1 = new bx1();
        this.o = bx1;
        q8b.setKeepScreenOn(true);
        addView(q8b, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        q8b.getPreviewStreamState().e(bx1, new dy1(0, new l(21, this)));
        q8b.setImplementationMode(n8b.COMPATIBLE);
        lw1.k(px1.c);
        lw1.l(1);
        q8b.getViewPort();
        kq0.e();
        lw1.t = true;
        q8b.setController(lw1);
    }
}
