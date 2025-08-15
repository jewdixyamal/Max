package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: td0  reason: default package */
public final class td0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public td0(ArrayList arrayList, int i, int i2, int i3, float f2, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
        this.f = str;
    }

    public static td0 a(yaf yaf) {
        byte[] bArr;
        String str;
        float f2;
        int i;
        int i2;
        try {
            yaf.I(4);
            int v = (yaf.v() & 3) + 1;
            if (v != 3) {
                ArrayList arrayList = new ArrayList();
                int v2 = yaf.v() & 31;
                int i3 = 0;
                while (true) {
                    bArr = i24.a;
                    if (i3 >= v2) {
                        break;
                    }
                    int A = yaf.A();
                    int i4 = yaf.b;
                    yaf.I(A);
                    byte[] bArr2 = yaf.a;
                    byte[] bArr3 = new byte[(A + 4)];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i4, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i3++;
                }
                int v3 = yaf.v();
                for (int i5 = 0; i5 < v3; i5++) {
                    int A2 = yaf.A();
                    int i6 = yaf.b;
                    yaf.I(A2);
                    byte[] bArr4 = yaf.a;
                    byte[] bArr5 = new byte[(A2 + 4)];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i6, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (v2 > 0) {
                    am9 F = np8.F(v, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i7 = F.e;
                    int i8 = F.f;
                    float f3 = F.g;
                    str = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(F.a), Integer.valueOf(F.b), Integer.valueOf(F.c)});
                    i2 = i7;
                    i = i8;
                    f2 = f3;
                } else {
                    i2 = -1;
                    i = -1;
                    f2 = 1.0f;
                    str = null;
                }
                return new td0(arrayList, v, i2, i, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing AVC config");
        }
    }
}
