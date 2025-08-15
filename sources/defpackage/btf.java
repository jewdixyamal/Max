package defpackage;

/* renamed from: btf  reason: default package */
public final class btf {
    public static final atf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ btf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        ju0.I(i, 7, zsf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btf)) {
            return false;
        }
        btf btf = (btf) obj;
        return tpa.f(this.a, btf.a) && tpa.f(this.b, btf.b) && tpa.f(this.c, btf.c);
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
        StringBuilder sb = new StringBuilder("WebAppBiometryAccessRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        return zr6.l(sb, this.c, ")");
    }
}
