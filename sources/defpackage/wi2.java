package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: wi2  reason: default package */
public final /* synthetic */ class wi2 implements UnaryOperator {
    public final /* synthetic */ ck2 a;
    public final /* synthetic */ zc8 b;
    public final /* synthetic */ cu8 c;

    public /* synthetic */ wi2(ck2 ck2, zc8 zc8, cu8 cu8) {
        this.a = ck2;
        this.b = zc8;
        this.c = cu8;
    }

    public final Object apply(Object obj) {
        zc8 zc8 = (zc8) obj;
        ck2 ck2 = this.a;
        zc8 zc82 = this.b;
        if (ck2.u(ck2, zc82)) {
            return zc82;
        }
        long j = this.c.c;
        return new zc8(j, j, ck2.H0, ck2.b);
    }
}
