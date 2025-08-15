package defpackage;

/* renamed from: hjb  reason: default package */
public final class hjb implements ijb {
    public final jqe a;

    public hjb(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjb) && tpa.f(this.a, ((hjb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSuccessRestoredMembersSnackbar(caption="), this.a, ")");
    }
}
