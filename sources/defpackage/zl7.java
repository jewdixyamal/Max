package defpackage;

/* renamed from: zl7  reason: default package */
public final class zl7 {
    public final Float a;
    public final boolean b;

    public zl7(Float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl7)) {
            return false;
        }
        zl7 zl7 = (zl7) obj;
        return tpa.f(this.a, zl7.a) && this.b == zl7.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Boolean.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "ListeningState(progress=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
