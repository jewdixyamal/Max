package defpackage;

/* renamed from: qd2  reason: default package */
public final class qd2 extends gle {
    public final Boolean X;
    public final long c;
    public final int o;

    public qd2(long j, int i, Boolean bool) {
        this.c = j;
        this.o = i;
        this.X = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd2)) {
            return false;
        }
        qd2 qd2 = (qd2) obj;
        return this.c == qd2.c && this.o == qd2.o && tpa.f(this.X, qd2.X);
    }

    public final int hashCode() {
        int e = k7d.e(this.o, Long.hashCode(this.c) * 31, 31);
        Boolean bool = this.X;
        return e + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Response(mark=" + this.c + ", unread=" + this.o + ", success=" + this.X + ")";
    }
}
