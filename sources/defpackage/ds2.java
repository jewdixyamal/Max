package defpackage;

import android.graphics.RectF;

/* renamed from: ds2  reason: default package */
public final class ds2 {
    public final String a;
    public final String b;
    public final RectF c;

    public ds2(String str, String str2, RectF rectF) {
        this.a = str;
        this.b = str2;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds2)) {
            return false;
        }
        ds2 ds2 = (ds2) obj;
        return tpa.f(this.a, ds2.a) && tpa.f(this.b, ds2.b) && tpa.f(this.c, ds2.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RectF rectF = this.c;
        if (rectF != null) {
            i = rectF.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ChatTitleIconState(newIconPath=" + this.a + ", croppedIconPath=" + this.b + ", relativeCrop=" + this.c + ")";
    }
}
