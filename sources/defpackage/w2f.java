package defpackage;

/* renamed from: w2f  reason: default package */
public final class w2f extends ee9 {
    public final long k;
    public final long l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w2f(java.lang.String r13, int r14, int r15, int r16, long r17, long r19, boolean r21) {
        /*
            r12 = this;
            r7 = r12
            r8 = r17
            r10 = r19
            ce9 r0 = new ce9
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r14, r13, r15, r4)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            long r3 = r10 - r8
            r1 = 0
            r0 = r12
            r6 = r21
            r0.<init>(r1, r3, r5, r6)
            r7.k = r8
            r7.l = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2f.<init>(java.lang.String, int, int, int, long, long, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w2f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w2f w2f = (w2f) obj;
        if (this.k != w2f.k) {
            return false;
        }
        return this.l == w2f.l;
    }

    public final int hashCode() {
        long j = this.k;
        long j2 = this.l;
        return (((super.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final long k() {
        return this.l;
    }

    public final long m() {
        return this.k;
    }
}
