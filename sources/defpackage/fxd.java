package defpackage;

import java.math.BigInteger;

/* renamed from: fxd  reason: default package */
public abstract class fxd extends jxd {
    public final BigInteger h;
    public final BigInteger i;
    public final BigInteger j;
    public final long k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fxd(int i2, long j2, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, long j3, String str2, bkb bkb) {
        super(i2, 1, j2, str, str2, bkb);
        this.h = bigInteger;
        this.i = bigInteger2;
        this.j = bigInteger3;
        this.k = j3;
    }
}
