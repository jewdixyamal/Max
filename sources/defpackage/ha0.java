package defpackage;

/* renamed from: ha0  reason: default package */
public final class ha0 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public ha0(int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i2;
        if (str != null) {
            this.b = str;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0 = (ha0) obj;
        return this.a == ha0.a && this.b.equals(ha0.b) && this.c == ha0.c && this.d == ha0.d && this.e == ha0.e && this.f == ha0.f && this.g == ha0.g && this.h == ha0.h && this.i == ha0.i && this.j == ha0.j;
    }

    public final int hashCode() {
        return this.j ^ ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", profile=");
        sb.append(this.g);
        sb.append(", bitDepth=");
        sb.append(this.h);
        sb.append(", chromaSubsampling=");
        sb.append(this.i);
        sb.append(", hdrFormat=");
        return zr6.j(sb, this.j, "}");
    }
}
