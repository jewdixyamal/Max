package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: vud  reason: default package */
public final class vud implements m60 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public j60 e;
    public j60 f;
    public j60 g;
    public j60 h;
    public boolean i;
    public tud j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public vud() {
        j60 j60 = j60.e;
        this.e = j60;
        this.f = j60;
        this.g = j60;
        this.h = j60;
        ByteBuffer byteBuffer = m60.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    public final ByteBuffer a() {
        tud tud = this.j;
        if (tud != null) {
            int i2 = tud.n;
            int i3 = tud.c;
            int i4 = i2 * i3 * 2;
            if (i4 > 0) {
                if (this.k.capacity() < i4) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i3, tud.n);
                int i5 = min * i3;
                shortBuffer.put(tud.m, 0, i5);
                int i6 = tud.n - min;
                tud.n = i6;
                short[] sArr = tud.m;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i3);
                this.o += (long) i4;
                this.k.limit(i4);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = m60.a;
        return byteBuffer;
    }

    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            tud tud = this.j;
            tud.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = tud.c;
            int i3 = remaining2 / i2;
            short[] c2 = tud.c(tud.k, tud.l, i3);
            tud.k = c2;
            asShortBuffer.get(c2, tud.l * i2, ((i3 * i2) * 2) / 2);
            tud.l += i3;
            tud.g();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void c() {
        tud tud = this.j;
        if (tud != null) {
            int i2 = tud.l;
            float f2 = tud.d;
            float f3 = tud.e;
            int i3 = tud.n + ((int) ((((((float) i2) / (f2 / f3)) + ((float) tud.p)) / (tud.f * f3)) + 0.5f));
            short[] sArr = tud.k;
            int i4 = tud.i * 2;
            tud.k = tud.c(sArr, i2, i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = tud.c;
                if (i5 >= i4 * i6) {
                    break;
                }
                tud.k[(i6 * i2) + i5] = 0;
                i5++;
            }
            tud.l = i4 + tud.l;
            tud.g();
            if (tud.n > i3) {
                tud.n = i3;
            }
            tud.l = 0;
            tud.s = 0;
            tud.p = 0;
        }
        this.p = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 == 0) goto L_0x0013
            tud r1 = r1.j
            if (r1 == 0) goto L_0x0011
            int r0 = r1.n
            int r1 = r1.c
            int r0 = r0 * r1
            int r0 = r0 * 2
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vud.d():boolean");
    }

    public final j60 e(j60 j60) {
        if (j60.c == 2) {
            int i2 = this.b;
            if (i2 == -1) {
                i2 = j60.a;
            }
            this.e = j60;
            j60 j602 = new j60(i2, j60.b, 2);
            this.f = j602;
            this.i = true;
            return j602;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }

    public final long f(long j2) {
        return g(j2);
    }

    public final void flush() {
        if (isActive()) {
            j60 j60 = this.e;
            this.g = j60;
            j60 j602 = this.f;
            this.h = j602;
            if (this.i) {
                this.j = new tud(j60.a, j60.b, this.c, this.d, j602.a, 1);
            } else {
                tud tud = this.j;
                if (tud != null) {
                    tud.l = 0;
                    tud.n = 0;
                    tud.p = 0;
                    tud.q = 0;
                    tud.r = 0;
                    tud.s = 0;
                    tud.t = 0;
                    tud.u = 0;
                    tud.v = 0;
                    tud.w = 0;
                }
            }
        }
        this.m = m60.a;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public final long g(long j2) {
        if (this.o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (((double) j2) / ((double) this.c));
        }
        long j3 = this.n;
        tud tud = this.j;
        tud.getClass();
        long j4 = j3 - ((long) ((tud.l * tud.c) * 2));
        int i2 = this.h.a;
        int i3 = this.g.a;
        if (i2 == i3) {
            return oaf.a0(j2, this.o, j4, RoundingMode.FLOOR);
        }
        return oaf.a0(j2, this.o * ((long) i3), j4 * ((long) i2), RoundingMode.FLOOR);
    }

    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        j60 j60 = j60.e;
        this.e = j60;
        this.f = j60;
        this.g = j60;
        this.h = j60;
        ByteBuffer byteBuffer = m60.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }
}
