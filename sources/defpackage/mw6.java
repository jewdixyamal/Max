package defpackage;

import java.util.Arrays;

/* renamed from: mw6  reason: default package */
public final class mw6 extends m1 implements lw6 {
    public final int e() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 6) {
            return false;
        } else {
            boolean z = uaf instanceof mw6;
            byte[] bArr = this.a;
            if (z) {
                return Arrays.equals(bArr, ((mw6) uaf).a);
            }
            byte[] bArr2 = ((m1) uaf.o()).a;
            return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final lw6 o() {
        return this;
    }

    public final lw6 s() {
        return this;
    }
}
