package defpackage;

/* renamed from: jb0  reason: default package */
public final class jb0 {
    public final x9b a;
    public final ov6 b;

    public jb0(x9b x9b, ov6 ov6) {
        if (x9b != null) {
            this.a = x9b;
            this.b = ov6;
            return;
        }
        throw new NullPointerException("Null processingRequest");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0 = (jb0) obj;
        return this.a.equals(jb0.a) && this.b.equals(jb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
