package defpackage;

import java.util.Arrays;

/* renamed from: w25  reason: default package */
public final class w25 implements cc7 {
    public final Enum[] a;
    public final r6d b;
    public final khe c = new khe(new es3(11, this));

    public w25(Enum[] enumArr, t25 t25) {
        this.a = enumArr;
        this.b = t25;
    }

    public final Object a(x8 x8Var) {
        int q = x8Var.q(d());
        Enum[] enumArr = this.a;
        if (q >= 0 && q < enumArr.length) {
            return enumArr[q];
        }
        throw new IllegalArgumentException(q + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    public final void b(xu3 xu3, Object obj) {
        Enum enumR = (Enum) obj;
        Enum[] enumArr = this.a;
        int g0 = ys.g0(enumArr, enumR);
        if (g0 != -1) {
            xu3.g(d(), g0);
            return;
        }
        throw new IllegalArgumentException(enumR + " is not a valid enum " + d().a() + ", must be one of " + Arrays.toString(enumArr));
    }

    public final r6d d() {
        return (r6d) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
