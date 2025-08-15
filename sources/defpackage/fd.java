package defpackage;

import java.util.Arrays;

/* renamed from: fd  reason: default package */
public final class fd {
    public final long a;
    public final mue b;
    public final int c;
    public final yj8 d;
    public final long e;
    public final mue f;
    public final int g;
    public final yj8 h;
    public final long i;
    public final long j;

    public fd(long j2, mue mue, int i2, yj8 yj8, long j3, mue mue2, int i3, yj8 yj82, long j4, long j5) {
        this.a = j2;
        this.b = mue;
        this.c = i2;
        this.d = yj8;
        this.e = j3;
        this.f = mue2;
        this.g = i3;
        this.h = yj82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd.class != obj.getClass()) {
            return false;
        }
        fd fdVar = (fd) obj;
        return this.a == fdVar.a && this.c == fdVar.c && this.e == fdVar.e && this.g == fdVar.g && this.i == fdVar.i && this.j == fdVar.j && f46.B(this.b, fdVar.b) && f46.B(this.d, fdVar.d) && f46.B(this.f, fdVar.f) && f46.B(this.h, fdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
