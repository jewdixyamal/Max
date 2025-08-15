package defpackage;

import java.io.Serializable;

/* renamed from: ux8  reason: default package */
public final class ux8 implements Serializable {
    public final int a;
    public final int b;

    public ux8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static ux8 a(gy8 gy8) {
        int N = lz7.N(gy8);
        if (N == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < N; i3++) {
            String z0 = gy8.z0();
            z0.getClass();
            if (z0.equals("views")) {
                i = gy8.v0();
            } else if (!z0.equals("forwards")) {
                gy8.z();
            } else {
                i2 = gy8.v0();
            }
        }
        return new ux8(i, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{views=");
        sb.append(this.a);
        sb.append(", forwards=");
        return zr6.j(sb, this.b, "}");
    }
}
