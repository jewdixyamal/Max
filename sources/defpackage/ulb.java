package defpackage;

/* renamed from: ulb  reason: default package */
public final class ulb extends amb {
    public final jqe a;
    public final m56 b;

    public ulb(jqe jqe, m56 m56) {
        this.a = jqe;
        this.b = m56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulb)) {
            return false;
        }
        ulb ulb = (ulb) obj;
        return tpa.f(this.a, ulb.a) && tpa.f(this.b, ulb.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
