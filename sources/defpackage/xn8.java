package defpackage;

import java.util.Collection;

/* renamed from: xn8  reason: default package */
public final class xn8 implements yn8 {
    public final long a;
    public final ek2 b;
    public final Collection c;

    public xn8(long j, ek2 ek2, Collection collection) {
        this.a = j;
        this.b = ek2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn8)) {
            return false;
        }
        xn8 xn8 = (xn8) obj;
        return this.a == xn8.a && this.b == xn8.b && tpa.f(this.c, xn8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
