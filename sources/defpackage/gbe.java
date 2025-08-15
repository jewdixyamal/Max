package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: gbe  reason: default package */
public final class gbe implements la5 {
    public final wpa X = new wpa();
    public byte[] Y = oaf.f;
    public yze Z;
    public final obe a;
    public final kj6 b = new kj6(9);
    public final qy5 c;
    public final ArrayList o;
    public int s0;
    public int t0;
    public long[] u0;
    public long v0;

    public gbe(obe obe, qy5 qy5) {
        this.a = obe;
        ny5 a2 = qy5.a();
        a2.m = ia9.l("application/x-media3-cues");
        a2.i = qy5.n;
        a2.G = obe.J();
        this.c = new qy5(a2);
        this.o = new ArrayList();
        this.t0 = 0;
        this.u0 = oaf.g;
        this.v0 = -9223372036854775807L;
    }

    public final void S(pa5 pa5) {
        fm9.k(this.t0 == 0);
        yze B = pa5.B(0, 3);
        this.Z = B;
        B.e(this.c);
        pa5.w();
        pa5.J(new vz6(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.t0 = 1;
    }

    public final void a(fbe fbe) {
        fm9.l(this.Z);
        byte[] bArr = fbe.b;
        int length = bArr.length;
        wpa wpa = this.X;
        wpa.getClass();
        wpa.E(bArr.length, bArr);
        this.Z.b(wpa, length, 0);
        this.Z.a(fbe.a, 1, length, 0, (wze) null);
    }

    public final void d(long j, long j2) {
        int i = this.t0;
        fm9.k((i == 0 || i == 5) ? false : true);
        this.v0 = j2;
        if (this.t0 == 2) {
            this.t0 = 1;
        }
        if (this.t0 == 4) {
            this.t0 = 3;
        }
    }

    public final int g(na5 na5, lh4 lh4) {
        int i = this.t0;
        fm9.k((i == 0 || i == 5) ? false : true);
        if (this.t0 == 1) {
            int l = ((sa4) na5).c != -1 ? s5c.l(((sa4) na5).c) : 1024;
            if (l > this.Y.length) {
                this.Y = new byte[l];
            }
            this.s0 = 0;
            this.t0 = 2;
        }
        int i2 = this.t0;
        ArrayList arrayList = this.o;
        if (i2 == 2) {
            byte[] bArr = this.Y;
            if (bArr.length == this.s0) {
                this.Y = Arrays.copyOf(bArr, bArr.length + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr2 = this.Y;
            int i3 = this.s0;
            sa4 sa4 = (sa4) na5;
            int read = sa4.read(bArr2, i3, bArr2.length - i3);
            if (read != -1) {
                this.s0 += read;
            }
            long j = sa4.c;
            if ((j != -1 && ((long) this.s0) == j) || read == -1) {
                try {
                    long j2 = this.v0;
                    this.a.G(this.Y, 0, this.s0, j2 != -9223372036854775807L ? new nbe(j2, true) : nbe.c, new bqc(20, this));
                    Collections.sort(arrayList);
                    this.u0 = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.u0[i4] = ((fbe) arrayList.get(i4)).a;
                    }
                    this.Y = oaf.f;
                    this.t0 = 4;
                } catch (RuntimeException e) {
                    throw ParserException.a(e, "SubtitleParser failed.");
                }
            }
        }
        if (this.t0 == 3) {
            if (((sa4) na5).g(((sa4) na5).c != -1 ? s5c.l(((sa4) na5).c) : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == -1) {
                long j3 = this.v0;
                for (int f = j3 == -9223372036854775807L ? 0 : oaf.f(this.u0, j3, true); f < arrayList.size(); f++) {
                    a((fbe) arrayList.get(f));
                }
                this.t0 = 4;
            }
        }
        return this.t0 == 4 ? -1 : 0;
    }

    public final boolean n(na5 na5) {
        return true;
    }

    public final void release() {
        if (this.t0 != 5) {
            this.a.reset();
            this.t0 = 5;
        }
    }
}
