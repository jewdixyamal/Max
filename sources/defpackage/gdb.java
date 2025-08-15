package defpackage;

/* renamed from: gdb  reason: default package */
public final class gdb implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public gdb(int i, je7 je7) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = mq.b;
                this.b = je7;
                return;
            default:
                this.b = je7;
                this.c = idb.b;
                return;
        }
    }

    public final i64 a() {
        switch (this.a) {
            case 0:
                return (idb) this.c;
            default:
                return (mq) this.c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l64 b(java.lang.String r13, defpackage.e64 r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            i64 r2 = r12.c
            int r3 = r12.a
            switch(r3) {
                case 0: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            mq r2 = (defpackage.mq) r2
            java.util.LinkedHashSet r2 = r2.a
            boolean r2 = r2.contains(r14)
            if (r2 != 0) goto L_0x0014
            goto L_0x002e
        L_0x0014:
            e64 r1 = defpackage.mq.c
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x002f
            lq r8 = new lq
            r8.<init>(r0, r12)
            l64 r1 = new l64
            r9 = 16
            r7 = 0
            r6 = 1
            r2 = r1
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x002e:
            return r1
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Unknown route="
            java.lang.String r13 = defpackage.au1.f(r13, r14)
            r12.<init>(r13)
            throw r12
        L_0x003b:
            idb r2 = (defpackage.idb) r2
            java.util.LinkedHashSet r2 = r2.a
            boolean r2 = r2.contains(r14)
            if (r2 != 0) goto L_0x0047
            goto L_0x01fd
        L_0x0047:
            idb r2 = defpackage.idb.b
            r2.getClass()
            e64 r2 = defpackage.idb.c
            boolean r2 = r14.equals(r2)
            je7 r3 = r12.b
            java.lang.String r4 = "type"
            java.lang.String r5 = "id"
            if (r2 == 0) goto L_0x00a0
            dp3 r1 = defpackage.hdb.b
            java.lang.String r2 = defpackage.i24.F(r4, r15)
            r1.getClass()
            hdb r1 = defpackage.dp3.c(r2)
            long r4 = defpackage.i24.D(r5, r15)
            int r2 = r1.ordinal()
            if (r2 == 0) goto L_0x0087
            r6 = 2
            if (r2 == r6) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            java.lang.Object r2 = r3.getValue()
            qe5 r2 = (defpackage.qe5) r2
            se5 r2 = (defpackage.se5) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f10avatarsscreenenabled
            boolean r0 = r2.n(r6, r0)
            goto L_0x0098
        L_0x0087:
            java.lang.Object r2 = r3.getValue()
            qe5 r2 = (defpackage.qe5) r2
            se5 r2 = (defpackage.se5) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f10avatarsscreenenabled
            boolean r0 = r2.n(r6, r0)
        L_0x0098:
            cdb r2 = new cdb
            r2.<init>((defpackage.hdb) r1, (defpackage.gdb) r12, (long) r4)
            r10 = r2
            goto L_0x019d
        L_0x00a0:
            e64 r12 = defpackage.idb.d
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x00ff
            long r1 = defpackage.i24.D(r5, r15)
            java.lang.String r12 = defpackage.i24.F(r4, r15)
            int r4 = r12.hashCode()
            r5 = -759091500(0xffffffffd2c12ed4, float:-4.14857167E11)
            if (r4 == r5) goto L_0x00dc
            r5 = 951526432(0x38b72420, float:8.732849E-5)
            if (r4 == r5) goto L_0x00d0
            r5 = 1303205804(0x4dad57ac, float:3.63525504E8)
            if (r4 == r5) goto L_0x00c4
            goto L_0x00e4
        L_0x00c4:
            java.lang.String r4 = "local_chat"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            hdb r12 = defpackage.hdb.LOCAL_CHAT
            goto L_0x00e9
        L_0x00d0:
            java.lang.String r4 = "contact"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x00d9
            goto L_0x00e4
        L_0x00d9:
            hdb r12 = defpackage.hdb.CONTACT
            goto L_0x00e9
        L_0x00dc:
            java.lang.String r4 = "server_chat"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x00e7
        L_0x00e4:
            hdb r12 = defpackage.hdb.LOCAL_CHAT
            goto L_0x00e9
        L_0x00e7:
            hdb r12 = defpackage.hdb.SERVER_CHAT
        L_0x00e9:
            java.lang.String r4 = "is_opened_from_dialog"
            java.lang.Boolean r4 = defpackage.i24.u(r4, r15)
            if (r4 == 0) goto L_0x00f6
            boolean r4 = r4.booleanValue()
            goto L_0x00f7
        L_0x00f6:
            r4 = r0
        L_0x00f7:
            ddb r5 = new ddb
            r5.<init>(r1, r12, r4)
            r10 = r5
            goto L_0x019d
        L_0x00ff:
            e64 r12 = defpackage.idb.e
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0114
            long r1 = defpackage.i24.D(r5, r15)
            ka3 r12 = new ka3
            r4 = 4
            r12.<init>(r1, r4)
        L_0x0111:
            r10 = r12
            goto L_0x019d
        L_0x0114:
            e64 r12 = defpackage.idb.f
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0142
            long r1 = defpackage.i24.D(r5, r15)
            java.lang.String r12 = defpackage.i24.F(r4, r15)
            ek2 r4 = defpackage.ek2.MEMBER
            java.lang.String r5 = "BLOCKED_MEMBER"
            boolean r5 = r12.equals(r5)
            if (r5 != 0) goto L_0x013a
            java.lang.String r5 = "ADMIN"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            ek2 r4 = defpackage.ek2.ADMIN
            goto L_0x013c
        L_0x013a:
            ek2 r4 = defpackage.ek2.BLOCKED_MEMBER
        L_0x013c:
            edb r12 = new edb
            r12.<init>(r1, r4)
            goto L_0x0111
        L_0x0142:
            e64 r12 = defpackage.idb.g
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0155
            long r1 = defpackage.i24.D(r5, r15)
            ka3 r12 = new ka3
            r4 = 5
            r12.<init>(r1, r4)
            goto L_0x0111
        L_0x0155:
            e64 r12 = defpackage.idb.h
            boolean r12 = r14.equals(r12)
            java.lang.String r2 = "chat_id"
            if (r12 == 0) goto L_0x016a
            long r1 = defpackage.i24.D(r2, r15)
            ka3 r12 = new ka3
            r4 = 6
            r12.<init>(r1, r4)
            goto L_0x0111
        L_0x016a:
            e64 r12 = defpackage.idb.i
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x017d
            long r1 = defpackage.i24.D(r2, r15)
            ka3 r12 = new ka3
            r4 = 7
            r12.<init>(r1, r4)
            goto L_0x0111
        L_0x017d:
            e64 r12 = defpackage.idb.j
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x01d5
            long r1 = defpackage.i24.D(r2, r15)
            java.lang.String r12 = "leave_chat"
            java.lang.Boolean r12 = defpackage.i24.u(r12, r15)
            if (r12 == 0) goto L_0x0196
            boolean r12 = r12.booleanValue()
            goto L_0x0197
        L_0x0196:
            r12 = r0
        L_0x0197:
            fdb r4 = new fdb
            r4.<init>(r1, r12)
            r10 = r4
        L_0x019d:
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r12 = r3.getValue()
            qe5 r12 = (defpackage.qe5) r12
            se5 r12 = (defpackage.se5) r12
            boolean r12 = r12.u()
            if (r12 == 0) goto L_0x01c2
            j64 r12 = new j64
            lab r0 = new lab
            r1 = 15
            r0.<init>(r1)
            lab r1 = new lab
            r2 = 16
            r1.<init>(r2)
            r12.<init>(r0, r1)
        L_0x01c0:
            r9 = r12
            goto L_0x01c8
        L_0x01c2:
            j64 r12 = new j64
            r12.<init>()
            goto L_0x01c0
        L_0x01c8:
            l64 r1 = new l64
            r11 = 8
            r8 = 0
            r4 = r1
            r5 = r13
            r6 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01fd
        L_0x01d5:
            java.lang.Class<gdb> r12 = defpackage.gdb.class
            java.lang.String r12 = r12.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "invalid route "
            r13.<init>(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r0.<init>(r14)
            defpackage.hm9.p(r12, r13, r0)
        L_0x01fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdb.b(java.lang.String, e64, android.os.Bundle):l64");
    }
}
