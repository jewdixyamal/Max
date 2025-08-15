package defpackage;

/* renamed from: rw6  reason: default package */
public final class rw6 extends n1 implements fy9 {
    public final double a;

    public rw6(double d) {
        this.a = d;
    }

    public final String a() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    public final int e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 4) {
            return false;
        } else {
            return this.a == uaf.l().a;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final rw6 l() {
        return this;
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    public final rw6 v() {
        return this;
    }
}
