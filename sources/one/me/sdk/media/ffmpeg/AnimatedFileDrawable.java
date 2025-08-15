package one.me.sdk.media.ffmpeg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, to0, nm9 {
    public static final float[] I1 = new float[8];
    public static final ScheduledThreadPoolExecutor J1 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final Rect rectTmp = new Rect();
    public boolean A0;
    public final ze A1;
    public boolean B0;
    public ze B1;
    public File C0;
    public long C1;
    public final String D0;
    public Bitmap D1;
    public boolean E0;
    public long E1;
    public volatile long F0 = -1;
    public int F1;
    public volatile long G0 = -1;
    public int G1;
    public boolean H0;
    public final Set H1;
    public final Object I0 = new Object();
    public boolean J0;
    public long K0;
    public final RectF L0 = new RectF();
    public final BitmapShader[] M0 = new BitmapShader[3];
    public final BitmapShader[] N0 = new BitmapShader[3];
    public final BitmapShader[] O0 = new BitmapShader[3];
    public final BitmapShader[] P0 = new BitmapShader[3];
    public final ArrayList Q0 = new ArrayList();
    public final int[] R0 = new int[4];
    public int[] S0;
    public final Path[] T0 = new Path[3];
    public float U0 = 1.0f;
    public float V0 = 1.0f;
    public boolean W0;
    public Runnable X;
    public final RectF X0 = new RectF();
    public Bitmap Y;
    public volatile boolean Y0;
    public int Z;
    public volatile boolean Z0;
    public long a;
    public boolean a1;
    public int b;
    public il4 b1;
    public int c = 50;
    public float c1;
    public float d1;
    public final int e1;
    public final int f1;
    public final boolean g1;
    public final so0 h1;
    public float i1 = 1.0f;
    public boolean ignoreNoParent;
    public boolean isWebmSticker;
    public final RectF[] j1 = new RectF[2];
    public final Paint[] k1 = new Paint[2];
    public View l1;
    public final ArrayList m1 = new ArrayList();
    public final ArrayList n1 = new ArrayList();
    public volatile long nativePtr;
    public final int[] o = new int[6];
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public vo0 r1;
    public int repeatCount;
    public Bitmap s0;
    public fm5 s1;
    public boolean skipFrameUpdate;
    public int t0;
    public final af t1;
    public int u0;
    public boolean u1;
    public Bitmap v0;
    public bf v1;
    public int w0;
    public final af w1;
    public boolean x0;
    public final af x1;
    public boolean y0;
    public int y1;
    public boolean z0;
    public final af z1;

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable);
    }

    public AnimatedFileDrawable(File file, int i, int i2, so0 so0, String str) {
        boolean z = true;
        this.p1 = true;
        this.t1 = new af(this, 0);
        this.w1 = new af(this, 1);
        this.x1 = new af(this, 2);
        this.y1 = 0;
        this.z1 = new af(this, 3);
        this.A1 = new ze(this, 1);
        this.H1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        setIsWebmSticker(true);
        this.e1 = i2;
        this.f1 = i;
        this.g1 = (so0 == null || i <= 0 || i2 <= 0) ? false : z;
        this.h1 = so0;
        this.D0 = str;
        if (file != null) {
            d(file, so0);
        }
    }

    public static void a(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable.z1 == null && animatedFileDrawable.x0 && animatedFileDrawable.nativePtr != 0 && !animatedFileDrawable.u1) {
            destroyDecoder(animatedFileDrawable.nativePtr);
            animatedFileDrawable.nativePtr = 0;
        }
        if (!animatedFileDrawable.canLoadFrames()) {
            Bitmap bitmap = animatedFileDrawable.Y;
            if (bitmap != null) {
                bitmap.recycle();
                animatedFileDrawable.Y = null;
            }
            Bitmap bitmap2 = animatedFileDrawable.v0;
            if (bitmap2 != null) {
                bitmap2.recycle();
                animatedFileDrawable.v0 = null;
            }
            il4 il4 = animatedFileDrawable.b1;
            if (il4 != null) {
                il4.a.getLooper().quit();
                animatedFileDrawable.b1 = null;
            }
            for (int i = 0; i < animatedFileDrawable.Q0.size(); i++) {
                ((Bitmap) animatedFileDrawable.Q0.get(i)).recycle();
            }
            animatedFileDrawable.Q0.clear();
            animatedFileDrawable.invalidateInternal();
        }
    }

    public static native long createDecoder(String str, int[] iArr);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2, boolean z2);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.H1.add(onNextFrameRenderedListener);
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.n1.contains(imageReceiver)) {
            this.n1.add(imageReceiver);
            if (this.Y0) {
                e();
            }
        }
        checkCacheCancel();
    }

    public void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.m1;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
    }

    public final void b(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.translate(rectF.left, rectF.top);
        int i = this.o[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.Y, 0.0f, 0.0f, paint);
    }

    public final void c() {
        Set set = this.H1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this);
                it.remove();
            }
        }
    }

    public boolean canLoadFrames() {
        return this.g1 ? this.r1 != null : this.nativePtr != 0 || !this.y0;
    }

    public void checkCacheCancel() {
        ze zeVar;
        if (this.r1 != null) {
            boolean isEmpty = this.n1.isEmpty();
            if (isEmpty && this.B1 == null) {
                ze zeVar2 = new ze(this, 2);
                this.B1 = zeVar2;
                he.e(zeVar2, 600);
            } else if (!isEmpty && (zeVar = this.B1) != null) {
                he.a.removeCallbacks(zeVar);
                this.B1 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004f A[SYNTHETIC, Splitter:B:35:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkCacheExist() {
        /*
            r7 = this;
            boolean r0 = r7.g1
            if (r0 == 0) goto L_0x005f
            vo0 r7 = r7.r1
            if (r7 == 0) goto L_0x005f
            boolean r0 = r7.r
            if (r0 == 0) goto L_0x000d
            goto L_0x005f
        L_0x000d:
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.h     // Catch:{ Exception -> 0x0058, all -> 0x004c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0058, all -> 0x004c }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0041 }
            java.io.File r4 = r7.m     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0041 }
            boolean r1 = r3.readBoolean()     // Catch:{ all -> 0x0035 }
            r7.s = r1     // Catch:{ all -> 0x0035 }
            int r1 = r3.readInt()     // Catch:{ all -> 0x0035 }
            long r4 = (long) r1     // Catch:{ all -> 0x0035 }
            r3.seek(r4)     // Catch:{ all -> 0x0035 }
            int r1 = r3.readInt()     // Catch:{ all -> 0x0035 }
            if (r1 > 0) goto L_0x0037
            r1 = 0
            r7.s = r1     // Catch:{ all -> 0x0035 }
            r7.q = r0     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r1 = move-exception
            goto L_0x0045
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r3.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x005d
        L_0x003c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005d
        L_0x0041:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
        L_0x0047:
            r7 = move-exception
            r1 = r3
            goto L_0x004d
        L_0x004a:
            r1 = r3
            goto L_0x0058
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0057:
            throw r7
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x005d:
            r7.r = r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.checkCacheExist():void");
    }

    public final void d(File file, so0 so0) {
        this.C0 = file;
        getPaint().setFlags(3);
        if (!this.g1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.a1 = this.nativePtr == 0 && (!this.isWebmSticker || this.y1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr = this.o;
                if (iArr[0] > 3840 || iArr[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0;
                }
            }
            g();
            this.y0 = true;
        }
        if (this.g1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.a1 = this.nativePtr == 0 && (!this.isWebmSticker || this.y1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr2 = this.o;
                if (iArr2[0] > 3840 || iArr2[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0;
                    return;
                }
            }
            this.r1 = new vo0(file, this, so0, this.f1, this.e1, !this.q1);
        }
    }

    public boolean decoderFailed() {
        return this.y0 && this.a1;
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        if (this.nativePtr != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                getNextFrame(true);
            }
            Bitmap backgroundBitmap = getBackgroundBitmap();
            if (backgroundBitmap == null) {
                backgroundBitmap = getNextFrame(true);
            }
            Rect rect = rectTmp;
            rect.set(0, 0, backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
            canvas.drawBitmap(getBackgroundBitmap(), rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.j1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.k1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint();
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawInternal(android.graphics.Canvas r11, boolean r12, long r13, int r15) {
        /*
            r10 = this;
            boolean r0 = r10.canLoadFrames()
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r10.x0
            if (r0 == 0) goto L_0x000c
            goto L_0x00fa
        L_0x000c:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            long r13 = java.lang.System.currentTimeMillis()
        L_0x0016:
            if (r12 == 0) goto L_0x001e
            android.graphics.RectF[] r0 = r10.j1
            r0 = r0[r15]
        L_0x001c:
            r2 = r0
            goto L_0x0021
        L_0x001e:
            android.graphics.RectF r0 = r10.X0
            goto L_0x001c
        L_0x0021:
            if (r12 == 0) goto L_0x0029
            android.graphics.Paint[] r0 = r10.k1
            r0 = r0[r15]
        L_0x0027:
            r3 = r0
            goto L_0x002e
        L_0x0029:
            android.graphics.Paint r0 = r10.getPaint()
            goto L_0x0027
        L_0x002e:
            r0 = 0
            if (r12 != 0) goto L_0x0034
            r10.updateCurrentFrame(r13, r0)
        L_0x0034:
            android.graphics.Bitmap r13 = r10.Y
            if (r13 == 0) goto L_0x00fa
            float r14 = r10.U0
            float r1 = r10.V0
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            int[] r6 = r10.o
            r7 = 2
            if (r12 == 0) goto L_0x0067
            int r13 = r13.getWidth()
            android.graphics.Bitmap r14 = r10.Y
            int r14 = r14.getHeight()
            r1 = r6[r7]
            if (r1 == r5) goto L_0x0055
            if (r1 != r4) goto L_0x0058
        L_0x0055:
            r9 = r14
            r14 = r13
            r13 = r9
        L_0x0058:
            float r1 = r2.width()
            float r13 = (float) r13
            float r1 = r1 / r13
            float r13 = r2.height()
            float r14 = (float) r14
            float r13 = r13 / r14
        L_0x0064:
            r6 = r13
            r5 = r1
            goto L_0x009a
        L_0x0067:
            boolean r8 = r10.W0
            if (r8 == 0) goto L_0x0098
            int r13 = r13.getWidth()
            android.graphics.Bitmap r14 = r10.Y
            int r14 = r14.getHeight()
            r1 = r6[r7]
            if (r1 == r5) goto L_0x007b
            if (r1 != r4) goto L_0x007e
        L_0x007b:
            r9 = r14
            r14 = r13
            r13 = r9
        L_0x007e:
            android.graphics.Rect r1 = r10.getBounds()
            r2.set(r1)
            float r1 = r2.width()
            float r13 = (float) r13
            float r1 = r1 / r13
            r10.U0 = r1
            float r13 = r2.height()
            float r14 = (float) r14
            float r13 = r13 / r14
            r10.V0 = r13
            r10.W0 = r0
            goto L_0x0064
        L_0x0098:
            r5 = r14
            r6 = r1
        L_0x009a:
            r13 = r0
        L_0x009b:
            int[] r14 = r10.R0
            int r1 = r14.length
            if (r13 >= r1) goto L_0x00f5
            r1 = r14[r13]
            if (r1 == 0) goto L_0x00f2
            if (r12 == 0) goto L_0x00a9
            int r15 = r15 + 1
            goto L_0x00aa
        L_0x00a9:
            r15 = r0
        L_0x00aa:
            android.graphics.Path[] r13 = r10.T0
            r1 = r13[r15]
            if (r1 != 0) goto L_0x00b7
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r13[r15] = r1
        L_0x00b7:
            boolean r13 = r10.p1
            if (r13 != 0) goto L_0x00bd
            if (r12 == 0) goto L_0x00e3
        L_0x00bd:
            if (r12 != 0) goto L_0x00c1
            r10.p1 = r0
        L_0x00c1:
            int r13 = r14.length
            float[] r15 = I1
            if (r0 >= r13) goto L_0x00d5
            int r13 = r0 * 2
            r4 = r14[r0]
            float r7 = (float) r4
            r15[r13] = r7
            int r13 = r13 + 1
            float r4 = (float) r4
            r15[r13] = r4
            int r0 = r0 + 1
            goto L_0x00c1
        L_0x00d5:
            r1.rewind()
            if (r12 == 0) goto L_0x00dc
            r12 = r2
            goto L_0x00de
        L_0x00dc:
            android.graphics.RectF r12 = r10.L0
        L_0x00de:
            android.graphics.Path$Direction r13 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r12, r15, r13)
        L_0x00e3:
            r11.save()
            r11.clipPath(r1)
            r1 = r10
            r4 = r11
            r1.b(r2, r3, r4, r5, r6)
            r11.restore()
            goto L_0x00fa
        L_0x00f2:
            int r13 = r13 + 1
            goto L_0x009b
        L_0x00f5:
            r1 = r10
            r4 = r11
            r1.b(r2, r3, r4, r5, r6)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    public final void e() {
        f(true, false);
    }

    public final void f(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if ((this.X == null || z2) && this.s0 == null && canLoadFrames() && !this.x0) {
            if (!this.Y0) {
                boolean z3 = this.z0;
                if (!z3) {
                    return;
                }
                if (z3 && this.A0) {
                    return;
                }
            }
            if ((this.n1.size() != 0 || this.ignoreNoParent) && !this.u1) {
                long j = 0;
                if (z && this.K0 != 0) {
                    long j2 = (long) this.c;
                    j = Math.min(j2, Math.max(0, j2 - (System.currentTimeMillis() - this.K0)));
                }
                if (!this.o1) {
                    if (this.b1 == null) {
                        this.b1 = new il4("decodeQueue" + this);
                    }
                    if (z2 && (runnable = this.X) != null) {
                        this.b1.a(runnable);
                    }
                    il4 il4 = this.b1;
                    af afVar = this.z1;
                    this.X = afVar;
                    il4.c(afVar, j);
                } else if (this.q1) {
                    af afVar2 = this.z1;
                    this.X = afVar2;
                    ml4.a(afVar2, false);
                } else {
                    if (z2 && (runnable2 = this.X) != null) {
                        J1.remove(runnable2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = J1;
                    af afVar3 = this.z1;
                    this.X = afVar3;
                    scheduledThreadPoolExecutor.schedule(afVar3, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    public final void finalize() {
        try {
            this.m1.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r4 = r6.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r6 = this;
            boolean r0 = r6.isWebmSticker
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0038
            int r0 = r6.e1
            if (r0 <= 0) goto L_0x0038
            int r2 = r6.f1
            if (r2 <= 0) goto L_0x0038
            r3 = 0
            int[] r4 = r6.o
            r3 = r4[r3]
            if (r3 <= 0) goto L_0x0038
            r5 = 1
            r4 = r4[r5]
            if (r4 <= 0) goto L_0x0038
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            float r0 = (float) r0
            float r3 = (float) r4
            float r0 = r0 / r3
            float r0 = java.lang.Math.max(r2, r0)
            r6.i1 = r0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0035
            double r2 = (double) r0
            r4 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
        L_0x0035:
            r6.i1 = r1
            goto L_0x003a
        L_0x0038:
            r6.i1 = r1
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.g():void");
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.Y;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.s0;
        if (bitmap2 != null) {
            return bitmap2;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.v0;
    }

    public float getCurrentProgress() {
        float f;
        int i;
        if (this.o[4] == 0) {
            return 0.0f;
        }
        if (this.G0 >= 0) {
            f = (float) this.G0;
            i = this.o[4];
        } else {
            int[] iArr = this.o;
            f = (float) iArr[3];
            i = iArr[4];
        }
        return f / ((float) i);
    }

    public int getCurrentProgressMs() {
        if (this.G0 >= 0) {
            return (int) this.G0;
        }
        int i = this.t0;
        return i != 0 ? i : this.Z;
    }

    public int getDurationMs() {
        return this.o[4];
    }

    public File getFilePath() {
        return this.C0;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        int i = this.f1;
        Bitmap createBitmap = bitmap == null ? Bitmap.createBitmap(i, this.e1, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        String absolutePath = this.C0.getAbsolutePath();
        int[] iArr = this.o;
        long createDecoder = createDecoder(absolutePath, iArr);
        if (createDecoder == 0) {
            return createBitmap;
        }
        if (this.D1 == null) {
            this.D1 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.D1;
        getVideoFrame(createDecoder, bitmap2, this.o, bitmap2.getRowBytes(), false, this.c1, this.d1, true);
        destroyDecoder(createDecoder);
        createBitmap.eraseColor(0);
        canvas.save();
        float width = ((float) i) / ((float) this.D1.getWidth());
        canvas.scale(width, width);
        canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public int getFps() {
        return this.o[5];
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    public int getIntrinsicHeight() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? he.a(100.0f) : (int) (((float) i) * this.i1);
    }

    public int getIntrinsicWidth() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? he.a(100.0f) : (int) (((float) i) * this.i1);
    }

    public long getLastFrameTimestamp() {
        return (long) this.b;
    }

    public int getMinimumHeight() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? he.a(100.0f) : i;
    }

    public int getMinimumWidth() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? he.a(100.0f) : i;
    }

    public Bitmap getNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return this.v0;
        }
        if (this.v0 == null) {
            if (!this.Q0.isEmpty()) {
                this.v0 = (Bitmap) this.Q0.remove(0);
            } else {
                int[] iArr = this.o;
                float f = this.i1;
                this.v0 = Bitmap.createBitmap((int) (((float) iArr[0]) * f), (int) (((float) iArr[1]) * f), Bitmap.Config.ARGB_8888);
            }
        }
        long j = this.nativePtr;
        Bitmap bitmap = this.v0;
        getVideoFrame(j, bitmap, this.o, bitmap.getRowBytes(), false, this.c1, this.d1, z);
        return this.v0;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.s0;
    }

    public int getOpacity() {
        return -2;
    }

    public int getOrientation() {
        return this.o[2];
    }

    public int getProgressMs() {
        return this.o[3];
    }

    public Bitmap getRenderingBitmap() {
        return this.Y;
    }

    public int getRenderingHeight() {
        return this.e1;
    }

    public int getRenderingWidth() {
        return this.f1;
    }

    public long getStartTime() {
        return (long) (this.c1 * 1000.0f);
    }

    public boolean hasBitmap() {
        return canLoadFrames() && !(this.Y == null && this.s0 == null);
    }

    public void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n1;
            if (i < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i)).invalidate();
                i++;
            } else {
                return;
            }
        }
    }

    public boolean isRecycled() {
        return this.Z0 || this.y1 >= 15;
    }

    public boolean isRunning() {
        return this.Y0;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W0 = true;
    }

    public void onFailed(Throwable th) {
        lm9 logger = WebmConfig.getLogger();
        logger.j("Fail load webm by url: " + this.D0, th);
    }

    public void onFinished(String str, File file, String str2) {
        lm9 logger = WebmConfig.getLogger();
        logger.i("Success load webm by url: " + str);
        d(file, this.h1);
        he.d(new ze(this, 0));
    }

    public void prepareForGenerateCache() {
        this.E1 = createDecoder(this.C0.getAbsolutePath(), this.o);
    }

    public void recycle() {
        if (!this.m1.isEmpty()) {
            this.E0 = true;
            return;
        }
        this.Y0 = false;
        this.Z0 = true;
        if (this.v1 != null) {
            vo0.c();
            RLottieDrawable.lottieCacheGenerateQueue.a(this.v1);
            this.v1 = null;
        }
        if (this.X == null) {
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.Y);
            arrayList.add(this.s0);
            arrayList.add(this.v0);
            arrayList.addAll(this.Q0);
            this.Q0.clear();
            this.Y = null;
            this.s0 = null;
            this.v0 = null;
            il4 il4 = this.b1;
            if (il4 != null) {
                il4.a.getLooper().quit();
                this.b1 = null;
            }
            getPaint().setShader((Shader) null);
            he.c(arrayList);
        } else {
            this.x0 = true;
        }
        invalidateInternal();
    }

    public void releaseForGenerateCache() {
        long j = this.E1;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.H1.remove(onNextFrameRenderedListener);
    }

    public void removeParent(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.n1;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void removeSecondParentView(View view) {
        ArrayList arrayList = this.m1;
        arrayList.remove(view);
        if (!arrayList.isEmpty()) {
            return;
        }
        if (this.E0) {
            recycle();
            return;
        }
        int[] iArr = this.S0;
        if (iArr != null) {
            setRoundRadius(iArr);
        }
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.Y;
        ArrayList arrayList = this.Q0;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        Bitmap bitmap3 = this.s0;
        if (bitmap3 != null) {
            arrayList.add(bitmap3);
        }
        this.Y = bitmap;
        this.s0 = null;
    }

    public void resetStream(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        if (z) {
            stopDecoder(this.nativePtr);
        } else {
            prepareToSeek(this.nativePtr);
        }
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public void seekToSync(long j) {
        if (this.nativePtr != 0) {
            seekToMs(this.nativePtr, j, this.o, true);
        }
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.L0;
        if (rectF.left != f || rectF.top != f2 || rectF.right != f6 || rectF.bottom != f5) {
            rectF.set(f, f2, f6, f5);
            this.p1 = true;
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.z0 = z;
        if (z) {
            e();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.J0 = z;
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.o1 = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.q1 = z;
    }

    public void setParentView(View view) {
        if (this.l1 == null) {
            this.l1 = view;
        }
    }

    public void setRoundRadius(int[] iArr) {
        boolean isEmpty = this.m1.isEmpty();
        int[] iArr2 = this.R0;
        if (!isEmpty) {
            if (this.S0 == null) {
                this.S0 = new int[4];
            }
            int[] iArr3 = this.S0;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.p1 && iArr[i] != iArr2[i]) {
                this.p1 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public void setStartEndTime(long j, long j2) {
        this.c1 = ((float) j) / 1000.0f;
        this.d1 = ((float) j2) / 1000.0f;
        if (j >= 0 && ((long) getCurrentProgressMs()) < j) {
            seekTo(j, true);
        }
    }

    public void setUseSharedQueue(boolean z) {
        if (!this.isWebmSticker) {
            this.o1 = z;
        }
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr != 0) {
            getVideoFrame(this.nativePtr, (Bitmap) null, this.o, 0, false, this.c1, this.d1, z);
        }
    }

    public void start() {
        if (this.Y0) {
            return;
        }
        if (!this.n1.isEmpty() || this.ignoreNoParent) {
            this.Y0 = true;
            e();
            he.d(this.A1);
        }
    }

    public void stop() {
        this.Y0 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        if (this.Y0) {
            Bitmap bitmap = this.Y;
            if (bitmap == null && this.s0 == null) {
                e();
            } else if (this.s0 == null || (bitmap != null && (Math.abs(j - this.a) < ((long) this.c) || this.skipFrameUpdate || this.G0 >= 0))) {
                invalidateInternal();
            } else {
                this.Q0.add(this.Y);
                this.Y = this.s0;
                this.Z = this.t0;
                for (int i = 0; i < this.P0.length; i++) {
                    BitmapShader[] bitmapShaderArr = this.M0;
                    BitmapShader[] bitmapShaderArr2 = this.N0;
                    bitmapShaderArr[i] = bitmapShaderArr2[i];
                    BitmapShader[] bitmapShaderArr3 = this.O0;
                    bitmapShaderArr2[i] = bitmapShaderArr3[i];
                    bitmapShaderArr3[i] = null;
                }
                this.t0 = this.u0;
                this.s0 = null;
                this.u0 = 0;
                this.a = j;
                c();
                e();
            }
        } else if (!this.Y0 && this.z0 && Math.abs(j - this.a) >= ((long) this.c) && this.s0 != null) {
            this.Q0.add(this.Y);
            this.Y = this.s0;
            this.Z = this.t0;
            for (int i2 = 0; i2 < this.P0.length; i2++) {
                BitmapShader[] bitmapShaderArr4 = this.M0;
                BitmapShader[] bitmapShaderArr5 = this.N0;
                bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
                BitmapShader[] bitmapShaderArr6 = this.O0;
                bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
                bitmapShaderArr6[i2] = null;
            }
            this.t0 = this.u0;
            this.s0 = null;
            this.u0 = 0;
            this.a = j;
            c();
            e();
        }
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        int i;
        if (!this.y0 || this.nativePtr == 0) {
            return null;
        }
        if (!z) {
            seekToMs(this.nativePtr, j, this.o, z);
        }
        int[] iArr = this.o;
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (z) {
            i = getFrameAtTime(this.nativePtr, j, createBitmap, this.o, createBitmap.getRowBytes());
        } else {
            i = getVideoFrame(this.nativePtr, createBitmap, this.o, createBitmap.getRowBytes(), true, 0.0f, 0.0f, true);
        }
        if (i != 0) {
            return createBitmap;
        }
        return null;
    }

    public void seekTo(long j, boolean z, boolean z2) {
        synchronized (this.I0) {
            try {
                this.F0 = j;
                this.G0 = j;
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
                }
                if (z2 && this.z0) {
                    this.A0 = false;
                    if (this.X == null) {
                        f(false, true);
                    } else {
                        this.B0 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getNextFrame(Bitmap bitmap) {
        int i;
        Bitmap bitmap2 = bitmap;
        if (this.E1 == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap2);
        Bitmap bitmap3 = this.D1;
        int[] iArr = this.o;
        if (bitmap3 == null) {
            this.D1 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.E1;
        Bitmap bitmap4 = this.D1;
        getVideoFrame(j, bitmap4, this.o, bitmap4.getRowBytes(), false, this.c1, this.d1, true);
        long j2 = this.C1;
        if (j2 != 0 && ((i = iArr[3]) == 0 || j2 > ((long) i))) {
            return 0;
        }
        int i2 = this.G1;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.F1 + 1;
            this.F1 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.G1 = i3;
        bitmap2.eraseColor(0);
        canvas.save();
        float width = ((float) this.f1) / ((float) this.D1.getWidth());
        canvas.scale(width, width);
        canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.C1 = (long) iArr[3];
        return 1;
    }
}
