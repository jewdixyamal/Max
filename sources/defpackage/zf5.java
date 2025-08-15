package defpackage;

import android.text.Layout;

/* renamed from: zf5  reason: default package */
public final class zf5 implements o00 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final Layout e;
    public final uf5 f;
    public final jqe g;
    public final String h;
    public final yf5 i;
    public final int j;
    public final yt6 k;
    public final wcf l;
    public final boolean m;
    public final j0e n;

    public zf5(long j2, long j3, String str, String str2, Layout layout, uf5 uf5, jqe jqe, String str3, yf5 yf5, int i2, yt6 yt6, wcf wcf, boolean z, q0e q0e) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = layout;
        this.f = uf5;
        this.g = jqe;
        this.h = str3;
        this.i = yf5;
        this.j = i2;
        this.k = yt6;
        this.l = wcf;
        this.m = z;
        this.n = q0e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf5)) {
            return false;
        }
        zf5 zf5 = (zf5) obj;
        return this.b == zf5.b && this.a == zf5.a && tpa.f(this.c, zf5.c) && tpa.f(this.d, zf5.d) && tpa.f(this.e, zf5.e) && tpa.f(this.f, zf5.f) && tpa.f(this.g, zf5.g) && tpa.f(this.h, zf5.h) && this.j == zf5.j && tpa.f(this.k, zf5.k) && tpa.f(this.l, zf5.l) && this.m == zf5.m && tpa.f(this.i, zf5.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + rh4.d(rh4.d(h4f.m(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d)) * 31)) * 31;
        int i2 = 0;
        jqe jqe = this.g;
        int hashCode2 = (hashCode + (jqe != null ? jqe.hashCode() : 0)) * 31;
        String str = this.h;
        int g2 = ey8.g(this.j, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
        yt6 yt6 = this.k;
        int hashCode3 = (g2 + (yt6 != null ? yt6.hashCode() : 0)) * 31;
        wcf wcf = this.l;
        int d2 = ms2.d((hashCode3 + (wcf != null ? wcf.hashCode() : 0)) * 31, 31, this.m);
        yf5 yf5 = this.i;
        if (yf5 != null) {
            i2 = yf5.hashCode();
        }
        return d2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileAttachModel(fileId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", fileName=");
        sb.append(this.d);
        sb.append(", fileNameLayout=");
        sb.append(this.e);
        sb.append(", extension=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", localPath=");
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.i);
        sb.append(", type=");
        int i2 = this.j;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", imageAttachConfig=");
        sb.append(this.k);
        sb.append(", videoAttachConfig=");
        sb.append(this.l);
        sb.append(", hasText=");
        sb.append(this.m);
        sb.append(", stateFlow=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
