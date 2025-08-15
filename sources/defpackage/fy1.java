package defpackage;

/* renamed from: fy1  reason: default package */
public final class fy1 implements efb {
    public final jqe a;

    public fy1(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy1) && tpa.f(this.a, ((fy1) obj).a);
    }

    public final long getItemId() {
        return (long) 256;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 256) == ol7.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 256;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("CancelDeleteProfileItem(text="), this.a, ")");
    }
}
