package defpackage;

/* renamed from: c14  reason: default package */
public final class c14 {
    public final lqb a;
    public final boolean b;

    public c14(lqb lqb, boolean z) {
        this.a = lqb;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c14)) {
            return false;
        }
        c14 c14 = (c14) obj;
        return c14.a.equals(this.a) && c14.b == this.b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
