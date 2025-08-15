package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* renamed from: d2e  reason: default package */
public final class d2e implements Serializable {
    public final long X;
    public final String Y;
    public final String Z;
    public final long a;
    public final int b;
    public final int c;
    public final String o;
    public final String s0;
    public final List t0;
    public final int u0;
    public final long v0;
    public final String w0;
    public final boolean x0;
    public final int y0;
    public final String z0;

    public d2e(e20 e20) {
        this.a = e20.a;
        this.b = e20.b;
        this.c = e20.c;
        this.o = e20.d;
        this.X = e20.e;
        this.Y = e20.f;
        this.Z = e20.g;
        this.s0 = e20.h;
        this.t0 = e20.i;
        this.u0 = e20.j;
        this.v0 = e20.k;
        this.w0 = e20.l;
        this.x0 = e20.m;
        this.y0 = e20.n;
        this.z0 = e20.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2e.class != obj.getClass()) {
            return false;
        }
        d2e d2e = (d2e) obj;
        if (this.a != d2e.a || this.b != d2e.b || this.c != d2e.c || this.X != d2e.X || this.v0 != d2e.v0 || this.x0 != d2e.x0) {
            return false;
        }
        String str = d2e.o;
        String str2 = this.o;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = d2e.Y;
        String str4 = this.Y;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = d2e.Z;
        String str6 = this.Z;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = d2e.s0;
        String str8 = this.s0;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = d2e.t0;
        List list2 = this.t0;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        if (this.u0 != d2e.u0) {
            return false;
        }
        String str9 = d2e.w0;
        String str10 = this.w0;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        if (!Objects.equals(this.z0, d2e.z0)) {
            return false;
        }
        return this.y0 == d2e.y0;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        int i2 = 0;
        String str = this.o;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.X;
        int i3 = (((i + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.Y;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Z;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.s0;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.t0;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i4 = this.u0;
        int s = i4 != 0 ? au1.s(i4) : 0;
        long j3 = this.v0;
        int i5 = (((hashCode5 + s) * 961) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.w0;
        int hashCode6 = (((i5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.x0 ? 1 : 0)) * 961;
        int i6 = this.y0;
        int s2 = (hashCode6 + (i6 != 0 ? au1.s(i6) : 0)) * 31;
        String str6 = this.z0;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return s2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sticker{id=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", url='");
        sb.append(this.o);
        sb.append("', updateTime=");
        sb.append(this.X);
        sb.append(", mp4Url='");
        sb.append(this.Y);
        sb.append("', firstUrl='");
        sb.append(this.Z);
        sb.append("', previewUrl='");
        sb.append(this.s0);
        sb.append("', tags=");
        sb.append(this.t0);
        sb.append(", stickerType=");
        sb.append(k7d.s(this.u0));
        sb.append(", external=false, setId=");
        sb.append(this.v0);
        sb.append(", lottieUrl='");
        sb.append(this.w0);
        sb.append("', audio=");
        sb.append(this.x0);
        sb.append(", photoAttach=null, stickerAuthorType=");
        sb.append(k7d.q(this.y0));
        sb.append(", videoUrl='");
        return zr6.l(sb, this.z0, "'}");
    }
}
