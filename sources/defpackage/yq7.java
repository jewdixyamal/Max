package defpackage;

import java.util.Locale;

/* renamed from: yq7  reason: default package */
public final class yq7 {
    public static final yq7 b = new yq7(new zq7(xq7.a(new Locale[0])));
    public final zq7 a;

    public yq7(zq7 zq7) {
        this.a = zq7;
    }

    public static yq7 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = wq7.a(split[i]);
        }
        return new yq7(new zq7(xq7.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yq7) {
            if (this.a.equals(((yq7) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
