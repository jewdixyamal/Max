package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* renamed from: ic0  reason: default package */
public final class ic0 implements q05 {
    public final String a;
    public final int b;
    public final bue c;
    public final Size d;
    public final int e;
    public final jc0 f;
    public final int g;
    public final int h;
    public final int i;

    public ic0(String str, int i2, bue bue, Size size, int i3, jc0 jc0, int i4, int i5, int i6) {
        this.a = str;
        this.b = i2;
        this.c = bue;
        this.d = size;
        this.e = i3;
        this.f = jc0;
        this.g = i4;
        this.h = i5;
        this.i = i6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qp4, java.lang.Object] */
    public static qp4 d() {
        ? obj = new Object();
        obj.b = -1;
        obj.s0 = 1;
        obj.X = 2130708361;
        obj.Y = jc0.d;
        return obj;
    }

    public final String a() {
        return this.a;
    }

    public final MediaFormat b() {
        Size size = this.d;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.e);
        createVideoFormat.setInteger("bitrate", this.i);
        createVideoFormat.setInteger("frame-rate", this.g);
        createVideoFormat.setInteger("i-frame-interval", this.h);
        int i2 = this.b;
        if (i2 != -1) {
            createVideoFormat.setInteger("profile", i2);
        }
        jc0 jc0 = this.f;
        int i3 = jc0.a;
        if (i3 != 0) {
            createVideoFormat.setInteger("color-standard", i3);
        }
        int i4 = jc0.b;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-transfer", i4);
        }
        int i5 = jc0.c;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-range", i5);
        }
        return createVideoFormat;
    }

    public final bue c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic0)) {
            return false;
        }
        ic0 ic0 = (ic0) obj;
        return this.a.equals(ic0.a) && this.b == ic0.b && this.c.equals(ic0.c) && this.d.equals(ic0.d) && this.e == ic0.e && this.f.equals(ic0.f) && this.g == ic0.g && this.h == ic0.h && this.i == ic0.i;
    }

    public final int hashCode() {
        return this.i ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return zr6.j(sb, this.i, "}");
    }
}
