package defpackage;

/* renamed from: qb8  reason: default package */
public final class qb8 implements sb8 {
    public final String X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long b;
    public final o00 c;
    public final wcf o;

    public qb8(long j, long j2, o00 o00, wcf wcf, String str) {
        this.a = j;
        this.b = j2;
        this.c = o00;
        this.o = wcf;
        this.X = str;
        String str2 = wcf.g;
        this.Y = str2 != null ? (long) str2.hashCode() : 0;
        this.Z = k8a.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb8)) {
            return false;
        }
        qb8 qb8 = (qb8) obj;
        return this.a == qb8.a && this.b == qb8.b && tpa.f(this.c, qb8.c) && tpa.f(this.o, qb8.o) && tpa.f(this.X, qb8.X);
    }

    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int m = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        o00 o00 = this.c;
        int hashCode = o00 == null ? 0 : o00.hashCode();
        return this.X.hashCode() + ((this.o.hashCode() + ((m + hashCode) * 31)) * 31);
    }

    public final long i() {
        return this.b;
    }

    public final long j() {
        return this.a;
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoAttachConfig=");
        sb.append(this.o);
        sb.append(", localId=");
        return zr6.l(sb, this.X, ")");
    }

    public final String x() {
        return this.X;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qb8(long r10, long r12, defpackage.o00 r14, defpackage.wcf r15) {
        /*
            r9 = this;
            java.lang.String r0 = r15.g
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = ""
        L_0x0006:
            r8 = r0
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb8.<init>(long, long, o00, wcf):void");
    }
}
