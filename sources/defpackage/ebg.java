package defpackage;

import java.util.Arrays;

/* renamed from: ebg  reason: default package */
public final class ebg {
    public final boolean[] a = new boolean[pf0.values().length];
    public int b = 0;

    public final boolean a(pf0 pf0, boolean z) {
        int ordinal = pf0.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[ordinal];
        zArr[pf0.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ebg.class != obj.getClass()) {
            return false;
        }
        ebg ebg = (ebg) obj;
        return this.b == ebg.b && Arrays.equals(this.a, ebg.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
