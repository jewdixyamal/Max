package defpackage;

/* renamed from: jid  reason: default package */
public final class jid implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public jid(int i, je7 je7) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = lwf.b;
                this.b = je7;
                return;
            default:
                this.b = je7;
                this.c = kid.b;
                return;
        }
    }

    public final i64 a() {
        switch (this.a) {
            case 0:
                return (kid) this.c;
            default:
                return (lwf) this.c;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: ka3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ngd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: kwf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: kwf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kwf} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l64 b(java.lang.String r18, defpackage.e64 r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r3 = r20
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0106;
                default: goto L_0x000b;
            }
        L_0x000b:
            i64 r1 = r0.c
            lwf r1 = (defpackage.lwf) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r2)
            r4 = 0
            if (r1 != 0) goto L_0x001a
            goto L_0x00f9
        L_0x001a:
            j64 r1 = new j64
            r1.<init>()
            lwf r5 = defpackage.lwf.b
            r5.getClass()
            e64 r5 = defpackage.lwf.c
            boolean r5 = r2.equals(r5)
            java.lang.String r6 = "bot_id"
            if (r5 == 0) goto L_0x00c8
            j64 r1 = new j64
            bse r5 = new bse
            r7 = 17
            r5.<init>(r7)
            bse r7 = new bse
            r8 = 18
            r7.<init>(r8)
            r1.<init>(r5, r7)
            long r10 = defpackage.i24.D(r6, r3)
            b46 r5 = defpackage.osf.c
            java.lang.String r6 = "entry_point"
            java.lang.String r6 = defpackage.i24.F(r6, r3)
            r5.getClass()
            v25 r5 = defpackage.osf.u0
            java.util.Iterator r5 = r5.iterator()
        L_0x0056:
            r7 = r5
            u1 r7 = (defpackage.u1) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r7 = r7.next()
            r12 = r7
            osf r12 = (defpackage.osf) r12
            java.lang.String r7 = r12.a
            boolean r7 = defpackage.tpa.f(r7, r6)
            if (r7 == 0) goto L_0x0056
            java.lang.String r5 = "chat_id"
            java.lang.Long r13 = defpackage.i24.v(r5, r3)
            java.lang.String r5 = "start_param"
            java.lang.String r14 = r3.getString(r5)
            java.lang.String r5 = "is_fullscreen"
            java.lang.Boolean r5 = defpackage.i24.u(r5, r3)
            r6 = 0
            if (r5 == 0) goto L_0x0089
            boolean r0 = r5.booleanValue()
        L_0x0087:
            r15 = r0
            goto L_0x009c
        L_0x0089:
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            ne7 r0 = r0.g
            java.lang.String r5 = "app.toggle.webapp_fullscreen"
            boolean r0 = r0.getBoolean(r5, r6)
            goto L_0x0087
        L_0x009c:
            java.lang.String r0 = "request_code"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x00ac
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x00ac:
            if (r4 == 0) goto L_0x00b5
            int r0 = r4.intValue()
            r16 = r0
            goto L_0x00b7
        L_0x00b5:
            r16 = r6
        L_0x00b7:
            kwf r0 = new kwf
            r9 = r0
            r9.<init>(r10, r12, r13, r14, r15, r16)
        L_0x00bd:
            r6 = r0
            r5 = r1
            goto L_0x00eb
        L_0x00c0:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            e64 r0 = defpackage.lwf.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d7
            ngd r0 = new ngd
            r4 = 7
            r0.<init>(r4)
            goto L_0x00bd
        L_0x00d7:
            e64 r0 = defpackage.lwf.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00fa
            long r4 = defpackage.i24.D(r6, r3)
            ka3 r0 = new ka3
            r6 = 11
            r0.<init>(r4, r6)
            goto L_0x00bd
        L_0x00eb:
            l64 r7 = new l64
            r4 = 1
            r0 = r7
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r4 = r7
        L_0x00f9:
            return r4
        L_0x00fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "invalid route "
            java.lang.String r1 = defpackage.au1.f(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0106:
            i64 r1 = r0.c
            kid r1 = (defpackage.kid) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r2)
            r4 = 0
            if (r1 != 0) goto L_0x0114
            goto L_0x0161
        L_0x0114:
            kid r1 = defpackage.kid.b
            r1.getClass()
            e64 r1 = defpackage.kid.c
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0139
            lq r6 = new lq
            r1 = 2
            r6.<init>(r1, r0)
            l64 r8 = new l64
            r5 = 0
            r4 = 0
            r7 = 24
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r4 = r8
            goto L_0x0161
        L_0x0139:
            java.lang.Class<jid> r0 = defpackage.jid.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid route "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            defpackage.hm9.p(r0, r1, r5)
        L_0x0161:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jid.b(java.lang.String, e64, android.os.Bundle):l64");
    }
}
