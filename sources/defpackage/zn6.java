package defpackage;

import android.net.Uri;

/* renamed from: zn6  reason: default package */
public final class zn6 implements gef {
    public final String a;
    public final uy b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Uri j;
    public final long k;

    public zn6(int i2, int i3, long j2, long j3, long j4, uy uyVar, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = uyVar;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = Uri.parse(str);
        this.k = j3;
    }

    public final gef a(long j2) {
        String str = this.a;
        uy uyVar = this.b;
        return new zn6(this.h, this.i, this.c, this.d, j2, uyVar, str, this.f, this.g);
    }

    public final uy b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final boolean c0() {
        return this.f;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn6)) {
            return false;
        }
        zn6 zn6 = (zn6) obj;
        return tpa.f(this.a, zn6.a) && tpa.f(this.b, zn6.b) && this.c == zn6.c && this.d == zn6.d && this.e == zn6.e && this.f == zn6.f && this.g == zn6.g && this.h == zn6.h && this.i == zn6.i;
    }

    public final int getHeight() {
        return this.i;
    }

    public final int getWidth() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uy uyVar = this.b;
        return Integer.hashCode(this.i) + k7d.e(this.h, ms2.d(ms2.d(h4f.m(h4f.m(h4f.m((hashCode + (uyVar == null ? 0 : uyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final long k() {
        return this.k;
    }

    public final Uri l() {
        return this.j;
    }

    public final long m() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", initSeekPos=");
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return zr6.j(sb, this.i, ")");
    }
}
