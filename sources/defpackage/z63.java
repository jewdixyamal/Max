package defpackage;

import java.io.Serializable;

/* renamed from: z63  reason: default package */
public final class z63 implements lx3, Serializable {
    public final lx3 a;
    public final jx3 b;

    public z63(lx3 lx3, jx3 jx3) {
        this.a = lx3;
        this.b = jx3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof z63)) {
                return false;
            }
            z63 z63 = (z63) obj;
            z63.getClass();
            int i = 2;
            z63 z632 = z63;
            int i2 = 2;
            while (true) {
                lx3 lx3 = z632.a;
                z632 = lx3 instanceof z63 ? (z63) lx3 : null;
                if (z632 == null) {
                    break;
                }
                i2++;
            }
            z63 z633 = this;
            while (true) {
                lx3 lx32 = z633.a;
                z633 = lx32 instanceof z63 ? (z63) lx32 : null;
                if (z633 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            while (true) {
                jx3 jx3 = this.b;
                if (tpa.f(z63.get(jx3.getKey()), jx3)) {
                    lx3 lx33 = this.a;
                    if (!(lx33 instanceof z63)) {
                        jx3 jx32 = (jx3) lx33;
                        z = tpa.f(z63.get(jx32.getKey()), jx32);
                        break;
                    }
                    this = (z63) lx33;
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }
    }

    public final Object fold(Object obj, a66 a66) {
        return a66.invoke(this.a.fold(obj, a66), this.b);
    }

    public final jx3 get(kx3 kx3) {
        while (true) {
            jx3 jx3 = this.b.get(kx3);
            if (jx3 != null) {
                return jx3;
            }
            lx3 lx3 = this.a;
            if (!(lx3 instanceof z63)) {
                return lx3.get(kx3);
            }
            this = (z63) lx3;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    public final lx3 minusKey(kx3 kx3) {
        jx3 jx3 = this.b;
        jx3 jx32 = jx3.get(kx3);
        lx3 lx3 = this.a;
        if (jx32 != null) {
            return lx3;
        }
        lx3 minusKey = lx3.minusKey(kx3);
        return minusKey == lx3 ? this : minusKey == hz4.a ? jx3 : new z63(minusKey, jx3);
    }

    public final lx3 plus(lx3 lx3) {
        return ema.z(this, lx3);
    }

    public final String toString() {
        return rh4.m(new StringBuilder("["), (String) fold("", y63.b), ']');
    }
}
