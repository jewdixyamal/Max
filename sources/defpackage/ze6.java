package defpackage;

import java.util.Arrays;

/* renamed from: ze6  reason: default package */
public final class ze6 {
    public final ye6 a;
    public final af6 b;

    public ze6(ye6 ye6, af6 af6) {
        this.a = ye6;
        this.b = af6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze6)) {
            return false;
        }
        ze6 ze6 = (ze6) obj;
        return tpa.f(this.a, ze6.a) && tpa.f(this.b, ze6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientsBannerDKColors(background=" + this.a + ", stroke=" + this.b + ")";
    }
}
