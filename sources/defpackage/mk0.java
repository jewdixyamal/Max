package defpackage;

import java.util.Arrays;

/* renamed from: mk0  reason: default package */
public final class mk0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public mk0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk0)) {
            return false;
        }
        mk0 mk0 = (mk0) obj;
        return this.c == mk0.c && this.d == mk0.d && f46.B(this.a, mk0.a) && f46.B(this.b, mk0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
