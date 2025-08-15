package defpackage;

/* renamed from: ie8  reason: default package */
public final class ie8 implements b64 {
    public final /* synthetic */ int a;
    public final i64 b;

    public ie8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gi4.b;
                return;
            case 2:
                this.b = zv5.b;
                return;
            case 3:
                this.b = yy5.b;
                return;
            case 4:
                this.b = yx6.b;
                return;
            case 5:
                this.b = d57.b;
                return;
            case 6:
                this.b = lf7.b;
                return;
            case 7:
                this.b = mu7.b;
                return;
            case 8:
                this.b = tw9.b;
                return;
            case 9:
                this.b = lxa.b;
                return;
            case 10:
                this.b = xjd.b;
                return;
            default:
                this.b = je8.b;
                return;
        }
    }

    public final i64 a() {
        switch (this.a) {
            case 0:
                return (je8) this.b;
            case 1:
                return (gi4) this.b;
            case 2:
                return (zv5) this.b;
            case 3:
                return (yy5) this.b;
            case 4:
                return (yx6) this.b;
            case 5:
                return (d57) this.b;
            case 6:
                return (lf7) this.b;
            case 7:
                return (mu7) this.b;
            case 8:
                return (tw9) this.b;
            case 9:
                return (lxa) this.b;
            default:
                return (xjd) this.b;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: ka3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: it5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: hf7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: if7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: if7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l64 b(java.lang.String r21, defpackage.e64 r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = r20
            r2 = r22
            r3 = r23
            r1 = 18
            r4 = 24
            r5 = 19
            java.lang.String r7 = "chat_id"
            r11 = 21
            r12 = 27
            r13 = 26
            java.lang.String r14 = "request_code"
            r15 = 16
            r8 = 15
            r9 = 0
            java.lang.String r10 = "invalid route "
            r19 = 0
            i64 r6 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x053e;
                case 1: goto L_0x047b;
                case 2: goto L_0x03cd;
                case 3: goto L_0x0373;
                case 4: goto L_0x032c;
                case 5: goto L_0x0291;
                case 6: goto L_0x018b;
                case 7: goto L_0x0154;
                case 8: goto L_0x00ee;
                case 9: goto L_0x00a8;
                default: goto L_0x0026;
            }
        L_0x0026:
            xjd r6 = (defpackage.xjd) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0032
            goto L_0x009d
        L_0x0032:
            e64 r0 = defpackage.xjd.c
            boolean r0 = r2.equals(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0053
            l64 r8 = new l64
            m92 r6 = new m92
            r0 = 7
            r6.<init>(r3, r0)
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0050:
            r19 = r8
            goto L_0x009d
        L_0x0053:
            e64 r0 = defpackage.xjd.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "text"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0086
            int r1 = r0.length()
            if (r1 != 0) goto L_0x006a
            goto L_0x0086
        L_0x006a:
            ru.ok.tamtam.android.util.share.ShareData r1 = new ru.ok.tamtam.android.util.share.ShareData
            r16 = 0
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 127(0x7f, float:1.78E-43)
            r19 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.text = r0
            r1.type = r9
            java.lang.String r0 = "share_data"
            r3.putParcelable(r0, r1)
        L_0x0086:
            l64 r8 = new l64
            m92 r6 = new m92
            r0 = 8
            r6.<init>(r3, r0)
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0050
        L_0x009d:
            return r19
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = defpackage.au1.f(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x00a8:
            lxa r6 = (defpackage.lxa) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00b3
            goto L_0x00e3
        L_0x00b3:
            j64 r0 = defpackage.j64.c
            e64 r0 = defpackage.lxa.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00e4
            j64 r5 = new j64
            s4a r0 = new s4a
            r0.<init>(r8)
            s4a r1 = new s4a
            r1.<init>(r15)
            r5.<init>(r0, r1)
            int r0 = defpackage.i24.C(r14, r3)
            kxa r6 = new kxa
            r6.<init>(r0)
            l64 r19 = new l64
            r4 = 1
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x00e3:
            return r19
        L_0x00e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = defpackage.au1.f(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            tw9 r6 = (defpackage.tw9) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00f9
            goto L_0x0147
        L_0x00f9:
            e64 r0 = defpackage.tw9.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0108
            i r0 = new i
            r0.<init>(r13)
        L_0x0106:
            r6 = r0
            goto L_0x0136
        L_0x0108:
            e64 r0 = defpackage.tw9.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0116
            i r0 = new i
            r0.<init>(r12)
            goto L_0x0106
        L_0x0116:
            e64 r0 = defpackage.tw9.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0126
            i r0 = new i
            r1 = 28
            r0.<init>(r1)
            goto L_0x0106
        L_0x0126:
            e64 r0 = defpackage.tw9.f
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0148
            i r0 = new i
            r1 = 29
            r0.<init>(r1)
            goto L_0x0106
        L_0x0136:
            l64 r19 = new l64
            r5 = 0
            r4 = 0
            r7 = 24
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0147:
            return r19
        L_0x0148:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown route"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0154:
            mu7 r6 = (defpackage.mu7) r6
            r6.getClass()
            e64 r0 = defpackage.mu7.c
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0162
            goto L_0x018a
        L_0x0162:
            j64 r5 = new j64
            m57 r0 = new m57
            r0.<init>(r11)
            m57 r1 = new m57
            r4 = 22
            r1.<init>(r4)
            r5.<init>(r0, r1)
            i r6 = new i
            r0 = 23
            r6.<init>(r0)
            l64 r19 = new l64
            r7 = 8
            r4 = 0
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x018a:
            return r19
        L_0x018b:
            lf7 r6 = (defpackage.lf7) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0197
            goto L_0x0284
        L_0x0197:
            e64 r0 = defpackage.lf7.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f8
            java.lang.String r0 = "lat"
            double r0 = defpackage.i24.B(r0, r3)
            java.lang.String r4 = "lon"
            double r4 = defpackage.i24.B(r4, r3)
            er7 r13 = new er7
            r13.<init>(r0, r4)
            java.lang.String r0 = "z"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x01c0
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.Float r19 = java.lang.Float.valueOf(r0)
        L_0x01c0:
            if (r19 == 0) goto L_0x01c8
            float r0 = r19.floatValue()
        L_0x01c6:
            r14 = r0
            goto L_0x01ca
        L_0x01c8:
            r0 = 0
            goto L_0x01c6
        L_0x01ca:
            java.lang.Long r0 = defpackage.i24.v(r7, r3)
            if (r0 == 0) goto L_0x01d6
            long r0 = r0.longValue()
            r9 = r0
            goto L_0x01d8
        L_0x01d6:
            r9 = 0
        L_0x01d8:
            java.lang.String r0 = "msg_id"
            java.lang.Long r0 = defpackage.i24.v(r0, r3)
            if (r0 == 0) goto L_0x01e6
            long r0 = r0.longValue()
            r11 = r0
            goto L_0x01e8
        L_0x01e6:
            r11 = 0
        L_0x01e8:
            java.lang.String r0 = "sender_id"
            java.lang.Long r15 = defpackage.i24.v(r0, r3)
            kf7 r0 = new kf7
            r8 = r0
            r8.<init>(r9, r11, r13, r14, r15)
            r6 = r0
        L_0x01f5:
            r4 = 1
            goto L_0x0274
        L_0x01f8:
            e64 r0 = defpackage.lf7.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0218
            int r0 = defpackage.i24.C(r14, r3)
            java.lang.Long r1 = defpackage.i24.v(r7, r3)
            if (r1 == 0) goto L_0x020f
            long r8 = r1.longValue()
            goto L_0x0211
        L_0x020f:
            r8 = 0
        L_0x0211:
            if7 r1 = new if7
            r1.<init>(r0, r8)
            r6 = r1
            goto L_0x01f5
        L_0x0218:
            e64 r0 = defpackage.lf7.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0285
            java.lang.String r0 = "attachment_id"
            java.lang.String r12 = defpackage.i24.F(r0, r3)
            java.lang.String r0 = "message"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            xw8 r0 = (defpackage.xw8) r0
            es8 r11 = r0.a
            java.lang.String r0 = "single_attach"
            java.lang.Boolean r0 = defpackage.i24.u(r0, r3)
            if (r0 == 0) goto L_0x023e
            boolean r0 = r0.booleanValue()
            r14 = r0
            goto L_0x023f
        L_0x023e:
            r14 = 1
        L_0x023f:
            java.lang.String r0 = "desc_order"
            java.lang.Boolean r0 = defpackage.i24.u(r0, r3)
            if (r0 == 0) goto L_0x024b
            boolean r9 = r0.booleanValue()
        L_0x024b:
            r13 = r9
            java.lang.String r0 = "start_auto_play"
            java.lang.Boolean r0 = defpackage.i24.u(r0, r3)
            if (r0 == 0) goto L_0x025a
            boolean r0 = r0.booleanValue()
            r15 = r0
            goto L_0x025b
        L_0x025a:
            r15 = 1
        L_0x025b:
            java.lang.String r0 = "cast_enabled"
            java.lang.Boolean r0 = defpackage.i24.u(r0, r3)
            if (r0 == 0) goto L_0x026a
            boolean r10 = r0.booleanValue()
            r16 = r10
            goto L_0x026c
        L_0x026a:
            r16 = 1
        L_0x026c:
            hf7 r0 = new hf7
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6 = r0
            r4 = 3
        L_0x0274:
            l64 r19 = new l64
            r7 = 16
            r5 = 0
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0284:
            return r19
        L_0x0285:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unknown route "
            java.lang.String r1 = defpackage.au1.f(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0291:
            d57 r6 = (defpackage.d57) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x029d
            goto L_0x0321
        L_0x029d:
            d57 r0 = defpackage.d57.b
            r0.getClass()
            e64 r0 = defpackage.d57.c
            boolean r0 = r2.equals(r0)
            r6 = 1
            if (r0 == 0) goto L_0x02c5
            l64 r8 = new l64
            i r7 = new i
            r7.<init>(r5)
            r9 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r6
            r6 = r7
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r19 = r8
            goto L_0x0321
        L_0x02c5:
            e64 r0 = defpackage.d57.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02f6
            j64 r5 = new j64
            fh5 r0 = new fh5
            r0.<init>(r4)
            fh5 r1 = new fh5
            r4 = 25
            r1.<init>(r4)
            r5.<init>(r0, r1)
            l64 r7 = new l64
            i r8 = new i
            r0 = 20
            r8.<init>(r0)
            r0 = r7
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r6
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x02f3:
            r19 = r7
            goto L_0x0321
        L_0x02f6:
            e64 r0 = defpackage.d57.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0322
            j64 r5 = new j64
            fh5 r0 = new fh5
            r0.<init>(r13)
            fh5 r1 = new fh5
            r1.<init>(r12)
            r5.<init>(r0, r1)
            l64 r7 = new l64
            i r8 = new i
            r8.<init>(r11)
            r0 = r7
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r6
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x02f3
        L_0x0321:
            return r19
        L_0x0322:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = defpackage.au1.f(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x032c:
            yx6 r6 = (defpackage.yx6) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0337
            goto L_0x0368
        L_0x0337:
            yx6 r0 = defpackage.yx6.b
            r0.getClass()
            e64 r0 = defpackage.yx6.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0369
            j64 r6 = new j64
            fh5 r0 = new fh5
            r0.<init>(r1)
            fh5 r4 = new fh5
            r4.<init>(r5)
            r6.<init>(r0, r4)
            l64 r19 = new l64
            i r7 = new i
            r7.<init>(r1)
            r4 = 1
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0368:
            return r19
        L_0x0369:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = defpackage.au1.f(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x0373:
            yy5 r6 = (defpackage.yy5) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x037e
            goto L_0x03c2
        L_0x037e:
            e64 r0 = defpackage.yy5.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03c3
            java.lang.String r0 = "messages_ids"
            long[] r0 = defpackage.i24.E(r0, r3)
            java.lang.String r1 = "attach_id"
            java.lang.Long r1 = defpackage.i24.v(r1, r3)
            java.lang.String r4 = "is_forward_attach"
            java.lang.Boolean r4 = defpackage.i24.u(r4, r3)
            if (r4 == 0) goto L_0x039f
            boolean r4 = r4.booleanValue()
            goto L_0x03a0
        L_0x039f:
            r4 = r9
        L_0x03a0:
            java.lang.String r5 = "show_ext_sharing"
            java.lang.Boolean r5 = defpackage.i24.u(r5, r3)
            if (r5 == 0) goto L_0x03ac
            boolean r9 = r5.booleanValue()
        L_0x03ac:
            xy5 r6 = new xy5
            r6.<init>(r0, r1, r4, r9)
            l64 r19 = new l64
            r7 = 16
            r5 = 0
            r4 = 1
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x03c2:
            return r19
        L_0x03c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = defpackage.au1.f(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x03cd:
            zv5 r6 = (defpackage.zv5) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x03d9
            goto L_0x047a
        L_0x03d9:
            zv5 r0 = defpackage.zv5.b
            r0.getClass()
            e64 r0 = defpackage.zv5.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03f0
            i r0 = new i
            r1 = 17
            r0.<init>(r1)
        L_0x03ed:
            r6 = r0
            goto L_0x0469
        L_0x03f0:
            e64 r0 = defpackage.zv5.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03ff
            m92 r0 = new m92
            r1 = 3
            r0.<init>(r3, r1)
            goto L_0x03ed
        L_0x03ff:
            e64 r0 = defpackage.zv5.f
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x041b
            java.lang.Long r0 = defpackage.i24.v(r7, r3)
            if (r0 == 0) goto L_0x0412
            long r8 = r0.longValue()
            goto L_0x0414
        L_0x0412:
            r8 = 0
        L_0x0414:
            ka3 r0 = new ka3
            r1 = 1
            r0.<init>(r8, r1)
            goto L_0x03ed
        L_0x041b:
            e64 r0 = defpackage.zv5.h
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0445
            java.lang.String r0 = "folder_id"
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x042e
            r0 = r1
        L_0x042e:
            java.lang.String r4 = "tag"
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L_0x0437
            goto L_0x0438
        L_0x0437:
            r1 = r4
        L_0x0438:
            java.lang.String r4 = "members_ids"
            long[] r4 = defpackage.i24.w(r4, r3)
            it5 r5 = new it5
            r5.<init>(r0, r1, r4)
            r6 = r5
            goto L_0x0469
        L_0x0445:
            e64 r0 = defpackage.zv5.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0454
            m92 r0 = new m92
            r1 = 4
            r0.<init>(r3, r1)
            goto L_0x03ed
        L_0x0454:
            e64 r0 = defpackage.zv5.g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x047a
            java.lang.String r0 = "id"
            long r0 = defpackage.i24.D(r0, r3)
            ka3 r4 = new ka3
            r5 = 2
            r4.<init>(r0, r5)
            r6 = r4
        L_0x0469:
            l64 r19 = new l64
            r5 = 0
            r4 = 0
            r7 = 24
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x047a:
            return r19
        L_0x047b:
            gi4 r6 = (defpackage.gi4) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0487
            goto L_0x053d
        L_0x0487:
            e64 r0 = defpackage.gi4.c
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0502
            e64 r0 = defpackage.gi4.g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0499
            goto L_0x0502
        L_0x0499:
            e64 r0 = defpackage.gi4.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04aa
            i r0 = new i
            r1 = 11
            r0.<init>(r1)
        L_0x04a8:
            r6 = r0
            goto L_0x050a
        L_0x04aa:
            e64 r0 = defpackage.gi4.h
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04ba
            i r0 = new i
            r1 = 12
            r0.<init>(r1)
            goto L_0x04a8
        L_0x04ba:
            e64 r0 = defpackage.gi4.i
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04ca
            i r0 = new i
            r1 = 13
            r0.<init>(r1)
            goto L_0x04a8
        L_0x04ca:
            e64 r0 = defpackage.gi4.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04da
            i r0 = new i
            r1 = 14
            r0.<init>(r1)
            goto L_0x04a8
        L_0x04da:
            e64 r0 = defpackage.gi4.f
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04e8
            i r0 = new i
            r0.<init>(r8)
            goto L_0x04a8
        L_0x04e8:
            e64 r0 = defpackage.gi4.j
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04f6
            i r0 = new i
            r0.<init>(r15)
            goto L_0x04a8
        L_0x04f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown route="
            java.lang.String r1 = defpackage.au1.f(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0502:
            i r0 = new i
            r1 = 10
            r0.<init>(r1)
            goto L_0x04a8
        L_0x050a:
            e64 r0 = defpackage.gi4.i
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x052a
            e64 r0 = defpackage.gi4.h
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x052a
            e64 r0 = defpackage.gi4.j
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0523
            goto L_0x052a
        L_0x0523:
            j64 r0 = new j64
            r0.<init>()
        L_0x0528:
            r5 = r0
            goto L_0x052d
        L_0x052a:
            j64 r0 = defpackage.j64.c
            goto L_0x0528
        L_0x052d:
            l64 r19 = new l64
            r7 = 8
            r4 = 0
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x053d:
            return r19
        L_0x053e:
            je8 r6 = (defpackage.je8) r6
            java.util.LinkedHashSet r0 = r6.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0549
            goto L_0x0593
        L_0x0549:
            je8 r0 = defpackage.je8.b
            r0.getClass()
            e64 r0 = defpackage.je8.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x056d
            i r6 = new i
            r6.<init>(r4)
            l64 r19 = new l64
            r7 = 16
            r5 = 0
            r4 = 1
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0593
        L_0x056d:
            java.lang.Class<ie8> r0 = defpackage.ie8.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            defpackage.hm9.p(r0, r1, r3)
        L_0x0593:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie8.b(java.lang.String, e64, android.os.Bundle):l64");
    }
}
