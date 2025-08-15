package defpackage;

import android.net.Uri;

/* renamed from: mb8  reason: default package */
public final class mb8 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public mb8(ob8 ob8) {
        this.a = (Uri) ob8.a;
        this.b = ob8.b;
        this.c = (String) ob8.c;
        this.d = ob8.d;
        this.e = ob8.e;
        this.f = (String) ob8.f;
        this.g = (String) ob8.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ob8, java.lang.Object] */
    public final ob8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb8)) {
            return false;
        }
        mb8 mb8 = (mb8) obj;
        return this.a.equals(mb8.a) && maf.a(this.b, mb8.b) && maf.a(this.c, mb8.c) && this.d == mb8.d && this.e == mb8.e && maf.a(this.f, mb8.f) && maf.a(this.g, mb8.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }
}
