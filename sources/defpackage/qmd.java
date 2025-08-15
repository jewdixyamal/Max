package defpackage;

/* renamed from: qmd  reason: default package */
public final class qmd implements efb {
    public final i24 a;

    public qmd(i24 i24) {
        this.a = i24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmd)) {
            return false;
        }
        return tpa.f(this.a, ((qmd) obj).a);
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 16) == ol7.getItemId();
    }

    public final int hashCode() {
        i24 i24 = this.a;
        return Integer.hashCode(-2147483632) + ((i24 == null ? 0 : i24.hashCode()) * 31);
    }

    public final int l() {
        return -2147483632;
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
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
