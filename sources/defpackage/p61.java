package defpackage;

/* renamed from: p61  reason: default package */
public final /* synthetic */ class p61 implements k56 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object s0;

    public /* synthetic */ p61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
        this.s0 = obj7;
    }

    /* JADX WARNING: type inference failed for: r13v4, types: [a4c] */
    /* JADX WARNING: type inference failed for: r13v5, types: [a4c] */
    /* JADX WARNING: type inference failed for: r5v3, types: [qp4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v20 */
    /* JADX WARNING: type inference failed for: r13v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0403  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r75 = this;
            r0 = r75
            java.lang.Object r1 = r0.s0
            java.lang.Object r3 = r0.Y
            java.lang.Object r4 = r0.X
            java.lang.Object r5 = r0.o
            java.lang.Object r6 = r0.c
            r7 = 1
            r8 = 3
            java.lang.Object r9 = r0.Z
            java.lang.Object r11 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x00e3;
                default: goto L_0x0017;
            }
        L_0x0017:
            gi2 r11 = (defpackage.gi2) r11
            e52 r0 = r11.v()
            if (r0 == 0) goto L_0x0022
            es8 r0 = r0.c
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x00e1
            tf2 r10 = new tf2
            hle r9 = (defpackage.hle) r9
            r12 = r9
            jle r12 = (defpackage.jle) r12
            ztc r15 = r12.b()
            v02 r14 = new v02
            r12 = 9
            r14.<init>(r12, r9)
            e52 r9 = r11.v()
            ih2 r12 = r11.c
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x0059
            if (r12 == r7) goto L_0x0056
            r7 = 2
            if (r12 == r7) goto L_0x0053
            if (r12 != r8) goto L_0x004d
            java.util.Set r7 = defpackage.ql8.c
            goto L_0x0066
        L_0x004d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0053:
            java.util.HashSet r7 = defpackage.ql8.f
            goto L_0x0066
        L_0x0056:
            java.util.HashSet r7 = defpackage.ql8.g
            goto L_0x0066
        L_0x0059:
            se5 r7 = r11.z0
            boolean r7 = r7.v()
            if (r7 == 0) goto L_0x0064
            java.util.HashSet r7 = defpackage.ql8.d
            goto L_0x0066
        L_0x0064:
            java.util.HashSet r7 = defpackage.ql8.e
        L_0x0066:
            java.util.Set r12 = defpackage.zf2.d(r7)
            c8d r13 = new c8d
            cu8 r0 = r0.a
            p82 r6 = (defpackage.p82) r6
            r13.<init>(r9, r0, r6, r12)
            die r0 = new die
            ge2 r5 = (defpackage.ge2) r5
            au8 r2 = r11.X
            r0.<init>(r5, r2, r9, r7)
            qp4 r5 = new qp4
            m7b r4 = (defpackage.m7b) r4
            fme r3 = (defpackage.fme) r3
            pk r7 = r11.Y
            r5.<init>()
            r5.b = r0
            r5.c = r6
            r5.a = r2
            r5.o = r4
            r5.X = r7
            r5.Y = r3
            r5.Z = r9
            r5.s0 = r12
            r5.t0 = r11
            yx4 r2 = new yx4
            java.lang.String r3 = "tf2"
            r2.<init>(r3)
            nl6 r4 = new nl6
            r20 = 40
            r23 = 96
            r22 = 0
            r16 = r4
            r17 = r13
            r18 = r0
            r19 = r5
            r21 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = "#"
            java.lang.StringBuilder r0 = defpackage.rh4.o(r3, r0)
            mg4 r2 = defpackage.mg4.REGULAR
            java.lang.String r2 = r2.name()
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r8)
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            long r2 = r9.a
            r0.append(r2)
            java.lang.String r17 = r0.toString()
            r16 = r1
            o45 r16 = (defpackage.o45) r16
            r12 = r10
            r13 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00e2
        L_0x00e1:
            r10 = 0
        L_0x00e2:
            return r10
        L_0x00e3:
            ru.ok.android.externcalls.sdk.ConversationFactory r2 = new ru.ok.android.externcalls.sdk.ConversationFactory
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r0 = r6.getValue()
            android.content.Context r0 = (android.content.Context) r0
            s61 r11 = (defpackage.s61) r11
            q2a r11 = r11.a
            java.lang.String r12 = "ONE_ME"
            r2.<init>(r11, r0, r12)
            je7 r5 = (defpackage.je7) r5
            java.lang.Object r0 = r5.getValue()
            x6a r0 = (defpackage.x6a) r0
            r0.getClass()
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r0 = r4.getValue()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f28debugmode
            r12 = 0
            long r13 = (long) r12
            long r11 = r0.q(r11, r13)
            int r0 = (int) r11
            if (r0 != r8) goto L_0x0120
            q61 r0 = new q61
            r0.<init>()
        L_0x011e:
            r8 = r0
            goto L_0x0126
        L_0x0120:
            z3c r0 = new z3c
            r0.<init>()
            goto L_0x011e
        L_0x0126:
            r61 r11 = new r61
            je7 r9 = (defpackage.je7) r9
            r11.<init>((defpackage.je7) r9)
            je7 r3 = (defpackage.je7) r3
            java.lang.Object r0 = r3.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f11badnetworindicatorconfig
            java.lang.String r9 = r3.name()
            ne7 r12 = r0.g
            boolean r9 = r12.contains(r9)
            if (r9 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            qyc r0 = r0.h
        L_0x014b:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            h23 r12 = defpackage.nec.a(r9)
            java.lang.Class r13 = java.lang.Boolean.TYPE
            h23 r13 = defpackage.nec.a(r13)
            boolean r13 = r12.equals(r13)
            java.lang.String r14 = "{ \n    \"rtt\":{ \n        \"step\":0.055, \n        \"baseline\":0.4, \n        \"stepWeight\":0.12, \n        \"weightUp\": 0.3, \n        \"weightDown\":0.8 \n    },\n     \"loss\":{ \n        \"step\":1.5, \n        \"baseline\":0.0, \n        \"stepWeight\":0.17, \n        \"weightUp\": 0.3, \n        \"weightDown\":0.6 \n    }\n}"
            if (r13 == 0) goto L_0x0174
            java.lang.String r3 = r3.name()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r9 = r14.booleanValue()
            boolean r0 = r0.d(r3, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01ad
        L_0x0174:
            java.lang.Class r13 = java.lang.Long.TYPE
            h23 r13 = defpackage.nec.a(r13)
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x0197
            java.lang.String r3 = r3.name()
            java.lang.Long r14 = (java.lang.Long) r14
            long r12 = r14.longValue()
            ne7 r0 = r0.g
            long r12 = r0.getLong(r3, r12)
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01ad
        L_0x0197:
            h23 r13 = defpackage.nec.a(r9)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0446
            java.lang.String r3 = r3.name()
            ne7 r0 = r0.g
            java.lang.String r0 = r0.getString(r3, r14)
            if (r0 == 0) goto L_0x043e
        L_0x01ad:
            uf0 r3 = defpackage.uf0.e
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0313 }
            r9.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = "calcNetworkStatusConfig"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            java.lang.String r3 = "enabled"
            boolean r12 = defpackage.kp.b(r0, r3, r7)
            if (r12 == 0) goto L_0x02a5
            rx0 r12 = new rx0
            r24 = r12
            java.lang.String r13 = "redline"
            r14 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r25 = defpackage.kp.a(r0, r13, r14)
            java.lang.String r13 = "redlineMargin"
            r14 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r27 = defpackage.kp.a(r0, r13, r14)
            java.lang.String r13 = "ratingWeightUp"
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r29 = defpackage.kp.a(r0, r13, r14)
            java.lang.String r13 = "ratingWeightDown"
            double r31 = defpackage.kp.a(r0, r13, r14)
            java.lang.String r13 = "goodRtt"
            r75 = r11
            r10 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r33 = defpackage.kp.a(r0, r13, r10)
            java.lang.String r10 = "rttWeightUp"
            r14 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r35 = defpackage.kp.a(r0, r10, r14)
            java.lang.String r10 = "rttWeightDown"
            double r37 = defpackage.kp.a(r0, r10, r14)
            java.lang.String r10 = "rttStep"
            r13 = r8
            r7 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            double r39 = defpackage.kp.a(r0, r10, r7)
            java.lang.String r7 = "rttStepWeight"
            r8 = r12
            r11 = 4593311331947716280(0x3fbeb851eb851eb8, double:0.12)
            double r41 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "fastLossWeight"
            r11 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r43 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "slowLossWeight"
            double r45 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "fastLossValue"
            r11 = 4623507967449235456(0x402a000000000000, double:13.0)
            double r47 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "slowLossValue"
            r11 = 4619567317775286272(0x401c000000000000, double:7.0)
            double r49 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "criticalRtt"
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r51 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "criticalFastLoss"
            double r53 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "criticalSlowLoss"
            double r55 = defpackage.kp.a(r0, r7, r11)
            java.lang.String r7 = "newNetworkRatingModelEnabled"
            r10 = 1
            boolean r57 = defpackage.kp.b(r0, r7, r10)
            java.lang.String r7 = "goodLoss"
            r14 = 0
            double r58 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "lossStep"
            r14 = 4579800533065604792(0x3f8eb851eb851eb8, double:0.015)
            double r60 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "lossStepWeight"
            r14 = 4595292915783759299(0x3fc5c28f5c28f5c3, double:0.17)
            double r62 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "bitrateRatingEnabled"
            r10 = 1
            boolean r64 = defpackage.kp.b(r0, r7, r10)
            java.lang.String r7 = "bitrateRatingInfluenceFactor"
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r65 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "estimatedBitrateWeightUp"
            r14 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r67 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "estimatedBitrateWeightDown"
            double r69 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "reportedBitrateWeightUp"
            double r71 = defpackage.kp.a(r0, r7, r14)
            java.lang.String r7 = "reportedBitrateWeightDown"
            double r73 = defpackage.kp.a(r0, r7, r14)
            r24.<init>(r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r58, r60, r62, r64, r65, r67, r69, r71, r73)
            r12 = r8
            goto L_0x02a9
        L_0x02a5:
            r13 = r8
            r75 = r11
            r12 = 0
        L_0x02a9:
            java.lang.String r0 = "reportNetworkStatusConfig"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            r7 = 1
            boolean r3 = defpackage.kp.b(r0, r3, r7)
            if (r3 == 0) goto L_0x02db
            dhc r3 = new dhc
            java.lang.String r7 = "networkStatusReportThreshold"
            r14 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r7 = defpackage.kp.a(r0, r7, r14)
            r10 = 5000(0x1388, float:7.006E-42)
            if (r0 == 0) goto L_0x02cd
            java.lang.String r14 = "networkStatusReportIntervalMs"
            int r10 = r0.optInt(r14, r10)
        L_0x02cd:
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r0 == 0) goto L_0x02d7
            java.lang.String r15 = "networkStatusReportForceIntervalMs"
            int r14 = r0.optInt(r15, r14)
        L_0x02d7:
            r3.<init>(r10, r14, r7)
            goto L_0x02dc
        L_0x02db:
            r3 = 0
        L_0x02dc:
            java.lang.String r0 = "signalingConfig"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            tf0 r7 = new tf0
            java.lang.String r8 = "dcReportNetworkStatEnabled"
            r10 = 1
            boolean r8 = defpackage.kp.b(r0, r8, r10)
            java.lang.String r10 = "producerCommandV3"
            r14 = 0
            boolean r0 = defpackage.kp.b(r0, r10, r14)
            r7.<init>(r8, r0)
            java.lang.String r0 = "debugLoggingConfig"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            sf0 r8 = new sf0
            java.lang.String r9 = "debugLogging"
            boolean r9 = defpackage.kp.b(r0, r9, r14)
            java.lang.String r10 = "debugVerboseLogging"
            boolean r0 = defpackage.kp.b(r0, r10, r14)
            r8.<init>(r9, r0)
            uf0 r0 = new uf0
            r0.<init>(r12, r3, r7, r8)
            r3 = r0
            goto L_0x031e
        L_0x0313:
            r0 = move-exception
            r13 = r8
            r75 = r11
            java.lang.String r7 = "BadNetworkIndicatorConfig"
            java.lang.String r8 = "Can't parse BadNetworkIndicatorConfig"
            r13.logException(r7, r8, r0)
        L_0x031e:
            r2.setBadNetworkIndicatorConfig(r3)
            r3 = 1
            r2.setEnableLossRttBadConnectionHandling(r3)
            r7 = r75
            r2.setScreenCapturePermissionProvider(r7)
            r2.setDeviceAudioShareEnabled(r3)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r0 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder
            r0.<init>()
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r3 = r0.setOpusDREDEnabled(r3)
            java.lang.Object r0 = r4.getValue()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f17callssdkaudiodynamicredundancy
            r8 = 0
            java.lang.String r0 = r0.w(r7, r8)
            if (r0 == 0) goto L_0x035d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0381 }
            r7.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.String r0 = "off"
            java.lang.Boolean r0 = defpackage.ote.n(r7, r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0381 }
            boolean r0 = defpackage.tpa.f(r0, r9)     // Catch:{ JSONException -> 0x0381 }
            if (r0 == 0) goto L_0x0360
        L_0x035d:
            r10 = r8
            goto L_0x03d5
        L_0x0360:
            java.lang.String r0 = "mab"
            boolean r9 = r7.has(r0)     // Catch:{ JSONException -> 0x0381 }
            if (r9 == 0) goto L_0x0371
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0381 }
            goto L_0x0372
        L_0x0371:
            r0 = r8
        L_0x0372:
            if (r0 == 0) goto L_0x0383
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0381 }
            int r0 = r0 * 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0381 }
            r26 = r0
            goto L_0x0385
        L_0x0381:
            r0 = move-exception
            goto L_0x03cd
        L_0x0383:
            r26 = r8
        L_0x0385:
            java.lang.String r0 = "dsb"
            boolean r9 = r7.has(r0)     // Catch:{ JSONException -> 0x0381 }
            if (r9 == 0) goto L_0x0396
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0381 }
            goto L_0x0397
        L_0x0396:
            r0 = r8
        L_0x0397:
            if (r0 == 0) goto L_0x03a6
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0381 }
            int r0 = r0 * 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0381 }
            r27 = r0
            goto L_0x03a8
        L_0x03a6:
            r27 = r8
        L_0x03a8:
            java.lang.String r0 = "nl"
            java.lang.Boolean r28 = defpackage.ote.n(r7, r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.String r0 = "df"
            java.lang.Boolean r29 = defpackage.ote.n(r7, r0)     // Catch:{ JSONException -> 0x0381 }
            java.lang.String r0 = "dlb"
            java.lang.Boolean r30 = defpackage.ote.n(r7, r0)     // Catch:{ JSONException -> 0x0381 }
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters r0 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters     // Catch:{ JSONException -> 0x0381 }
            r32 = 0
            r33 = 192(0xc0, float:2.69E-43)
            r34 = 0
            r25 = 1
            r31 = 0
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x0381 }
            r10 = r0
            goto L_0x03d5
        L_0x03cd:
            java.lang.String r7 = "CallsSdk"
            java.lang.String r9 = "Calls SDK audio redundancy parameters are expected to look like valid JSON string"
            defpackage.hm9.p(r7, r9, r0)
            goto L_0x035d
        L_0x03d5:
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r0 = r3.setDynamicRedundancyParameters(r10)
            java.lang.Object r3 = r4.getValue()
            y7d r3 = (defpackage.y7d) r3
            qyc r3 = (defpackage.qyc) r3
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f18callssdknetdisablesharedsocket
            r7 = 0
            boolean r3 = r3.n(r4, r7)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r0 = r0.setSharedSocketDisabledForICE(r3)
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            q33 r1 = (defpackage.q33) r1
            t33 r1 = (defpackage.t33) r1
            ne7 r1 = r1.g
            java.lang.String r3 = "app.calls_sdk.logging.webrtc"
            boolean r1 = r1.getBoolean(r3, r7)
            if (r1 == 0) goto L_0x0406
            r0.setLogger(r13)
        L_0x0406:
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection r0 = r0.build()
            r2.setLogger(r13)
            re6 r1 = new re6
            r3 = 5
            r1.<init>((int) r3, (java.lang.Object) r5)
            r2.setLogConfiguration(r1)
            ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender r1 = r2.getAnalyticsSender()
            ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration r1 = r1.getConfiguration()
            un0 r3 = new un0
            r4 = 6
            r3.<init>(r4)
            r1.setApplicationNameProvider(r3)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder r1 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder
            java.lang.Object r3 = r6.getValue()
            android.content.Context r3 = (android.content.Context) r3
            r1.<init>(r3)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder r0 = r1.setPeerConnection(r0)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams r0 = r0.build()
            ru.ok.android.externcalls.sdk.ConversationFactory.init((ru.ok.android.externcalls.sdk.ConversationFactoryInitParams) r0)
            return r2
        L_0x043e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        L_0x0446:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            h23 r1 = defpackage.nec.a(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported type: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p61.invoke():java.lang.Object");
    }
}
