package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: yd9  reason: default package */
public final class yd9 implements pa5 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable o;

    public yd9(yw1 yw1, Rational rational) {
        this.a = yw1.b();
        this.b = yw1.g();
        this.o = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    public yze B(int i, int i2) {
        if (i2 == 2) {
            this.a = i;
        } else if (i2 == 1) {
            this.b = i;
        }
        HashMap hashMap = (HashMap) this.o;
        xd9 xd9 = (xd9) hashMap.get(Integer.valueOf(i2));
        if (xd9 != null) {
            return xd9;
        }
        xd9 xd92 = new xd9();
        hashMap.put(Integer.valueOf(i2), xd92);
        return xd92;
    }

    public void J(v1d v1d) {
        this.c = true;
    }

    public Size a(ev6 ev6) {
        boolean z = false;
        int f0 = ev6.f0(0);
        Size size = (Size) ev6.f(ev6.F, (Object) null);
        if (size == null) {
            return size;
        }
        int C = kp.C(f0);
        if (1 == this.b) {
            z = true;
        }
        int m = kp.m(C, this.a, z);
        return (m == 90 || m == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public void w() {
    }

    public yd9() {
        this.a = -1;
        this.b = -1;
        this.o = new HashMap();
    }
}
