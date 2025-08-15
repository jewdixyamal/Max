package defpackage;

/* renamed from: qzd  reason: default package */
public final class qzd {
    public final bz a;
    public final d5g b;

    public qzd(bz bzVar, d5g d5g) {
        this.a = bzVar;
        this.b = d5g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd)) {
            return false;
        }
        qzd qzd = (qzd) obj;
        return tpa.f(this.a, qzd.a) && tpa.f(this.b, qzd.b);
    }

    public final int hashCode() {
        bz bzVar = this.a;
        return this.b.hashCode() + ((bzVar == null ? 0 : bzVar.hashCode()) * 31);
    }

    public final String toString() {
        return "StartMessage(media=" + this.a + ", text=" + this.b + ")";
    }
}
