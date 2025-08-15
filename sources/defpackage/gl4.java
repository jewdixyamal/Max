package defpackage;

import java.util.List;

/* renamed from: gl4  reason: default package */
public final class gl4 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public gl4(long j, String str, boolean z, List list, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        list = (i & 8) != 0 ? nz4.a : list;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4 = (gl4) obj;
        return this.a == gl4.a && tpa.f(this.b, gl4.b) && this.c == gl4.c && tpa.f(this.d, gl4.d) && this.e == gl4.e && this.f == gl4.f;
    }

    public final int hashCode() {
        int d2 = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = true;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int g = k7d.g(this.d, (d2 + (z2 ? 1 : 0)) * 31, 31);
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i = (g + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (!z4) {
            z = z4;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        return "SpaceConsumer(size=" + this.a + ", name=" + this.b + ", isDirectory=" + this.c + ", children=" + this.d + ", overflow=" + this.e + ", excluded=" + this.f + ')';
    }
}
