package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

public class RLottieDrawable extends BitmapDrawable implements Animatable, to0, nm9 {
    public static final Handler H1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal I1 = new ThreadLocal();
    public static final ThreadLocal J1 = new ThreadLocal();
    public static final ll4 K1 = new ll4();
    public static final Rect L1 = new Rect();
    public static Gson gson;
    public static il4 lottieCacheGenerateQueue;
    public final ArraySet A0;
    public String A1;
    public int B0;
    public volatile boolean B1;
    public int C0;
    public volatile Throwable C1;
    public int D0;
    public String D1;
    public long E0;
    public final Set E1;
    public volatile boolean F0;
    public final Set F1;
    public Runnable G0;
    public final Set G1;
    public Runnable H0;
    public volatile Bitmap I0;
    public volatile Bitmap J0;
    public volatile Bitmap K0;
    public boolean L0;
    public CountDownLatch M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public float U0;
    public float V0;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public final RectF Y0;
    public int[] Z;
    public final RectF[] Z0;
    public final int a;
    public final Paint[] a1;
    public final int b;
    public volatile boolean b1;
    public final int[] c;
    public volatile boolean c1;
    public volatile long d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public File h1;
    public boolean i1;
    public Runnable j1;
    public Runnable k1;
    public View l1;
    public ho9 m1;
    public final t3c n1;
    public int o;
    public final t3c o1;
    public boolean p1;
    public final t3c q1;
    public final t3c r1;
    public int[] s0;
    public vo0 s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public final HashMap t0;
    public int t1;
    public volatile HashMap u0;
    public boolean u1;
    public HashMap v0;
    public boolean v1;
    public boolean w0;
    public final t3c w1;
    public Runnable whenCacheDone;
    public boolean x0;
    public long x1;
    public WeakReference y0;
    public int y1;
    public View z0;
    public Bitmap z1;

    public interface DrawableLoadListener {
        void onError(Throwable th) {
        }

        void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, so0 so0, boolean z) {
        this(file, i, i2, so0, z, (int[]) null, 0);
    }

    public static /* synthetic */ void a(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static /* synthetic */ void b(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static void c(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.j1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.j1 = null;
        }
    }

    /* access modifiers changed from: private */
    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new il4("rlottie-generator-queue");
    }

    private static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    /* access modifiers changed from: private */
    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native long getFramesCount(String str, String str2);

    /* access modifiers changed from: private */
    public static native void replaceColors(long j, int[] iArr);

    /* access modifiers changed from: private */
    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.E1.add(drawableLoadListener);
        if (this.B1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.C1 != null) {
            drawableLoadListener.onError(this.C1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.G1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.A0.add(imageReceiver);
        }
    }

    public void beginApplyLayerColors() {
        this.R0 = true;
    }

    public void cacheFrame(int i) {
        if (this.y1 != i || this.z1 == null) {
            if (this.z1 == null) {
                this.z1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.d1;
            this.y1 = i;
            Bitmap bitmap = this.z1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        return this.i1 ? this.s1 != null : this.d1 != 0;
    }

    public void checkCache(Runnable runnable) {
        if (this.s1 == null) {
            he.d(runnable);
            return;
        }
        this.p1 = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.G0 == null) {
            vo0.B++;
            il4 il4 = lottieCacheGenerateQueue;
            s3c s3c = new s3c(this, runnable, 0);
            this.G0 = s3c;
            il4.b(s3c);
        }
    }

    public void checkCacheCancel() {
        if (this.s1 != null && lottieCacheGenerateQueue != null && this.G0 != null && this.A0.isEmpty() && getCallback() == null) {
            View view = this.l1;
            if (view == null || !view.isAttachedToWindow()) {
                Runnable runnable = this.G0;
                if (runnable != null) {
                    lottieCacheGenerateQueue.a(runnable);
                    vo0.c();
                    this.G0 = null;
                }
                this.p1 = false;
                this.u1 = false;
            }
        }
    }

    public void commitApplyLayerColors() {
        if (this.R0) {
            this.R0 = false;
            if (!this.b1 && this.O0) {
                if (this.S0 <= 2) {
                    this.S0 = 0;
                }
                this.F0 = false;
                this.P0 = false;
                if (!o()) {
                    this.Q0 = true;
                }
            }
            invalidateInternal();
        }
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, getPaint(), false, 0, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.z1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = L1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.z1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.Z0;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.a1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, (Paint) null, true, 0, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float f;
        float f2;
        if (canLoadFrames() && !this.N0) {
            boolean z2 = true;
            if (!z) {
                z = !Looper.getMainLooper().isCurrentThread();
            }
            if (!z) {
                updateCurrentFrame(j, false);
            }
            RectF rectF = z ? this.Z0[i] : this.Y0;
            if (rectF == null) {
                rectF = this.Y0;
            }
            if (paint == null) {
                paint = z ? this.a1[i] : getPaint();
            }
            if (paint.getAlpha() != 0) {
                if (!hasBitmap()) {
                    RLottie.getLogger().i("!hasBitmap() " + this.A1);
                }
                if (this.I0 == null) {
                    RLottie.getLogger().i("rendering bitmap is null");
                }
                if (!this.f1 && this.I0 != null) {
                    if (!z) {
                        rectF.set(getBounds());
                        if (this.W0) {
                            this.U0 = rectF.width() / ((float) this.a);
                            this.V0 = rectF.height() / ((float) this.b);
                            this.W0 = false;
                            if (Math.abs(rectF.width() - ((float) this.a)) < ((float) he.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) he.a(1.0f))) {
                                z2 = false;
                            }
                            this.X0 = z2;
                        }
                        f2 = this.U0;
                        f = this.V0;
                        z2 = this.X0;
                    } else {
                        float width = rectF.width() / ((float) this.a);
                        float height = rectF.height() / ((float) this.b);
                        if (Math.abs(rectF.width() - ((float) this.a)) < ((float) he.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) he.a(1.0f))) {
                            z2 = false;
                        }
                        f2 = width;
                        f = height;
                    }
                    if (!z2) {
                        try {
                            canvas.drawBitmap(this.I0, rectF.left, rectF.top, paint);
                        } catch (Exception e) {
                            RLottie.getLogger().o(e);
                        }
                    } else if (this.scaleByCanvas) {
                        this.srcRect.set(0, 0, this.I0.getWidth(), this.I0.getHeight());
                        canvas.drawBitmap(this.I0, this.srcRect, rectF, paint);
                    } else {
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.scale(f2, f);
                        canvas.drawBitmap(this.I0, 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                    if (this.b1 && !z) {
                        invalidateInternal();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r4 = (one.me.rlottie.RLottieDrawable) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r3 = 1
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof one.me.rlottie.RLottieDrawable
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            one.me.rlottie.RLottieDrawable r4 = (one.me.rlottie.RLottieDrawable) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 == r0) goto L_0x0013
            return r1
        L_0x0013:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r3.B0
            int r2 = r4.B0
            if (r0 == r2) goto L_0x0021
            return r1
        L_0x0021:
            java.lang.String r3 = r3.D1
            java.lang.String r4 = r4.D1
            boolean r3 = java.util.Objects.equals(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.equals(java.lang.Object):boolean");
    }

    public final void finalize() {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.I0 != null) {
            return this.I0;
        }
        if (this.J0 != null) {
            return this.J0;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.K0;
    }

    public int getCurrentFrame() {
        return this.S0;
    }

    public String getCurrentUrl() {
        return this.A1;
    }

    public int getCustomEndFrame() {
        return this.X;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((((float) iArr[0]) / ((float) iArr[1])) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String file = ((File) this.m1.c).toString();
        ho9 ho9 = this.m1;
        ho9.getClass();
        int i = ho9.a;
        int i2 = this.b;
        long create = create(file, (String) null, this.a, i2, new int[3], false, (int[]) ho9.b, false, i);
        if (create == 0) {
            return bitmap;
        }
        long j = create;
        Bitmap bitmap2 = bitmap;
        getFrame(j, 0, bitmap2, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(create);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        vo0 vo0 = this.s1;
        if (vo0 == null) {
            return 1.0f;
        }
        if (this.G0 != null) {
            float framesCount = ((float) vo0.d.get()) / ((float) getFramesCount());
            if (Float.isNaN(framesCount)) {
                return 0.0f;
            }
            if (Float.isInfinite(framesCount)) {
                return 1.0f;
            }
            return Math.max(Math.min(framesCount, 1.0f), 0.0f);
        } else if (vo0.q) {
            return this.s1.g() ? 0.0f : 1.0f;
        } else {
            return -2.0f;
        }
    }

    public int getIntrinsicHeight() {
        return this.b;
    }

    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.E0;
    }

    public int getMinimumHeight() {
        return this.b;
    }

    public int getMinimumWidth() {
        return this.a;
    }

    public int getNextFrame(Bitmap bitmap) {
        long j = this.x1;
        if (j == 0) {
            return -1;
        }
        int i = this.T0 ? 2 : 1;
        if (getFrame(j, this.t1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) == -5) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        int i2 = this.t1 + i;
        this.t1 = i2;
        return i2 > this.c[0] ? 0 : 1;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.J0;
    }

    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.I0;
    }

    public float getScaleX() {
        return this.U0;
    }

    public float getScaleY() {
        return this.V0;
    }

    public int getTimeBetweenFrames() {
        return this.o;
    }

    public final void h() {
        Runnable runnable = this.G0;
        if (runnable != null) {
            lottieCacheGenerateQueue.a(runnable);
            vo0.c();
            this.G0 = null;
        }
        if (!hasParent() && this.J0 != null && this.H0 != null) {
            this.H0 = null;
            this.J0 = null;
        }
    }

    public boolean hasBitmap() {
        return !this.c1 && !(this.I0 == null && this.J0 == null) && !this.f1;
    }

    public boolean hasParent() {
        return (this.A0.isEmpty() && this.l1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.A0.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.v0 != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.D1;
        return Integer.hashCode(this.B0) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void i() {
        if (this.N0) {
            h();
            if (this.H0 == null && this.G0 == null && this.d1 != 0) {
                l(true);
            }
        }
        if (this.d1 == 0 && this.s1 == null) {
            m();
            return;
        }
        this.L0 = true;
        if (!hasParent()) {
            lm9 logger = RLottie.getLogger();
            logger.i("RLottieDrawable. Call stop because !hasParentView() " + this.A1);
            stop();
        }
        if (this.b1) {
            o();
        }
    }

    public void invalidateInternal() {
        if (!this.c1) {
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            View view = this.l1;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public boolean isApplyTransformation() {
        return this.W0;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.Q0;
    }

    public boolean isGeneratingCache() {
        return this.G0 != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.S0 == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return !this.B1 && this.C1 != null;
    }

    public boolean isNeedScale() {
        return this.X0;
    }

    public boolean isRecycled() {
        return this.c1;
    }

    public boolean isRunning() {
        return this.b1;
    }

    public boolean isWaitingForNextTask() {
        return this.L0;
    }

    public final void j() {
        this.B1 = true;
        this.C1 = null;
        if (he.b()) {
            Iterator it = new ArrayList(this.E1).iterator();
            while (it.hasNext()) {
                ((DrawableLoadListener) it.next()).onLoaded(this);
            }
            return;
        }
        he.d(new r3c(this, 1));
    }

    public final void k(File file, int[] iArr) {
        if (gson == null) {
            gson = new Gson();
        }
        Class<v3c> cls = v3c.class;
        if (file != null) {
            try {
                FileReader fileReader = new FileReader(file.getAbsolutePath());
                au1.r(gson.fromJson(fileReader, cls));
                try {
                    fileReader.close();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                RLottie.getLogger().o(e);
                String absolutePath = file.getAbsolutePath();
                ho9 ho9 = this.m1;
                boolean z = this.T0;
                int i = ho9.a;
                int i2 = this.b;
                long create = create(absolutePath, (String) null, this.a, i2, iArr, false, (int[]) ho9.b, z, i);
                if (create != 0) {
                    destroy(create);
                    return;
                }
                return;
            }
        } else {
            au1.r(gson.fromJson((String) null, cls));
        }
        throw null;
    }

    public final void l(boolean z) {
        long j = this.d1;
        this.d1 = 0;
        if (j != 0) {
            if (z) {
                ml4.a(new q3c(j, 0, 0), false);
                return;
            }
            w4d w4d = tu0.l.f;
            ((ScheduledExecutorService) ((khe) w4d.b).getValue()).execute(new q3c(j, 0, 1));
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I0);
        arrayList.add(this.K0);
        arrayList.add(this.J0);
        this.J0 = null;
        this.I0 = null;
        this.K0 = null;
        he.c(arrayList);
        if (this.j1 != null) {
            this.j1 = null;
        }
    }

    public void multiplySpeed(float f) {
        this.o *= (int) (1.0f / f);
    }

    public final void n() {
        if (!this.R0 && !this.b1 && this.O0) {
            if (this.S0 <= 2) {
                this.S0 = 0;
            }
            this.F0 = false;
            this.P0 = false;
            if (!o()) {
                this.Q0 = true;
            }
        }
        invalidateInternal();
    }

    public final boolean o() {
        boolean z = false;
        if (this.H0 == null && this.J0 == null) {
            if (!canLoadFrames() || this.N0 || (!this.b1 && (!this.O0 || this.P0))) {
                RLottie.getLogger().i("RLottieDrawable. Can't schedule next frame invalid state");
            } else if (this.p1 && !this.v1) {
                return false;
            } else {
                if (!this.t0.isEmpty()) {
                    this.u0.putAll(this.t0);
                    this.t0.clear();
                }
                int[] iArr = this.Z;
                if (iArr != null) {
                    this.s0 = iArr;
                    this.Z = null;
                }
                this.H0 = this.w1;
                if (!this.T0 || !he.b()) {
                    K1.b(this.H0);
                } else {
                    Runnable runnable = this.H0;
                    if (this.M0 != null) {
                        z = true;
                    }
                    ml4.a(runnable, z);
                }
                return true;
            }
        }
        return false;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W0 = true;
    }

    public void onFailed(Throwable th) {
        RLottie.getLogger().o(th);
        this.B1 = false;
        this.C1 = th;
        he.d(new do9(this, 24, th));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [so0, java.lang.Object] */
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.D1 = file.getAbsolutePath();
        this.h1 = file;
        if (this.i1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.i1) {
            this.s1 = new vo0(file, this, new Object(), this.a, this.b, !this.T0);
            ho9 ho9 = new ho9(this);
            this.m1 = ho9;
            ho9.c = file.getAbsoluteFile();
            this.m1.getClass();
            this.d1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.i1, (int[]) null, this.T0, 0);
            destroy(this.d1);
            this.d1 = 0;
        } else {
            this.d1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.i1, (int[]) null, this.T0, 0);
            if (this.d1 == 0) {
                file.delete();
            }
        }
        if (this.T0 && this.c[1] < 60) {
            this.T0 = false;
        }
        this.o = Math.max(this.T0 ? 33 : 16, (int) (1000.0f / ((float) this.c[1])));
        j();
        he.d(new r3c(this, 0));
    }

    public final void p(long j, long j2, boolean z, long j3) {
        int i;
        this.K0 = this.I0;
        this.I0 = this.J0;
        this.J0 = null;
        if (this.F0 || (this.C0 == 0 && this.B0 == 1)) {
            stop();
        }
        this.H0 = null;
        if (this.g1) {
            this.g1 = false;
        } else if (this.f1) {
            this.f1 = false;
        }
        this.P0 = true;
        this.L0 = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.E0 = j;
        } else {
            this.E0 = j - Math.min(16, j2 - j3);
        }
        if (z && this.Q0) {
            this.P0 = false;
            this.Q0 = false;
        }
        Set set = this.F1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.S0);
                it.remove();
            }
        }
        if (isLastFrame() && ((i = this.B0) == 2 || i == 1 || i == 3 || this.F0)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.G1) {
                int i2 = this.B0;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        o();
    }

    public void post(Runnable runnable) {
        if (!this.T0 || !he.b()) {
            K1.b(new i40(runnable, 5));
        } else {
            ml4.a(new i40(runnable, 4), this.M0 != null);
        }
    }

    public void prepareForGenerateCache() {
        File file;
        String file2 = ((File) this.m1.c).toString();
        ho9 ho9 = this.m1;
        ho9.getClass();
        int i = ho9.a;
        int i2 = this.b;
        long create = create(file2, (String) null, this.a, i2, new int[3], false, (int[]) ho9.b, false, i);
        this.x1 = create;
        if (create == 0 && (file = this.h1) != null) {
            file.delete();
        }
    }

    public void recycle(boolean z) {
        this.b1 = false;
        this.c1 = true;
        h();
        if (this.H0 == null && this.G0 == null && !this.p1) {
            l(z);
            vo0 vo0 = this.s1;
            if (vo0 != null) {
                RandomAccessFile randomAccessFile = vo0.u;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    vo0.u = null;
                }
                vo0.t = true;
                this.s1 = null;
            }
            m();
            return;
        }
        this.N0 = true;
    }

    public void releaseForGenerateCache() {
        long j = this.x1;
        if (j != 0) {
            destroy(j);
            this.x1 = 0;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.E1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.G1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.A0.remove(imageReceiver);
            checkCacheCancel();
        }
    }

    public void replaceColors(int[] iArr) {
        this.Z = iArr;
        n();
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.w0 = z;
    }

    public boolean restart() {
        return restart(false);
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.O0 = z;
        if (z) {
            o();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.v1 = z;
    }

    public void setAllowVibration(boolean z) {
        this.x0 = z;
    }

    public void setAutoRepeat(int i) {
        if (this.B0 != 2 || i != 3 || this.S0 == 0) {
            this.B0 = i;
        }
    }

    public void setAutoRepeatCount(int i) {
        this.C0 = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public void setCurrentParentView(View view) {
        this.z0 = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.X == i || i > this.c[0]) {
            return false;
        }
        this.X = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.t1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.e1 = z;
    }

    public void setLayerColor(String str, int i) {
        this.t0.put(str, Integer.valueOf(i));
        n();
    }

    public void setMasterParent(View view) {
        this.l1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.j1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.y0 = new WeakReference(runnable);
        } else if (this.y0 != null) {
            this.y0 = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.k1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.Y = z;
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0, j) / ((long) this.o)) % ((long) this.c[0])), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> hashMap) {
        this.v0 = hashMap;
    }

    public void start() {
        if (RLottie.config.isEnabled && !this.b1) {
            if ((this.B0 < 2 || this.D0 == 0) && this.X != this.S0) {
                this.b1 = true;
                if (this.e1) {
                    this.f1 = true;
                    if (this.H0 != null) {
                        this.g1 = true;
                    }
                }
                o();
                invalidateInternal();
            }
        }
    }

    public void stop() {
        lm9 logger = RLottie.getLogger();
        logger.i("Stop url: " + getCurrentUrl() + " class: " + hashCode());
        this.b1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.E0;
        if (!z || this.T0) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z && f <= 80.0f)) ? this.o - 6 : this.o;
        } else {
            i = this.o - 16;
        }
        if (this.b1) {
            if (this.I0 == null && this.J0 == null) {
                o();
            } else if (this.J0 == null) {
            } else {
                if (this.I0 == null || (j3 >= ((long) i) && !this.skipFrameUpdate)) {
                    HashMap hashMap = this.v0;
                    if (!(hashMap == null || this.z0 == null || !this.x0 || (num = (Integer) hashMap.get(Integer.valueOf(this.S0 - 1))) == null)) {
                        this.z0.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    }
                    p(j2, j3, false, (long) i);
                }
            }
        } else if ((this.Q0 || (this.O0 && j3 >= ((long) i))) && this.J0 != null) {
            p(j2, j3, true, (long) i);
        }
    }

    public RLottieDrawable(File file, int i, int i2, so0 so0, boolean z, int[] iArr, int i3) {
        int[] iArr2;
        char c2;
        File file2 = file;
        boolean z2 = z;
        int[] iArr3 = new int[3];
        this.c = iArr3;
        this.X = -1;
        this.t0 = new HashMap();
        this.u0 = new HashMap();
        this.w0 = false;
        this.x0 = true;
        this.A0 = new ArraySet();
        this.B0 = 1;
        this.C0 = -1;
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.Y0 = new RectF();
        this.Z0 = new RectF[2];
        this.a1 = new Paint[2];
        this.n1 = new t3c(this, 0);
        this.o1 = new t3c(this, 1);
        this.q1 = new t3c(this, 2);
        this.r1 = new t3c(this, 3);
        this.w1 = new t3c(this, 4);
        this.srcRect = new Rect();
        this.y1 = -1;
        this.A1 = null;
        this.B1 = false;
        this.C1 = null;
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.G1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.T0 = z2;
        this.D1 = file.getAbsolutePath();
        this.i1 = so0 != null;
        getPaint().setFlags(2);
        this.h1 = file2;
        if (this.i1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.i1) {
            ho9 ho9 = new ho9(this);
            this.m1 = ho9;
            ho9.c = file.getAbsoluteFile();
            ho9 ho92 = this.m1;
            ho92.getClass();
            ho92.b = iArr;
            ho92.a = i3;
            k(file2, iArr3);
            if (this.T0 && iArr3[1] < 60) {
                this.T0 = false;
            }
            this.s1 = new vo0(file, this, so0, i, i2, !z2);
            c2 = 1;
            iArr2 = iArr3;
        } else {
            int[] iArr4 = iArr;
            int i4 = i3;
            c2 = 1;
            iArr2 = iArr3;
            this.d1 = create(file.getAbsolutePath(), (String) null, i, i2, iArr3, this.i1, iArr, this.T0, i3);
            if (this.d1 == 0) {
                RLottie.getLogger().i("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.T0 && iArr2[1] < 60) {
                this.T0 = false;
            }
        }
        this.o = Math.max(this.T0 ? 33 : 16, (int) (1000.0f / ((float) iArr2[c2])));
        j();
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0, 0);
    }

    public boolean restart(boolean z) {
        if (!z && ((this.B0 < 2 || this.D0 == 0) && this.C0 < 0)) {
            return false;
        }
        this.D0 = 0;
        this.B0 = 2;
        start();
        return true;
    }

    public void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r3 > 1.0f) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0007
        L_0x0005:
            r3 = r0
            goto L_0x000e
        L_0x0007:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            int[] r0 = r2.c
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.setCurrentFrame(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.setProgress(float, boolean):void");
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i >= 0 && i <= this.c[0]) {
            if (this.S0 != i || z2) {
                this.S0 = i;
                this.F0 = false;
                this.P0 = false;
                if (this.e1) {
                    this.f1 = true;
                    if (this.H0 != null) {
                        this.g1 = true;
                    }
                }
                if ((!z || z2) && this.L0 && this.J0 != null) {
                    this.K0 = this.J0;
                    this.J0 = null;
                    this.H0 = null;
                    this.L0 = false;
                }
                if (!z && this.H0 == null) {
                    this.M0 = new CountDownLatch(1);
                }
                if (z2 && !this.b1) {
                    this.b1 = true;
                }
                if (!o()) {
                    this.Q0 = true;
                } else if (!z) {
                    try {
                        this.M0.await();
                    } catch (Exception e) {
                        RLottie.getLogger().o(e);
                    }
                    this.M0 = null;
                }
                invalidateSelf();
            }
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104 A[SYNTHETIC, Splitter:B:30:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RLottieDrawable(int r10, java.lang.String r11, int r12, int r13, boolean r14, int[] r15) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 3
            int[] r0 = new int[r0]
            r9.c = r0
            r0 = -1
            r9.X = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.t0 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.u0 = r1
            r1 = 0
            r9.w0 = r1
            r2 = 1
            r9.x0 = r2
            android.util.ArraySet r3 = new android.util.ArraySet
            r3.<init>()
            r9.A0 = r3
            r9.B0 = r2
            r9.C0 = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.U0 = r3
            r9.V0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r9.Y0 = r3
            r3 = 2
            android.graphics.RectF[] r4 = new android.graphics.RectF[r3]
            r9.Z0 = r4
            android.graphics.Paint[] r4 = new android.graphics.Paint[r3]
            r9.a1 = r4
            t3c r4 = new t3c
            r5 = 0
            r4.<init>(r9, r5)
            r9.n1 = r4
            t3c r4 = new t3c
            r5 = 1
            r4.<init>(r9, r5)
            r9.o1 = r4
            t3c r4 = new t3c
            r5 = 2
            r4.<init>(r9, r5)
            r9.q1 = r4
            t3c r4 = new t3c
            r5 = 3
            r4.<init>(r9, r5)
            r9.r1 = r4
            t3c r4 = new t3c
            r5 = 4
            r4.<init>(r9, r5)
            r9.w1 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r9.srcRect = r4
            r9.y1 = r0
            r0 = 0
            r9.A1 = r0
            r9.B1 = r1
            r9.C1 = r0
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.E1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.F1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.G1 = r4
            r9.a = r12
            r9.b = r13
            r9.B0 = r1
            java.lang.ThreadLocal r12 = I1
            java.lang.Object r13 = r12.get()
            byte[] r13 = (byte[]) r13
            if (r13 != 0) goto L_0x00bc
            r13 = 65536(0x10000, float:9.18355E-41)
            byte[] r13 = new byte[r13]
            r12.set(r13)
        L_0x00bc:
            jm9 r4 = defpackage.tu0.l     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r4 = r0
        L_0x00c2:
            android.content.res.Resources r4 = r4.h     // Catch:{ all -> 0x0101 }
            java.io.InputStream r10 = r4.openRawResource(r10)     // Catch:{ all -> 0x0101 }
            java.lang.ThreadLocal r4 = J1     // Catch:{ all -> 0x0102 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x0102 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x00d9
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0102 }
            r4.set(r5)     // Catch:{ all -> 0x0102 }
        L_0x00d9:
            r4 = r1
        L_0x00da:
            int r6 = r5.length     // Catch:{ all -> 0x0102 }
            int r6 = r10.read(r5, r1, r6)     // Catch:{ all -> 0x0102 }
            if (r6 < 0) goto L_0x00f8
            int r7 = r13.length     // Catch:{ all -> 0x0102 }
            int r8 = r4 + r6
            if (r7 >= r8) goto L_0x00f1
            int r7 = r13.length     // Catch:{ all -> 0x0102 }
            int r7 = r7 * r3
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0102 }
            java.lang.System.arraycopy(r13, r1, r7, r1, r4)     // Catch:{ all -> 0x0102 }
            r12.set(r7)     // Catch:{ all -> 0x0102 }
            r13 = r7
        L_0x00f1:
            if (r6 <= 0) goto L_0x00da
            java.lang.System.arraycopy(r5, r1, r13, r4, r6)     // Catch:{ all -> 0x0102 }
            r4 = r8
            goto L_0x00da
        L_0x00f8:
            r10.close()     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r1, r4)
            goto L_0x0107
        L_0x0101:
            r10 = r0
        L_0x0102:
            if (r10 == 0) goto L_0x0107
            r10.close()     // Catch:{ all -> 0x0107 }
        L_0x0107:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 == 0) goto L_0x010e
            return
        L_0x010e:
            android.graphics.Paint r10 = r9.getPaint()
            r10.setFlags(r3)
            int[] r10 = r9.c
            long r10 = createWithJson(r0, r11, r10, r15)
            r9.d1 = r10
            int[] r10 = r9.c
            r10 = r10[r2]
            float r10 = (float) r10
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r11 / r10
            int r10 = (int) r11
            r11 = 16
            int r10 = java.lang.Math.max(r11, r10)
            r9.o = r10
            if (r14 == 0) goto L_0x0133
            r9.setAllowDecodeSingleFrame(r2)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.<init>(int, java.lang.String, int, int, boolean, int[]):void");
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.X = -1;
        this.t0 = new HashMap();
        this.u0 = new HashMap();
        this.w0 = false;
        this.x0 = true;
        this.A0 = new ArraySet();
        this.B0 = 1;
        this.C0 = -1;
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.Y0 = new RectF();
        this.Z0 = new RectF[2];
        this.a1 = new Paint[2];
        this.n1 = new t3c(this, 0);
        this.o1 = new t3c(this, 1);
        this.q1 = new t3c(this, 2);
        this.r1 = new t3c(this, 3);
        this.w1 = new t3c(this, 4);
        this.srcRect = new Rect();
        this.y1 = -1;
        this.A1 = null;
        this.B1 = false;
        this.C1 = null;
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.G1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.D1 = str2;
        if (!TextUtils.isEmpty(str)) {
            getPaint().setFlags(2);
            this.d1 = createWithJson(str, str2, iArr2, iArr);
            this.o = Math.max(16, (int) (1000.0f / ((float) iArr2[1])));
            if (z) {
                setAllowDecodeSingleFrame(true);
            }
            j();
        }
    }
}
