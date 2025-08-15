package defpackage;

/* renamed from: dmd  reason: default package */
public final class dmd implements ol7 {
    public final int a;
    public final int b = eda.d;
    public final long c;

    public dmd(int i) {
        this.a = i;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmd) && this.a == ((dmd) obj).a;
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.b;
    }

    public final String toString() {
        return zr6.j(new StringBuilder("ShimmerMemberListItem(pos="), this.a, ")");
    }
}
