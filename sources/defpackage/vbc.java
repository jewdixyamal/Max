package defpackage;

import java.util.Arrays;

/* renamed from: vbc  reason: default package */
public final class vbc implements xbc {
    public final long a;
    public final byte[] b;

    public vbc(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbc)) {
            return false;
        }
        vbc vbc = (vbc) obj;
        return this.a == vbc.a && tpa.f(this.b, vbc.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder("AudioMsg(duration=");
        ms2.j(this.a, ", wave=", arrays, sb);
        sb.append(")");
        return sb.toString();
    }
}
