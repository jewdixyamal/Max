package defpackage;

import java.util.Arrays;

/* renamed from: k4b  reason: default package */
public final class k4b {
    public static final k4b c = new k4b(false, false);
    public static final String d = Integer.toString(0, 36);
    public static final String e = Integer.toString(1, 36);
    public final boolean a;
    public final boolean b;

    static {
        int i = oaf.a;
    }

    public k4b(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b)) {
            return false;
        }
        k4b k4b = (k4b) obj;
        return this.a == k4b.a && this.b == k4b.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
