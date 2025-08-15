package defpackage;

import android.net.Uri;

/* renamed from: wcf  reason: default package */
public final class wcf implements a53 {
    public static final wcf k;
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final Uri h;
    public final jic i;
    public final d20 j;

    static {
        Uri uri = Uri.EMPTY;
        int i2 = ft4.o;
        k = new wcf(0, uri, -1, -1, -1, 0, (String) null, (Uri) null, (jic) null, d20.a);
    }

    public wcf(long j2, Uri uri, int i2, int i3, int i4, long j3, String str, Uri uri2, jic jic, d20 d20) {
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j3;
        this.g = str;
        this.h = uri2;
        this.i = jic;
        this.j = d20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcf)) {
            return false;
        }
        wcf wcf = (wcf) obj;
        return this.a == wcf.a && tpa.f(this.b, wcf.b) && this.c == wcf.c && this.d == wcf.d && this.e == wcf.e && ft4.d(this.f, wcf.f) && tpa.f(this.g, wcf.g) && tpa.f(this.h, wcf.h) && tpa.f(this.i, wcf.i) && this.j == wcf.j;
    }

    public final int hashCode() {
        int e2 = k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        int i2 = ft4.o;
        int m = h4f.m(e2, 31, this.f);
        int i3 = 0;
        String str = this.g;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.h;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        jic jic = this.i;
        if (jic != null) {
            i3 = jic.hashCode();
        }
        return this.j.hashCode() + ((hashCode2 + i3) * 31);
    }

    public final String i() {
        return this.g;
    }

    public final String toString() {
        String j2 = ft4.j(this.f);
        return "VideoAttachConfig(videoId=" + this.a + ", previewUri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", maxImageViewHeight=" + this.e + ", duration=" + j2 + ", attachId=" + this.g + ", lowResUri=" + this.h + ", previewResizeOptions=" + this.i + ", status=" + this.j + ")";
    }
}
