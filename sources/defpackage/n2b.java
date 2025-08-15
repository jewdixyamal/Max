package defpackage;

/* renamed from: n2b  reason: default package */
public final class n2b implements efb {
    public final jqe a;

    public n2b(eqe eqe) {
        this.a = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2b)) {
            return false;
        }
        return tpa.f(this.a, ((n2b) obj).a);
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 65536) == ol7.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (this.a.hashCode() * 31);
    }

    public final int l() {
        return -2147418112;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof qmd)) {
            return null;
        }
        return new wfb(((qmd) ol7).a);
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "PlaceholderItem(text=" + this.a + ", viewType=-2147418112)";
    }
}
