package defpackage;

import android.text.TextUtils;

/* renamed from: lqe  reason: default package */
public final class lqe {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final es8 g;
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqe(float f2, CharSequence charSequence, boolean z, boolean z2, int i2) {
        this(f2, charSequence, z, (i2 & 8) != 0 ? false : z2, Integer.MAX_VALUE, (TextUtils.TruncateAt) null, (es8) null, 0, 0);
    }

    public static lqe a(lqe lqe, CharSequence charSequence, int i2, int i3) {
        if ((i3 & 2) != 0) {
            charSequence = lqe.b;
        }
        CharSequence charSequence2 = charSequence;
        boolean z = (i3 & 8) != 0 ? lqe.d : false;
        if ((i3 & 16) != 0) {
            i2 = lqe.e;
        }
        return new lqe(lqe.a, charSequence2, lqe.c, z, i2, lqe.f, lqe.g, lqe.h, lqe.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqe)) {
            return false;
        }
        lqe lqe = (lqe) obj;
        return Float.compare(this.a, lqe.a) == 0 && tpa.f(this.b, lqe.b) && this.c == lqe.c && this.d == lqe.d && this.e == lqe.e && this.f == lqe.f && tpa.f(this.g, lqe.g) && this.h == lqe.h && this.i == lqe.i;
    }

    public final int hashCode() {
        int e2 = k7d.e(this.e, ms2.d(ms2.d(rh4.f(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        int i2 = 0;
        TextUtils.TruncateAt truncateAt = this.f;
        int hashCode = (e2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        es8 es8 = this.g;
        if (es8 != null) {
            i2 = es8.hashCode();
        }
        return Integer.hashCode(this.i) + k7d.e(this.h, (hashCode + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", includeFontPadding=");
        sb.append(this.c);
        sb.append(", postProcessing=");
        sb.append(this.d);
        sb.append(", maxLines=");
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return zr6.j(sb, this.i, ")");
    }

    public lqe(float f2, CharSequence charSequence, boolean z, boolean z2, int i2, TextUtils.TruncateAt truncateAt, es8 es8, int i3, int i4) {
        this.a = f2;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = truncateAt;
        this.g = es8;
        this.h = i3;
        this.i = i4;
        this.j = i2 != Integer.MAX_VALUE;
    }
}
