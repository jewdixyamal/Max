package defpackage;

/* renamed from: hue  reason: default package */
public final class hue {
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public s8 g = s8.g;

    static {
        int i2 = oaf.a;
    }

    public final long a(int i2, int i3) {
        q8 a2 = this.g.a(i2);
        if (a2.b != -1) {
            return a2.g[i3];
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = r0.a(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r9) {
        /*
            r8 = this;
            s8 r0 = r8.g
            long r1 = r8.d
            r0.getClass()
            r3 = -9223372036854775808
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r5 = -1
            if (r8 == 0) goto L_0x004b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001c
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            int r8 = r0.e
        L_0x001e:
            int r1 = r0.b
            if (r8 >= r1) goto L_0x0048
            q8 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0036
            q8 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0045
        L_0x0036:
            q8 r2 = r0.a(r8)
            int r6 = r2.b
            if (r6 == r5) goto L_0x0048
            int r2 = r2.a(r5)
            if (r2 >= r6) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0048:
            if (r8 >= r1) goto L_0x004b
            r5 = r8
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hue.b(long):int");
    }

    public final int c(long j2) {
        s8 s8Var = this.g;
        long j3 = this.d;
        int i2 = s8Var.b - 1;
        int i3 = i2 - (s8Var.b(i2) ? 1 : 0);
        while (i3 >= 0 && j2 != Long.MIN_VALUE) {
            q8 a2 = s8Var.a(i3);
            long j4 = a2.a;
            if (j4 != Long.MIN_VALUE) {
                if (j2 >= j4) {
                    break;
                }
            } else if (j3 != -9223372036854775807L && ((!a2.i || a2.b != -1) && j2 >= j3)) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            q8 a3 = s8Var.a(i3);
            int i4 = a3.b;
            if (i4 == -1) {
                return i3;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = a3.f[i5];
                if (i6 == 0 || i6 == 1) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        q8 a2 = this.g.a(i2);
        if (a2.b != -1) {
            return a2.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (hue.class.equals(obj.getClass())) {
                hue hue = (hue) obj;
                return oaf.a(this.a, hue.a) && oaf.a(this.b, hue.b) && this.c == hue.c && this.d == hue.d && this.e == hue.e && this.f == hue.f && oaf.a(this.g, hue.g);
            }
        }
        return false;
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final long g() {
        return this.e;
    }

    public final boolean h(int i2) {
        s8 s8Var = this.g;
        return i2 == s8Var.b - 1 && s8Var.b(i2);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        long j2 = this.d;
        long j3 = this.e;
        return this.g.hashCode() + ((((((((((hashCode + i2) * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final boolean i(int i2) {
        return this.g.a(i2).i;
    }

    public final void j(Object obj, Object obj2, int i2, long j2, long j3, s8 s8Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = s8Var;
        this.f = z;
    }
}
