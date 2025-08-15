package defpackage;

import java.util.Arrays;

/* renamed from: i05  reason: default package */
public final class i05 {
    public final i15 a;
    public final byte[] b;

    public i05(i15 i15, byte[] bArr) {
        if (i15 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = i15;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i05)) {
            return false;
        }
        i05 i05 = (i05) obj;
        if (!this.a.equals(i05.a)) {
            return false;
        }
        return Arrays.equals(this.b, i05.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
