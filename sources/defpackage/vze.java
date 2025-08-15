package defpackage;

import java.util.Arrays;

/* renamed from: vze  reason: default package */
public final class vze {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vze(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vze.class != obj.getClass()) {
            return false;
        }
        vze vze = (vze) obj;
        return this.a == vze.a && this.c == vze.c && this.d == vze.d && Arrays.equals(this.b, vze.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
