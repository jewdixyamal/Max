package defpackage;

/* renamed from: lq0  reason: default package */
public final /* synthetic */ class lq0 extends v8 implements a66 {
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.s0 = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: mab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: mab} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v3, types: [znc] */
    /* JADX WARNING: type inference failed for: r15v5, types: [znc] */
    /* JADX WARNING: type inference failed for: r15v7, types: [znc] */
    /* JADX WARNING: type inference failed for: r15v9, types: [znc] */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            r25 = this;
            r0 = r25
            qj4 r4 = defpackage.qj4.a
            r5 = 5
            r6 = 67
            r7 = 12
            pia r8 = defpackage.pia.a
            nia r9 = defpackage.nia.a
            java.lang.String r10 = "BottomSheetWidget"
            r11 = 3
            vx3 r12 = defpackage.vx3.b
            r13 = 4
            r14 = 2
            r15 = 0
            r1 = 1
            r2 = 0
            e5f r16 = defpackage.e5f.a
            java.lang.Object r3 = r0.a
            int r0 = r0.s0
            switch(r0) {
                case 0: goto L_0x0c1e;
                case 1: goto L_0x0bd0;
                case 2: goto L_0x0bc0;
                case 3: goto L_0x0bae;
                case 4: goto L_0x0b4c;
                case 5: goto L_0x0a8a;
                case 6: goto L_0x09bb;
                case 7: goto L_0x08f7;
                case 8: goto L_0x08e9;
                case 9: goto L_0x07e9;
                case 10: goto L_0x0799;
                case 11: goto L_0x068c;
                case 12: goto L_0x067e;
                case 13: goto L_0x0670;
                case 14: goto L_0x0630;
                case 15: goto L_0x0603;
                case 16: goto L_0x05f5;
                case 17: goto L_0x05e5;
                case 18: goto L_0x052b;
                case 19: goto L_0x0442;
                case 20: goto L_0x040d;
                case 21: goto L_0x03f5;
                case 22: goto L_0x0240;
                case 23: goto L_0x0230;
                case 24: goto L_0x01a1;
                case 25: goto L_0x0127;
                case 26: goto L_0x00f6;
                case 27: goto L_0x00b9;
                case 28: goto L_0x007c;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = r26
            e52 r0 = (defpackage.e52) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            y0b r3 = (defpackage.y0b) r3
            r3.getClass()
            java.util.concurrent.atomic.AtomicReference r4 = r0.w0
            c52 r5 = new c52
            r5.<init>(r0, r2)
            java.lang.Object r2 = r4.updateAndGet(r5)
            mpa r2 = (defpackage.mpa) r2
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r2.b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0042
        L_0x0041:
            r2 = r15
        L_0x0042:
            boolean r4 = r0.I()
            if (r4 == 0) goto L_0x004c
            boolean r1 = r0.w()
        L_0x004c:
            if (r2 == 0) goto L_0x0074
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0055
            goto L_0x0074
        L_0x0055:
            c1b r4 = new c1b
            es8 r0 = r0.X
            if (r0 == 0) goto L_0x0068
            cu8 r0 = r0.a
            long r5 = r0.b
            iqe r0 = new iqe
            r0.<init>(r2)
            r4.<init>(r5, r0, r1)
            goto L_0x0076
        L_0x0068:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0074:
            b1b r4 = defpackage.b1b.a
        L_0x0076:
            q0e r0 = r3.h
            r0.m(r15, r4)
            return r16
        L_0x007c:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            pza r3 = (defpackage.pza) r3
            bc7[] r4 = one.me.chats.picker.members.PickerMembersListWidget.x0
            if (r0 == 0) goto L_0x00a7
            r3.getClass()
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0094
            goto L_0x00a7
        L_0x0094:
            nza r4 = new nza
            r4.<init>(r3, r0, r15)
            vxd r0 = defpackage.pnf.n(r3, r15, r12, r4, r1)
            bc7[] r1 = defpackage.pza.s0
            r1 = r1[r2]
            w4d r2 = r3.Z
            r2.o1(r3, r1, r0)
            goto L_0x00b8
        L_0x00a7:
            r3.getClass()
            bc7[] r0 = defpackage.pza.s0
            r0 = r0[r2]
            w4d r1 = r3.Z
            r1.o1(r3, r0, r15)
            q0e r0 = r3.Y
            r0.setValue(r15)
        L_0x00b8:
            return r16
        L_0x00b9:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            dza r3 = (defpackage.dza) r3
            bc7[] r4 = one.me.chats.picker.contacts.PickerContactsListWidget.y0
            if (r0 == 0) goto L_0x00e4
            r3.getClass()
            int r4 = r0.length()
            if (r4 != 0) goto L_0x00d1
            goto L_0x00e4
        L_0x00d1:
            bza r4 = new bza
            r4.<init>(r3, r0, r15)
            vxd r0 = defpackage.pnf.n(r3, r15, r12, r4, r1)
            bc7[] r1 = defpackage.dza.Y
            r1 = r1[r2]
            w4d r2 = r3.X
            r2.o1(r3, r1, r0)
            goto L_0x00f5
        L_0x00e4:
            r3.getClass()
            bc7[] r0 = defpackage.dza.Y
            r0 = r0[r2]
            w4d r1 = r3.X
            r1.o1(r3, r0, r15)
            js3 r0 = r3.c
            r0.b()
        L_0x00f5:
            return r16
        L_0x00f6:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            eya r3 = (defpackage.eya) r3
            bc7[] r4 = one.me.chats.picker.chats.PickerChatsListWidget.C0
            if (r0 == 0) goto L_0x0121
            r3.getClass()
            boolean r4 = defpackage.w9e.C0(r0)
            if (r4 == 0) goto L_0x010e
            goto L_0x0121
        L_0x010e:
            xxa r4 = new xxa
            r4.<init>(r3, r0, r15)
            vxd r0 = defpackage.pnf.n(r3, r15, r12, r4, r1)
            bc7[] r1 = defpackage.eya.F0
            r1 = r1[r2]
            w4d r2 = r3.w0
            r2.o1(r3, r1, r0)
            goto L_0x0126
        L_0x0121:
            q0e r0 = r3.A0
            r0.setValue(r15)
        L_0x0126:
            return r16
        L_0x0127:
            r0 = r26
            yf9 r0 = (defpackage.yf9) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kg9 r3 = (defpackage.kg9) r3
            r3.getClass()
            java.util.Set r4 = r0.a
            boolean r4 = r4.isEmpty()
            g39 r5 = r3.d
            androidx.recyclerview.widget.RecyclerView r6 = r3.a
            if (r4 == 0) goto L_0x015f
            c03 r0 = r3.e
            if (r0 == 0) goto L_0x0147
            r6.p0(r0)
        L_0x0147:
            r3.e = r15
            w54 r0 = r3.f
            if (r0 == 0) goto L_0x0150
            r6.r0(r0)
        L_0x0150:
            r3.f = r15
            fg9 r0 = new fg9
            nz4 r1 = defpackage.nz4.a
            r0.<init>(r2, r1)
            q0e r1 = r5.Y
            r1.m(r15, r0)
            goto L_0x01a0
        L_0x015f:
            c03 r4 = r3.e
            if (r4 != 0) goto L_0x018b
            c03 r4 = new c03
            zj7 r8 = new zj7
            r8.<init>(r7, r3)
            ig9 r7 = new ig9
            r7.<init>(r3, r2)
            ig9 r2 = new ig9
            r2.<init>(r3, r1)
            ig9 r1 = new ig9
            r1.<init>(r3, r14)
            r4.<init>(r8, r7, r2, r1)
            r6.j(r4)
            r3.e = r4
            w54 r1 = new w54
            r1.<init>(r6)
            r6.l(r1)
            r3.f = r1
        L_0x018b:
            fg9 r1 = new fg9
            java.util.Set r2 = r0.a
            int r2 = r2.size()
            java.util.List r0 = r0.b
            r1.<init>(r2, r0)
            q0e r0 = r5.Y
            r0.m(r15, r1)
            r6.Y()
        L_0x01a0:
            return r16
        L_0x01a1:
            r0 = r26
            xf9 r0 = (defpackage.xf9) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            jg9 r3 = (defpackage.jg9) r3
            r3.getClass()
            boolean r4 = r0.a
            b5d r5 = r3.d
            androidx.recyclerview.widget.RecyclerView r6 = r3.a
            if (r4 != 0) goto L_0x01d2
            jn3 r0 = r3.e
            if (r0 == 0) goto L_0x01bd
            r6.p0(r0)
        L_0x01bd:
            r3.e = r15
            w54 r0 = r3.f
            if (r0 == 0) goto L_0x01c6
            r6.r0(r0)
        L_0x01c6:
            r3.f = r15
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x022f
            r5.a()
            goto L_0x022f
        L_0x01d2:
            jn3 r4 = r3.e
            if (r4 != 0) goto L_0x01f4
            jn3 r4 = new jn3
            gg9 r7 = new gg9
            r7.<init>(r3, r1)
            hg9 r8 = new hg9
            r8.<init>(r3, r1)
            r4.<init>(r7, r8)
            r6.j(r4)
            r3.e = r4
            w54 r1 = new w54
            r1.<init>(r6)
            r6.l(r1)
            r3.f = r1
        L_0x01f4:
            java.util.Set r1 = r0.b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0207
            android.content.Context r1 = r6.getContext()
            int r4 = defpackage.hja.H
            java.lang.String r1 = r1.getString(r4)
            goto L_0x021d
        L_0x0207:
            android.content.Context r4 = r6.getContext()
            int r7 = defpackage.hja.I
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r4.getString(r7, r1)
        L_0x021d:
            gg9 r4 = new gg9
            r4.<init>(r3, r2)
            hg9 r7 = new hg9
            r7.<init>(r3, r2)
            java.util.List r0 = r0.c
            r5.c(r1, r0, r4, r7)
            r6.Y()
        L_0x022f:
            return r16
        L_0x0230:
            r0 = r26
            java.util.List r0 = (java.util.List) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            mfd r3 = (defpackage.mfd) r3
            bc7[] r1 = one.me.messages.settings.MessagesSettingsScreen.Y
            r3.E(r0)
            return r16
        L_0x0240:
            r0 = r26
            wm9 r0 = (defpackage.wm9) r0
            r2 = r27
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            one.me.messages.list.ui.MessagesListWidget r3 = (one.me.messages.list.ui.MessagesListWidget) r3
            bc7[] r2 = one.me.messages.list.ui.MessagesListWidget.X0
            r3.getClass()
            boolean r2 = r0 instanceof defpackage.c64
            if (r2 == 0) goto L_0x025c
            u29 r1 = defpackage.u29.c
            c64 r0 = (defpackage.c64) r0
            r1.R1(r0)
            goto L_0x03f4
        L_0x025c:
            boolean r2 = r0 instanceof defpackage.gma
            je7 r4 = r3.v0
            if (r2 == 0) goto L_0x0279
            java.lang.Object r2 = r4.getValue()
            rg1 r2 = (defpackage.rg1) r2
            r3 = r0
            gma r3 = (defpackage.gma) r3
            long r4 = r3.b
            rt8 r6 = new rt8
            r6.<init>((defpackage.wm9) r0, (int) r1)
            boolean r0 = r3.c
            r2.l(r4, r0, r6)
            goto L_0x03f4
        L_0x0279:
            boolean r1 = r0 instanceof defpackage.ula
            if (r1 == 0) goto L_0x0294
            java.lang.Object r1 = r4.getValue()
            rg1 r1 = (defpackage.rg1) r1
            r2 = r0
            ula r2 = (defpackage.ula) r2
            java.lang.String r3 = r2.d
            rt8 r4 = new rt8
            r4.<init>((defpackage.wm9) r0, (int) r14)
            boolean r0 = r2.c
            r1.j(r3, true, r0, false, r4)
            goto L_0x03f4
        L_0x0294:
            boolean r1 = r0 instanceof defpackage.hma
            if (r1 == 0) goto L_0x02d7
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.INSERT"
            r1.<init>(r2)
            java.lang.String r2 = "vnd.android.cursor.dir/raw_contact"
            r1.setType(r2)
            hma r0 = (defpackage.hma) r0
            java.lang.String r2 = r0.c
            java.lang.String r4 = "name"
            r1.putExtra(r4, r2)
            java.lang.String r2 = "phone"
            java.lang.String r4 = r0.d
            r1.putExtra(r2, r4)
            android.content.Context r2 = r3.getContext()     // Catch:{ ActivityNotFoundException -> 0x02bd }
            r2.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x02bd }
            goto L_0x03f4
        L_0x02bd:
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r1 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error creating a new contact #"
            r2.<init>(r3)
            long r3 = r0.b
            java.lang.String r0 = " in phonebook"
            java.lang.String r0 = defpackage.zr6.k(r2, r3, r0)
            defpackage.hm9.p(r1, r0, r15)
            goto L_0x03f4
        L_0x02d7:
            boolean r1 = r0 instanceof defpackage.xla
            if (r1 == 0) goto L_0x02e8
            android.content.Context r1 = r3.getContext()
            xla r0 = (defpackage.xla) r0
            java.lang.String r0 = r0.b
            defpackage.nd7.A(r1, r0)
            goto L_0x03f4
        L_0x02e8:
            boolean r1 = r0 instanceof defpackage.yla
            if (r1 == 0) goto L_0x0309
            yla r0 = (defpackage.yla) r0
            android.content.Intent r1 = r0.b
            android.content.Context r2 = r3.getContext()     // Catch:{ Exception -> 0x02f9 }
            r2.startActivity(r1)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x03f4
        L_0x02f9:
            java.lang.String r2 = "*/*"
            android.net.Uri r0 = r0.c
            r1.setDataAndType(r0, r2)
            android.content.Context r0 = r3.getContext()
            r0.startActivity(r1)
            goto L_0x03f4
        L_0x0309:
            boolean r1 = r0 instanceof defpackage.dma
            if (r1 == 0) goto L_0x0336
            u29 r1 = defpackage.u29.c
            dma r0 = (defpackage.dma) r0
            android.os.Parcelable r2 = r0.b
            r1.getClass()
            kpa r3 = new kpa
            java.lang.String r4 = "message"
            r3.<init>(r4, r2)
            kpa[] r2 = new defpackage.kpa[]{r3}
            android.os.Bundle r2 = defpackage.dy7.g(r2)
            f64 r1 = r1.P1()
            java.lang.String r3 = ":attach/fullscreen?attachment_id="
            java.lang.String r0 = r0.c
            java.lang.String r0 = r3.concat(r0)
            r1.b(r0, r2)
            goto L_0x03f4
        L_0x0336:
            boolean r1 = r0 instanceof defpackage.z37
            if (r1 == 0) goto L_0x0355
            o19 r1 = defpackage.o19.a
            v4 r1 = r1.getAccessor()
            java.lang.Class<f64> r2 = defpackage.f64.class
            java.lang.Object r1 = r1.c(r2)
            f64 r1 = (defpackage.f64) r1
            z37 r0 = (defpackage.z37) r0
            java.lang.Object r0 = r0.a
            m64 r0 = (defpackage.m64) r0
            android.net.Uri r0 = r0.a
            r1.c(r0, r15)
            goto L_0x03f4
        L_0x0355:
            boolean r1 = r0 instanceof defpackage.j95
            if (r1 == 0) goto L_0x0379
            u29 r1 = defpackage.u29.c
            j95 r0 = (defpackage.j95) r0
            java.lang.String r0 = r0.b
            f64 r1 = r1.P1()
            kpa r2 = new kpa
            java.lang.String r3 = "params"
            r2.<init>(r3, r0)
            kpa[] r0 = new defpackage.kpa[]{r2}
            android.os.Bundle r0 = defpackage.dy7.g(r0)
            java.lang.String r2 = ":external_callback"
            r1.b(r2, r0)
            goto L_0x03f4
        L_0x0379:
            boolean r1 = r0 instanceof defpackage.ind
            if (r1 == 0) goto L_0x03e1
            u29 r1 = defpackage.u29.c
            ind r0 = (defpackage.ind) r0
            long r2 = r0.b
            r1.getClass()
            java.lang.String r4 = r0.g
            android.net.Uri r4 = android.net.Uri.parse(r4)
            f64 r1 = r1.P1()
            kpa r5 = new kpa
            java.lang.String r6 = "file_url"
            r5.<init>(r6, r4)
            kpa[] r4 = new defpackage.kpa[]{r5}
            android.os.Bundle r4 = defpackage.dy7.g(r4)
            y7g r5 = new y7g
            r6 = 13
            r5.<init>((int) r6)
            java.lang.String r6 = ":dialogs/file-download-warning"
            r5.b = r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "chat_id"
            r5.D(r2, r3)
            long r2 = r0.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "message_id"
            r5.D(r2, r3)
            java.lang.String r2 = r0.d
            if (r2 == 0) goto L_0x03c7
            java.lang.String r3 = "attach_id"
            r5.D(r2, r3)
        L_0x03c7:
            long r2 = r0.e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "file_id"
            r5.D(r2, r3)
            java.lang.String r2 = "file_name"
            java.lang.String r0 = r0.f
            r5.D(r0, r2)
            android.net.Uri r0 = r5.r()
            r1.c(r0, r4)
            goto L_0x03f4
        L_0x03e1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown navigation event "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r3.a
            defpackage.hm9.p(r1, r0, r15)
        L_0x03f4:
            return r16
        L_0x03f5:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            bp8 r3 = (defpackage.bp8) r3
            bc7[] r1 = one.me.members.list.MembersListWidget.D0
            je7 r1 = r3.s0
            java.lang.Object r1 = r1.getValue()
            lp8 r1 = (defpackage.lp8) r1
            r1.a(r0)
            return r16
        L_0x040d:
            r0 = r26
            o35 r0 = (defpackage.o35) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            bc8 r3 = (defpackage.bc8) r3
            r3.getClass()
            boolean r1 = r0 instanceof defpackage.ac8
            if (r1 != 0) goto L_0x041f
            goto L_0x0441
        L_0x041f:
            r1 = r0
            ac8 r1 = (defpackage.ac8) r1
            boolean r4 = r1 instanceof defpackage.wb8
            sv8 r3 = r3.b
            if (r4 == 0) goto L_0x0430
            wb8 r0 = (defpackage.wb8) r0
            java.lang.CharSequence r0 = r0.a
            r3.f(r0)
            goto L_0x0441
        L_0x0430:
            boolean r0 = r1 instanceof defpackage.vb8
            if (r0 == 0) goto L_0x0441
            r3.getClass()
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r2, r6)
            qv8 r1 = r3.c
            r1.dispatchKeyEvent(r0)
        L_0x0441:
            return r16
        L_0x0442:
            r0 = r26
            uy8 r0 = (defpackage.uy8) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.chatscreen.mediabar.MediaBarWidget r3 = (one.me.chatscreen.mediabar.MediaBarWidget) r3
            bc7[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r3.getClass()
            int r0 = r0.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x050f
            if (r0 == r1) goto L_0x0496
            if (r0 == r14) goto L_0x045f
            goto L_0x052a
        L_0x045f:
            tz5 r0 = r3.a1
            r0.getClass()
            one.me.sdk.arch.Widget r0 = r0.b
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            sv8 r0 = r0.w0()
            r0.e(r1)
            sv8 r0 = r3.w0()
            int r2 = defpackage.woc.a1
            r0.setLeftIcon(r2)
            q0e r0 = defpackage.vc7.f
            m58 r2 = new m58
            r2.<init>(r0, r14)
            jp5 r0 = defpackage.od2.Z(r2, r1)
            x58 r1 = new x58
            r1.<init>(r15, r3)
            zn5 r2 = new zn5
            r2.<init>(r0, r1, r5)
            pg7 r0 = r3.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            goto L_0x052a
        L_0x0496:
            znc r0 = r3.v0()
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x04ee
            znc r0 = r3.v0()
            one.me.keyboardmedia.MediaKeyboardWidget r1 = new one.me.keyboardmedia.MediaKeyboardWidget
            android.os.Bundle r4 = r3.getArgs()
            java.lang.String r5 = "scope_id"
            java.lang.Class<suc> r6 = defpackage.suc.class
            java.lang.Object r4 = defpackage.ay7.v(r4, r5, r6)
            if (r4 == 0) goto L_0x04d8
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            suc r4 = (defpackage.suc) r4
            bc7[] r5 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r2 = r5[r2]
            fs r2 = r3.b
            java.lang.Object r2 = r2.a(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            java.lang.String r5 = r4.a
            r8 = 1
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r8, r9)
            coc r1 = defpackage.i24.e(r1, r15, r15)
            r0.R(r1)
            goto L_0x04ee
        L_0x04d8:
            java.lang.String r0 = r6.getSimpleName()
            java.lang.String r1 = "No value passed for key scope_id of type "
            java.lang.String r2 = " in bundle"
            java.lang.String r0 = defpackage.zr6.i(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x04ee:
            android.widget.LinearLayout r0 = r3.r0()
            java.util.WeakHashMap r1 = defpackage.zmf.a
            defpackage.omf.u(r0, r15)
            f6b r0 = r3.x0()
            r0.k()
            hc8 r0 = r3.b1
            if (r0 == 0) goto L_0x0505
            r0.f()
        L_0x0505:
            sv8 r0 = r3.w0()
            int r1 = defpackage.woc.e1
            r0.setLeftIcon(r1)
            goto L_0x052a
        L_0x050f:
            hc8 r0 = r3.b1
            if (r0 == 0) goto L_0x0518
            bc7[] r2 = defpackage.hc8.m
            r0.e(r1)
        L_0x0518:
            sv8 r0 = r3.w0()
            int r1 = defpackage.woc.a1
            r0.setLeftIcon(r1)
            android.widget.LinearLayout r0 = r3.r0()
            x27 r1 = one.me.chatscreen.mediabar.MediaBarWidget.e1
            defpackage.br7.d(r0, r1, r15)
        L_0x052a:
            return r16
        L_0x052b:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            rk7 r3 = (defpackage.rk7) r3
            je7 r4 = r3.o
            java.lang.Object r4 = r4.getValue()
            pk7 r4 = (defpackage.pk7) r4
            r4.getClass()
            int r5 = r0.length()
            if (r5 >= r13) goto L_0x0548
            r2 = r1
            goto L_0x0596
        L_0x0548:
            r5 = 6
            r6 = 32
            int r5 = defpackage.w9e.z0(r0, r6, r2, r2, r5)
            if (r5 < 0) goto L_0x0553
            r2 = r14
            goto L_0x0596
        L_0x0553:
            java.lang.String r5 = "https://"
            boolean r5 = defpackage.eae.o0(r0, r5, r1)
            if (r5 != 0) goto L_0x0565
            java.lang.String r5 = "http://"
            boolean r5 = defpackage.eae.o0(r0, r5, r1)
            if (r5 != 0) goto L_0x0565
            r2 = r13
            goto L_0x0596
        L_0x0565:
            je7 r5 = r4.b
            java.lang.Object r5 = r5.getValue()
            java.util.regex.Pattern r5 = (java.util.regex.Pattern) r5
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x0596
            je7 r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            al r4 = (defpackage.al) r4
            fl7 r4 = (defpackage.fl7) r4
            r4.getClass()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0595
            android.net.Uri r5 = android.net.Uri.parse(r0)
            boolean r4 = r4.d(r5)
            if (r4 == 0) goto L_0x0595
            goto L_0x0596
        L_0x0595:
            r2 = r11
        L_0x0596:
            if (r2 == 0) goto L_0x059e
            nk7 r4 = new nk7
            r4.<init>(r2)
            goto L_0x05a0
        L_0x059e:
            ok7 r4 = defpackage.ok7.a
        L_0x05a0:
            q0e r2 = r3.b
            java.lang.Object r3 = r2.getValue()
            mk7 r3 = (defpackage.mk7) r3
            boolean r5 = r4 instanceof defpackage.nk7
            if (r5 == 0) goto L_0x05d7
            nk7 r4 = (defpackage.nk7) r4
            int[] r5 = defpackage.qk7.$EnumSwitchMapping$0
            int r4 = r4.a
            int r4 = defpackage.au1.s(r4)
            r4 = r5[r4]
            if (r4 == r1) goto L_0x05cf
            if (r4 == r14) goto L_0x05cc
            if (r4 == r11) goto L_0x05c9
            if (r4 != r13) goto L_0x05c3
            int r1 = defpackage.i1c.writebar__add_link_error_not_valid_scheme
            goto L_0x05d1
        L_0x05c3:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c9:
            int r1 = defpackage.i1c.writebar__add_link_error_has_space
            goto L_0x05d1
        L_0x05cc:
            int r1 = defpackage.i1c.writebar__add_link_error_short_link
            goto L_0x05d1
        L_0x05cf:
            int r1 = defpackage.i1c.writebar__add_link_error_not_valid_link
        L_0x05d1:
            eqe r4 = new eqe
            r4.<init>(r1)
            goto L_0x05d9
        L_0x05d7:
            iqe r4 = defpackage.jqe.a
        L_0x05d9:
            r3.getClass()
            mk7 r1 = new mk7
            r1.<init>(r4, r0)
            r2.m(r15, r1)
            return r16
        L_0x05e5:
            r0 = r26
            java.util.List r0 = (java.util.List) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kt5 r3 = (defpackage.kt5) r3
            bc7[] r1 = one.me.folders.edit.FolderEditScreen.s0
            r3.E(r0)
            return r16
        L_0x05f5:
            r0 = r26
            fka r0 = (defpackage.fka) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            t84 r3 = (defpackage.t84) r3
            r3.onThemeChanged(r0)
            return r16
        L_0x0603:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            js3 r3 = (defpackage.js3) r3
            je7 r1 = r3.d
            java.lang.Object r1 = r1.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            is3 r4 = new is3
            r4.<init>(r3, r0, r15)
            sx3 r0 = r3.a
            vxd r0 = defpackage.j47.S(r0, r1, r12, r4)
            bc7[] r1 = defpackage.js3.j
            r1 = r1[r2]
            w4d r2 = r3.f
            r2.o1(r3, r1, r0)
            return r16
        L_0x0630:
            r0 = r26
            qj4 r0 = (defpackage.qj4) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            cq3 r3 = (defpackage.cq3) r3
            r3.getClass()
            boolean r0 = defpackage.tpa.f(r0, r4)
            if (r0 == 0) goto L_0x066a
            uj3 r0 = r3.E()
            if (r0 != 0) goto L_0x064a
            goto L_0x0669
        L_0x064a:
            kpa r0 = r3.D(r0)
            w7c r1 = r3.e
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            mab r1 = (defpackage.mab) r1
            if (r1 == 0) goto L_0x0666
            java.lang.Object r2 = r0.a
            tab r2 = (defpackage.tab) r2
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            mab r15 = defpackage.mab.a(r1, r2, r0, r13)
        L_0x0666:
            r3.f(r15)
        L_0x0669:
            return r16
        L_0x066a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0670:
            r0 = r26
            mab r0 = (defpackage.mab) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            cq3 r3 = (defpackage.cq3) r3
            r3.f(r0)
            return r16
        L_0x067e:
            r0 = r26
            y12 r0 = (defpackage.y12) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            zk3 r3 = (defpackage.zk3) r3
            r3.d(r0)
            return r16
        L_0x068c:
            r0 = r26
            java.lang.String r0 = (java.lang.String) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            gw2 r3 = (defpackage.gw2) r3
            r3.getClass()
            if (r0 == 0) goto L_0x0798
            boolean r4 = defpackage.w9e.C0(r0)
            if (r4 == 0) goto L_0x06a3
            goto L_0x0798
        L_0x06a3:
            yx7 r3 = r3.o
            r3.getClass()
            long r8 = java.lang.System.nanoTime()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = "yx7"
            java.lang.String r10 = "searchChatsAndMessages start"
            defpackage.hm9.H(r6, r10, r4)
            r3.a()
            r3.r = r0
            java.lang.String r4 = r3.s
            boolean r4 = defpackage.oag.t(r4)
            if (r4 != 0) goto L_0x06c5
            java.lang.String r4 = r3.s
            goto L_0x06c6
        L_0x06c5:
            r4 = r15
        L_0x06c6:
            u24 r6 = new u24
            r6.<init>(r3, r5, r0)
            q1a r5 = new q1a
            r5.<init>(r14, r6)
            kp7 r6 = new kp7
            r10 = 9
            r6.<init>(r10)
            frd r10 = new frd
            r10.<init>(r5, r6, r15)
            kp7 r5 = new kp7
            r6 = 10
            r5.<init>(r6)
            uqd r5 = r10.h(r5)
            ztc r6 = r3.c
            drd r5 = r5.m(r6)
            rx7 r10 = new rx7
            r10.<init>(r3, r2)
            rqd r12 = new rqd
            r12.<init>(r5, r10, r2)
            drd r5 = r3.e(r0)
            kp7 r10 = new kp7
            r13 = 11
            r10.<init>(r13)
            uqd r5 = r5.h(r10)
            r3.c()
            au r10 = new au
            r10.<init>((java.lang.String) r0, (java.lang.String) r4)
            mle r4 = r3.d
            tle r4 = (defpackage.tle) r4
            r4.getClass()
            ypc r13 = new ypc
            r7 = 9
            r13.<init>(r4, r7, r10)
            q1a r4 = new q1a
            r4.<init>(r1, r13)
            drd r4 = r4.i(r6)
            rx7 r7 = new rx7
            r7.<init>(r3, r11)
            uqd r4 = r4.h(r7)
            kp7 r7 = new kp7
            r10 = 7
            r7.<init>(r10)
            frd r10 = new frd
            r10.<init>(r4, r7, r15)
            kp7 r4 = new kp7
            r7 = 8
            r4.<init>(r7)
            uqd r4 = r10.h(r4)
            drd r4 = r4.m(r6)
            iqd[] r7 = new defpackage.iqd[r11]
            r7[r2] = r12
            r7[r1] = r5
            r7[r14] = r4
            wq5 r2 = defpackage.wq5.a(r7)
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r5 = "maxConcurrency"
            defpackage.hm9.j0(r4, r5)
            lr5 r4 = new lr5
            r4.<init>(r2)
            vx7 r2 = new vx7
            long r10 = r3.h
            r2.<init>(r10)
            kp7 r5 = new kp7
            r7 = 12
            r5.<init>(r7)
            t66 r7 = new t66
            r7.<init>(r2)
            yq5 r2 = new yq5
            r2.<init>(r4, r7, r5, r14)
            cs5 r10 = new cs5
            r10.<init>(r2, r6, r1)
            tx7 r2 = new tx7
            r11 = 0
            r4 = r2
            r5 = r3
            r6 = r8
            r8 = r0
            r9 = r11
            r4.<init>(r5, r6, r8, r9)
            sx7 r4 = new sx7
            r4.<init>(r3, r0, r1)
            td7 r0 = new td7
            r0.<init>(r2, r4)
            r10.c(r0)
            r3.j = r0
        L_0x0798:
            return r16
        L_0x0799:
            r0 = r26
            w9 r0 = (defpackage.w9) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.chatscreen.ChatScreen r3 = (one.me.chatscreen.ChatScreen) r3
            bc7[] r4 = one.me.chatscreen.ChatScreen.k1
            r3.getClass()
            bc7[] r4 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r4 = new one.me.sdk.messagewrite.markdown.AddLinkBottomSheet
            java.lang.String r5 = r3.L0
            r4.<init>(r5, r0, r15)
            r4.setTargetController(r3)
        L_0x07b4:
            uu3 r0 = r3.getParentController()
            if (r0 == 0) goto L_0x07bf
            uu3 r3 = r3.getParentController()
            goto L_0x07b4
        L_0x07bf:
            boolean r0 = r3 instanceof defpackage.foc
            if (r0 == 0) goto L_0x07c6
            foc r3 = (defpackage.foc) r3
            goto L_0x07c7
        L_0x07c6:
            r3 = r15
        L_0x07c7:
            if (r3 == 0) goto L_0x07cd
            znc r15 = r3.T()
        L_0x07cd:
            if (r15 == 0) goto L_0x07e8
            coc r0 = new coc
            r20 = 0
            r23 = -1
            r19 = 0
            r21 = 0
            r22 = 0
            r17 = r0
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            defpackage.wg0.l(r2, r0, r1, r10)
            r15.G(r0)
        L_0x07e8:
            return r16
        L_0x07e9:
            r0 = r26
            o35 r0 = (defpackage.o35) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.chatscreen.ChatScreen r3 = (one.me.chatscreen.ChatScreen) r3
            bc7[] r4 = one.me.chatscreen.ChatScreen.k1
            r3.getClass()
            boolean r4 = r0 instanceof defpackage.ac8
            if (r4 == 0) goto L_0x08e8
            w12 r4 = r3.E0()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0808
            goto L_0x08e8
        L_0x0808:
            r4 = r0
            ac8 r4 = (defpackage.ac8) r4
            boolean r5 = r4 instanceof defpackage.wb8
            if (r5 == 0) goto L_0x0822
            one.me.sdk.messagewrite.MessageWriteWidget r1 = r3.G0()
            if (r1 == 0) goto L_0x08e8
            wb8 r0 = (defpackage.wb8) r0
            java.lang.CharSequence r0 = r0.a
            sv8 r1 = r1.q0()
            r1.f(r0)
            goto L_0x08e8
        L_0x0822:
            boolean r5 = r4 instanceof defpackage.xb8
            if (r5 == 0) goto L_0x083c
            xb8 r0 = (defpackage.xb8) r0
            bd7 r0 = r0.a
            bd7 r1 = defpackage.bd7.Z
            if (r0 != r1) goto L_0x0831
            iv8 r0 = defpackage.iv8.a
            goto L_0x0833
        L_0x0831:
            iv8 r0 = defpackage.iv8.c
        L_0x0833:
            xz8 r1 = r3.F0()
            r1.A(r13, r0)
            goto L_0x08e8
        L_0x083c:
            boolean r5 = r4 instanceof defpackage.vb8
            if (r5 == 0) goto L_0x0859
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r3.G0()
            if (r0 == 0) goto L_0x08e8
            sv8 r0 = r0.q0()
            r0.getClass()
            android.view.KeyEvent r1 = new android.view.KeyEvent
            r1.<init>(r2, r6)
            qv8 r0 = r0.c
            r0.dispatchKeyEvent(r1)
            goto L_0x08e8
        L_0x0859:
            boolean r2 = r4 instanceof defpackage.zb8
            if (r2 == 0) goto L_0x08bb
            rq2 r2 = r3.P0()
            zb8 r0 = (defpackage.zb8) r0
            long r8 = r0.a
            xz8 r0 = r3.F0()
            java.lang.Long r7 = r0.w()
            kke r0 = r2.u()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            bq2 r4 = new bq2
            r10 = 0
            r5 = r4
            r6 = r2
            r5.<init>(r6, r7, r8, r10)
            kotlinx.coroutines.internal.ContextScope r5 = r2.a
            vxd r0 = defpackage.j47.S(r5, r0, r12, r4)
            bc7[] r4 = defpackage.rq2.f1
            r4 = r4[r1]
            w4d r5 = r2.M0
            r5.o1(r2, r4, r0)
            xz8 r0 = r3.F0()
            r0.D(r15)
            je7 r0 = r3.h1
            java.lang.Object r0 = r0.getValue()
            xx6 r0 = (defpackage.xx6) r0
            if (r0 == 0) goto L_0x08e8
            wx6 r2 = new wx6
            ux6 r3 = defpackage.ux6.SEND_3_STICKERS
            r2.<init>(r3, r1)
            wx6 r3 = new wx6
            ux6 r4 = defpackage.ux6.SEND_5_MESSAGES
            r3.<init>(r4, r1)
            wx6[] r1 = new defpackage.wx6[]{r2, r3}
            java.util.Set r1 = defpackage.bcd.a0(r1)
            wuc r2 = defpackage.wuc.CHAT
            r0.f(r1, r2)
            goto L_0x08e8
        L_0x08bb:
            boolean r0 = r4 instanceof defpackage.yb8
            if (r0 == 0) goto L_0x08e2
            rq2 r0 = r3.P0()
            kke r1 = r0.u()
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.a()
            cq2 r2 = new cq2
            r2.<init>(r0, r15)
            kotlinx.coroutines.internal.ContextScope r3 = r0.a
            vxd r1 = defpackage.j47.S(r3, r1, r12, r2)
            bc7[] r2 = defpackage.rq2.f1
            r2 = r2[r14]
            w4d r3 = r0.N0
            r3.o1(r0, r2, r1)
            goto L_0x08e8
        L_0x08e2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x08e8:
            return r16
        L_0x08e9:
            r0 = r26
            mab r0 = (defpackage.mab) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            cn2 r3 = (defpackage.cn2) r3
            r3.f(r0)
            return r16
        L_0x08f7:
            r0 = r26
            ijb r0 = (defpackage.ijb) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.profile.screens.members.ChatMembersScreen r3 = (one.me.profile.screens.members.ChatMembersScreen) r3
            bc7[] r4 = one.me.profile.screens.members.ChatMembersScreen.u0
            r3.getClass()
            boolean r4 = r0 instanceof defpackage.gjb
            if (r4 == 0) goto L_0x092e
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            r1.e(r9)
            gjb r0 = (defpackage.gjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.f(r8)
            v02 r0 = new v02
            r2 = 11
            r0.<init>(r2, r3)
            r1.d(r0)
            vha r0 = r1.i()
            r3.t0 = r0
            goto L_0x09b4
        L_0x092e:
            boolean r4 = r0 instanceof defpackage.fjb
            if (r4 == 0) goto L_0x0997
            bc7[] r4 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            fjb r0 = (defpackage.fjb) r0
            jqe r4 = r0.a
            android.os.Bundle r5 = r0.d
            lg3 r4 = defpackage.od2.a(r4, r5, r13)
            jqe r5 = r0.b
            r4.f(r5)
            mg3[] r5 = new defpackage.mg3[r2]
            java.util.List r0 = r0.c
            java.lang.Object[] r0 = r0.toArray(r5)
            mg3[] r0 = (defpackage.mg3[]) r0
            int r5 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            mg3[] r0 = (defpackage.mg3[]) r0
            r4.a(r0)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r0 = r4.e()
            r0.setTargetController(r3)
            r4 = r3
        L_0x095f:
            uu3 r5 = r4.getParentController()
            if (r5 == 0) goto L_0x096a
            uu3 r4 = r4.getParentController()
            goto L_0x095f
        L_0x096a:
            boolean r5 = r4 instanceof defpackage.foc
            if (r5 == 0) goto L_0x0971
            foc r4 = (defpackage.foc) r4
            goto L_0x0972
        L_0x0971:
            r4 = r15
        L_0x0972:
            if (r4 == 0) goto L_0x0978
            znc r15 = r4.T()
        L_0x0978:
            r0.z0(r3)
            if (r15 == 0) goto L_0x09b4
            coc r3 = new coc
            r20 = 0
            r23 = -1
            r19 = 0
            r21 = 0
            r22 = 0
            r17 = r3
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            defpackage.wg0.l(r2, r3, r1, r10)
            r15.G(r3)
            goto L_0x09b4
        L_0x0997:
            boolean r1 = r0 instanceof defpackage.hjb
            if (r1 == 0) goto L_0x09b5
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            kia r2 = new kia
            int r3 = defpackage.woc.n
            r2.<init>(r3)
            r1.e(r2)
            hjb r0 = (defpackage.hjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.i()
        L_0x09b4:
            return r16
        L_0x09b5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x09bb:
            r0 = r26
            ijb r0 = (defpackage.ijb) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.profile.screens.members.compact.ChatMembersCompactWidget r3 = (one.me.profile.screens.members.compact.ChatMembersCompactWidget) r3
            bc7[] r4 = one.me.profile.screens.members.compact.ChatMembersCompactWidget.Z
            r3.getClass()
            boolean r4 = r0 instanceof defpackage.gjb
            if (r4 == 0) goto L_0x09f2
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            r1.e(r9)
            gjb r0 = (defpackage.gjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.f(r8)
            v02 r0 = new v02
            r2 = 10
            r0.<init>(r2, r3)
            r1.d(r0)
            vha r0 = r1.i()
            r3.o = r0
            goto L_0x0a83
        L_0x09f2:
            boolean r4 = r0 instanceof defpackage.fjb
            if (r4 == 0) goto L_0x0a66
            bc7[] r4 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            fjb r0 = (defpackage.fjb) r0
            jqe r4 = r0.a
            android.os.Bundle r5 = r0.d
            lg3 r4 = defpackage.od2.a(r4, r5, r13)
            jqe r5 = r0.b
            r4.f(r5)
            jk2 r5 = new jk2
            java.lang.String r22 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r23 = 8
            r18 = 1
            java.lang.Class<lg3> r20 = defpackage.lg3.class
            java.lang.String r21 = "addButton"
            r24 = 0
            r17 = r5
            r19 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            hk2 r6 = new hk2
            r6.<init>(r5, r2)
            java.util.List r0 = r0.c
            r0.forEach(r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r0 = r4.e()
            r0.setTargetController(r3)
            r4 = r3
        L_0x0a2e:
            uu3 r5 = r4.getParentController()
            if (r5 == 0) goto L_0x0a39
            uu3 r4 = r4.getParentController()
            goto L_0x0a2e
        L_0x0a39:
            boolean r5 = r4 instanceof defpackage.foc
            if (r5 == 0) goto L_0x0a40
            foc r4 = (defpackage.foc) r4
            goto L_0x0a41
        L_0x0a40:
            r4 = r15
        L_0x0a41:
            if (r4 == 0) goto L_0x0a47
            znc r15 = r4.T()
        L_0x0a47:
            r0.z0(r3)
            if (r15 == 0) goto L_0x0a83
            coc r3 = new coc
            r20 = 0
            r23 = -1
            r19 = 0
            r21 = 0
            r22 = 0
            r17 = r3
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            defpackage.wg0.l(r2, r3, r1, r10)
            r15.G(r3)
            goto L_0x0a83
        L_0x0a66:
            boolean r1 = r0 instanceof defpackage.hjb
            if (r1 == 0) goto L_0x0a84
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            kia r2 = new kia
            int r3 = defpackage.woc.n
            r2.<init>(r3)
            r1.e(r2)
            hjb r0 = (defpackage.hjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.i()
        L_0x0a83:
            return r16
        L_0x0a84:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0a8a:
            r0 = r26
            ijb r0 = (defpackage.ijb) r0
            r4 = r27
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            one.me.profile.screens.members.ChatAdminsScreen r3 = (one.me.profile.screens.members.ChatAdminsScreen) r3
            bc7[] r4 = one.me.profile.screens.members.ChatAdminsScreen.w0
            r3.getClass()
            boolean r4 = r0 instanceof defpackage.gjb
            if (r4 == 0) goto L_0x0abf
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            r1.e(r9)
            gjb r0 = (defpackage.gjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.f(r8)
            v02 r0 = new v02
            r0.<init>(r11, r3)
            r1.d(r0)
            vha r0 = r1.i()
            r3.u0 = r0
            goto L_0x0b45
        L_0x0abf:
            boolean r4 = r0 instanceof defpackage.fjb
            if (r4 == 0) goto L_0x0b28
            bc7[] r4 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            fjb r0 = (defpackage.fjb) r0
            jqe r4 = r0.a
            android.os.Bundle r5 = r0.d
            lg3 r4 = defpackage.od2.a(r4, r5, r13)
            jqe r5 = r0.b
            r4.f(r5)
            mg3[] r5 = new defpackage.mg3[r2]
            java.util.List r0 = r0.c
            java.lang.Object[] r0 = r0.toArray(r5)
            mg3[] r0 = (defpackage.mg3[]) r0
            int r5 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            mg3[] r0 = (defpackage.mg3[]) r0
            r4.a(r0)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r0 = r4.e()
            r0.setTargetController(r3)
            r4 = r3
        L_0x0af0:
            uu3 r5 = r4.getParentController()
            if (r5 == 0) goto L_0x0afb
            uu3 r4 = r4.getParentController()
            goto L_0x0af0
        L_0x0afb:
            boolean r5 = r4 instanceof defpackage.foc
            if (r5 == 0) goto L_0x0b02
            foc r4 = (defpackage.foc) r4
            goto L_0x0b03
        L_0x0b02:
            r4 = r15
        L_0x0b03:
            if (r4 == 0) goto L_0x0b09
            znc r15 = r4.T()
        L_0x0b09:
            r0.z0(r3)
            if (r15 == 0) goto L_0x0b45
            coc r3 = new coc
            r20 = 0
            r23 = -1
            r19 = 0
            r21 = 0
            r22 = 0
            r17 = r3
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            defpackage.wg0.l(r2, r3, r1, r10)
            r15.G(r3)
            goto L_0x0b45
        L_0x0b28:
            boolean r1 = r0 instanceof defpackage.hjb
            if (r1 == 0) goto L_0x0b46
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r3)
            kia r2 = new kia
            int r3 = defpackage.woc.n
            r2.<init>(r3)
            r1.e(r2)
            hjb r0 = (defpackage.hjb) r0
            jqe r0 = r0.a
            r1.g(r0)
            r1.i()
        L_0x0b45:
            return r16
        L_0x0b46:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0b4c:
            r0 = r26
            e52 r0 = (defpackage.e52) r0
            r2 = r27
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            dd1 r3 = (defpackage.dd1) r3
            q0e r2 = r3.t0
        L_0x0b58:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            rc1 r4 = (defpackage.rc1) r4
            kl7 r5 = defpackage.j1e.l()
            if (r0 == 0) goto L_0x0b91
            k92 r6 = r0.b
            int r7 = r6.m
            int r6 = r6.c()
            gc1 r8 = new gc1
            if (r6 != 0) goto L_0x0b79
            int r6 = defpackage.t7a.m
            eqe r9 = new eqe
            r9.<init>(r6)
            goto L_0x0b82
        L_0x0b79:
            int r9 = defpackage.s7a.a
            int r6 = r6 + r1
            aqe r10 = new aqe
            r10.<init>(r9, r6)
            r9 = r10
        L_0x0b82:
            if (r7 != 0) goto L_0x0b86
            r6 = r15
            goto L_0x0b8b
        L_0x0b86:
            afd r6 = new afd
            r6.<init>(r7)
        L_0x0b8b:
            r8.<init>(r9, r6)
            r5.add(r8)
        L_0x0b91:
            java.util.List r6 = defpackage.rc1.j
            r5.addAll(r6)
            kl7 r9 = defpackage.j1e.d(r5)
            r11 = 0
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r13 = 479(0x1df, float:6.71E-43)
            rc1 r4 = defpackage.rc1.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = r2.c(r3, r4)
            if (r3 == 0) goto L_0x0b58
            return r16
        L_0x0bae:
            r0 = r26
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r11 r3 = (defpackage.r11) r3
            r3.setVolumeMicrophone(r0)
            return r16
        L_0x0bc0:
            r0 = r26
            java.util.List r0 = (java.util.List) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            dz0 r3 = (defpackage.dz0) r3
            bc7[] r1 = one.me.calls.ui.ui.settings.CallAdminSettingsScreen.t0
            r3.E(r0)
            return r16
        L_0x0bd0:
            r0 = r26
            qj4 r0 = (defpackage.qj4) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            nq0 r3 = (defpackage.nq0) r3
            r3.getClass()
            boolean r0 = defpackage.tpa.f(r0, r4)
            if (r0 == 0) goto L_0x0c18
            je7 r0 = r3.f
            java.lang.Object r0 = r0.getValue()
            ds3 r0 = (defpackage.ds3) r0
            long r1 = r3.a
            w7c r0 = r0.c(r1)
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            uj3 r0 = (defpackage.uj3) r0
            if (r0 != 0) goto L_0x0bfc
            goto L_0x0c17
        L_0x0bfc:
            mab r0 = r3.D(r0)
            w7c r1 = r3.e
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            mab r1 = (defpackage.mab) r1
            if (r1 == 0) goto L_0x0c14
            tab r2 = r0.a
            java.util.List r0 = r0.b
            mab r15 = defpackage.mab.a(r1, r2, r0, r13)
        L_0x0c14:
            r3.f(r15)
        L_0x0c17:
            return r16
        L_0x0c18:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0c1e:
            r0 = r26
            mab r0 = (defpackage.mab) r0
            r1 = r27
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            nq0 r3 = (defpackage.nq0) r3
            r3.f(r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
