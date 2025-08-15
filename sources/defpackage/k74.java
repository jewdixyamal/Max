package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* renamed from: k74  reason: default package */
public final class k74 {
    public final boolean a;
    public final boolean b;
    public final SparseArray c = new SparseArray();
    public int d;
    public j60 e = j60.e;
    public int f = -1;
    public bu1[] g = new bu1[0];
    public long h = -9223372036854775807L;
    public long i = -1;
    public long j;
    public long k = Long.MAX_VALUE;
    public long l;

    public k74(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z) {
            this.l = Long.MAX_VALUE;
        }
    }

    public final int a(j60 j60, long j2) {
        c();
        c();
        j60 j602 = this.e;
        if (j60.a != j602.a || !j1e.h(j60) || !j1e.h(j602)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.e, j60);
        }
        long a0 = oaf.a0(j2 - this.h, (long) j60.a, 1000000, RoundingMode.CEILING);
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.append(i2, new j74(this, j60, f42.a(j60.b, this.e.b), a0));
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        return i2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, bu1] */
    public final bu1 b(long j2) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.f * this.e.d).order(ByteOrder.nativeOrder());
        order.mark();
        ? obj = new Object();
        obj.c = order;
        obj.a = j2;
        obj.b = ((long) this.f) + j2;
        return obj;
    }

    public final void c() {
        fm9.j("Audio mixer is not configured.", !this.e.equals(j60.e));
    }

    public final void d(j60 j60) {
        fm9.j("Audio mixer already configured.", this.e.equals(j60.e));
        if (j1e.h(j60)) {
            this.e = j60;
            this.f = (500 * j60.a) / 1000;
            this.h = 0;
            LinkedHashMap linkedHashMap = d54.a;
            synchronized (d54.class) {
            }
            this.g = new bu1[]{b(0), b((long) this.f)};
            this.i = Math.min(this.k, this.j + ((long) this.f));
            return;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", j60);
    }

    public final boolean e() {
        c();
        long j2 = this.j;
        return j2 >= this.k || (j2 >= this.l && this.c.size() == 0);
    }

    public final void f(int i2, ByteBuffer byteBuffer) {
        int i3;
        k74 k74 = this;
        int i4 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = k74.c;
            fm9.j("Source not found.", oaf.l(sparseArray, i4));
            j74 j74 = (j74) sparseArray.get(i4);
            if (j74.a < k74.i) {
                long min = Math.min(j74.a + ((long) (byteBuffer.remaining() / j74.b.d)), k74.i);
                if (j74.c.d) {
                    j74.a(min, byteBuffer2);
                    return;
                }
                long j2 = j74.a;
                long j3 = k74.j;
                if (j2 < j3) {
                    j74.a(Math.min(min, j3), byteBuffer2);
                    if (j74.a == min) {
                        return;
                    }
                }
                bu1[] bu1Arr = k74.g;
                int length = bu1Arr.length;
                int i5 = 0;
                while (i5 < length) {
                    bu1 bu1 = bu1Arr[i5];
                    long j4 = j74.a;
                    if (j4 >= bu1.b) {
                        i3 = i5;
                    } else {
                        int i6 = ((int) (j4 - bu1.a)) * k74.e.d;
                        ByteBuffer byteBuffer3 = (ByteBuffer) bu1.c;
                        byteBuffer3.position(byteBuffer3.position() + i6);
                        long min2 = Math.min(min, bu1.b);
                        j60 j60 = k74.e;
                        fm9.f(min2 >= j74.a);
                        int i7 = (int) (min2 - j74.a);
                        boolean z = j74.d.b;
                        i3 = i5;
                        j1e.B(byteBuffer, j74.b, (ByteBuffer) bu1.c, j60, j74.c, i7, true, z);
                        j74.a = min2;
                        byteBuffer3.reset();
                        if (j74.a == min) {
                            return;
                        }
                    }
                    i5 = i3 + 1;
                    k74 = this;
                }
            }
        }
    }
}
