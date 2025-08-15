package defpackage;

import android.util.SparseLongArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g03  reason: default package */
public final class g03 implements z14, a24, abe, agf, ma5, na5, oa5, pa5, m78 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ g03(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public boolean A() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return true;
        }
    }

    public xze B(int i, int i2) {
        return ((oa5) this.c).B(i, i2);
    }

    public long C() {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public long D(long j) {
        switch (this.a) {
            case 2:
                return (long) ((l13) this.c).a;
            default:
                return (long) ((m13) this.c).a;
        }
    }

    public long E(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) ((l13) this.c).a;
            default:
                return (long) ((m13) this.c).a;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void F(long j) {
        ard ard = (ard) this.c;
        if (ard.w0) {
            c(new Exception("onOutputFrameAvailableForRendering() received after onEnded()"));
            return;
        }
        if (j == 0) {
            ard.y0 = true;
        }
        this.b = j;
        ((ard) this.c).Y.execute(new r60(this, j, 7));
    }

    public void J(v1d v1d) {
        ((pa5) this.c).J(new wzd(this, v1d, v1d));
    }

    public void K() {
    }

    public void M(u1d u1d) {
        ((oa5) this.c).M(new vzd(this, u1d));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void O() {
        ard ard = (ard) this.c;
        if (ard.w0) {
            c(new Exception("onEnded() received multiple times"));
            return;
        }
        ard.w0 = true;
        ard.Y.execute(new u3c(19, this));
    }

    public void P(int i) {
        if (i >= 64) {
            g03 g03 = (g03) this.c;
            if (g03 != null) {
                g03.P(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    public int Q(int i) {
        g03 g03 = (g03) this.c;
        if (g03 == null) {
            if (i >= 64) {
                return Long.bitCount(this.b);
            }
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else {
            return Long.bitCount(this.b) + g03.Q(i - 64);
        }
    }

    public void R() {
        if (((g03) this.c) == null) {
            this.c = new g03(0);
        }
    }

    public boolean S(int i) {
        if (i >= 64) {
            R();
            return ((g03) this.c).S(i - 64);
        }
        return ((1 << i) & this.b) != 0;
    }

    public int T(long j) {
        long U = U();
        long j2 = 0;
        int i = (U > 0 ? 1 : (U == 0 ? 0 : -1));
        int i2 = 0;
        gg ggVar = (gg) this.c;
        if (i == 0) {
            long j3 = 0;
            while (true) {
                j3 += (long) ggVar.M(i2);
                int i3 = i2 + 1;
                if (0 < j3) {
                    return i2;
                }
                i2 = i3;
            }
        } else if (ggVar.g0() != 0 && j / U >= ((long) ggVar.g0())) {
            return -1;
        } else {
            long j4 = j % U;
            while (true) {
                j2 += (long) ggVar.M(i2);
                int i4 = i2 + 1;
                if (j4 < j2) {
                    return i2;
                }
                i2 = i4;
            }
        }
    }

    public long U() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0;
        gg ggVar = (gg) this.c;
        int x = ggVar.x();
        for (int i = 0; i < x; i++) {
            this.b += (long) ggVar.M(i);
        }
        return this.b;
    }

    public long V(long j) {
        long U = U();
        long j2 = 0;
        if (U == 0) {
            return -1;
        }
        gg ggVar = (gg) this.c;
        if (!(ggVar.g0() == 0) && j / U >= ((long) ggVar.g0())) {
            return -1;
        }
        long j3 = j % U;
        int x = ggVar.x();
        for (int i = 0; i < x && j2 <= j3; i++) {
            j2 += (long) ggVar.M(i);
        }
        return (j2 - j3) + j;
    }

    public void W(int i, boolean z) {
        if (i >= 64) {
            R();
            ((g03) this.c).W(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            b0(i);
        } else {
            P(i);
        }
        if (z2 || ((g03) this.c) != null) {
            R();
            ((g03) this.c).W(0, z2);
        }
    }

    public void X(String str) {
        long nanoTime = System.nanoTime() - this.b;
        long seconds = TimeUnit.NANOSECONDS.toSeconds(nanoTime);
        float nanos = ((float) (nanoTime - TimeUnit.SECONDS.toNanos(seconds))) / ((float) TimeUnit.MILLISECONDS.toNanos(1));
        ((a4c) this.c).log("OKRTCCall", rh4.j(str, " completed in ", seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", new Object[]{Float.valueOf(nanos)}) : String.format(Locale.ROOT, "%d seconds and %.1f ms", new Object[]{Long.valueOf(seconds), Float.valueOf(nanos)})));
    }

    public cj6 Y() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String G = ((fu0) this.c).G(this.b);
            this.b -= (long) G.length();
            if (G.length() == 0) {
                break;
            }
            int z0 = w9e.z0(G, ':', 1, false, 4);
            if (z0 != -1) {
                String substring = G.substring(0, z0);
                String substring2 = G.substring(z0 + 1);
                arrayList.add(substring);
                arrayList.add(w9e.b1(substring2).toString());
            } else if (G.charAt(0) == ':') {
                String substring3 = G.substring(1);
                arrayList.add("");
                arrayList.add(w9e.b1(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(w9e.b1(G).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new cj6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean Z(int i) {
        if (i >= 64) {
            R();
            return ((g03) this.c).Z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        g03 g03 = (g03) this.c;
        if (g03 != null) {
            if (g03.S(0)) {
                b0(63);
            }
            ((g03) this.c).Z(0);
        }
        return z;
    }

    public void a0() {
        this.b = 0;
        g03 g03 = (g03) this.c;
        if (g03 != null) {
            g03.a0();
        }
    }

    public long b(long j) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).e[(int) j] - this.b;
            default:
                return ((m13) this.c).X[(int) j] - this.b;
        }
    }

    public void b0(int i) {
        if (i >= 64) {
            R();
            ((g03) this.c).b0(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((ard) this.c).Y.execute(new flc(this, 19, videoFrameProcessingException));
    }

    public void c0(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
        if (i2 == 0 || j > j2) {
            sparseLongArray.put(i, j);
            if (i2 == 0 || j2 == this.b) {
                int i3 = oaf.a;
                if (sparseLongArray.size() != 0) {
                    long j3 = Long.MAX_VALUE;
                    for (int i4 = 0; i4 < sparseLongArray.size(); i4++) {
                        j3 = Math.min(j3, sparseLongArray.valueAt(i4));
                    }
                    this.b = j3;
                    return;
                }
                throw new NoSuchElementException();
            }
        }
    }

    public c3b d() {
        return c3b.d;
    }

    public long e() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).e() - this.b;
            default:
                return ((na5) this.c).e() - this.b;
        }
    }

    public void f(c3b c3b) {
    }

    public int g(long j) {
        return this.b > j ? 0 : -1;
    }

    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).h(bArr, i, i2, z);
            default:
                return ((na5) this.c).h(bArr, i, i2, z);
        }
    }

    public long i(int i) {
        np8.d(i == 0);
        return this.b;
    }

    public long j(long j, long j2) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).d[(int) j];
            default:
                return ((m13) this.c).o[(int) j];
        }
    }

    public long k(long j, long j2) {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public void l(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).l(i, bArr, i2);
                return;
            default:
                ((na5) this.c).l(i, bArr, i2);
                return;
        }
    }

    public long m(long j, long j2) {
        switch (this.a) {
            case 2:
                return -9223372036854775807L;
            default:
                return -9223372036854775807L;
        }
    }

    public q4c n(long j) {
        l13 l13 = (l13) this.c;
        int i = (int) j;
        return new q4c(l13.c[i], (String) null, (long) l13.b[i]);
    }

    public void o(int i, int i2) {
        ((ard) this.c).Y.execute(new ft0(this, i, i2, 4));
    }

    public List p(long j) {
        if (j >= this.b) {
            return (zw6) this.c;
        }
        ls5 ls5 = zw6.b;
        return ffc.X;
    }

    public boolean q(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).q(bArr, i, i2, z);
            default:
                return ((na5) this.c).q(bArr, i, i2, z);
        }
    }

    public long r() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).r() - this.b;
            default:
                return ((na5) this.c).r() - this.b;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).read(bArr, i, i2);
            default:
                return ((na5) this.c).read(bArr, i, i2);
        }
    }

    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).readFully(bArr, i, i2);
                return;
            default:
                ((na5) this.c).readFully(bArr, i, i2);
                return;
        }
    }

    public void s(int i) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).s(i);
                return;
            default:
                ((na5) this.c).s(i);
                return;
        }
    }

    public long t() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((g03) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((g03) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public int u() {
        return 1;
    }

    public long v(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) maf.f(((l13) this.c).e, j + this.b, true);
            default:
                return (long) oaf.f(((m13) this.c).X, j + this.b, true);
        }
    }

    public void w() {
        switch (this.a) {
            case 13:
                ((oa5) this.c).w();
                return;
            default:
                ((pa5) this.c).w();
                return;
        }
    }

    public long x() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).x() - this.b;
            default:
                return ((na5) this.c).x() - this.b;
        }
    }

    public void y() {
        switch (this.a) {
            case 11:
                ((ma5) this.c).y();
                return;
            default:
                ((na5) this.c).y();
                return;
        }
    }

    public void z(int i) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).z(i);
                return;
            default:
                ((na5) this.c).z(i);
                return;
        }
    }

    public /* synthetic */ g03(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    /* renamed from: B  reason: collision with other method in class */
    public yze m18B(int i, int i2) {
        return ((pa5) this.c).B(i, i2);
    }

    /* renamed from: n  reason: collision with other method in class */
    public r4c m19n(long j) {
        m13 m13 = (m13) this.c;
        int i = (int) j;
        return new r4c(m13.c[i], (String) null, (long) m13.b[i]);
    }

    public /* synthetic */ g03(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public g03(gyc gyc, bqc bqc) {
        this.a = 9;
        this.c = new AtomicInteger(0);
        int intValue = ((Number) gyc.invoke()).intValue() + 1;
        ((hyc) bqc.b).k(intValue, "request_id");
        this.b = ((long) intValue) << 32;
    }

    public g03(wf wfVar) {
        this.a = 4;
        this.c = wfVar;
        this.b = -1;
    }

    public g03(fu0 fu0) {
        this.a = 7;
        this.c = fu0;
        this.b = (long) 262144;
    }

    public g03(ra4 ra4, long j) {
        this.a = 11;
        this.c = ra4;
        np8.d(ra4.o >= j);
        this.b = j;
    }

    public g03(sa4 sa4, long j) {
        this.a = 12;
        this.c = sa4;
        fm9.f(sa4.o >= j);
        this.b = j;
    }

    public g03(int i) {
        this.a = i;
        switch (i) {
            case 6:
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.c = new SparseLongArray();
                return;
            default:
                this.b = 0;
                return;
        }
    }
}
