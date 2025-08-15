package defpackage;

/* renamed from: ib  reason: default package */
public final class ib implements jb {
    public final gg1 a;

    public ib(gg1 gg1) {
        this.a = gg1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        return tpa.f(this.a, ((ib) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableScreenSharingForParticipant(id=" + this.a + ", isSuccess=true)";
    }
}
