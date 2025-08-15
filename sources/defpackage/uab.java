package defpackage;

import java.util.List;

/* renamed from: uab  reason: default package */
public final class uab {
    public final long a;
    public final List b;

    public uab(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uab)) {
            return false;
        }
        uab uab = (uab) obj;
        return this.a == uab.a && tpa.f(this.b, uab.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProfileAvatarModel(id=" + this.a + ", urls=" + this.b + ")";
    }
}
