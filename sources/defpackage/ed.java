package defpackage;

import java.util.Arrays;

/* renamed from: ed  reason: default package */
public final class ed {
    public final long a;
    public final lue b;
    public final int c;
    public final xj8 d;
    public final long e;
    public final lue f;
    public final int g;
    public final xj8 h;
    public final long i;
    public final long j;

    public ed(long j2, lue lue, int i2, xj8 xj8, long j3, lue lue2, int i3, xj8 xj82, long j4, long j5) {
        this.a = j2;
        this.b = lue;
        this.c = i2;
        this.d = xj8;
        this.e = j3;
        this.f = lue2;
        this.g = i3;
        this.h = xj82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ed.class != obj.getClass()) {
            return false;
        }
        ed edVar = (ed) obj;
        return this.a == edVar.a && this.c == edVar.c && this.e == edVar.e && this.g == edVar.g && this.i == edVar.i && this.j == edVar.j && f46.B(this.b, edVar.b) && f46.B(this.d, edVar.d) && f46.B(this.f, edVar.f) && f46.B(this.h, edVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
