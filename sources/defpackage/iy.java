package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: iy  reason: default package */
public final class iy extends MediaCodec.Callback {
    public final Object a = new Object();
    public final HandlerThread b;
    public Handler c;
    public final b23 d;
    public final b23 e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public d88 o;

    public iy(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.d = new b23();
        this.e = new b23();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        b23 b23 = this.d;
        b23.b = b23.a;
        b23 b232 = this.e;
        b232.b = b232.a;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        w75 w75;
        synchronized (this.a) {
            this.d.a(i2);
            d88 d88 = this.o;
            if (!(d88 == null || (w75 = d88.a.R0) == null)) {
                w75.a();
            }
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        w75 w75;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i2);
                this.f.add(bufferInfo);
                d88 d88 = this.o;
                if (!(d88 == null || (w75 = d88.a.R0) == null)) {
                    w75.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
