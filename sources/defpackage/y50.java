package defpackage;

/* renamed from: y50  reason: default package */
public final class y50 {
    public static final y50 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public y50(x50 x50) {
        this.a = x50.a;
        this.b = x50.b;
        this.c = x50.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y50.class != obj.getClass()) {
            return false;
        }
        y50 y50 = (y50) obj;
        return this.a == y50.a && this.b == y50.b && this.c == y50.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << true) + ((this.b ? 1 : 0) << true) + (this.c ? 1 : 0);
    }
}
