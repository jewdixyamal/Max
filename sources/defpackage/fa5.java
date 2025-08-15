package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.work.WorkRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: fa5  reason: default package */
public final class fa5 extends v2 {
    public static final int[] G0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final long H0 = (oaf.O() ? WorkRequest.MIN_BACKOFF_MILLIS : 500);
    public boolean A0;
    public t26 B0;
    public t26 C0;
    public ScheduledFuture D0;
    public boolean E0;
    public long F0;
    public ba5 X;
    public final int Y;
    public final Surface Z;
    public final va8 o;
    public final SurfaceTexture s0;
    public final float[] t0;
    public final ConcurrentLinkedQueue u0;
    public final ScheduledExecutorService v0;
    public final boolean w0;
    public final boolean x0;
    public int y0;
    public int z0;

    public fa5(va8 va8, nx0 nx0, boolean z, boolean z2) {
        super(nx0);
        this.o = va8;
        this.w0 = z;
        this.x0 = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            mr0.f();
            int i = iArr[0];
            mr0.d(36197, i, 9729);
            this.Y = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.s0 = surfaceTexture;
            this.t0 = new float[16];
            this.u0 = new ConcurrentLinkedQueue();
            this.v0 = Executors.newSingleThreadScheduledExecutor(new pd3(3, "ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new da5(this, nx0));
            this.Z = new Surface(surfaceTexture);
            this.F0 = -9223372036854775807L;
        } catch (GlUtil$GlException e) {
            throw new Exception(e);
        }
    }

    public static float A(int i, float f) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (int i2 = 2; i2 <= 256; i2 *= 2) {
            int i3 = (((i + i2) - 1) / i2) * i2;
            for (int i4 = 0; i4 <= 2; i4++) {
                float f4 = (float) i;
                float f5 = (float) i3;
                float f6 = (f4 - ((float) i4)) / f5;
                if (Math.abs(f6 - f) < Math.abs(f2 - f)) {
                    f3 = f4 / f5;
                    f2 = f6;
                }
            }
        }
        return Math.abs(f2 - f) > 1.0E-9f ? f : f3;
    }

    public final void B() {
        t26 t26;
        boolean z = true;
        if (this.y0 != 0 && this.z0 != 0 && this.B0 == null) {
            this.s0.updateTexImage();
            this.z0--;
            if (this.w0) {
                t26 = this.C0;
                t26.getClass();
            } else {
                t26 = (t26) this.u0.element();
            }
            this.B0 = t26;
            this.y0--;
            this.s0.getTransformMatrix(this.t0);
            long timestamp = (this.s0.getTimestamp() / 1000) + t26.e;
            if (this.x0) {
                float[] fArr = this.t0;
                int i = t26.b;
                int i2 = t26.c;
                char c = 0;
                boolean z2 = fArr.length != 16;
                int[] iArr = G0;
                for (int i3 = 0; i3 < 8; i3++) {
                    z2 |= Math.abs(fArr[iArr[i3]]) > 1.0E-9f;
                }
                boolean z3 = z2 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f);
                char c2 = 13;
                char c3 = 12;
                char c4 = 4;
                if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                    boolean z4 = z3 | (Math.abs(fArr[1]) > 1.0E-9f);
                    if (Math.abs(fArr[4]) <= 1.0E-9f) {
                        z = false;
                    }
                    z |= z4;
                    c4 = 5;
                    c3 = 13;
                    c2 = 12;
                } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                    c = 65535;
                    c2 = 65535;
                    c3 = 65535;
                    c4 = 65535;
                } else {
                    boolean z5 = z3 | (Math.abs(fArr[0]) > 1.0E-9f);
                    if (Math.abs(fArr[5]) > 1.0E-9f) {
                        c = 1;
                    }
                    boolean z6 = z5 | c;
                    c = 1;
                    z = z6;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = d54.a;
                    synchronized (d54.class) {
                    }
                } else {
                    float f = fArr[c];
                    float f2 = fArr[c2];
                    if (Math.abs(f) + 1.0E-9f < 1.0f) {
                        float copySign = Math.copySign(A(i, Math.abs(f)), f);
                        float f3 = z7b.f(f, copySign, 0.5f, f2);
                        LinkedHashMap linkedHashMap2 = d54.a;
                        synchronized (d54.class) {
                        }
                        fArr[c] = copySign;
                        fArr[c2] = f3;
                    }
                    float f4 = fArr[c4];
                    float f5 = fArr[c3];
                    if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                        float copySign2 = Math.copySign(A(i2, Math.abs(f4)), f4);
                        float f6 = z7b.f(f4, copySign2, 0.5f, f5);
                        LinkedHashMap linkedHashMap3 = d54.a;
                        synchronized (d54.class) {
                        }
                        fArr[c4] = copySign2;
                        fArr[c3] = f6;
                    }
                }
            }
            ba5 ba5 = this.X;
            ba5.getClass();
            ((od4) ba5).h.q("uTexTransformationMatrix", this.t0);
            ba5 ba52 = this.X;
            ba52.getClass();
            ((qi0) ba52).e(this.o, new hd6(this.Y, -1, t26.b, t26.c), timestamp);
            if (!this.w0) {
                fm9.l((t26) this.u0.remove());
            }
            d54.a();
        }
    }

    public final void C(CountDownLatch countDownLatch) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.z0;
            concurrentLinkedQueue = this.u0;
            if (i <= 0) {
                break;
            }
            this.z0 = i - 1;
            this.s0.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (concurrentLinkedQueue.isEmpty() || (this.F0 != -9223372036854775807L && System.currentTimeMillis() - this.F0 >= H0)) {
            this.F0 = -9223372036854775807L;
            countDownLatch.countDown();
            return;
        }
        if (this.F0 == -9223372036854775807L) {
            this.F0 = System.currentTimeMillis();
        }
        this.v0.schedule(new kl4((Object) this, 22, (Object) countDownLatch), 10, TimeUnit.MILLISECONDS);
    }

    public final void h() {
        ((nx0) this.a).v(new ca5(this, 5));
    }

    public final void i() {
        this.y0 = 0;
        this.B0 = null;
        this.u0.clear();
        this.C0 = null;
        super.i();
    }

    public final Surface j() {
        return this.Z;
    }

    public final int k() {
        return this.u0.size();
    }

    public final void q(t26 t26) {
        this.C0 = t26;
        if (!this.w0) {
            this.u0.add(t26);
        }
        ((nx0) this.a).v(new ca5(this, 0));
    }

    public final void release() {
        this.s0.release();
        this.Z.release();
        this.v0.shutdownNow();
    }

    public final void s(hd6 hd6) {
        ((nx0) this.a).v(new ca5(this, 1));
    }

    public final void u() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((nx0) this.a).v(new ea5(this, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            z04.c0("Interrupted when waiting for MediaCodec frames to arrive.");
        }
    }

    public final void y(od4 od4) {
        ((nx0) this.a).v(new i12(this, 1, od4));
    }

    public final void z() {
        ((nx0) this.a).v(new ca5(this, 3));
    }
}
