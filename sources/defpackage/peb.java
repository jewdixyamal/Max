package defpackage;

/* renamed from: peb  reason: default package */
public final class peb implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public peb(int i, je7 je7) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = je7;
                this.c = ie2.b;
                return;
            default:
                this.b = je7;
                this.c = seb.b;
                return;
        }
    }

    public final i64 a() {
        switch (this.a) {
            case 0:
                return (seb) this.c;
            default:
                return (ie2) this.c;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: oeb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: ka3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: edb} */
    /* JADX WARNING: type inference failed for: r0v15, types: [cdb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l64 b(java.lang.String r14, defpackage.e64 r15, android.os.Bundle r16) {
        /*
            r13 = this;
            r0 = r13
            r2 = r15
            r3 = r16
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x009d;
                default: goto L_0x0009;
            }
        L_0x0009:
            i64 r1 = r0.c
            ie2 r1 = (defpackage.ie2) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L_0x0018
            r0 = 0
            goto L_0x0090
        L_0x0018:
            e64 r1 = defpackage.ie2.c
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "chat_id"
            long r5 = defpackage.i24.D(r1, r3)
            java.lang.String r1 = "attach_id"
            java.lang.String r7 = defpackage.i24.F(r1, r3)
            java.lang.String r1 = "msg_id"
            long r8 = defpackage.i24.D(r1, r3)
            java.lang.String r1 = "single"
            java.lang.Boolean r1 = defpackage.i24.u(r1, r3)
            r4 = 0
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.booleanValue()
            r10 = r1
            goto L_0x0042
        L_0x0041:
            r10 = r4
        L_0x0042:
            java.lang.String r1 = "desc"
            java.lang.Boolean r1 = defpackage.i24.u(r1, r3)
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.booleanValue()
            r11 = r1
            goto L_0x0051
        L_0x0050:
            r11 = r4
        L_0x0051:
            he2 r12 = new he2
            r4 = r12
            r4.<init>(r5, r7, r8, r10, r11)
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x007c
            j64 r0 = new j64
            m52 r1 = new m52
            r4 = 9
            r1.<init>(r4)
            m52 r4 = new m52
            r5 = 10
            r4.<init>(r5)
            r0.<init>(r1, r4)
        L_0x007a:
            r5 = r0
            goto L_0x0082
        L_0x007c:
            j64 r0 = new j64
            r0.<init>()
            goto L_0x007a
        L_0x0082:
            l64 r8 = new l64
            r7 = 8
            r4 = 0
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = r16
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0090:
            return r0
        L_0x0091:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unknown route "
            java.lang.String r1 = defpackage.au1.f(r1, r15)
            r0.<init>(r1)
            throw r0
        L_0x009d:
            i64 r1 = r0.c
            seb r1 = (defpackage.seb) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r15)
            r4 = 0
            if (r1 != 0) goto L_0x00ac
            goto L_0x01b2
        L_0x00ac:
            seb r1 = defpackage.seb.b
            r1.getClass()
            e64 r1 = defpackage.seb.c
            boolean r1 = r15.equals(r1)
            java.lang.String r5 = "type"
            java.lang.String r6 = "id"
            if (r1 == 0) goto L_0x00d7
            long r0 = defpackage.i24.D(r6, r3)
            vu4 r4 = defpackage.reb.b
            java.lang.String r5 = defpackage.i24.F(r5, r3)
            r4.getClass()
            reb r4 = defpackage.vu4.s(r5)
            edb r5 = new edb
            r6 = 1
            r5.<init>(r0, r4, r6)
            r6 = r5
            goto L_0x017a
        L_0x00d7:
            e64 r1 = defpackage.seb.d
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x00ed
            long r0 = defpackage.i24.D(r6, r3)
            ka3 r4 = new ka3
            r5 = 8
            r4.<init>(r0, r5)
            r6 = r4
            goto L_0x017a
        L_0x00ed:
            e64 r1 = defpackage.seb.e
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0159
            long r6 = defpackage.i24.D(r6, r3)
            vu4 r1 = defpackage.reb.b
            java.lang.String r5 = defpackage.i24.F(r5, r3)
            r1.getClass()
            reb r1 = defpackage.vu4.s(r5)
            reb r5 = defpackage.reb.CONTACT
            if (r1 != r5) goto L_0x0122
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f3accountnicknameenabled
            r8 = 0
            boolean r0 = r0.n(r5, r8)
            if (r0 != 0) goto L_0x0122
            goto L_0x01b2
        L_0x0122:
            o84 r0 = defpackage.qeb.b
            java.lang.String r4 = "flow"
            java.lang.String r4 = defpackage.i24.F(r4, r3)
            r0.getClass()
            v25 r0 = defpackage.qeb.X
            java.util.Iterator r0 = r0.iterator()
        L_0x0133:
            r5 = r0
            u1 r5 = (defpackage.u1) r5
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0151
            java.lang.Object r5 = r5.next()
            qeb r5 = (defpackage.qeb) r5
            java.lang.String r8 = r5.a
            boolean r8 = defpackage.tpa.f(r8, r4)
            if (r8 == 0) goto L_0x0133
            cdb r0 = new cdb
            r0.<init>((long) r6, (defpackage.reb) r1, (defpackage.qeb) r5)
        L_0x014f:
            r6 = r0
            goto L_0x017a
        L_0x0151:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x0159:
            e64 r0 = defpackage.seb.f
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "chat_id"
            long r5 = defpackage.i24.D(r0, r3)
            java.lang.String r0 = "contact_id"
            long r8 = defpackage.i24.D(r0, r3)
            java.lang.String r0 = "permissions_type"
            java.lang.String r7 = defpackage.i24.F(r0, r3)
            oeb r0 = new oeb
            r4 = r0
            r4.<init>(r5, r7, r8)
            goto L_0x014f
        L_0x017a:
            l64 r8 = new l64
            r7 = 16
            r5 = 0
            r4 = 1
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r4 = r8
            goto L_0x01b2
        L_0x018a:
            java.lang.Class<peb> r0 = defpackage.peb.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid route "
            r1.<init>(r3)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r15)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            defpackage.hm9.p(r0, r1, r5)
        L_0x01b2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peb.b(java.lang.String, e64, android.os.Bundle):l64");
    }
}
