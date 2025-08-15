package defpackage;

import java.util.Arrays;

/* renamed from: om5  reason: default package */
public final class om5 extends a9e {
    public qm5 o;
    public qy p;

    public final long b(wpa wpa) {
        byte[] bArr = wpa.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            wpa.H(4);
            wpa.B();
        }
        int K = z7.K(i, wpa);
        wpa.G(0);
        return (long) K;
    }

    public final boolean d(wpa wpa, long j, djb djb) {
        wpa wpa2 = wpa;
        djb djb2 = djb;
        byte[] bArr = wpa2.a;
        qm5 qm5 = this.o;
        if (qm5 == null) {
            qm5 qm52 = new qm5(bArr, 17, 1);
            this.o = qm52;
            djb2.b = qm52.e(Arrays.copyOfRange(bArr, 9, wpa2.c), (f99) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            h7b s = ft.s(wpa);
            long j2 = qm5.k;
            qm5 qm53 = new qm5(qm5.b, qm5.c, qm5.d, qm5.e, qm5.f, qm5.h, qm5.i, j2, s, (f99) qm5.m);
            this.o = qm53;
            qy qyVar = new qy(3);
            qyVar.o = qm53;
            qyVar.X = s;
            qyVar.b = -1;
            qyVar.c = -1;
            this.p = qyVar;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            qy qyVar2 = this.p;
            if (qyVar2 != null) {
                qyVar2.b = j;
                djb2.c = qyVar2;
            }
            ((qy5) djb2.b).getClass();
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
