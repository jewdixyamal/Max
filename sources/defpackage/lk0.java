package defpackage;

import java.util.Arrays;

/* renamed from: lk0  reason: default package */
public final class lk0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public lk0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk0)) {
            return false;
        }
        lk0 lk0 = (lk0) obj;
        return this.c == lk0.c && this.d == lk0.d && f46.B(this.a, lk0.a) && f46.B(this.b, lk0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
