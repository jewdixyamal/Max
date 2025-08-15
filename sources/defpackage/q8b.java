package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q8b  reason: default package */
public final class q8b extends FrameLayout {
    public final m8b A0;
    public final i61 B0;
    public final sy4 C0;
    public n8b a = n8b.PERFORMANCE;
    public pu9 b;
    public final fvc c;
    public final l8b o;
    public boolean s0;
    public final ci9 t0;
    public final AtomicReference u0;
    public lw1 v0;
    public final r8b w0;
    public final fag x0;
    public yw1 y0;
    public MotionEvent z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v0, types: [l8b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v5, types: [fvc, android.view.View] */
    public q8b(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? obj = new Object();
        obj.h = o8b.FILL_CENTER;
        this.o = obj;
        this.s0 = true;
        this.t0 = new xm7(p8b.a);
        this.u0 = new AtomicReference();
        this.w0 = new r8b(obj);
        this.A0 = new m8b(this);
        this.B0 = new i61(4, this);
        this.C0 = new sy4(24, (Object) this);
        kq0.e();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, d3c.PreviewView, 0, 0);
        int[] iArr = d3c.PreviewView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, (AttributeSet) null, obtainStyledAttributes, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(d3c.PreviewView_scaleType, obj.h.a);
            for (o8b o8b : o8b.values()) {
                if (o8b.a == integer) {
                    setScaleType(o8b);
                    int integer2 = obtainStyledAttributes.getInteger(d3c.PreviewView_implementationMode, 0);
                    for (n8b n8b : n8b.values()) {
                        if (n8b.a == integer2) {
                            setImplementationMode(n8b);
                            obtainStyledAttributes.recycle();
                            this.x0 = new fag(context, new yt8(20, (Object) this));
                            if (getBackground() == null) {
                                setBackgroundColor(lt3.a(getContext(), 17170444));
                            }
                            ? view = new View(context, (AttributeSet) null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(0.0f);
                            view.setElevation(Float.MAX_VALUE);
                            this.c = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(see see, n8b n8b) {
        boolean equals = see.e.p().j().equals("androidx.camera.camera2.legacy");
        boolean z = (yi4.a.e(SurfaceViewStretchedQuirk.class) == null && yi4.a.e(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z) {
            return true;
        }
        int ordinal = n8b.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + n8b);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private eu6 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(eu6 eu6) {
        lw1 lw1 = this.v0;
        if (lw1 != null) {
            cvc cvc = cvc.a;
            dvc dvc = new dvc(cvc, eu6);
            dvc f = lw1.f();
            lw1.C.put(cvc, dvc);
            dvc f2 = lw1.f();
            if (f2 != null && !f2.equals(f)) {
                dvc f3 = lw1.f();
                if (f3 == null) {
                    fu6 fu6 = lw1.d;
                    jw1 jw1 = lw1.D;
                    fu6.getClass();
                    gvc gvc = new gvc(jw1);
                    fu6.u = gvc;
                    fu6.d().g(gvc);
                    return;
                }
                fu6 fu62 = lw1.d;
                fu62.getClass();
                gvc gvc2 = new gvc(f3.b);
                fu62.u = gvc2;
                fu62.d().g(gvc2);
                f3.a.name();
            }
        }
    }

    public final void a(boolean z) {
        kq0.e();
        uof viewPort = getViewPort();
        if (this.v0 != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.v0.a(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e) {
                if (z) {
                    e.toString();
                    return;
                }
                throw e;
            }
        }
    }

    public final void b() {
        Display display;
        yw1 yw1;
        kq0.e();
        if (this.b != null) {
            if (!(!this.s0 || (display = getDisplay()) == null || (yw1 = this.y0) == null)) {
                int l = yw1.l(display.getRotation());
                int rotation = display.getRotation();
                l8b l8b = this.o;
                if (l8b.g) {
                    l8b.c = l;
                    l8b.e = rotation;
                }
            }
            this.b.m();
        }
        r8b r8b = this.w0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        r8b.getClass();
        kq0.e();
        synchronized (r8b) {
            try {
                if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                    Rect rect = r8b.c;
                    if (rect != null) {
                        r8b.d = r8b.b.a(size, layoutDirection, rect);
                    }
                }
                r8b.d = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        lw1 lw1 = this.v0;
        if (lw1 != null) {
            getSensorToViewTransform();
            lw1.getClass();
            kq0.e();
        }
    }

    public Bitmap getBitmap() {
        Bitmap g;
        kq0.e();
        pu9 pu9 = this.b;
        if (pu9 == null || (g = pu9.g()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) pu9.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        l8b l8b = (l8b) pu9.d;
        if (!l8b.f()) {
            return g;
        }
        Matrix d = l8b.d();
        RectF e = l8b.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), g.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / ((float) l8b.a.getWidth()), e.height() / ((float) l8b.a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(g, matrix, new Paint(7));
        return createBitmap;
    }

    public lw1 getController() {
        kq0.e();
        return this.v0;
    }

    public n8b getImplementationMode() {
        kq0.e();
        return this.a;
    }

    public v99 getMeteringPointFactory() {
        kq0.e();
        return this.w0;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, zna] */
    public zna getOutputTransform() {
        Matrix matrix;
        l8b l8b = this.o;
        kq0.e();
        try {
            matrix = l8b.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = l8b.b;
        if (matrix == null || rect == null) {
            return null;
        }
        RectF rectF = e1f.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(e1f.a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.b instanceof hre) {
            matrix.postConcat(getMatrix());
        } else {
            getMatrix().isIdentity();
        }
        new Size(rect.width(), rect.height());
        return new Object();
    }

    public xm7 getPreviewStreamState() {
        return this.t0;
    }

    public o8b getScaleType() {
        kq0.e();
        return this.o.h;
    }

    public eu6 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        kq0.e();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        l8b l8b = this.o;
        if (!l8b.f()) {
            return null;
        }
        Matrix matrix = new Matrix(l8b.d);
        matrix.postConcat(l8b.c(size, layoutDirection));
        return matrix;
    }

    public g8b getSurfaceProvider() {
        kq0.e();
        return this.C0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, uof] */
    public uof getViewPort() {
        kq0.e();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        kq0.e();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        ? obj = new Object();
        obj.a = viewPortScaleType;
        obj.b = rational;
        obj.c = rotation;
        obj.d = layoutDirection;
        return obj;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.A0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.B0);
        pu9 pu9 = this.b;
        if (pu9 != null) {
            pu9.j();
        }
        a(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.B0);
        pu9 pu9 = this.b;
        if (pu9 != null) {
            pu9.k();
        }
        lw1 lw1 = this.v0;
        if (lw1 != null) {
            lw1.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.A0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [c54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [c54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v14, types: [c54, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (r9 != false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            lw1 r2 = r0.v0
            if (r2 != 0) goto L_0x000d
            boolean r0 = super.onTouchEvent(r19)
            return r0
        L_0x000d:
            int r2 = r19.getPointerCount()
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x0017
            r2 = r3
            goto L_0x0018
        L_0x0017:
            r2 = r4
        L_0x0018:
            int r5 = r19.getAction()
            if (r5 != r3) goto L_0x0020
            r5 = r3
            goto L_0x0021
        L_0x0020:
            r5 = r4
        L_0x0021:
            long r6 = r19.getEventTime()
            long r8 = r19.getDownTime()
            long r6 = r6 - r8
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r8 = (long) r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0035
            r6 = r3
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            if (r2 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            if (r6 == 0) goto L_0x0042
            r0.z0 = r1
            r18.performClick()
            return r3
        L_0x0042:
            fag r0 = r0.x0
            r0.getClass()
            r19.getEventTime()
            r0.getClass()
            int r2 = r19.getActionMasked()
            boolean r5 = r0.c
            if (r5 == 0) goto L_0x005a
            android.view.GestureDetector r5 = r0.l
            r5.onTouchEvent(r1)
        L_0x005a:
            int r5 = r19.getPointerCount()
            int r6 = r19.getButtonState()
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0068
            r6 = r3
            goto L_0x0069
        L_0x0068:
            r6 = r4
        L_0x0069:
            int r7 = r0.k
            r8 = 2
            if (r7 != r8) goto L_0x0072
            if (r6 != 0) goto L_0x0072
            r7 = r3
            goto L_0x0073
        L_0x0072:
            r7 = r4
        L_0x0073:
            if (r2 == r3) goto L_0x007d
            r9 = 3
            if (r2 == r9) goto L_0x007d
            if (r7 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r9 = r4
            goto L_0x007e
        L_0x007d:
            r9 = r3
        L_0x007e:
            yt8 r10 = r0.b
            r11 = 0
            if (r2 == 0) goto L_0x0085
            if (r9 == 0) goto L_0x00ad
        L_0x0085:
            boolean r12 = r0.g
            if (r12 == 0) goto L_0x009b
            dag r12 = new dag
            r0.a()
            r12.<init>()
            r10.b(r12)
            r0.g = r4
            r0.h = r11
            r0.k = r4
            goto L_0x00a9
        L_0x009b:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x00a9
            r0.g = r4
            r0.h = r11
            r0.k = r4
        L_0x00a9:
            if (r9 == 0) goto L_0x00ad
            goto L_0x01d8
        L_0x00ad:
            boolean r12 = r0.g
            if (r12 != 0) goto L_0x00cf
            boolean r12 = r0.d
            if (r12 == 0) goto L_0x00cf
            boolean r12 = r0.b()
            if (r12 != 0) goto L_0x00cf
            if (r9 != 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00cf
            float r6 = r19.getX()
            r0.i = r6
            float r6 = r19.getY()
            r0.j = r6
            r0.k = r8
            r0.h = r11
        L_0x00cf:
            r6 = 6
            if (r2 == 0) goto L_0x00dc
            if (r2 == r6) goto L_0x00dc
            r9 = 5
            if (r2 == r9) goto L_0x00dc
            if (r7 == 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r7 = r4
            goto L_0x00dd
        L_0x00dc:
            r7 = r3
        L_0x00dd:
            if (r2 != r6) goto L_0x00e1
            r6 = r3
            goto L_0x00e2
        L_0x00e1:
            r6 = r4
        L_0x00e2:
            if (r6 == 0) goto L_0x00e9
            int r9 = r19.getActionIndex()
            goto L_0x00ea
        L_0x00e9:
            r9 = -1
        L_0x00ea:
            if (r6 == 0) goto L_0x00ef
            int r6 = r5 + -1
            goto L_0x00f0
        L_0x00ef:
            r6 = r5
        L_0x00f0:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x0108
            float r12 = r0.i
            float r13 = r0.j
            float r14 = r19.getY()
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x0104
            r14 = r3
            goto L_0x0105
        L_0x0104:
            r14 = r4
        L_0x0105:
            r0.m = r14
            goto L_0x0125
        L_0x0108:
            r12 = r4
            r13 = r11
            r14 = r13
        L_0x010b:
            if (r12 >= r5) goto L_0x011c
            if (r9 == r12) goto L_0x0119
            float r15 = r1.getX(r12)
            float r13 = r13 + r15
            float r15 = r1.getY(r12)
            float r14 = r14 + r15
        L_0x0119:
            int r12 = r12 + 1
            goto L_0x010b
        L_0x011c:
            float r12 = (float) r6
            float r13 = r13 / r12
            float r12 = r14 / r12
            r17 = r13
            r13 = r12
            r12 = r17
        L_0x0125:
            r15 = r4
            r14 = r11
        L_0x0127:
            if (r15 >= r5) goto L_0x0147
            if (r9 == r15) goto L_0x0144
            float r16 = r1.getX(r15)
            float r16 = r16 - r12
            float r16 = java.lang.Math.abs(r16)
            float r16 = r16 + r11
            float r11 = r1.getY(r15)
            float r11 = r11 - r13
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 + r14
            r14 = r11
            r11 = r16
        L_0x0144:
            int r15 = r15 + 1
            goto L_0x0127
        L_0x0147:
            float r1 = (float) r6
            float r11 = r11 / r1
            float r14 = r14 / r1
            float r1 = (float) r8
            float r11 = r11 * r1
            float r14 = r14 * r1
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0154
            goto L_0x015b
        L_0x0154:
            double r5 = (double) r11
            double r14 = (double) r14
            double r5 = java.lang.Math.hypot(r5, r14)
            float r14 = (float) r5
        L_0x015b:
            boolean r1 = r0.g
            defpackage.tu0.G(r12)
            r0.getClass()
            defpackage.tu0.G(r13)
            r0.getClass()
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x0189
            boolean r5 = r0.g
            if (r5 == 0) goto L_0x0189
            float r5 = (float) r4
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x017a
            if (r7 == 0) goto L_0x0189
        L_0x017a:
            dag r5 = new dag
            r0.a()
            r5.<init>()
            r10.b(r5)
            r0.g = r4
            r0.h = r14
        L_0x0189:
            if (r7 == 0) goto L_0x0191
            r0.e = r14
            r0.f = r14
            r0.h = r14
        L_0x0191:
            boolean r5 = r0.b()
            int r6 = r0.a
            if (r5 == 0) goto L_0x019a
            r4 = r6
        L_0x019a:
            boolean r5 = r0.g
            if (r5 != 0) goto L_0x01c0
            float r4 = (float) r4
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01c0
            if (r1 != 0) goto L_0x01b2
            float r1 = r0.h
            float r1 = r14 - r1
            float r1 = java.lang.Math.abs(r1)
            float r4 = (float) r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c0
        L_0x01b2:
            r0.e = r14
            r0.f = r14
            dag r1 = new dag
            r1.<init>()
            r10.b(r1)
            r0.g = r3
        L_0x01c0:
            if (r2 != r8) goto L_0x01d8
            r0.e = r14
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x01d4
            eag r1 = new eag
            float r2 = r0.a()
            r1.<init>(r2)
            r10.b(r1)
        L_0x01d4:
            float r1 = r0.e
            r0.f = r1
        L_0x01d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performClick() {
        if (this.v0 != null) {
            MotionEvent motionEvent = this.z0;
            float x = motionEvent != null ? motionEvent.getX() : ((float) getWidth()) / 2.0f;
            MotionEvent motionEvent2 = this.z0;
            float y = motionEvent2 != null ? motionEvent2.getY() : ((float) getHeight()) / 2.0f;
            lw1 lw1 = this.v0;
            if (lw1.h() && lw1.t) {
                lw1.w.i(1);
                r8b r8b = this.w0;
                u99 a2 = r8b.a(x, y, 0.16666667f);
                u99 a3 = r8b.a(x, y, 0.25f);
                bw4 bw4 = new bw4(a2);
                bw4.b(a3, 2);
                kq0.a(((hw1) lw1.m.c.B0.d).h(new bw4(bw4)), new qqd(7, (Object) lw1), ju0.k());
            }
        }
        this.z0 = null;
        return super.performClick();
    }

    public void setController(lw1 lw1) {
        kq0.e();
        lw1 lw12 = this.v0;
        if (!(lw12 == null || lw12 == lw1)) {
            lw12.b();
            setScreenFlashUiInfo((eu6) null);
        }
        this.v0 = lw1;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(n8b n8b) {
        kq0.e();
        this.a = n8b;
    }

    public void setScaleType(o8b o8b) {
        kq0.e();
        this.o.h = o8b;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        kq0.e();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
