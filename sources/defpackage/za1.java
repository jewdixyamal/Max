package defpackage;

/* renamed from: za1  reason: default package */
public final class za1 extends gb1 {
    public final md0 a;

    public za1(md0 md0) {
        this.a = md0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za1) && tpa.f(this.a, ((za1) obj).a);
    }

    public final int hashCode() {
        md0 md0 = this.a;
        if (md0 == null) {
            return 0;
        }
        return md0.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
