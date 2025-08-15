package defpackage;

import android.text.TextUtils;

/* renamed from: s54  reason: default package */
public final class s54 {
    public final String a;
    public final qy5 b;
    public final qy5 c;
    public final int d;
    public final int e;

    public s54(String str, qy5 qy5, qy5 qy52, int i, int i2) {
        fm9.f(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            qy5.getClass();
            this.b = qy5;
            qy52.getClass();
            this.c = qy52;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s54.class != obj.getClass()) {
            return false;
        }
        s54 s54 = (s54) obj;
        return this.d == s54.d && this.e == s54.e && this.a.equals(s54.a) && this.b.equals(s54.b) && this.c.equals(s54.c);
    }

    public final int hashCode() {
        int d2 = rh4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
