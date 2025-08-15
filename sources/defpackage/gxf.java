package defpackage;

/* renamed from: gxf  reason: default package */
public final class gxf {
    public static final fxf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ gxf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        ju0.I(i, 7, exf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxf)) {
            return false;
        }
        gxf gxf = (gxf) obj;
        return tpa.f(this.a, gxf.a) && tpa.f(this.b, gxf.b) && tpa.f(this.c, gxf.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileRequest(requestId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fileName=");
        return zr6.l(sb, this.c, ")");
    }
}
