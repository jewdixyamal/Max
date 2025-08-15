package defpackage;

import java.util.Collection;

/* renamed from: vn8  reason: default package */
public final class vn8 implements yn8 {
    public final long a;
    public final ek2 b;
    public final Collection c;

    public vn8(long j, ek2 ek2, Collection collection) {
        this.a = j;
        this.b = ek2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn8)) {
            return false;
        }
        vn8 vn8 = (vn8) obj;
        return this.a == vn8.a && this.b == vn8.b && tpa.f(this.c, vn8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Add(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
