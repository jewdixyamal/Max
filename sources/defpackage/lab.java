package defpackage;

/* renamed from: lab  reason: default package */
public final /* synthetic */ class lab implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ lab(int i) {
        this.a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ all -> 0x008c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r16 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2 = r16
            int r2 = r2.a
            switch(r2) {
                case 0: goto L_0x0307;
                case 1: goto L_0x02f7;
                case 2: goto L_0x02de;
                case 3: goto L_0x02bb;
                case 4: goto L_0x0298;
                case 5: goto L_0x0275;
                case 6: goto L_0x0252;
                case 7: goto L_0x0230;
                case 8: goto L_0x01bb;
                case 9: goto L_0x01a2;
                case 10: goto L_0x0189;
                case 11: goto L_0x0166;
                case 12: goto L_0x0143;
                case 13: goto L_0x0120;
                case 14: goto L_0x00fd;
                case 15: goto L_0x00f7;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00d2;
                case 18: goto L_0x00c3;
                case 19: goto L_0x00be;
                case 20: goto L_0x00b9;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00ad;
                case 23: goto L_0x00a7;
                case 24: goto L_0x009d;
                case 25: goto L_0x0098;
                case 26: goto L_0x0030;
                case 27: goto L_0x0023;
                case 28: goto L_0x0016;
                default: goto L_0x000a;
            }
        L_0x000a:
            bc7[] r0 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 1
            r0.setShape(r1)
            return r0
        L_0x0016:
            bc7[] r1 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            android.view.animation.PathInterpolator r1 = new android.view.animation.PathInterpolator
            r2 = 1048576000(0x3e800000, float:0.25)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r1.<init>(r2, r3, r2, r0)
            return r1
        L_0x0023:
            o19 r0 = defpackage.o19.a
            kke r0 = r0.getDispatchers()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            return r0
        L_0x0030:
            yb9 r1 = new yb9
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r2.keys()
        L_0x0040:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r5 = r2.optJSONObject(r0)
            if (r5 != 0) goto L_0x0053
            goto L_0x0040
        L_0x0053:
            px4 r6 = new px4     // Catch:{ all -> 0x008c }
            java.lang.String r7 = "emoji"
            org.json.JSONObject r7 = r5.optJSONObject(r7)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = "url"
            r9 = 0
            if (r7 != 0) goto L_0x0062
        L_0x0060:
            r11 = r9
            goto L_0x006d
        L_0x0062:
            java.lang.String r10 = r7.optString(r8)     // Catch:{ all -> 0x008c }
            if (r10 == 0) goto L_0x0060
            ox4 r11 = new ox4     // Catch:{ all -> 0x008c }
            r11.<init>(r7, r10)     // Catch:{ all -> 0x008c }
        L_0x006d:
            java.lang.String r7 = "reactionAction"
            org.json.JSONObject r5 = r5.optJSONObject(r7)     // Catch:{ all -> 0x008c }
            if (r5 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            java.lang.String r7 = r5.optString(r8)     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x0081
            ox4 r9 = new ox4     // Catch:{ all -> 0x008c }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x008c }
        L_0x0081:
            r6.<init>(r0, r11, r9)     // Catch:{ all -> 0x008c }
            if (r11 != 0) goto L_0x0088
            if (r9 == 0) goto L_0x0040
        L_0x0088:
            r3.put(r0, r6)     // Catch:{ all -> 0x008c }
            goto L_0x0040
        L_0x008c:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0040
        L_0x0091:
            r1.<init>()
            r3.size()
            return r1
        L_0x0098:
            bc7[] r0 = defpackage.b6c.B0
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x009d:
            android.view.animation.PathInterpolator r1 = new android.view.animation.PathInterpolator
            r2 = 0
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r1.<init>(r2, r2, r3, r0)
            return r1
        L_0x00a7:
            ejb r0 = new ejb
            r0.<init>()
            return r0
        L_0x00ad:
            gcb r0 = new gcb
            r0.<init>()
            return r0
        L_0x00b3:
            zcb r0 = new zcb
            r0.<init>()
            return r0
        L_0x00b9:
            bc7[] r0 = one.me.profile.ProfileScreen.D0
            wuc r0 = defpackage.wuc.CHAT_INFO
            return r0
        L_0x00be:
            bc7[] r0 = one.me.profile.screens.invite.ProfileInviteScreen.Y
            wuc r0 = defpackage.wuc.CHAT_INFO_INVITE_LINK
            return r0
        L_0x00c3:
            neb r0 = defpackage.neb.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<dfb> r1 = defpackage.dfb.class
            java.lang.Object r0 = r0.c(r1)
            dfb r0 = (defpackage.dfb) r0
            return r0
        L_0x00d2:
            bc7[] r0 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.x0
            neb r0 = defpackage.neb.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<qe5> r1 = defpackage.qe5.class
            khe r0 = r0.d(r1)
            java.lang.Object r0 = r0.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            boolean r0 = r0.t()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00f1:
            mge r0 = new mge
            r0.<init>(r1)
            return r0
        L_0x00f7:
            mge r0 = new mge
            r0.<init>(r1)
            return r0
        L_0x00fd:
            l7a r0 = new l7a
            int r3 = defpackage.wea.K0
            int r1 = defpackage.yea.s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 32
            r2 = r0
            r2.<init>((int) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (java.lang.Integer) r7, (int) r8)
            return r0
        L_0x0120:
            l7a r0 = new l7a
            int r10 = defpackage.wea.L0
            int r1 = defpackage.yea.t
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r15 = 32
            r9 = r0
            r9.<init>((int) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (int) r15)
            return r0
        L_0x0143:
            l7a r0 = new l7a
            int r2 = defpackage.wea.I0
            int r1 = defpackage.yea.q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.e0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r7 = 32
            r1 = r0
            r1.<init>((int) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (int) r7)
            return r0
        L_0x0166:
            l7a r0 = new l7a
            int r9 = defpackage.wea.Q0
            int r1 = defpackage.yea.y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.p1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 32
            r8 = r0
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            return r0
        L_0x0189:
            l7a r0 = new l7a
            int r2 = defpackage.wea.P0
            int r1 = defpackage.yea.x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.N0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r6 = 0
            r7 = 52
            r1 = r0
            r1.<init>((int) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (int) r7)
            return r0
        L_0x01a2:
            l7a r0 = new l7a
            int r9 = defpackage.wea.J0
            int r1 = defpackage.yea.r
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.C0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11 = 0
            r13 = 0
            r14 = 52
            r8 = r0
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            return r0
        L_0x01bb:
            kl7 r0 = defpackage.j1e.l()
            tt3 r7 = new tt3
            int r2 = defpackage.wea.a1
            int r1 = defpackage.yea.E2
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.B1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 20
            r5 = 0
            r1 = r7
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            r0.add(r7)
            tt3 r1 = new tt3
            int r9 = defpackage.wea.Z0
            int r2 = defpackage.yea.D2
            eqe r10 = new eqe
            r10.<init>(r2)
            int r2 = defpackage.woc.o2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r13 = 20
            r12 = 0
            r8 = r1
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            r0.add(r1)
            tt3 r1 = new tt3
            int r3 = defpackage.wea.b1
            int r2 = defpackage.yea.F2
            eqe r4 = new eqe
            r4.<init>(r2)
            int r2 = defpackage.woc.A1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r7 = 20
            r6 = 0
            r2 = r1
            r2.<init>((int) r3, (defpackage.jqe) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (int) r7)
            r0.add(r1)
            tt3 r1 = new tt3
            int r9 = defpackage.wea.Y0
            int r2 = defpackage.yea.C2
            eqe r10 = new eqe
            r10.<init>(r2)
            int r2 = defpackage.woc.q
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r13 = 20
            r12 = 0
            r8 = r1
            r8.<init>((int) r9, (defpackage.jqe) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            r0.add(r1)
            kl7 r0 = defpackage.j1e.d(r0)
            return r0
        L_0x0230:
            tt3 r0 = new tt3
            int r2 = defpackage.wea.s0
            int r1 = defpackage.yea.X1
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6)
            return r0
        L_0x0252:
            l7a r0 = new l7a
            int r8 = defpackage.wea.N0
            int r1 = defpackage.yea.z
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.C
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r13 = 32
            r7 = r0
            r7.<init>((int) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (int) r13)
            return r0
        L_0x0275:
            l7a r0 = new l7a
            int r2 = defpackage.wea.N0
            int r1 = defpackage.yea.v
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.C
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r7 = 32
            r1 = r0
            r1.<init>((int) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (int) r7)
            return r0
        L_0x0298:
            l7a r0 = new l7a
            int r9 = defpackage.wea.O0
            int r1 = defpackage.yea.w
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.C
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 32
            r8 = r0
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            return r0
        L_0x02bb:
            l7a r0 = new l7a
            int r2 = defpackage.wea.M0
            int r1 = defpackage.yea.u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r7 = 32
            r1 = r0
            r1.<init>((int) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (int) r7)
            return r0
        L_0x02de:
            l7a r0 = new l7a
            int r9 = defpackage.wea.H0
            int r1 = defpackage.yea.p
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11 = 0
            r13 = 0
            r14 = 52
            r8 = r0
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            return r0
        L_0x02f7:
            mg3 r0 = new mg3
            int r2 = defpackage.wea.y
            int r3 = defpackage.yea.X
            eqe r4 = new eqe
            r4.<init>(r3)
            r3 = 3
            r0.<init>(r2, r4, r3, r1)
            return r0
        L_0x0307:
            n1d r0 = new n1d
            xcb r1 = defpackage.xcb.a
            v4 r2 = r1.getAccessor()
            java.lang.Class<ida> r3 = defpackage.ida.class
            khe r2 = r2.d(r3)
            v4 r3 = r1.getAccessor()
            java.lang.Class<zua> r4 = defpackage.zua.class
            khe r3 = r3.d(r4)
            je7 r4 = r1.d()
            v4 r1 = r1.getAccessor()
            java.lang.Class<y7d> r5 = defpackage.y7d.class
            khe r1 = r1.d(r5)
            r0.<init>(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lab.invoke():java.lang.Object");
    }
}
