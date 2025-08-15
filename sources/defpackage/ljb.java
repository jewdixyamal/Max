package defpackage;

/* renamed from: ljb  reason: default package */
public final class ljb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ljb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static ljb a(ljb ljb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = ljb.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = ljb.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = ljb.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = ljb.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = ljb.e;
        }
        ljb.getClass();
        return new ljb(z6, z7, z8, z9, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ljb) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.ljb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ljb r5 = (defpackage.ljb) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x002f
            return r2
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileMemberPermissionsModel(changePhoto=");
        sb.append(this.a);
        sb.append(", canAddMembers=");
        sb.append(this.b);
        sb.append(", canPinMessage=");
        sb.append(this.c);
        sb.append(", canCallInChat=");
        sb.append(this.d);
        sb.append(", canSeePrivateChatLink=");
        return au1.j(sb, this.e, ")");
    }
}
