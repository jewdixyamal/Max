package defpackage;

/* renamed from: tnb  reason: default package */
public final class tnb {
    public final int a;
    public final boolean b;

    public tnb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tnb.class != obj.getClass()) {
            return false;
        }
        tnb tnb = (tnb) obj;
        return this.a == tnb.a && this.b == tnb.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
