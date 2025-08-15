package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: vj6  reason: default package */
public final class vj6 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public vj6(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static vj6 a(yaf yaf) {
        int i;
        yaf yaf2 = yaf;
        try {
            yaf2.I(21);
            int v = yaf.v() & 3;
            int v2 = yaf.v();
            int i2 = yaf2.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < v2; i5++) {
                yaf2.I(1);
                int A = yaf.A();
                for (int i6 = 0; i6 < A; i6++) {
                    int A2 = yaf.A();
                    i4 += A2 + 4;
                    yaf2.I(A2);
                }
            }
            yaf2.H(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < v2) {
                int v3 = yaf.v() & 127;
                int A3 = yaf.A();
                int i9 = i3;
                while (i9 < A3) {
                    int A4 = yaf.A();
                    System.arraycopy(np8.b, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(yaf2.a, yaf2.b, bArr, i10, A4);
                    if (v3 == 33 && i9 == 0) {
                        wl9 E = np8.E(i10, bArr, i10 + A4);
                        i = v2;
                        str = i24.f(E.a, E.b, E.c, E.d, E.e, E.f);
                        f = E.g;
                    } else {
                        i = v2;
                    }
                    i8 = i10 + A4;
                    yaf2.I(A4);
                    i9++;
                    v2 = i;
                    i3 = 0;
                }
                int i11 = v2;
                i7++;
                i3 = 0;
            }
            return new vj6(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), v + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing HEVC config");
        }
    }
}
