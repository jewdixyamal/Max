package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: el7  reason: default package */
public final class el7 {
    public final String a;
    public final boolean b;

    public el7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof el7)) {
            return false;
        }
        el7 el7 = (el7) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(el7.a)) {
            return false;
        }
        boolean z = this.b;
        String str2 = el7.a;
        if (z) {
            return str.equals(str2);
        }
        Pattern pattern = bre.a;
        return str.length() == str2.length() && str2.regionMatches(true, 0, str, 0, str.length());
    }
}
