package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* renamed from: mlf  reason: default package */
public final class mlf extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final yaf c = new yaf(np8.b);
    public final yaf o = new yaf(4);
    public int s0;

    public mlf(xze xze) {
        super(10, (Object) xze);
    }

    public final boolean Z1(yaf yaf) {
        int v = yaf.v();
        int i = (v >> 4) & 15;
        int i2 = v & 15;
        if (i2 == 7) {
            this.s0 = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(z7b.h(39, i2, "Video format not supported: "));
    }

    public final boolean a2(long j, yaf yaf) {
        int v = yaf.v();
        byte[] bArr = yaf.a;
        int i = yaf.b;
        int i2 = i + 1;
        yaf.b = i2;
        int i3 = i + 2;
        yaf.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        yaf.b = i + 3;
        long j2 = (((long) ((bArr[i3] & 255) | i4 | (((bArr[i] & 255) << 24) >> 8))) * 1000) + j;
        xze xze = (xze) this.b;
        if (v == 0 && !this.Y) {
            byte[] bArr2 = new byte[yaf.c()];
            yaf yaf2 = new yaf(bArr2);
            yaf.g(0, bArr2, yaf.c());
            td0 a = td0.a(yaf2);
            this.X = a.b;
            my5 my5 = new my5();
            my5.k = "video/avc";
            my5.h = a.f;
            my5.p = a.c;
            my5.q = a.d;
            my5.t = a.e;
            my5.m = a.a;
            xze.d(new oy5(my5));
            this.Y = true;
            return false;
        } else if (v != 1 || !this.Y) {
            return false;
        } else {
            int i5 = this.s0 == 1 ? 1 : 0;
            if (!this.Z && i5 == 0) {
                return false;
            }
            yaf yaf3 = this.o;
            byte[] bArr3 = yaf3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.X;
            int i7 = 0;
            while (yaf.c() > 0) {
                yaf.g(i6, yaf3.a, this.X);
                yaf3.H(0);
                int y = yaf3.y();
                yaf yaf4 = this.c;
                yaf4.H(0);
                xze.c(4, yaf4);
                xze.c(y, yaf);
                i7 = i7 + 4 + y;
            }
            ((xze) this.b).b(j2, i5, i7, 0, (vze) null);
            this.Z = true;
            return true;
        }
    }
}
