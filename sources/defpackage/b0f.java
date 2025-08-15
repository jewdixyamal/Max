package defpackage;

import java.util.Arrays;

/* renamed from: b0f  reason: default package */
public final class b0f {
    public final m85[] a;
    public int b;

    public b0f(m85... m85Arr) {
        this.a = m85Arr;
        int length = m85Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((b0f) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
