package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: x3f  reason: default package */
public final class x3f implements obe {
    public final String X;
    public final float Y;
    public final int Z;
    public final wpa a = new wpa();
    public final boolean b;
    public final int c;
    public final int o;

    public x3f(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.o = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.X = "Serif".equals(new String(bArr, 43, bArr.length - 43, b52.c)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.Z = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.b = z;
            if (z) {
                this.Y = oaf.i(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.Y = 0.85f;
            }
        } else {
            this.c = 0;
            this.o = -1;
            this.X = str;
            this.b = false;
            this.Y = 0.85f;
            this.Z = -1;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public final void G(byte[] bArr, int i, int i2, nbe nbe, pj3 pj3) {
        String str;
        int i3 = i;
        pj3 pj32 = pj3;
        wpa wpa = this.a;
        wpa.E(i3 + i2, bArr);
        wpa.G(i3);
        int i4 = 2;
        boolean z = false;
        fm9.f(wpa.a() >= 2);
        int A = wpa.A();
        if (A == 0) {
            str = "";
        } else {
            int i5 = wpa.b;
            Charset C = wpa.C();
            int i6 = A - (wpa.b - i5);
            if (C == null) {
                C = b52.c;
            }
            str = wpa.s(i6, C);
        }
        if (str.isEmpty()) {
            ls5 ls5 = zw6.b;
            pj32.accept(new b04(-9223372036854775807L, -9223372036854775807L, ffc.X));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        b(spannableStringBuilder2, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder2, this.o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str2 = this.X;
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.Y;
        while (wpa.a() >= 8) {
            int i7 = wpa.b;
            int g = wpa.g();
            int g2 = wpa.g();
            if (g2 == 1937013100) {
                fm9.f(wpa.a() >= i4 ? true : z);
                int A2 = wpa.A();
                int i8 = z;
                while (i8 < A2) {
                    fm9.f(wpa.a() >= 12 ? true : z);
                    int A3 = wpa.A();
                    int A4 = wpa.A();
                    wpa.H(i4);
                    int u = wpa.u();
                    wpa.H(1);
                    int g3 = wpa.g();
                    if (A4 > spannableStringBuilder.length()) {
                        StringBuilder n = rh4.n(A4, "Truncating styl end (", ") to cueText.length() (");
                        n.append(spannableStringBuilder.length());
                        n.append(").");
                        z04.c0(n.toString());
                        A4 = spannableStringBuilder.length();
                    }
                    if (A3 >= A4) {
                        z04.c0("Ignoring styl with start (" + A3 + ") >= end (" + A4 + ").");
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        int i9 = A3;
                        int i10 = A4;
                        b(spannableStringBuilder3, u, this.c, i9, i10, 0);
                        a(spannableStringBuilder3, g3, this.o, i9, i10, 0);
                    }
                    i8++;
                    i4 = 2;
                    z = false;
                }
            } else if (g2 != 1952608120 || !this.b) {
                i4 = 2;
            } else {
                i4 = 2;
                fm9.f(wpa.a() >= 2);
                f = oaf.i(((float) wpa.A()) / ((float) this.Z), 0.0f, 0.95f);
            }
            wpa.G(i7 + g);
            z = false;
        }
        pj32.accept(new b04(-9223372036854775807L, -9223372036854775807L, zw6.n(new yz3(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }

    public final int J() {
        return 2;
    }
}
