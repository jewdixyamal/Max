package defpackage;

import java.util.Collection;

/* renamed from: vu8  reason: default package */
public final class vu8 implements yu8 {
    public final Collection a;

    public vu8(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu8) && tpa.f(this.a, ((vu8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByIds(messageIds=" + this.a + ")";
    }
}
