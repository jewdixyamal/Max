package defpackage;

import android.text.TextUtils;

/* renamed from: i88  reason: default package */
public final class i88 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public i88(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != i88.class) {
            return false;
        }
        i88 i88 = (i88) obj;
        return TextUtils.equals(this.a, i88.a) && this.b == i88.b && this.c == i88.c;
    }

    public final int hashCode() {
        int i = 1237;
        int d = (rh4.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31;
        if (this.c) {
            i = 1231;
        }
        return d + i;
    }
}
