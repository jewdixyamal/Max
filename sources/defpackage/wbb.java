package defpackage;

/* renamed from: wbb  reason: default package */
public final class wbb implements acb {
    public final jqe a;
    public final boolean b;

    public wbb(eqe eqe, boolean z) {
        this.a = eqe;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbb)) {
            return false;
        }
        wbb wbb = (wbb) obj;
        return tpa.f(this.a, wbb.a) && this.b == wbb.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotifyUser(text=" + this.a + ", isError=" + this.b + ")";
    }
}
