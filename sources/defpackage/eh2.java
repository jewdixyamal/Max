package defpackage;

import android.os.Bundle;

/* renamed from: eh2  reason: default package */
public final /* synthetic */ class eh2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ eh2(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: uo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: uo3} */
    /* JADX WARNING: type inference failed for: r2v34, types: [java.lang.Object, pz7] */
    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r30 = this;
            r0 = r30
            r1 = 0
            uo3 r2 = defpackage.uo3.b
            java.lang.String r3 = "contact_screen_open_mode"
            java.lang.String r4 = "chat_id"
            java.lang.Class<kke> r5 = defpackage.kke.class
            java.lang.Class<qe5> r6 = defpackage.qe5.class
            java.lang.Class<gh3> r7 = defpackage.gh3.class
            java.lang.Class<rh0> r8 = defpackage.rh0.class
            java.lang.String r9 = "id"
            java.lang.String r10 = ""
            r11 = 0
            android.os.Bundle r12 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x030b;
                case 1: goto L_0x02fe;
                case 2: goto L_0x0239;
                case 3: goto L_0x0219;
                case 4: goto L_0x01cf;
                case 5: goto L_0x016d;
                case 6: goto L_0x0109;
                case 7: goto L_0x00d6;
                case 8: goto L_0x0099;
                case 9: goto L_0x007f;
                case 10: goto L_0x003f;
                default: goto L_0x001d;
            }
        L_0x001d:
            bc7[] r0 = one.me.webapp.settings.WebAppSettingsScreen.s0
            p0g r0 = new p0g
            jwf r1 = defpackage.jwf.a
            v4 r1 = r1.getAccessor()
            java.lang.Class<q33> r2 = defpackage.q33.class
            java.lang.Object r1 = r1.c(r2)
            q33 r1 = (defpackage.q33) r1
            hyc r1 = (defpackage.hyc) r1
            long r1 = r1.t()
            java.lang.String r3 = "bot_id_arg"
            long r3 = r12.getLong(r3)
            r0.<init>(r1, r3)
            return r0
        L_0x003f:
            bc7[] r0 = one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.G0
            java.lang.String r0 = "open_type"
            java.lang.String r1 = "UNDEFINE"
            java.lang.String r0 = r12.getString(r0, r1)
            ccc r2 = defpackage.ccc.valueOf(r0)
            je7 r0 = defpackage.yi1.a
            zi1 r0 = defpackage.zi1.a
            v4 r1 = r0.getAccessor()
            java.lang.Class<lvc> r3 = defpackage.lvc.class
            khe r6 = r1.d(r3)
            je7 r5 = defpackage.yi1.b()
            ir1 r4 = r0.b()
            je7 r7 = defpackage.yi1.a()
            java.lang.String r0 = "admin_record_settings"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x0077
            boolean r0 = r12.getBoolean(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
        L_0x0077:
            r3 = r11
            kcc r0 = new kcc
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x007f:
            bc7[] r0 = one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet.B0
            i4c r0 = new i4c
            java.lang.String r1 = "opponent_id"
            android.os.Parcelable r1 = r12.getParcelable(r1)
            gg1 r1 = (defpackage.gg1) r1
            if (r1 != 0) goto L_0x008f
            gg1 r1 = defpackage.gg1.c
        L_0x008f:
            zi1 r2 = defpackage.zi1.a
            ir1 r2 = r2.b()
            r0.<init>(r1, r2)
            return r0
        L_0x0099:
            int r0 = one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen.o
            zjb r0 = new zjb
            long r14 = r12.getLong(r9)
            neb r1 = defpackage.neb.a
            je7 r16 = r1.c()
            je7 r17 = r1.d()
            je7 r18 = r1.b()
            v4 r2 = r1.getAccessor()
            khe r19 = r2.d(r8)
            v4 r2 = r1.getAccessor()
            khe r20 = r2.d(r7)
            v4 r2 = r1.getAccessor()
            java.lang.Class<wha> r3 = defpackage.wha.class
            khe r21 = r2.d(r3)
            v4 r1 = r1.getAccessor()
            khe r22 = r1.d(r6)
            r13 = r0
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x00d6:
            bc7[] r0 = one.me.profile.screens.invite.ProfileInviteScreen.Y
            jib r0 = new jib
            long r14 = r12.getLong(r9)
            xcb r1 = defpackage.xcb.a
            v4 r2 = r1.getAccessor()
            khe r16 = r2.d(r7)
            je7 r17 = r1.c()
            je7 r18 = r1.f()
            je7 r19 = r1.b()
            v4 r2 = r1.getAccessor()
            khe r20 = r2.d(r8)
            je7 r21 = r1.g()
            je7 r22 = r1.d()
            r13 = r0
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x0109:
            bc7[] r0 = one.me.profile.screens.avatars.ProfileAvatarsScreen.z0
            java.lang.String r0 = "EXTRA_ID"
            long r0 = r12.getLong(r0)
            java.lang.String r2 = "EXTRA_TYPE"
            java.lang.String r2 = r12.getString(r2)
            dp3 r3 = defpackage.hdb.b
            java.lang.String r3 = "contact"
            boolean r2 = defpackage.tpa.f(r2, r3)
            if (r2 == 0) goto L_0x0127
            obb r2 = new obb
            r2.<init>(r0)
            goto L_0x0157
        L_0x0127:
            pz7 r2 = new pz7
            r2.<init>()
            r2.a = r0
            xcb r0 = defpackage.xcb.a
            je7 r1 = r0.c()
            r2.c = r1
            qrc r0 = r0.h()
            r2.b = r0
            nz4 r0 = defpackage.nz4.a
            q0e r0 = defpackage.r0e.a(r0)
            r2.d = r0
            w7c r1 = new w7c
            r1.<init>(r0)
            r2.e = r1
            dbb r0 = new dbb
            iqe r1 = new iqe
            r1.<init>(r10)
            r0.<init>(r1)
            r2.f = r0
        L_0x0157:
            ccb r0 = new ccb
            xcb r1 = defpackage.xcb.a
            v4 r3 = r1.getAccessor()
            java.lang.Class<o45> r4 = defpackage.o45.class
            khe r3 = r3.d(r4)
            je7 r1 = r1.f()
            r0.<init>(r2, r3, r1)
            return r0
        L_0x016d:
            bc7[] r0 = one.me.keyboardmedia.stickers.KeyboardStickersWidget.t0
            b8e r0 = new b8e
            java.lang.String r1 = "arg_key_chat_id"
            r12.getLong(r1)
            kc7 r1 = defpackage.kc7.a
            v4 r2 = r1.getAccessor()
            java.lang.Object r2 = r2.c(r5)
            r14 = r2
            kke r14 = (defpackage.kke) r14
            v4 r2 = r1.getAccessor()
            java.lang.Class<o2e> r3 = defpackage.o2e.class
            khe r15 = r2.d(r3)
            v4 r2 = r1.getAccessor()
            java.lang.Class<x9c> r3 = defpackage.x9c.class
            khe r16 = r2.d(r3)
            v4 r2 = r1.getAccessor()
            java.lang.Class<md5> r3 = defpackage.md5.class
            khe r17 = r2.d(r3)
            v4 r2 = r1.getAccessor()
            java.lang.Class<sc5> r3 = defpackage.sc5.class
            khe r18 = r2.d(r3)
            v4 r2 = r1.getAccessor()
            java.lang.Class<s8g> r3 = defpackage.s8g.class
            r2.d(r3)
            m57 r2 = new m57
            r3 = 8
            r2.<init>(r3)
            khe r3 = new khe
            r3.<init>(r2)
            v4 r1 = r1.getAccessor()
            khe r20 = r1.d(r6)
            r13 = r0
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x01cf:
            int r0 = one.me.filedownloadwarning.FileDownloadWarningBottomSheet.b
            jh5 r0 = new jh5
            kh5 r1 = new kh5
            long r14 = r12.getLong(r4)
            java.lang.String r2 = "message_id"
            long r16 = r12.getLong(r2)
            java.lang.String r2 = "attach_id"
            java.lang.String r18 = r12.getString(r2)
            java.lang.String r2 = "file_id"
            long r19 = r12.getLong(r2)
            java.lang.String r2 = "file_name"
            java.lang.String r21 = r12.getString(r2)
            java.lang.String r2 = "Required value was null."
            if (r21 == 0) goto L_0x020f
            java.lang.String r3 = "file_url"
            java.lang.String r22 = r12.getString(r3)
            if (r22 == 0) goto L_0x0205
            r13 = r1
            r13.<init>(r14, r16, r18, r19, r21, r22)
            r0.<init>(r1)
            return r0
        L_0x0205:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x020f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0219:
            bc7[] r0 = one.me.contactlist.ContactListWidget.P0
            if (r12 == 0) goto L_0x0222
            java.lang.String r0 = r12.getString(r3)
            goto L_0x0223
        L_0x0222:
            r0 = r11
        L_0x0223:
            if (r0 != 0) goto L_0x0226
            goto L_0x0227
        L_0x0226:
            r10 = r0
        L_0x0227:
            uo3 r11 = defpackage.uo3.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x022b }
        L_0x022b:
            if (r11 != 0) goto L_0x022e
            goto L_0x022f
        L_0x022e:
            r2 = r11
        L_0x022f:
            uo3 r0 = defpackage.uo3.a
            if (r2 != r0) goto L_0x0234
            r1 = 1
        L_0x0234:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x0239:
            bc7[] r0 = one.me.contactlist.ContactListWidget.P0
            if (r12 == 0) goto L_0x0242
            java.lang.String r0 = r12.getString(r3)
            goto L_0x0243
        L_0x0242:
            r0 = r11
        L_0x0243:
            if (r0 != 0) goto L_0x0246
            goto L_0x0247
        L_0x0246:
            r10 = r0
        L_0x0247:
            uo3 r11 = defpackage.uo3.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x024b }
        L_0x024b:
            if (r11 != 0) goto L_0x024f
            r13 = r2
            goto L_0x0250
        L_0x024f:
            r13 = r11
        L_0x0250:
            hr3 r0 = defpackage.hr3.a
            v4 r1 = r0.getAccessor()
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            khe r14 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<qn3> r2 = defpackage.qn3.class
            java.lang.Object r1 = r1.c(r2)
            r15 = r1
            qn3 r15 = (defpackage.qn3) r15
            v4 r1 = r0.getAccessor()
            java.lang.Class<yx7> r2 = defpackage.yx7.class
            khe r16 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Object r1 = r1.c(r5)
            r17 = r1
            kke r17 = (defpackage.kke) r17
            v4 r1 = r0.getAccessor()
            java.lang.Class<b0d> r2 = defpackage.b0d.class
            khe r18 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<xj3> r2 = defpackage.xj3.class
            khe r19 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<ds3> r2 = defpackage.ds3.class
            khe r20 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<iy2> r2 = defpackage.iy2.class
            khe r21 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<ck3> r2 = defpackage.ck3.class
            khe r22 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<qq3> r2 = defpackage.qq3.class
            khe r23 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<yj3> r2 = defpackage.yj3.class
            khe r24 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<gq3> r2 = defpackage.gq3.class
            khe r25 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<afe> r2 = defpackage.afe.class
            khe r26 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<oc6> r2 = defpackage.oc6.class
            khe r27 = r1.d(r2)
            v4 r1 = r0.getAccessor()
            java.lang.Class<y7d> r2 = defpackage.y7d.class
            khe r28 = r1.d(r2)
            v4 r0 = r0.getAccessor()
            java.lang.Class<l67> r1 = defpackage.l67.class
            khe r29 = r0.d(r1)
            oo3 r0 = new oo3
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        L_0x02fe:
            int r0 = one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet.B0
            java.lang.String r0 = "bottom_snackbar_margin"
            int r0 = r12.getInt(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x030b:
            bc7[] r0 = one.me.profile.screens.media.ChatMediaTabWidget.w0
            dh2 r0 = new dh2
            long r1 = r12.getLong(r4)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh2.invoke():java.lang.Object");
    }
}
