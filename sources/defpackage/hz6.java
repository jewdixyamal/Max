package defpackage;

/* renamed from: hz6  reason: default package */
public final class hz6 implements efb {
    public final jqe a;

    public hz6(cqe cqe) {
        this.a = cqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz6) && tpa.f(this.a, ((hz6) obj).a);
    }

    public final long getItemId() {
        return (long) 64;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 64) == ol7.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 64;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("InactiveTimeDeleteProfileItem(text="), this.a, ")");
    }
}
