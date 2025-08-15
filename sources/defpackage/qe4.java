package defpackage;

import java.util.Arrays;

/* renamed from: qe4  reason: default package */
public final class qe4 implements su0 {
    public final int a;
    public final int[] b;
    public final int c;

    public qe4(int i, int i2, int[] iArr) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        this.c = i2;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qe4.class != obj.getClass()) {
            return false;
        }
        qe4 qe4 = (qe4) obj;
        return this.a == qe4.a && Arrays.equals(this.b, qe4.b) && this.c == qe4.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c;
    }
}
