package defpackage;

/* renamed from: scf  reason: default package */
public final class scf {
    public final pcf a;
    public final tcf b;

    public scf(pcf pcf, tcf tcf) {
        this.a = pcf;
        this.b = tcf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scf)) {
            return false;
        }
        scf scf = (scf) obj;
        return tpa.f(this.a, scf.a) && tpa.f(this.b, scf.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VfxColors(buttonIconOverlayPlain=" + this.a + ", emptyBlock=" + this.b + ")";
    }
}
