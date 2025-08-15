package defpackage;

import java.util.regex.Pattern;

/* renamed from: ak3  reason: default package */
public final class ak3 {
    public final je7 a;
    public final je7 b;

    public ak3(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final String a(uj3 uj3, n10 n10) {
        if (uj3 != null) {
            return uj3.q(((hyc) ((q33) this.b.getValue())).q(), kk0.c);
        }
        if (n10.d.length() > 0) {
            String str = n10.g;
            int length = str.length();
            String str2 = n10.h;
            if (length > 0 || str2.length() > 0) {
                if (str2.length() != 0) {
                    str = str2;
                }
                return j47.O(str);
            }
        }
        return null;
    }

    public final uj3 b(n10 n10) {
        long j = n10.b;
        if (j == 0) {
            return null;
        }
        el3 el3 = ((ds3) this.a.getValue()).a;
        uj3 uj3 = (uj3) el3.a.get(Long.valueOf(j));
        if (uj3 == null) {
            uj3 = el3.i(j, false);
        }
        if (uj3 == null || uj3.w() || uj3.k() != 0) {
            return null;
        }
        return uj3;
    }

    public final CharSequence c(n10 n10) {
        uj3 b2 = b(n10);
        if (b2 != null && ((String) b2.m()).length() > 0) {
            return b2.m();
        }
        String str = n10.d;
        if (str.length() <= 0) {
            return fca.b("Unknown", (CharSequence) null);
        }
        Pattern pattern = fca.a;
        return fca.b(str, n10.e);
    }
}
