package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gy  reason: default package */
public final class gy implements w78 {
    public static final ArrayDeque Z = new ArrayDeque();
    public static final Object s0 = new Object();
    public final ae3 X;
    public boolean Y;
    public final MediaCodec a;
    public final HandlerThread b;
    public cy c;
    public final AtomicReference o = new AtomicReference();

    public gy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ae3 ae3 = new ae3(1, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.X = ae3;
    }

    public static ey c() {
        ArrayDeque arrayDeque = Z;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    ey eyVar = new ey();
                    return eyVar;
                }
                ey eyVar2 = (ey) arrayDeque.removeFirst();
                return eyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(long j, int i, int i2, int i3) {
        b();
        ey c2 = c();
        c2.a = i;
        c2.b = 0;
        c2.c = i2;
        c2.e = j;
        c2.f = i3;
        cy cyVar = this.c;
        int i4 = oaf.a;
        cyVar.obtainMessage(1, c2).sendToTarget();
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.o.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void flush() {
        if (this.Y) {
            try {
                cy cyVar = this.c;
                cyVar.getClass();
                cyVar.removeCallbacksAndMessages((Object) null);
                ae3 ae3 = this.X;
                ae3.c();
                cy cyVar2 = this.c;
                cyVar2.getClass();
                cyVar2.obtainMessage(3).sendToTarget();
                ae3.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void i(int i, rz3 rz3, long j, int i2) {
        b();
        ey c2 = c();
        c2.a = i;
        c2.b = 0;
        c2.c = 0;
        c2.e = j;
        c2.f = i2;
        int i3 = rz3.f;
        MediaCodec.CryptoInfo cryptoInfo = c2.d;
        cryptoInfo.numSubSamples = i3;
        int[] iArr = (int[]) rz3.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = (int[]) rz3.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = (byte[]) rz3.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = (byte[]) rz3.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = rz3.c;
        if (oaf.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(rz3.g, rz3.h));
        }
        this.c.obtainMessage(2, c2).sendToTarget();
    }

    public final void setParameters(Bundle bundle) {
        b();
        cy cyVar = this.c;
        int i = oaf.a;
        cyVar.obtainMessage(4, bundle).sendToTarget();
    }

    public final void shutdown() {
        if (this.Y) {
            flush();
            this.b.quit();
        }
        this.Y = false;
    }

    public final void start() {
        if (!this.Y) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new cy(this, handlerThread.getLooper(), 1);
            this.Y = true;
        }
    }
}
