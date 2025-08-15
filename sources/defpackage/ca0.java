package defpackage;

/* renamed from: ca0  reason: default package */
public final class ca0 {
    public final int a;
    public final int b;
    public final lq1 c;

    public ca0(int i, int i2, lq1 lq1) {
        this.a = i;
        this.b = i2;
        this.c = lq1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        ca0 ca0 = (ca0) obj;
        return this.a == ca0.a && this.b == ca0.b && this.c.equals(ca0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
