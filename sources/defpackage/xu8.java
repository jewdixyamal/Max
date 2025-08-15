package defpackage;

import java.util.Collection;

/* renamed from: xu8  reason: default package */
public final class xu8 implements yu8 {
    public final Collection a;

    public xu8(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xu8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        return tpa.f(this.a, ((xu8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(messageIds=" + this.a + ")";
    }
}
