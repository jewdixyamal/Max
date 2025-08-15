package defpackage;

/* renamed from: gi7  reason: default package */
public final class gi7 extends gle {
    public fs8 X;
    public String Y;
    public dh6 Z;
    public f52 c;
    public kq3 o;
    public def s0;
    public n3e t0;

    public gi7(gy8 gy8) {
        super(gy8);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [cef, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.gy8 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r19.getClass()
            r10 = -1
            int r11 = r19.hashCode()
            switch(r11) {
                case -1195420187: goto L_0x0059;
                case -921148724: goto L_0x004e;
                case 3052376: goto L_0x0043;
                case 3599307: goto L_0x0038;
                case 98629247: goto L_0x002d;
                case 954925063: goto L_0x0022;
                case 1958352887: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            r2 = r10
            goto L_0x0063
        L_0x0017:
            java.lang.String r11 = "videoConference"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            r2 = 6
            goto L_0x0063
        L_0x0022:
            java.lang.String r11 = "message"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x002b
            goto L_0x0015
        L_0x002b:
            r2 = 5
            goto L_0x0063
        L_0x002d:
            java.lang.String r11 = "group"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0036
            goto L_0x0015
        L_0x0036:
            r2 = 4
            goto L_0x0063
        L_0x0038:
            java.lang.String r11 = "user"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0041
            goto L_0x0015
        L_0x0041:
            r2 = r6
            goto L_0x0063
        L_0x0043:
            java.lang.String r11 = "chat"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x004c
            goto L_0x0015
        L_0x004c:
            r2 = r7
            goto L_0x0063
        L_0x004e:
            java.lang.String r11 = "startPayload"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0057
            goto L_0x0015
        L_0x0057:
            r2 = r8
            goto L_0x0063
        L_0x0059:
            java.lang.String r11 = "stickerSet"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0062
            goto L_0x0015
        L_0x0062:
            r2 = r9
        L_0x0063:
            switch(r2) {
                case 0: goto L_0x0174;
                case 1: goto L_0x016d;
                case 2: goto L_0x0166;
                case 3: goto L_0x015f;
                case 4: goto L_0x0158;
                case 5: goto L_0x0151;
                case 6: goto L_0x006b;
                default: goto L_0x0066;
            }
        L_0x0066:
            r18.z()
            goto L_0x017a
        L_0x006b:
            int r2 = defpackage.lz7.N(r18)
            if (r2 != 0) goto L_0x0074
            r1 = 0
            goto L_0x014e
        L_0x0074:
            cef r11 = new cef
            r11.<init>()
            r11.h = r9
            r12 = 0
            r11.i = r12
            r14 = r9
        L_0x0080:
            if (r14 >= r2) goto L_0x013f
            java.lang.String r15 = r18.z0()
            r15.getClass()
            int r16 = r15.hashCode()
            switch(r16) {
                case -1897186251: goto L_0x00ed;
                case -1401988028: goto L_0x00e2;
                case -1361631597: goto L_0x00d7;
                case -794658985: goto L_0x00cc;
                case -172815863: goto L_0x00c1;
                case 3575610: goto L_0x00b6;
                case 106164915: goto L_0x00ab;
                case 265384045: goto L_0x00a0;
                case 1867394383: goto L_0x0093;
                default: goto L_0x0090;
            }
        L_0x0090:
            r3 = r10
            goto L_0x00f7
        L_0x0093:
            java.lang.String r3 = "participantsCount"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x009c
            goto L_0x0090
        L_0x009c:
            r3 = 8
            goto L_0x00f7
        L_0x00a0:
            java.lang.String r3 = "previewParticipantIds"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00a9
            goto L_0x0090
        L_0x00a9:
            r3 = 7
            goto L_0x00f7
        L_0x00ab:
            java.lang.String r3 = "owner"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00b4
            goto L_0x0090
        L_0x00b4:
            r3 = 6
            goto L_0x00f7
        L_0x00b6:
            java.lang.String r3 = "type"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00bf
            goto L_0x0090
        L_0x00bf:
            r3 = 5
            goto L_0x00f7
        L_0x00c1:
            java.lang.String r3 = "callName"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00ca
            goto L_0x0090
        L_0x00ca:
            r3 = 4
            goto L_0x00f7
        L_0x00cc:
            java.lang.String r3 = "conferenceId"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00d5
            goto L_0x0090
        L_0x00d5:
            r3 = r6
            goto L_0x00f7
        L_0x00d7:
            java.lang.String r3 = "chatId"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00e0
            goto L_0x0090
        L_0x00e0:
            r3 = r7
            goto L_0x00f7
        L_0x00e2:
            java.lang.String r3 = "joinLink"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00eb
            goto L_0x0090
        L_0x00eb:
            r3 = r8
            goto L_0x00f7
        L_0x00ed:
            java.lang.String r3 = "startAt"
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00f6
            goto L_0x0090
        L_0x00f6:
            r3 = r9
        L_0x00f7:
            switch(r3) {
                case 0: goto L_0x0136;
                case 1: goto L_0x012f;
                case 2: goto L_0x0128;
                case 3: goto L_0x0121;
                case 4: goto L_0x011a;
                case 5: goto L_0x0113;
                case 6: goto L_0x010c;
                case 7: goto L_0x0105;
                case 8: goto L_0x00fe;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            r18.z()
            goto L_0x013c
        L_0x00fe:
            int r3 = defpackage.lz7.L(r18)
            r11.e = r3
            goto L_0x013c
        L_0x0105:
            wz r3 = defpackage.wz.d(r18)
            r11.g = r3
            goto L_0x013c
        L_0x010c:
            wm3 r3 = defpackage.wm3.e(r18)
            r11.a = r3
            goto L_0x013c
        L_0x0113:
            byte r3 = defpackage.lz7.I(r18)
            r11.h = r3
            goto L_0x013c
        L_0x011a:
            java.lang.String r3 = defpackage.lz7.P(r18)
            r11.c = r3
            goto L_0x013c
        L_0x0121:
            java.lang.String r3 = defpackage.lz7.P(r18)
            r11.d = r3
            goto L_0x013c
        L_0x0128:
            long r4 = defpackage.lz7.M(r1, r12)
            r11.i = r4
            goto L_0x013c
        L_0x012f:
            java.lang.String r4 = defpackage.lz7.P(r18)
            r11.b = r4
            goto L_0x013c
        L_0x0136:
            long r4 = defpackage.lz7.M(r1, r12)
            r11.f = r4
        L_0x013c:
            int r14 = r14 + r8
            goto L_0x0080
        L_0x013f:
            java.util.List r1 = r11.g
            if (r1 != 0) goto L_0x0149
            java.util.List r1 = java.util.Collections.emptyList()
            r11.g = r1
        L_0x0149:
            def r1 = new def
            r1.<init>(r11)
        L_0x014e:
            r0.s0 = r1
            goto L_0x017a
        L_0x0151:
            fs8 r1 = defpackage.tpa.z(r18)
            r0.X = r1
            goto L_0x017a
        L_0x0158:
            dh6 r1 = defpackage.dh6.a(r18)
            r0.Z = r1
            goto L_0x017a
        L_0x015f:
            kq3 r1 = defpackage.kq3.a(r18)
            r0.o = r1
            goto L_0x017a
        L_0x0166:
            f52 r1 = defpackage.f52.a(r18)
            r0.c = r1
            goto L_0x017a
        L_0x016d:
            java.lang.String r1 = defpackage.lz7.P(r18)
            r0.Y = r1
            goto L_0x017a
        L_0x0174:
            n3e r1 = defpackage.n3e.a(r18)
            r0.t0 = r1
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi7.b(gy8, java.lang.String):void");
    }

    public final String toString() {
        f52 f52 = this.c;
        kq3 kq3 = this.o;
        fs8 fs8 = this.X;
        String str = this.Y;
        dh6 dh6 = this.Z;
        def def = this.s0;
        n3e n3e = this.t0;
        return "Response{chat=" + f52 + ", contactSearchResult=" + kq3 + ", message=" + fs8 + ", startPayload='" + str + "', groupChatInfo=" + dh6 + ", videoConference=" + def + ", stickerSet=" + n3e + "}";
    }
}
