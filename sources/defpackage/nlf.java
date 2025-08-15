package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* renamed from: nlf  reason: default package */
public final class nlf extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final wpa c = new wpa(fm9.e);
    public final wpa o = new wpa(4);
    public int s0;

    public nlf(yze yze) {
        super(11, (Object) yze);
    }

    public final boolean Z1(wpa wpa) {
        int u = wpa.u();
        int i = (u >> 4) & 15;
        int i2 = u & 15;
        if (i2 == 7) {
            this.s0 = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(zr6.h(i2, "Video format not supported: "));
    }

    public final boolean a2(long j, wpa wpa) {
        int u = wpa.u();
        byte[] bArr = wpa.a;
        int i = wpa.b;
        int i2 = i + 1;
        wpa.b = i2;
        int i3 = i + 2;
        wpa.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        wpa.b = i + 3;
        long j2 = (((long) ((bArr[i3] & 255) | i4 | (((bArr[i] & 255) << 24) >> 8))) * 1000) + j;
        yze yze = (yze) this.b;
        if (u == 0 && !this.Y) {
            byte[] bArr2 = new byte[wpa.a()];
            wpa wpa2 = new wpa(bArr2);
            wpa.e(0, bArr2, wpa.a());
            ud0 a = ud0.a(wpa2);
            this.X = a.b;
            ny5 ny5 = new ny5();
            ny5.m = ia9.l("video/avc");
            ny5.i = a.l;
            ny5.s = a.c;
            ny5.t = a.d;
            ny5.w = a.k;
            ny5.p = a.a;
            yze.e(ny5.a());
            this.Y = true;
            return false;
        } else if (u != 1 || !this.Y) {
            return false;
        } else {
            int i5 = this.s0 == 1 ? 1 : 0;
            if (!this.Z && i5 == 0) {
                return false;
            }
            wpa wpa3 = this.o;
            byte[] bArr3 = wpa3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.X;
            int i7 = 0;
            while (wpa.a() > 0) {
                wpa.e(i6, wpa3.a, this.X);
                wpa3.G(0);
                int y = wpa3.y();
                wpa wpa4 = this.c;
                wpa4.G(0);
                yze.b(wpa4, 4, 0);
                yze.b(wpa, y, 0);
                i7 = i7 + 4 + y;
            }
            ((yze) this.b).a(j2, i5, i7, 0, (wze) null);
            this.Z = true;
            return true;
        }
    }
}
