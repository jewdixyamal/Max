package defpackage;

/* renamed from: gh4  reason: default package */
public final class gh4 implements efb {
    public final jqe a;

    public gh4(eqe eqe) {
        this.a = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh4) && tpa.f(this.a, ((gh4) obj).a);
    }

    public final long getItemId() {
        return (long) 128;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 128) == ol7.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 128;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("DeleteProfileItem(text="), this.a, ")");
    }
}
