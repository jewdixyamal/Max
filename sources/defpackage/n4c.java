package defpackage;

/* renamed from: n4c  reason: default package */
public abstract class n4c {
    public static final m4c a = new n4c();
    public static final d3 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [n4c, m4c] */
    /* JADX WARNING: type inference failed for: r0v3, types: [n4c] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            m4c r0 = new m4c
            r0.<init>()
            a = r0
            java.lang.Integer r0 = defpackage.r77.a
            if (r0 == 0) goto L_0x001a
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            pb5 r0 = new pb5
            r0.<init>()
            goto L_0x001f
        L_0x001a:
            x2b r0 = new x2b
            r0.<init>()
        L_0x001f:
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4c.<clinit>():void");
    }

    public abstract int a(int i);

    public abstract boolean b();

    public abstract byte[] c(byte[] bArr);

    public abstract double d();

    public abstract float e();

    public abstract int f();

    public abstract int g(int i);

    public abstract long h();

    public long i(long j) {
        return j(0, j);
    }

    public long j(long j, long j2) {
        long j3;
        long h;
        long j4;
        int f;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        f = a(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        f = f();
                    } else {
                        j3 = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) f()) & 4294967295L);
                    }
                    j3 = ((long) f) & 4294967295L;
                } else {
                    do {
                        h = h() >>> 1;
                        j4 = h % j5;
                    } while ((j5 - 1) + (h - j4) < 0);
                    j3 = j4;
                }
                return j + j3;
            }
            while (true) {
                long h2 = h();
                if (j <= h2 && h2 < j2) {
                    return h2;
                }
            }
        } else {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
    }
}
