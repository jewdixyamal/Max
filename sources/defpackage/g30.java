package defpackage;

import android.media.AudioAttributes;

/* renamed from: g30  reason: default package */
public final class g30 implements su0 {
    public static final g30 Z = new g30(0, 0, 1, 1, 0);
    public final int X;
    public AudioAttributes Y;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    public g30(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = i4;
        this.X = i5;
    }

    public final AudioAttributes a() {
        if (this.Y == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i = maf.a;
            if (i >= 29) {
                c30.a(usage, this.o);
            }
            if (i >= 32) {
                e30.a(usage, this.X);
            }
            this.Y = usage.build();
        }
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g30.class != obj.getClass()) {
            return false;
        }
        g30 g30 = (g30) obj;
        return this.a == g30.a && this.b == g30.b && this.c == g30.c && this.o == g30.o && this.X == g30.X;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.X;
    }
}
