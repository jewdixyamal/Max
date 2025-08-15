package defpackage;

/* renamed from: r1g  reason: default package */
public final class r1g {
    public static final q1g Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ r1g(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        ju0.I(i, 7, p1g.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1g)) {
            return false;
        }
        r1g r1g = (r1g) obj;
        return tpa.f(this.a, r1g.a) && tpa.f(this.b, r1g.b) && tpa.f(this.c, r1g.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        return zr6.l(sb, this.c, ")");
    }
}
