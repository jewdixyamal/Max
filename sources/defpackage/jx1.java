package defpackage;

/* renamed from: jx1  reason: default package */
public final class jx1 {
    public final int a;

    public jx1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx1) && this.a == ((jx1) obj).a;
    }

    public final int hashCode() {
        return au1.s(this.a);
    }

    public final String toString() {
        return "CameraParams(facing=" + wg0.s(this.a) + ")";
    }
}
