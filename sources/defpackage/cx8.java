package defpackage;

import java.io.Serializable;

/* renamed from: cx8  reason: default package */
public final class cx8 implements Serializable {
    public final bx8 a;
    public final int b;

    public cx8(bx8 bx8, int i) {
        this.a = bx8;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx8)) {
            return false;
        }
        cx8 cx8 = (cx8) obj;
        return tpa.f(this.a, cx8.a) && this.b == cx8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionCounter(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
