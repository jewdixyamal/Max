package defpackage;

import android.text.TextUtils;

/* renamed from: h88  reason: default package */
public final class h88 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public h88(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != h88.class) {
            return false;
        }
        h88 h88 = (h88) obj;
        return TextUtils.equals(this.a, h88.a) && this.b == h88.b && this.c == h88.c;
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
