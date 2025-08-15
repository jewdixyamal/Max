package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: p7  reason: default package */
public final class p7 {
    public final bkb a;
    public final String b;

    public p7(bkb bkb) {
        List list = q7.d;
        String str = "null";
        if (bkb != null) {
            String str2 = (String) bkb.b;
            str = str2 != null ? str2.toLowerCase(Locale.ROOT) : str;
            if (q7.d.contains(str)) {
                str = ((String) bkb.a) + ":" + str;
            }
        }
        this.a = bkb;
        this.b = str;
    }
}
