package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: q2d  reason: default package */
public final class q2d extends m2d {
    public final pl8 j;
    public final pl8 k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q2d(r4c r4c, long j2, long j3, long j4, long j5, long j6, List list, long j7, pl8 pl8, pl8 pl82, long j8, long j9) {
        super(r4c, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = pl8;
        this.k = pl82;
        this.l = j5;
    }

    public final r4c b(lhc lhc) {
        pl8 pl8 = this.j;
        if (pl8 == null) {
            return (r4c) this.c;
        }
        qy5 qy5 = lhc.a;
        return new r4c(0, pl8.i(qy5.i, 0, 0, qy5.a), -1);
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

    public final r4c i(long j2, lhc lhc) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((s2d) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        qy5 qy5 = lhc.a;
        return new r4c(0, this.k.i(qy5.i, j2, j4, qy5.a), -1);
    }
}
