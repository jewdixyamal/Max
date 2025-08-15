package defpackage;

import java.util.Map;

/* renamed from: rn6  reason: default package */
public final class rn6 extends erc {
    public final Map H;
    public dr4 I;

    public rn6(n64 n64, tr4 tr4, lr4 lr4, Map map) {
        super(n64, tr4, lr4);
        this.H = map;
    }

    public final qy5 l(qy5 qy5) {
        dr4 dr4;
        dr4 dr42 = this.I;
        if (dr42 == null) {
            dr42 = qy5.r;
        }
        if (!(dr42 == null || (dr4 = (dr4) this.H.get(dr42.c)) == null)) {
            dr42 = dr4;
        }
        f99 f99 = qy5.k;
        f99 f992 = null;
        if (f99 != null) {
            d99[] d99Arr = f99.a;
            int length = d99Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                d99 d99 = d99Arr[i2];
                if ((d99 instanceof g9b) && "com.apple.streaming.transportStreamTimestamp".equals(((g9b) d99).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    d99[] d99Arr2 = new d99[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            d99Arr2[i < i2 ? i : i - 1] = d99Arr[i];
                        }
                        i++;
                    }
                    f992 = new f99(d99Arr2);
                }
            }
            if (!(dr42 == qy5.r && f99 == qy5.k)) {
                ny5 a = qy5.a();
                a.q = dr42;
                a.j = f99;
                qy5 = a.a();
            }
            return super.l(qy5);
        }
        f99 = f992;
        ny5 a2 = qy5.a();
        a2.q = dr42;
        a2.j = f99;
        qy5 = a2.a();
        return super.l(qy5);
    }
}
