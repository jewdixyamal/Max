package defpackage;

import java.util.Arrays;

/* renamed from: o3b  reason: default package */
public final class o3b implements su0 {
    public final int X;
    public final long Y;
    public final long Z;
    public final Object a;
    public final int b;
    public final rb8 c;
    public final Object o;
    public final int s0;
    public final int t0;

    public o3b(Object obj, int i, rb8 rb8, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = rb8;
        this.o = obj2;
        this.X = i2;
        this.Y = j;
        this.Z = j2;
        this.s0 = i3;
        this.t0 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o3b.class != obj.getClass()) {
            return false;
        }
        o3b o3b = (o3b) obj;
        return this.b == o3b.b && this.X == o3b.X && this.Y == o3b.Y && this.Z == o3b.Z && this.s0 == o3b.s0 && this.t0 == o3b.t0 && f46.B(this.a, o3b.a) && f46.B(this.o, o3b.o) && f46.B(this.c, o3b.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.o, Integer.valueOf(this.X), Long.valueOf(this.Y), Long.valueOf(this.Z), Integer.valueOf(this.s0), Integer.valueOf(this.t0)});
    }
}
