package defpackage;

import java.util.Arrays;

/* renamed from: dbf  reason: default package */
public final class dbf {
    public final int[] a;
    public final float b;

    public dbf(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf)) {
            return false;
        }
        dbf dbf = (dbf) obj;
        return tpa.f(this.a, dbf.a) && Float.compare(this.b, dbf.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}
