package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: ti8  reason: default package */
public final class ti8 {
    public final String a;
    public final int b;
    public final int c;

    public ti8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti8)) {
            return false;
        }
        ti8 ti8 = (ti8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || ti8.b < 0) ? TextUtils.equals(str, ti8.a) && i == ti8.c : TextUtils.equals(str, ti8.a) && i2 == ti8.b && i == ti8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
