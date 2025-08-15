package defpackage;

/* renamed from: spa  reason: default package */
public final class spa {
    public static final spa f = new spa((b2b) null, 0, (zud) null, (Long) null, (us) null, 31);
    public final b2b a;
    public final int b;
    public final zud c;
    public final Long d;
    public final us e;

    public spa(b2b b2b, int i, zud zud, Long l, us usVar) {
        this.a = b2b;
        this.b = i;
        this.c = zud;
        this.d = l;
        this.e = usVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.spa
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            spa r5 = (defpackage.spa) r5
            b2b r1 = r5.a
            b2b r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            zud r1 = r4.c
            zud r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.Long r1 = r4.d
            java.lang.Long r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            us r4 = r4.e
            us r5 = r5.e
            if (r4 != 0) goto L_0x0038
            if (r5 != 0) goto L_0x0036
            r4 = r0
            goto L_0x003f
        L_0x0036:
            r4 = r2
            goto L_0x003f
        L_0x0038:
            if (r5 != 0) goto L_0x003b
            goto L_0x0036
        L_0x003b:
            boolean r4 = r4.equals(r5)
        L_0x003f:
            if (r4 != 0) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        b2b b2b = this.a;
        int hashCode = (b2b == null ? 0 : b2b.hashCode()) * 31;
        int i2 = this.b;
        int s = (hashCode + (i2 == 0 ? 0 : au1.s(i2))) * 31;
        zud zud = this.c;
        int hashCode2 = (s + (zud == null ? 0 : zud.hashCode())) * 31;
        Long l = this.d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        us usVar = this.e;
        if (usVar != null) {
            i = usVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        String str;
        us usVar = this.e;
        if (usVar == null) {
            str = "null";
        } else {
            str = "ReasonMeta(meta=" + usVar + ")";
        }
        StringBuilder sb = new StringBuilder("Params(pipType=");
        sb.append(this.a);
        sb.append(", navReason=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PIP_CLOSE" : "FOLDER_CHANGE" : "LINK" : "PUSH_NOTIFICATION");
        sb.append(", sourceType=");
        sb.append(this.c);
        sb.append(", sourceId=");
        sb.append(this.d);
        sb.append(", reasonMeta=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spa(b2b b2b, int i, zud zud, Long l, us usVar, int i2) {
        this((i2 & 1) != 0 ? null : b2b, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : zud, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : usVar);
    }
}
