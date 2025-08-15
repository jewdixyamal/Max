package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: p2d  reason: default package */
public final class p2d extends l2d {
    public final pkg j;
    public final pkg k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p2d(q4c q4c, long j2, long j3, long j4, long j5, long j6, List list, long j7, pkg pkg, pkg pkg2, long j8, long j9) {
        super(q4c, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = pkg;
        this.k = pkg2;
        this.l = j5;
    }

    public final q4c a(khc khc) {
        pkg pkg = this.j;
        if (pkg == null) {
            return (q4c) this.c;
        }
        oy5 oy5 = khc.a;
        return new q4c(0, pkg.a(oy5.s0, 0, 0, oy5.a), -1);
    }

    public final long e(long j2) {
        List list = this.f;
        if (list != null) {
            return (long) list.size();
        }
        long j3 = this.l;
        if (j3 != -1) {
            return (j3 - this.d) + 1;
        }
        if (j2 == -9223372036854775807L) {
            return -1;
        }
        BigInteger multiply = BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.a));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = dm0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    public final q4c i(long j2, khc khc) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((r2d) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        oy5 oy5 = khc.a;
        return new q4c(0, this.k.a(oy5.s0, j2, j4, oy5.a), -1);
    }
}
