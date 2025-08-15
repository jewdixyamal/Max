package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;

/* renamed from: w3f  reason: default package */
public final class w3f extends fqd {
    public final int A0;
    public final String B0;
    public final float C0;
    public final int D0;
    public final yaf x0 = new yaf(3, false);
    public final boolean y0;
    public final int z0;

    public w3f(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.z0 = bArr[24];
            this.A0 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.B0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, b52.c)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.D0 = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.y0 = z;
            if (z) {
                this.C0 = maf.i(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.C0 = 0.85f;
            }
        } else {
            this.z0 = 0;
            this.A0 = -1;
            this.B0 = str;
            this.y0 = false;
            this.C0 = 0.85f;
            this.D0 = -1;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    public final abe a(int i, byte[] bArr, boolean z) {
        String str;
        int i2;
        int i3;
        yaf yaf = this.x0;
        yaf.F(i, bArr);
        if (yaf.c() >= 2) {
            int A = yaf.A();
            if (A == 0) {
                str = "";
            } else {
                if (yaf.c() >= 2) {
                    byte[] bArr2 = yaf.a;
                    int i4 = yaf.b;
                    char c = (char) ((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        str = yaf.t(A, b52.f);
                    }
                }
                str = yaf.t(A, b52.c);
            }
            if (str.isEmpty()) {
                return y3f.b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            h(spannableStringBuilder2, this.z0, 0, 0, spannableStringBuilder.length(), 16711680);
            g(spannableStringBuilder2, this.A0, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            String str2 = this.B0;
            if (str2 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
            }
            float f = this.C0;
            while (yaf.c() >= 8) {
                int i5 = yaf.b;
                int h = yaf.h();
                int h2 = yaf.h();
                if (h2 == 1937013100) {
                    if (yaf.c() >= 2) {
                        int A2 = yaf.A();
                        int i6 = 0;
                        while (i6 < A2) {
                            if (yaf.c() >= 12) {
                                int A3 = yaf.A();
                                int A4 = yaf.A();
                                yaf.I(2);
                                int v = yaf.v();
                                yaf.I(1);
                                int h3 = yaf.h();
                                if (A4 > spannableStringBuilder.length()) {
                                    spannableStringBuilder.length();
                                    A4 = spannableStringBuilder.length();
                                }
                                int i7 = A4;
                                if (A3 >= i7) {
                                    i3 = i6;
                                    i2 = A2;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                    int i8 = i7;
                                    int i9 = A3;
                                    i3 = i6;
                                    int i10 = i8;
                                    i2 = A2;
                                    h(spannableStringBuilder3, v, this.z0, A3, i10, 0);
                                    g(spannableStringBuilder3, h3, this.A0, A3, i10, 0);
                                }
                                i6 = i3 + 1;
                                A2 = i2;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (h2 == 1952608120 && this.y0) {
                    if (yaf.c() >= 2) {
                        f = maf.i(((float) yaf.A()) / ((float) this.D0), 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                }
                yaf.H(i5 + h);
            }
            xz3 xz3 = r1;
            xz3 xz32 = new xz3(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
            return new y3f(xz3);
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
