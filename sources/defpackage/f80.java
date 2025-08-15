package defpackage;

/* renamed from: f80  reason: default package */
public final class f80 {
    public final je7 a;
    public final je7 b;

    public f80(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.e80
            if (r0 == 0) goto L_0x0013
            r0 = r9
            e80 r0 = (defpackage.e80) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            e80 r0 = new e80
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            f80 r6 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0084
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            defpackage.od2.a0(r9)
            je7 r9 = r6.b
            java.lang.Object r9 = r9.getValue()
            e5a r9 = (defpackage.e5a) r9
            r0.o = r6
            r0.Z = r3
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ome r9 = (defpackage.ome) r9
            x70 r2 = new x70
            sla r4 = defpackage.sla.AUTH
            r2.<init>((defpackage.sla) r4)
            r4 = 0
            if (r8 == 0) goto L_0x005b
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r5 = r4
            goto L_0x005c
        L_0x005b:
            r5 = r3
        L_0x005c:
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = "token"
            r2.p(r5, r8)
            if (r7 == 0) goto L_0x006c
            int r8 = r7.length()
            if (r8 != 0) goto L_0x006d
        L_0x006c:
            r4 = r3
        L_0x006d:
            r8 = r4 ^ 1
            if (r8 == 0) goto L_0x0094
            java.lang.String r8 = "verifyCode"
            r2.p(r8, r7)
            java.lang.String r7 = "authTokenType"
            java.lang.String r8 = "CHECK_CODE"
            r2.p(r7, r8)
            java.lang.Object r9 = r9.e(r2, r0)
            if (r9 != r1) goto L_0x0084
            return r1
        L_0x0084:
            y70 r9 = (defpackage.y70) r9
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            ad r6 = (defpackage.ad) r6
            java.lang.String r7 = "CONFIRM_PHONE_SUCCESS"
            r6.f(r7)
            return r9
        L_0x0094:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'verifyCode' can't be null when param 'authTokenType' is 'PHONE' or 'PHONE_CONFIRM'"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00a0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'token' can't be null"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f80.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
