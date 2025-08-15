package defpackage;

/* renamed from: exe  reason: default package */
public final class exe {
    public final fxe a;
    public final gxe b;

    public exe(fxe fxe, gxe gxe) {
        this.a = fxe;
        this.b = gxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe)) {
            return false;
        }
        exe exe = (exe) obj;
        return tpa.f(this.a, exe.a) && tpa.f(this.b, exe.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarBackgroundColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
