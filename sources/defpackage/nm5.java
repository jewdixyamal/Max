package defpackage;

import java.util.Arrays;

/* renamed from: nm5  reason: default package */
public final class nm5 extends a9e {
    public qm5 o;
    public qy p;

    public final long c(yaf yaf) {
        byte[] bArr = yaf.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yaf.I(4);
            yaf.D();
        }
        int E = ngg.E(i, yaf);
        yaf.H(0);
        return (long) E;
    }

    public final boolean e(yaf yaf, long j, l7b l7b) {
        yaf yaf2 = yaf;
        l7b l7b2 = l7b;
        byte[] bArr = yaf2.a;
        qm5 qm5 = this.o;
        if (qm5 == null) {
            qm5 qm52 = new qm5(bArr, 17, 0);
            this.o = qm52;
            l7b2.b = qm52.d(Arrays.copyOfRange(bArr, 9, yaf2.c), (e99) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            va8 t = kp.t(yaf);
            long j2 = qm5.k;
            qm5 qm53 = new qm5(qm5.b, qm5.c, qm5.d, qm5.e, qm5.f, qm5.h, qm5.i, j2, t, (e99) qm5.m);
            this.o = qm53;
            qy qyVar = new qy(2);
            qyVar.o = qm53;
            qyVar.X = t;
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
                l7b2.c = qyVar2;
            }
            ((oy5) l7b2.b).getClass();
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
