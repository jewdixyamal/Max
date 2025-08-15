package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: c0f  reason: default package */
public final class c0f {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final rze a;
    public final zw6 b;

    static {
        int i = oaf.a;
    }

    public c0f(rze rze, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < rze.a)) {
            this.a = rze;
            this.b = zw6.j(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0f.class != obj.getClass()) {
            return false;
        }
        c0f c0f = (c0f) obj;
        return this.a.equals(c0f.a) && this.b.equals(c0f.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
