package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;

/* renamed from: yrf  reason: default package */
public final class yrf implements wrf, xrf {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public yrf(oa5 oa5, xze xze, bsf bsf, String str, int i2) {
        this.f = oa5;
        this.g = xze;
        this.h = bsf;
        int i3 = bsf.d;
        int i4 = bsf.a;
        int i5 = (i3 * i4) / 8;
        int i6 = bsf.c;
        if (i6 == i5) {
            int i7 = bsf.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            my5 my5 = new my5();
            my5.k = str;
            my5.f = i9;
            my5.g = i9;
            my5.l = max;
            my5.x = i4;
            my5.y = i7;
            my5.z = i2;
            this.i = new oy5(my5);
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i5);
        sb.append("; got: ");
        sb.append(i6);
        throw ParserException.a((RuntimeException) null, sb.toString());
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
        }
    }

    public final void b(int i2, long j) {
        switch (this.a) {
            case 0:
                ((oa5) this.f).M(new csf((bsf) this.h, 1, (long) i2, j));
                ((xze) this.g).d((oy5) this.i);
                return;
            default:
                ((pa5) this.f).J(new dsf((bsf) this.h, 1, (long) i2, j));
                ((yze) this.g).e((qy5) this.i);
                return;
        }
    }

    public boolean c(sa4 sa4, long j) {
        int i2;
        int i3;
        int i4;
        Object obj = this.g;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                bsf bsf = (bsf) this.h;
                int i5 = bsf.c;
                int i6 = this.d / i5;
            } else {
                int c2 = ((yze) obj).c(sa4, (int) Math.min((long) (i4 - i3), j2), true);
                if (c2 == -1) {
                    j2 = 0;
                } else {
                    this.d += c2;
                    j2 -= (long) c2;
                }
            }
        }
        bsf bsf2 = (bsf) this.h;
        int i52 = bsf2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = (long) bsf2.b;
            int i7 = oaf.a;
            int i8 = i62 * i52;
            int i9 = this.d - i8;
            ((yze) obj).a(j3 + oaf.a0(j4, 1000000, j5, RoundingMode.FLOOR), 1, i8, i9, (wze) null);
            this.e += (long) i62;
            this.d = i9;
        }
        return i2 <= 0;
    }

    public boolean d(ra4 ra4, long j) {
        int i2;
        int i3;
        int i4;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                bsf bsf = (bsf) this.h;
                int i5 = bsf.c;
                int i6 = this.d / i5;
            } else {
                int a2 = ((xze) this.g).a(ra4, (int) Math.min((long) (i4 - i3), j2), true);
                if (a2 == -1) {
                    j2 = 0;
                } else {
                    this.d += a2;
                    j2 -= (long) a2;
                }
            }
        }
        bsf bsf2 = (bsf) this.h;
        int i52 = bsf2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            int i7 = i62 * i52;
            int i8 = this.d - i7;
            ((xze) this.g).b(this.c + maf.J(this.e, 1000000, (long) bsf2.b), 1, i7, i8, (vze) null);
            this.e += (long) i62;
            this.d = i8;
        }
        return i2 <= 0;
    }

    public yrf(pa5 pa5, yze yze, bsf bsf, String str, int i2) {
        this.f = pa5;
        this.g = yze;
        this.h = bsf;
        int i3 = bsf.d;
        int i4 = bsf.a;
        int i5 = (i3 * i4) / 8;
        int i6 = bsf.c;
        if (i6 == i5) {
            int i7 = bsf.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            ny5 ny5 = new ny5();
            ny5.m = ia9.l(str);
            ny5.g = i9;
            ny5.h = i9;
            ny5.n = max;
            ny5.A = i4;
            ny5.B = i7;
            ny5.C = i2;
            this.i = new qy5(ny5);
            return;
        }
        throw androidx.media3.common.ParserException.a((RuntimeException) null, "Expected block size: " + i5 + "; got: " + i6);
    }
}
