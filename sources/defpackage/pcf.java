package defpackage;

/* renamed from: pcf  reason: default package */
public final class pcf {
    public final qcf a;
    public final rcf b;

    public pcf(qcf qcf, rcf rcf) {
        this.a = qcf;
        this.b = rcf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcf)) {
            return false;
        }
        pcf pcf = (pcf) obj;
        return tpa.f(this.a, pcf.a) && tpa.f(this.b, pcf.b);
    }

    public final int hashCode() {
        this.a.getClass();
        this.b.getClass();
        return Integer.hashCode(687865856) + (Integer.hashCode(520093696) * 31);
    }

    public final String toString() {
        return "VfxButtonIconOverlayPlainColors(elevation1=" + this.a + ", elevation2=" + this.b + ")";
    }
}
