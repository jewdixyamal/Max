package defpackage;

import java.util.Arrays;

/* renamed from: qx6  reason: default package */
public final class qx6 extends m1 implements px6 {
    public final int e() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        n1 n1Var = (n1) ((uaf) obj);
        if (n1Var.e() != 5) {
            return false;
        }
        boolean z = n1Var instanceof qx6;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((qx6) n1Var).a);
        }
        byte[] bArr2 = ((m1) n1Var.m()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final px6 m() {
        return this;
    }

    public final px6 p() {
        return this;
    }
}
