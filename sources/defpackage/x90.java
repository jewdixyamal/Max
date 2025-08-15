package defpackage;

/* renamed from: x90  reason: default package */
public final class x90 {
    public final String a;
    public final pa0 b;

    public x90(String str, pa0 pa0) {
        if (str != null) {
            this.a = str;
            if (pa0 != null) {
                this.b = pa0;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90 = (x90) obj;
        return this.a.equals(x90.a) && this.b.equals(x90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
