package defpackage;

/* renamed from: i2g  reason: default package */
public final class i2g {
    public static final h2g Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ i2g(int i, String str, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        ju0.I(i, 15, g2g.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2g)) {
            return false;
        }
        i2g i2g = (i2g) obj;
        return tpa.f(this.a, i2g.a) && tpa.f(this.b, i2g.b) && tpa.f(this.c, i2g.c) && tpa.f(this.d, i2g.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d2 = rh4.d(rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageSaveKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", value=");
        return zr6.l(sb, this.d, ")");
    }
}
