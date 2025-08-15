package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* renamed from: v85  reason: default package */
public final class v85 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final i63 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ExportException p;
    public final zw6 q;

    public v85(ffc ffc, long j2, long j3, int i2, int i3, int i4, String str, String str2, int i5, i63 i63, int i6, int i7, int i8, String str3, String str4, int i9, ExportException exportException) {
        String str5 = str2;
        String str6 = str4;
        int i10 = i9;
        this.q = ffc;
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str5;
        this.h = i5;
        this.i = i63;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = str3;
        this.n = str6;
        this.o = i10;
        this.p = exportException;
        a(str5, i10, ffc, 1);
        a(str6, i10, ffc, 2);
    }

    public static void a(String str, int i2, ffc ffc, int i3) {
        if (str != null && i2 != 1) {
            boolean z = false;
            ls5 l2 = ffc.listIterator(0);
            while (l2.hasNext()) {
                u85 u85 = (u85) l2.next();
                if ((i3 == 1 ? u85.a : u85.b) == null) {
                    if (!z) {
                        z = true;
                    } else {
                        return;
                    }
                } else if (!z) {
                    z = true;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v85)) {
            return false;
        }
        v85 v85 = (v85) obj;
        return Objects.equals(this.q, v85.q) && this.a == v85.a && this.b == v85.b && this.c == v85.c && this.d == v85.d && this.e == v85.e && Objects.equals(this.f, v85.f) && Objects.equals(this.g, v85.g) && this.h == v85.h && Objects.equals(this.i, v85.i) && this.j == v85.j && this.k == v85.k && this.l == v85.l && Objects.equals(this.m, v85.m) && Objects.equals(this.n, v85.n) && this.o == v85.o && Objects.equals(this.p, v85.p);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.f);
        int hashCode2 = Objects.hashCode(this.g);
        int hashCode3 = Objects.hashCode(this.i);
        int hashCode4 = Objects.hashCode(this.m);
        int hashCode5 = Objects.hashCode(this.n);
        return Objects.hashCode(this.p) + ((((hashCode5 + ((hashCode4 + ((((((((hashCode3 + ((((hashCode2 + ((hashCode + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
