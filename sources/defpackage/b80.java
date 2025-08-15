package defpackage;

/* renamed from: b80  reason: default package */
public final class b80 {
    public final je7 a;

    public b80(je7 je7) {
        this.a = je7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.afc r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.a80
            if (r0 == 0) goto L_0x0013
            r0 = r11
            a80 r0 = (defpackage.a80) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            a80 r0 = new a80
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            defpackage.od2.a0(r11)
            goto L_0x00b5
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            defpackage.od2.a0(r11)
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            e5a r9 = (defpackage.e5a) r9
            java.lang.String r11 = r10.a
            r2 = 0
            java.lang.Long r4 = r10.X
            if (r4 == 0) goto L_0x0044
            r5 = r3
            goto L_0x0045
        L_0x0044:
            r5 = r2
        L_0x0045:
            r0.Y = r3
            r9.getClass()
            au r6 = new au
            sla r7 = defpackage.sla.AUTH_CONFIRM
            r8 = 7
            r6.<init>((defpackage.sla) r7, (int) r8)
            if (r11 == 0) goto L_0x005d
            int r7 = r11.length()
            if (r7 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00c4
            java.lang.String r7 = "token"
            r6.p(r7, r11)
            java.lang.String r11 = "tokenType"
            java.lang.String r7 = "REGISTER"
            r6.p(r11, r7)
            java.lang.String r11 = r10.c
            if (r11 == 0) goto L_0x0077
            int r7 = r11.length()
            if (r7 != 0) goto L_0x0078
        L_0x0077:
            r2 = r3
        L_0x0078:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = "firstName"
            r6.p(r2, r11)
            java.lang.String r10 = r10.o
            if (r10 == 0) goto L_0x0090
            int r11 = r10.length()
            if (r11 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            java.lang.String r11 = "lastName"
            r6.p(r11, r10)
        L_0x0090:
            if (r4 == 0) goto L_0x009b
            long r10 = r4.longValue()
            java.lang.String r2 = "photoId"
            r6.i(r10, r2)
        L_0x009b:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r10 = defpackage.au1.e(r5)
            java.lang.String r11 = "avatarType"
            r6.p(r11, r10)
        L_0x00a6:
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ome r9 = (defpackage.ome) r9
            java.lang.Object r11 = r9.e(r6, r0)
            if (r11 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            z70 r11 = (defpackage.z70) r11
            return r11
        L_0x00b8:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'firstName' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00c4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'token' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.a(afc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
