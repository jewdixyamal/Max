package defpackage;

/* renamed from: aa  reason: default package */
public final class aa {
    public static final aa h = new aa(false, true, true, true, true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public aa(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public static aa a(aa aaVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = aaVar.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = aaVar.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = aaVar.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = aaVar.d;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = aaVar.e;
        }
        boolean z11 = z5;
        boolean z12 = aaVar.f;
        if ((i & 64) != 0) {
            z6 = aaVar.g;
        }
        aaVar.getClass();
        return new aa(z7, z8, z9, z10, z11, z12, z6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.aa) r5;
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
            boolean r1 = r5 instanceof defpackage.aa
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            aa r5 = (defpackage.aa) r5
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
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x003d
            return r2
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminCallState(isAdminOrCreator=");
        sb.append(this.a);
        sb.append(", isEnableCameraAvailableInCall=");
        sb.append(this.b);
        sb.append(", isEnableMicrophoneAvailableInCall=");
        sb.append(this.c);
        sb.append(", isEnableSharingScreenAvailableInCall=");
        sb.append(this.d);
        sb.append(", isEnableRecordScreenAvailableInCall=");
        sb.append(this.e);
        sb.append(", isEnableHandsUpAvailableInCall=");
        sb.append(this.f);
        sb.append(", isEnableWaitingRoom=");
        return au1.j(sb, this.g, ")");
    }
}
