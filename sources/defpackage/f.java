package defpackage;

/* renamed from: f  reason: default package */
public final /* synthetic */ class f extends p66 implements m56 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v16, types: [znc] */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (((defpackage.z2e) r2).b == ((defpackage.k7e) r7.getValue()).a) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0537, code lost:
        if (r4.longValue() != ((defpackage.hyc) ((defpackage.q33) r0.s0.getValue())).t()) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r9.a == ((defpackage.k7e) r7.getValue()).a) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x056e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = -1
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x06a7;
                case 1: goto L_0x0622;
                case 2: goto L_0x05a6;
                case 3: goto L_0x0590;
                case 4: goto L_0x0582;
                case 5: goto L_0x0574;
                case 6: goto L_0x050b;
                case 7: goto L_0x04a7;
                case 8: goto L_0x0497;
                case 9: goto L_0x0487;
                case 10: goto L_0x03d6;
                case 11: goto L_0x03c6;
                case 12: goto L_0x03b6;
                case 13: goto L_0x0307;
                case 14: goto L_0x02e8;
                case 15: goto L_0x02d2;
                case 16: goto L_0x02bc;
                case 17: goto L_0x02a6;
                case 18: goto L_0x027f;
                case 19: goto L_0x0268;
                case 20: goto L_0x0241;
                case 21: goto L_0x022a;
                case 22: goto L_0x018e;
                case 23: goto L_0x012e;
                case 24: goto L_0x0120;
                case 25: goto L_0x0110;
                case 26: goto L_0x0102;
                case 27: goto L_0x00f4;
                case 28: goto L_0x009f;
                default: goto L_0x000c;
            }
        L_0x000c:
            r2 = r21
            ol7 r2 = (defpackage.ol7) r2
            java.lang.Object r0 = r0.receiver
            b8e r0 = (defpackage.b8e) r0
            r0.getClass()
            if (r2 == 0) goto L_0x009c
            boolean r6 = r2 instanceof defpackage.z2e
            if (r6 != 0) goto L_0x0021
            boolean r7 = r2 instanceof defpackage.w3e
            if (r7 == 0) goto L_0x009c
        L_0x0021:
            q0e r7 = r0.w0
            if (r6 == 0) goto L_0x0038
            r8 = r2
            z2e r8 = (defpackage.z2e) r8
            java.lang.Object r9 = r7.getValue()
            k7e r9 = (defpackage.k7e) r9
            long r9 = r9.a
            long r11 = r8.b
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0038
            goto L_0x009c
        L_0x0038:
            boolean r8 = r2 instanceof defpackage.w3e
            if (r8 == 0) goto L_0x0053
            r9 = r2
            w3e r9 = (defpackage.w3e) r9
            r10 = 5
            int r11 = r9.Y
            if (r11 != r10) goto L_0x009c
            java.lang.Object r10 = r7.getValue()
            k7e r10 = (defpackage.k7e) r10
            long r10 = r10.a
            long r12 = r9.a
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0053
            goto L_0x009c
        L_0x0053:
            if (r8 == 0) goto L_0x005a
            w3e r2 = (defpackage.w3e) r2
            long r8 = r2.a
            goto L_0x0064
        L_0x005a:
            if (r6 == 0) goto L_0x005f
            z2e r2 = (defpackage.z2e) r2
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            if (r2 == 0) goto L_0x009c
            long r8 = r2.b
        L_0x0064:
            w7c r2 = r0.u0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            l7e r2 = (defpackage.l7e) r2
            java.util.List r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0074:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x008c
            java.lang.Object r6 = r2.next()
            e02 r6 = (defpackage.e02) r6
            w3e r6 = r6.b
            long r10 = r6.a
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x008a
            r14 = r3
            goto L_0x008d
        L_0x008a:
            int r3 = r3 + r5
            goto L_0x0074
        L_0x008c:
            r14 = r1
        L_0x008d:
            k7e r1 = new k7e
            r13 = 0
            r15 = 2
            r10 = r1
            r11 = r8
            r10.<init>(r11, r13, r14, r15)
            r7.m(r4, r1)
            r0.t(r8, r4)
        L_0x009c:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x009f:
            r6 = r21
            ol7 r6 = (defpackage.ol7) r6
            java.lang.Object r0 = r0.receiver
            az4 r0 = (defpackage.az4) r0
            r0.getClass()
            if (r6 == 0) goto L_0x00f1
            boolean r7 = r6 instanceof defpackage.qx4
            if (r7 == 0) goto L_0x00f1
            qx4 r6 = (defpackage.qx4) r6
            q0e r7 = r0.Y
            java.lang.Object r8 = r7.getValue()
            yy4 r8 = (defpackage.yy4) r8
            int r8 = r8.a
            int r6 = r6.a
            if (r6 != r8) goto L_0x00c1
            goto L_0x00f1
        L_0x00c1:
            w7c r8 = r0.u0
            j0e r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            xy4 r8 = (defpackage.xy4) r8
            java.util.List r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
            r9 = r3
        L_0x00d2:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r10 = r8.next()
            d02 r10 = (defpackage.d02) r10
            int r10 = r10.a
            if (r10 != r6) goto L_0x00e4
            r1 = r9
            goto L_0x00e6
        L_0x00e4:
            int r9 = r9 + r5
            goto L_0x00d2
        L_0x00e6:
            yy4 r5 = new yy4
            r5.<init>(r6, r3, r1, r2)
            r7.m(r4, r5)
            r0.r(r6, r4)
        L_0x00f1:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00f4:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            k87 r0 = (defpackage.k87) r0
            r0.d(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0102:
            r1 = r21
            x47 r1 = (defpackage.x47) r1
            java.lang.Object r0 = r0.receiver
            b57 r0 = (defpackage.b57) r0
            r0.A(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0110:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            o7d r0 = (defpackage.o7d) r0
            oo6 r0 = r0.a
            r0.s(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0120:
            r1 = r21
            rd6 r1 = (defpackage.rd6) r1
            java.lang.Object r0 = r0.receiver
            qd6 r0 = (defpackage.qd6) r0
            r0.J(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x012e:
            r1 = r21
            w9f r1 = (defpackage.w9f) r1
            java.lang.Object r0 = r0.receiver
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = (one.me.folders.pickerfolders.FoldersPickerScreen) r0
            bc7[] r2 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
            r0.getClass()
            int[] r2 = defpackage.qw5.$EnumSwitchMapping$0
            v9f r6 = r1.b
            int r6 = r6.ordinal()
            r2 = r2[r6]
            if (r2 != r5) goto L_0x018b
            yw5 r0 = r0.m0()
            r0.getClass()
            at5 r1 = r1.a
            if (r1 != 0) goto L_0x0153
            goto L_0x018b
        L_0x0153:
            q0e r2 = r0.x0
            java.lang.Object r6 = r2.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = defpackage.x53.G0(r6)
            java.lang.String r1 = r1.a
            boolean r7 = r6.remove(r1)
            if (r7 != 0) goto L_0x016a
            r6.add(r1)
        L_0x016a:
            r2.m(r4, r6)
            java.util.concurrent.atomic.AtomicReference r1 = r0.w0
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x0178
            goto L_0x0182
        L_0x0178:
            java.lang.Object r2 = r2.getValue()
            boolean r1 = r1.equals(r2)
            r3 = r1 ^ 1
        L_0x0182:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            q0e r0 = r0.u0
            r0.m(r4, r1)
        L_0x018b:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x018e:
            r1 = r21
            w9f r1 = (defpackage.w9f) r1
            java.lang.Object r0 = r0.receiver
            one.me.folders.list.FoldersListScreen r0 = (one.me.folders.list.FoldersListScreen) r0
            bc7[] r3 = one.me.folders.list.FoldersListScreen.Z
            r0.getClass()
            v9f r3 = r1.b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0227
            at5 r1 = r1.a
            if (r3 == r5) goto L_0x0206
            if (r3 == r2) goto L_0x01ed
            r6 = 3
            if (r3 != r6) goto L_0x01e7
            iw5 r0 = r0.m0()
            r0.getClass()
            if (r1 != 0) goto L_0x01b6
            goto L_0x01c8
        L_0x01b6:
            kke r3 = r0.c
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            gw5 r6 = new gw5
            r6.<init>(r0, r1, r4)
            kotlinx.coroutines.internal.ContextScope r0 = r0.a
            defpackage.j47.T(r0, r3, r4, r6, r2)
        L_0x01c8:
            xv5 r0 = defpackage.xv5.a
            v4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.e()
            xx6 r0 = (defpackage.xx6) r0
            if (r0 == 0) goto L_0x0227
            wx6 r1 = new wx6
            ux6 r2 = defpackage.ux6.CREATE_FOLDER
            r1.<init>(r2, r5)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            wuc r2 = defpackage.wuc.SETTINGS_FOLDERS
            r0.f(r1, r2)
            goto L_0x0227
        L_0x01e7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ed:
            iw5 r0 = r0.m0()
            r0.getClass()
            bv5 r1 = defpackage.bv5.c
            r1.getClass()
            c64 r1 = new c64
            java.lang.String r2 = ":settings/folder/create"
            r1.<init>(r2)
            s35 r0 = r0.Z
            defpackage.pnf.o(r0, r1)
            goto L_0x0227
        L_0x0206:
            iw5 r0 = r0.m0()
            r0.getClass()
            if (r1 != 0) goto L_0x0210
            goto L_0x0227
        L_0x0210:
            bv5 r2 = defpackage.bv5.c
            r2.getClass()
            java.lang.String r2 = ":settings/folder/edit?id="
            java.lang.String r1 = r1.a
            java.lang.String r1 = r2.concat(r1)
            c64 r2 = new c64
            r2.<init>(r1)
            s35 r0 = r0.Z
            defpackage.pnf.o(r0, r2)
        L_0x0227:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x022a:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            ib5 r0 = (defpackage.ib5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            nx2 r0 = r0.p0()
            r0.v()
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0241:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            ib5 r0 = (defpackage.ib5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            nx2 r0 = r0.p0()
            kotlinx.coroutines.internal.ContextScope r1 = r0.a
            kke r3 = r0.Y
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            nw2 r7 = new nw2
            r7.<init>(r0, r5, r4)
            defpackage.j47.T(r1, r3, r4, r7, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0268:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            ib5 r0 = (defpackage.ib5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            nx2 r0 = r0.p0()
            r0.v()
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x027f:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            ib5 r0 = (defpackage.ib5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            nx2 r0 = r0.p0()
            kotlinx.coroutines.internal.ContextScope r1 = r0.a
            kke r3 = r0.Y
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            nw2 r7 = new nw2
            r7.<init>(r0, r5, r4)
            defpackage.j47.T(r1, r3, r4, r7, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02a6:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "web_app:ssl_check"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02bc:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "app.enable_in_app_review_not_from_market_build"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02d2:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "app.disable_in_app_review_time_condition"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02e8:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            rx2 r0 = (defpackage.rx2) r0
            r0.getClass()
            gy2 r2 = defpackage.gy2.c
            r8 = 0
            r9 = 0
            java.lang.String r5 = "local"
            r6 = 0
            r7 = 0
            r10 = 124(0x7c, float:1.74E-43)
            defpackage.gy2.b2(r2, r3, r5, r6, r7, r8, r9, r10)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0307:
            r1 = r21
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            bc7[] r2 = one.me.chatmedia.viewer.ChatMediaViewerScreen.K0
            ck2 r2 = r0.D0()
            sb8 r3 = r2.x()
            boolean r4 = r3 instanceof defpackage.jb8
            if (r4 == 0) goto L_0x0320
            int r4 = defpackage.l8a.d
            goto L_0x0326
        L_0x0320:
            boolean r4 = r3 instanceof defpackage.qb8
            if (r4 == 0) goto L_0x038f
            int r4 = defpackage.l8a.e
        L_0x0326:
            kl7 r6 = defpackage.j1e.l()
            tt3 r13 = new tt3
            int r8 = defpackage.k8a.m
            int r7 = defpackage.l8a.g
            eqe r9 = new eqe
            r9.<init>(r7)
            int r7 = defpackage.yfa.y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12 = 20
            r11 = 0
            r7 = r13
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            r6.add(r13)
            tt3 r7 = new tt3
            int r15 = defpackage.k8a.k
            int r8 = defpackage.l8a.f
            eqe r9 = new eqe
            r9.<init>(r8)
            int r8 = defpackage.woc.l1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            r19 = 20
            r18 = 0
            r14 = r7
            r16 = r9
            r14.<init>((int) r15, (defpackage.jqe) r16, (java.lang.Integer) r17, (java.lang.Integer) r18, (int) r19)
            r6.add(r7)
            long r7 = r3.i()
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x038a
            boolean r2 = r2.Y
            if (r2 != 0) goto L_0x038a
            tt3 r2 = new tt3
            int r8 = defpackage.k8a.j
            eqe r9 = new eqe
            r9.<init>(r4)
            int r3 = defpackage.j8a.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r12 = 20
            r11 = 0
            r7 = r2
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            r6.add(r2)
        L_0x038a:
            kl7 r2 = defpackage.j1e.d(r6)
            goto L_0x0391
        L_0x038f:
            nz4 r2 = defpackage.nz4.a
        L_0x0391:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0398
            goto L_0x03b3
        L_0x0398:
            qt3 r3 = defpackage.dy7.c(r5)
            qt3 r2 = r3.I(r2)
            qt3 r1 = r2.Y(r1)
            qt3 r1 = r1.s()
            qt3 r1 = r1.y()
            rt3 r1 = r1.build()
            r1.q(r0)
        L_0x03b3:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x03b6:
            r1 = r21
            xm8 r1 = (defpackage.xm8) r1
            java.lang.Object r0 = r0.receiver
            mf2 r0 = (defpackage.mf2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.p0(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x03c6:
            r1 = r21
            xm8 r1 = (defpackage.xm8) r1
            java.lang.Object r0 = r0.receiver
            mf2 r0 = (defpackage.mf2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.p0(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x03d6:
            r1 = r21
            vm8 r1 = (defpackage.vm8) r1
            java.lang.Object r0 = r0.receiver
            mf2 r0 = (defpackage.mf2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.getClass()
            bc7[] r6 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            iqe r6 = new iqe
            java.lang.String r7 = r1.X
            r6.<init>(r7)
            long r7 = r1.b
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            kpa r8 = new kpa
            java.lang.String r9 = "selected_message_id"
            r8.<init>(r9, r7)
            long r9 = r1.c
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            kpa r9 = new kpa
            java.lang.String r10 = "selected_attach_id"
            r9.<init>(r10, r7)
            kpa[] r7 = new defpackage.kpa[]{r8, r9}
            android.os.Bundle r7 = defpackage.dy7.g(r7)
            r8 = 4
            lg3 r6 = defpackage.od2.a(r6, r7, r8)
            java.lang.CharSequence r1 = r1.Z
            java.lang.String r1 = java.lang.String.valueOf(r1)
            iqe r7 = new iqe
            r7.<init>(r1)
            r6.f(r7)
            mg3 r1 = new mg3
            int r7 = defpackage.wea.a0
            int r8 = defpackage.yea.C1
            eqe r9 = new eqe
            r9.<init>(r8)
            r1.<init>(r7, r9, r2, r3)
            mg3[] r1 = new defpackage.mg3[]{r1}
            r6.a(r1)
            mg3 r1 = new mg3
            int r7 = defpackage.wea.V
            int r8 = defpackage.yea.u1
            eqe r9 = new eqe
            r9.<init>(r8)
            r1.<init>(r7, r9, r2, r3)
            mg3[] r1 = new defpackage.mg3[]{r1}
            r6.a(r1)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r6.e()
            r8.setTargetController(r0)
            r1 = r0
        L_0x0453:
            uu3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x045e
            uu3 r1 = r1.getParentController()
            goto L_0x0453
        L_0x045e:
            boolean r2 = r1 instanceof defpackage.foc
            if (r2 == 0) goto L_0x0465
            foc r1 = (defpackage.foc) r1
            goto L_0x0466
        L_0x0465:
            r1 = r4
        L_0x0466:
            if (r1 == 0) goto L_0x046c
            znc r4 = r1.T()
        L_0x046c:
            r8.z0(r0)
            if (r4 == 0) goto L_0x0484
            coc r0 = new coc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "BottomSheetWidget"
            defpackage.wg0.l(r3, r0, r5, r1)
            r4.G(r0)
        L_0x0484:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0487:
            r1 = r21
            xm8 r1 = (defpackage.xm8) r1
            java.lang.Object r0 = r0.receiver
            mf2 r0 = (defpackage.mf2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.p0(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0497:
            r1 = r21
            xm8 r1 = (defpackage.xm8) r1
            java.lang.Object r0 = r0.receiver
            mf2 r0 = (defpackage.mf2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.p0(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04a7:
            r1 = r21
            c62 r1 = (defpackage.c62) r1
            java.lang.Object r0 = r0.receiver
            w52 r0 = (defpackage.w52) r0
            y52 r0 = r0.a
            x52 r0 = r0.c
            if (r0 == 0) goto L_0x0508
            or r0 = (defpackage.or) r0
            zr r0 = r0.a
            boolean r6 = r0.w()
            if (r6 == 0) goto L_0x04e4
            ze0 r3 = r0.z0
            ze0 r6 = r1.b
            boolean r3 = defpackage.tpa.f(r3, r6)
            if (r3 == 0) goto L_0x04ca
            goto L_0x0508
        L_0x04ca:
            ze0 r3 = r1.b
            r0.z0 = r3
            r0.x()
            kke r3 = r0.v()
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.b()
            xr r6 = new xr
            r6.<init>(r1, r5, r0, r4)
            defpackage.pnf.n(r0, r3, r4, r6, r2)
            goto L_0x0508
        L_0x04e4:
            ze0 r5 = r0.y0
            ze0 r6 = r1.b
            boolean r5 = defpackage.tpa.f(r5, r6)
            if (r5 == 0) goto L_0x04ef
            goto L_0x0508
        L_0x04ef:
            ze0 r5 = r1.b
            r0.y0 = r5
            r0.x()
            kke r5 = r0.v()
            w9a r5 = (defpackage.w9a) r5
            nx3 r5 = r5.b()
            xr r6 = new xr
            r6.<init>(r1, r3, r0, r4)
            defpackage.pnf.n(r0, r5, r4, r6, r2)
        L_0x0508:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x050b:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            u52 r0 = (defpackage.u52) r0
            e52 r6 = r0.q()
            if (r6 == 0) goto L_0x0521
            java.lang.Long r4 = r6.d(r1)
        L_0x0521:
            if (r4 == 0) goto L_0x0539
            je7 r1 = r0.s0
            java.lang.Object r1 = r1.getValue()
            q33 r1 = (defpackage.q33) r1
            hyc r1 = (defpackage.hyc) r1
            long r1 = r1.t()
            long r6 = r4.longValue()
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0545
        L_0x0539:
            e52 r1 = r0.q()
            if (r1 == 0) goto L_0x0547
            boolean r1 = r1.d0()
            if (r1 != r5) goto L_0x0547
        L_0x0545:
            r1 = r5
            goto L_0x0548
        L_0x0547:
            r1 = r3
        L_0x0548:
            je7 r2 = r0.Z
            java.lang.Object r2 = r2.getValue()
            qe5 r2 = (defpackage.qe5) r2
            se5 r2 = (defpackage.se5) r2
            boolean r2 = r2.t()
            if (r2 == 0) goto L_0x055a
            if (r1 == 0) goto L_0x055b
        L_0x055a:
            r3 = r5
        L_0x055b:
            a8g r0 = r0.t0
            if (r3 == 0) goto L_0x056e
            java.lang.Object r0 = r0.o
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            tt3 r0 = (defpackage.tt3) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x0573
        L_0x056e:
            r0.getClass()
            nz4 r0 = defpackage.nz4.a
        L_0x0573:
            return r0
        L_0x0574:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            wr1 r0 = (defpackage.wr1) r0
            defpackage.wr1.a(r0, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0582:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            wr1 r0 = (defpackage.wr1) r0
            defpackage.wr1.a(r0, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0590:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "app.calls_sdk.logging.webrtc"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x05a6:
            r1 = r21
            ic7 r1 = (defpackage.ic7) r1
            java.lang.Object r0 = r0.receiver
            qv0 r0 = (defpackage.qv0) r0
            r0.w0 = r1
            z07 r1 = (defpackage.z07) r1
            java.util.List r1 = r1.a
            java.util.Iterator r1 = r1.iterator()
        L_0x05b8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0613
            java.lang.Object r2 = r1.next()
            lv0 r2 = (defpackage.lv0) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x05c8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x05b8
            java.lang.Object r4 = r2.next()
            r7 = r4
            fv0 r7 = (defpackage.fv0) r7
            java.util.ArrayList r4 = r0.v0
            int r4 = r4.size()
            int r4 = r4 - r5
            if (r3 <= r4) goto L_0x05df
            goto L_0x0613
        L_0x05df:
            java.util.ArrayList r4 = r0.v0
            java.lang.Object r4 = r4.get(r3)
            jq0 r4 = (defpackage.jq0) r4
            fv0 r6 = r4.a
            if (r7 == r6) goto L_0x060f
            java.util.ArrayList r15 = r0.v0
            jq0 r14 = new jq0
            boolean r11 = r4.e
            boolean r12 = r4.f
            a20 r8 = r4.b
            int r9 = r4.c
            boolean r10 = r4.d
            boolean r13 = r4.g
            float[] r6 = r4.h
            r16 = r6
            r6 = r14
            r5 = r14
            r14 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r4 = r4.i
            r5.i = r4
            r15.set(r3, r5)
            r4 = 1
            goto L_0x0610
        L_0x060f:
            r4 = r5
        L_0x0610:
            int r3 = r3 + r4
            r5 = r4
            goto L_0x05c8
        L_0x0613:
            b r1 = new b
            r2 = 20
            r1.<init>((int) r2, (java.lang.Object) r0)
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0622:
            r1 = r21
            aq r1 = (defpackage.aq) r1
            java.lang.Object r0 = r0.receiver
            mr r0 = (defpackage.mr) r0
            zr r0 = r0.a
            aq r5 = r0.D0
            if (r5 != r1) goto L_0x0632
            goto L_0x06a4
        L_0x0632:
            r0.D0 = r1
            v25 r5 = defpackage.aq.X
            java.util.List r5 = defpackage.x53.D0(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.z53.S(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x0649:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0667
            java.lang.Object r7 = r5.next()
            aq r7 = (defpackage.aq) r7
            eq r8 = new eq
            if (r7 != r1) goto L_0x065b
            r9 = 1
            goto L_0x065c
        L_0x065b:
            r9 = r3
        L_0x065c:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.<init>(r7, r9)
            r6.add(r8)
            goto L_0x0649
        L_0x0667:
            q0e r3 = r0.E0
            r3.m(r4, r6)
            int r1 = r1.ordinal()
            qp4 r3 = r0.v0
            jp r4 = r0.c
            if (r1 == 0) goto L_0x0697
            r5 = 1
            if (r1 == r5) goto L_0x068c
            if (r1 != r2) goto L_0x0686
            java.lang.String r1 = "app.night.mode.enabled"
            r4.y(r1)
            dq9 r1 = defpackage.dq9.b
            r3.k(r1)
            goto L_0x06a1
        L_0x0686:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x068c:
            java.lang.String r1 = "app.night.mode"
            r4.y(r1)
            cq9 r1 = defpackage.cq9.b
            r3.k(r1)
            goto L_0x06a1
        L_0x0697:
            java.lang.String r1 = "app.night.mode.system"
            r4.y(r1)
            fq9 r1 = defpackage.fq9.b
            r3.k(r1)
        L_0x06a1:
            r0.x()
        L_0x06a4:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x06a7:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            n r0 = (defpackage.n) r0
            r0.getClass()
            int r2 = one.me.aboutappsettings.AboutAppSettingsScreen.c
            one.me.aboutappsettings.AboutAppSettingsScreen r0 = r0.a
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            v r0 = (defpackage.v) r0
            r0.getClass()
            u r2 = new u
            r2.<init>(r1)
            s35 r0 = r0.c
            defpackage.pnf.o(r0, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.invoke(java.lang.Object):java.lang.Object");
    }
}
