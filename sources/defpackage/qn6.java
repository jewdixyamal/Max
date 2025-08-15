package defpackage;

import java.util.Map;

/* renamed from: qn6  reason: default package */
public final class qn6 extends drc {
    public final Map H;
    public cr4 I;

    public qn6(n64 n64, sr4 sr4, kr4 kr4, Map map) {
        super(n64, sr4, kr4);
        this.H = map;
    }

    public final oy5 m(oy5 oy5) {
        cr4 cr4;
        cr4 cr42 = this.I;
        if (cr42 == null) {
            cr42 = oy5.z0;
        }
        if (!(cr42 == null || (cr4 = (cr4) this.H.get(cr42.c)) == null)) {
            cr42 = cr4;
        }
        e99 e99 = oy5.u0;
        e99 e992 = null;
        if (e99 != null) {
            c99[] c99Arr = e99.a;
            int length = c99Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                c99 c99 = c99Arr[i2];
                if ((c99 instanceof f9b) && "com.apple.streaming.transportStreamTimestamp".equals(((f9b) c99).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    c99[] c99Arr2 = new c99[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            c99Arr2[i < i2 ? i : i - 1] = c99Arr[i];
                        }
                        i++;
                    }
                    e992 = new e99(c99Arr2);
                }
            }
            if (!(cr42 == oy5.z0 && e99 == oy5.u0)) {
                my5 a = oy5.a();
                a.n = cr42;
                a.i = e99;
                oy5 = a.a();
            }
            return super.m(oy5);
        }
        e99 = e992;
        my5 a2 = oy5.a();
        a2.n = cr42;
        a2.i = e99;
        oy5 = a2.a();
        return super.m(oy5);
    }
}
