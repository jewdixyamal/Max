package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: hc0  reason: default package */
public final class hc0 {
    public final String a;
    public final byte[] b;
    public final z8b c;

    public hc0(String str, byte[] bArr, z8b z8b) {
        this.a = str;
        this.b = bArr;
        this.c = z8b;
    }

    public static vq7 a() {
        vq7 vq7 = new vq7();
        vq7.o = z8b.a;
        return vq7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0 = (hc0) obj;
        return this.a.equals(hc0.a) && Arrays.equals(this.b, hc0.b) && this.c.equals(hc0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        return "TransportContext(" + this.a + ", " + this.c + ", " + encodeToString + ")";
    }
}
