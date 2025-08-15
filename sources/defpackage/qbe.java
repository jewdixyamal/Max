package defpackage;

import java.io.EOFException;

/* renamed from: qbe  reason: default package */
public final class qbe implements yze {
    public final yze a;
    public final mbe b;
    public final kj6 c = new kj6(9);
    public final wpa d = new wpa();
    public int e = 0;
    public int f = 0;
    public byte[] g = oaf.f;
    public obe h;
    public qy5 i;

    public qbe(yze yze, mbe mbe) {
        this.a = yze;
        this.b = mbe;
    }

    public final void a(long j, int i2, int i3, int i4, wze wze) {
        if (this.h == null) {
            this.a.a(j, i2, i3, i4, wze);
            return;
        }
        fm9.e("DRM on subtitles is not supported", wze == null);
        int i5 = (this.f - i4) - i3;
        this.h.G(this.g, i5, i3, nbe.c, new e74((Object) this, j, i2, 6));
        int i6 = i5 + i3;
        this.e = i6;
        if (i6 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void b(wpa wpa, int i2, int i3) {
        if (this.h == null) {
            this.a.b(wpa, i2, i3);
            return;
        }
        f(i2);
        wpa.e(this.f, this.g, i2);
        this.f += i2;
    }

    public final int c(m24 m24, int i2, boolean z) {
        if (this.h == null) {
            return this.a.c(m24, i2, z);
        }
        f(i2);
        int read = m24.read(this.g, this.f, i2);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(qy5 qy5) {
        qy5.n.getClass();
        String str = qy5.n;
        fm9.f(ia9.g(str) == 3);
        boolean equals = qy5.equals(this.i);
        mbe mbe = this.b;
        if (!equals) {
            this.i = qy5;
            this.h = mbe.a(qy5) ? mbe.e(qy5) : null;
        }
        obe obe = this.h;
        yze yze = this.a;
        if (obe == null) {
            yze.e(qy5);
            return;
        }
        ny5 a2 = qy5.a();
        a2.m = ia9.l("application/x-media3-cues");
        a2.i = str;
        a2.r = Long.MAX_VALUE;
        a2.G = mbe.l(qy5);
        yze.e(new qy5(a2));
    }

    public final void f(int i2) {
        int length = this.g.length;
        int i3 = this.f;
        if (length - i3 < i2) {
            int i4 = i3 - this.e;
            int max = Math.max(i4 * 2, i2 + i4);
            byte[] bArr = this.g;
            byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
            System.arraycopy(bArr, this.e, bArr2, 0, i4);
            this.e = 0;
            this.f = i4;
            this.g = bArr2;
        }
    }
}
