package defpackage;

import java.math.BigInteger;

/* renamed from: ubg  reason: default package */
public final class ubg extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lec b;
    public final /* synthetic */ lec c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubg(lec lec, lec lec2, int i) {
        super(1);
        this.a = i;
        this.b = lec;
        this.c = lec2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                fxd fxd = (fxd) obj;
                lec lec = this.b;
                long j = lec.a;
                long j2 = 0;
                BigInteger bigInteger = fxd.h;
                lec.a = j + (bigInteger != null ? bigInteger.longValue() : 0);
                lec lec2 = this.c;
                long j3 = lec2.a;
                BigInteger bigInteger2 = fxd.i;
                if (bigInteger2 != null) {
                    j2 = bigInteger2.longValue();
                }
                lec2.a = j3 + j2;
                return e5f.a;
            default:
                gxd gxd = (gxd) obj;
                lec lec3 = this.b;
                long j4 = lec3.a;
                long j5 = 0;
                BigInteger bigInteger3 = gxd.h;
                lec3.a = j4 + (bigInteger3 != null ? bigInteger3.longValue() : 0);
                lec lec4 = this.c;
                long j6 = lec4.a;
                BigInteger bigInteger4 = gxd.i;
                if (bigInteger4 != null) {
                    j5 = bigInteger4.longValue();
                }
                lec4.a = j6 + j5;
                return e5f.a;
        }
    }
}
