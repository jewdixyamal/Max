package defpackage;

import java.util.ArrayDeque;

/* renamed from: ea4  reason: default package */
public final class ea4 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public ea4(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yaf(1, false);
                return;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yaf(0, false);
                return;
        }
    }

    public long a(ra4 ra4, int i) {
        byte[] bArr = this.a;
        ra4.h(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public long b(sa4 sa4, int i) {
        byte[] bArr = this.a;
        sa4.h(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
