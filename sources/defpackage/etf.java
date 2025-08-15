package defpackage;

/* renamed from: etf  reason: default package */
public final class etf {
    public static final dtf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ etf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        ju0.I(i, 7, ctf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etf)) {
            return false;
        }
        etf etf = (etf) obj;
        return tpa.f(this.a, etf.a) && tpa.f(this.b, etf.b) && tpa.f(this.c, etf.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d = rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryAuthRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        return zr6.l(sb, this.c, ")");
    }
}
