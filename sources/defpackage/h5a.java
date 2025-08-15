package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: h5a  reason: default package */
public final class h5a {
    public static final vc0 a = new vc0();
    public static final wc0 b = new Object();

    public static nj0 a(m5a m5a) {
        if (m5a instanceof j5a) {
            return a;
        }
        if (m5a instanceof l5a) {
            return b;
        }
        if (m5a.equals(k5a.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wv6 b(String str, m5a m5a, int i) {
        if ((i & 2) != 0) {
            m5a = j5a.a;
        }
        Uri d = fp3.d(str);
        if (d == null) {
            d = Uri.EMPTY;
        }
        xv6 d2 = xv6.d(d);
        d2.g = uv6.b;
        d2.l = a(m5a);
        d2.k = a9b.c;
        return d2.a();
    }
}
