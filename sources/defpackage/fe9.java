package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: fe9  reason: default package */
public final class fe9 implements gef {
    public final List a;
    public final uy b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final Uri i;

    public fe9(List list, uy uyVar, long j, long j2, boolean z, int i2, int i3) {
        this.a = list;
        this.b = uyVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = j2;
        this.i = list.isEmpty() ? Uri.EMPTY : Uri.parse(((de9) list.get(0)).a);
    }

    public final uy b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final boolean c0() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe9)) {
            return false;
        }
        fe9 fe9 = (fe9) obj;
        return tpa.f(this.a, fe9.a) && tpa.f(this.b, fe9.b) && this.c == fe9.c && this.d == fe9.d && this.e == fe9.e && this.f == fe9.f && this.g == fe9.g;
    }

    public final int getHeight() {
        return this.g;
    }

    public final int getWidth() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uy uyVar = this.b;
        return Integer.hashCode(this.g) + k7d.e(this.f, ms2.d(h4f.m(h4f.m((hashCode + (uyVar == null ? 0 : uyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final long k() {
        return this.h;
    }

    public final Uri l() {
        return this.i;
    }

    public final long m() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", isMute=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        return zr6.j(sb, this.g, ")");
    }
}
