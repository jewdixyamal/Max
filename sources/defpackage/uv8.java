package defpackage;

import android.text.Layout;

/* renamed from: uv8  reason: default package */
public final class uv8 implements vv8 {
    public final long a;
    public final Layout b;
    public final Layout c;

    public uv8(long j, Layout layout, Layout layout2) {
        this.a = j;
        this.b = layout;
        this.c = layout2;
    }

    public final Layout a() {
        return this.b;
    }

    public final Layout b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv8)) {
            return false;
        }
        uv8 uv8 = (uv8) obj;
        return this.a == uv8.a && tpa.f(this.b, uv8.b) && tpa.f(this.c, uv8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", bodyLayout=" + this.b + ", forwardedTitleLayout=" + this.c + ")";
    }
}
