package defpackage;

import android.text.TextUtils;

/* renamed from: r54  reason: default package */
public final class r54 {
    public final String a;
    public final oy5 b;
    public final oy5 c;
    public final int d;
    public final int e;

    public r54(String str, oy5 oy5, oy5 oy52, int i, int i2) {
        np8.d(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            oy5.getClass();
            this.b = oy5;
            oy52.getClass();
            this.c = oy52;
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
        if (obj == null || r54.class != obj.getClass()) {
            return false;
        }
        r54 r54 = (r54) obj;
        return this.d == r54.d && this.e == r54.e && this.a.equals(r54.a) && this.b.equals(r54.b) && this.c.equals(r54.c);
    }

    public final int hashCode() {
        int d2 = rh4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
