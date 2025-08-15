package defpackage;

import java.util.Arrays;

/* renamed from: tw6  reason: default package */
public final class tw6 extends n1 implements uaf {
    public final byte a;
    public final byte[] b;

    public tw6(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final int e() {
        return 9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 9) {
            return false;
        } else {
            tw6 n = uaf.n();
            return this.a == n.a && Arrays.equals(this.b, n.b);
        }
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public final tw6 n() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    public final tw6 u() {
        return this;
    }
}
