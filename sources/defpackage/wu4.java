package defpackage;

/* renamed from: wu4  reason: default package */
public final class wu4 implements jv4 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final a73 e;
    public final String f;
    public final int g;

    public wu4(String str, long j, CharSequence charSequence, String str2, a73 a73, String str3, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = a73;
        this.f = str3;
        this.g = i;
    }

    public static wu4 c(wu4 wu4, String str, a73 a73, String str2, int i) {
        if ((i & 8) != 0) {
            str = wu4.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            a73 = wu4.e;
        }
        a73 a732 = a73;
        if ((i & 32) != 0) {
            str2 = wu4.f;
        }
        return new wu4(wu4.a, wu4.b, wu4.c, str3, a732, str2, wu4.g);
    }

    public final boolean a(jv4 jv4) {
        if (jv4 == null || !(jv4 instanceof wu4)) {
            return false;
        }
        wu4 wu4 = (wu4) jv4;
        return !tpa.f(this.d, wu4.d) || !tpa.f(this.f, wu4.f) || this.g != wu4.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = ((defpackage.wu4) r3).g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.jv4 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0011
            boolean r1 = r3 instanceof defpackage.wu4
            if (r1 != 0) goto L_0x0008
            goto L_0x0011
        L_0x0008:
            wu4 r3 = (defpackage.wu4) r3
            int r3 = r3.g
            int r2 = r2.g
            if (r2 == r3) goto L_0x0011
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu4.b(jv4):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu4)) {
            return false;
        }
        wu4 wu4 = (wu4) obj;
        return tpa.f(this.a, wu4.a) && this.b == wu4.b && tpa.f(this.c, wu4.c) && tpa.f(this.d, wu4.d) && tpa.f(this.e, wu4.e) && tpa.f(this.f, wu4.f) && this.g == wu4.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int f2 = rh4.f(this.c, h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int hashCode = (f2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a73 a73 = this.e;
        int hashCode2 = (hashCode + (a73 == null ? 0 : a73.a.hashCode())) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return au1.s(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditChatProfileUiModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", titleError=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", chatType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "PRIVATE" : "PUBLIC");
        sb.append(")");
        return sb.toString();
    }
}
