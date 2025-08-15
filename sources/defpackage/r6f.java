package defpackage;

import java.util.List;

/* renamed from: r6f  reason: default package */
public final class r6f {
    public final long a;
    public final String b;
    public final List c;
    public final vx8 d;

    public r6f(long j, String str, List list, vx8 vx8) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = vx8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6f)) {
            return false;
        }
        r6f r6f = (r6f) obj;
        return this.a == r6f.a && tpa.f(this.b, r6f.b) && tpa.f(this.c, r6f.c) && this.d == r6f.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + k7d.g(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "UpdateTextEntity(id=" + this.a + ", text=" + this.b + ", elements=" + this.c + ", status=" + this.d + ")";
    }
}
