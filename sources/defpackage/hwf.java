package defpackage;

/* renamed from: hwf  reason: default package */
public final class hwf {
    public static final gwf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ hwf(int i, String str, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        ju0.I(i, 15, fwf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwf)) {
            return false;
        }
        hwf hwf = (hwf) obj;
        return tpa.f(this.a, hwf.a) && tpa.f(this.b, hwf.b) && tpa.f(this.c, hwf.c) && tpa.f(this.d, hwf.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d2 = rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryUpdateTokenRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", token=");
        return zr6.l(sb, this.d, ")");
    }
}
