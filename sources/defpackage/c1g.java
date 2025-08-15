package defpackage;

import java.util.Arrays;

/* renamed from: c1g  reason: default package */
public final class c1g {
    public final byte[] a;
    public final String b;
    public final String c;

    public c1g(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        return tpa.f(this.a, c1g.a) && tpa.f(this.b, c1g.b) && tpa.f(this.c, c1g.c);
    }

    public final int hashCode() {
        int i = 0;
        byte[] bArr = this.a;
        int hashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder m = au1.m("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=");
        m.append(this.b);
        m.append(", fileMimeType=");
        return zr6.l(m, this.c, ")");
    }
}
