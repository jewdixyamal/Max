package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: yi8  reason: default package */
public final class yi8 {
    public final String a;
    public final int b;
    public final int c;

    public yi8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi8)) {
            return false;
        }
        yi8 yi8 = (yi8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || yi8.b < 0) ? TextUtils.equals(str, yi8.a) && i == yi8.c : TextUtils.equals(str, yi8.a) && i2 == yi8.b && i == yi8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
