package defpackage;

import java.math.BigInteger;

/* renamed from: gxd  reason: default package */
public abstract class gxd extends jxd {
    public final BigInteger h;
    public final BigInteger i;
    public final BigInteger j;
    public final Boolean k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gxd(int i2, long j2, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, bkb bkb, Boolean bool) {
        super(i2, 2, j2, str, str2, bkb);
        this.h = bigInteger;
        this.i = bigInteger2;
        this.j = bigInteger3;
        this.k = bool;
    }
}
