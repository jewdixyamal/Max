package defpackage;

/* renamed from: wi9  reason: default package */
public final class wi9 {
    public final vi9 a;
    public final boolean b;

    public wi9(vi9 vi9, boolean z) {
        this.a = vi9;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi9)) {
            return false;
        }
        wi9 wi9 = (wi9) obj;
        return tpa.f(this.a, wi9.a) && this.b == wi9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
