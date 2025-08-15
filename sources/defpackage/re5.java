package defpackage;

/* renamed from: re5  reason: default package */
public final /* synthetic */ class re5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qyc b;

    public /* synthetic */ re5(qyc qyc, int i) {
        this.a = i;
        this.b = qyc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00ad;
                case 2: goto L_0x0089;
                default: goto L_0x0005;
            }
        L_0x0005:
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f130videopreview
            qyc r12 = r12.b
            r1 = 0
            java.lang.String r0 = r12.w(r0, r1)
            r1 = 480(0x1e0, float:6.73E-43)
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x007b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x001b
            goto L_0x007b
        L_0x001b:
            khe r3 = defpackage.qyc.o     // Catch:{ all -> 0x004c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x004c }
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch:{ all -> 0x004c }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r0.toUpperCase(r4)     // Catch:{ all -> 0x004c }
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch:{ all -> 0x004c }
            boolean r4 = r3.find()     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x006d
            r4 = 1
            java.lang.String r4 = r3.group(r4)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "Required value was null."
            if (r4 == 0) goto L_0x0058
            int r1 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x004c }
            r4 = 2
            java.lang.String r3 = r3.group(r4)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004e
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x004c }
            goto L_0x006d
        L_0x004c:
            r3 = move-exception
            goto L_0x0062
        L_0x004e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x004c }
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0058:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x004c }
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0062:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = r12.e
            java.lang.String r4 = "invalid video preview template %s"
            defpackage.hm9.r(r12, r3, r4, r0)
        L_0x006d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kpa r1 = new kpa
            r1.<init>(r12, r0)
            goto L_0x0088
        L_0x007b:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kpa r1 = new kpa
            r1.<init>(r12, r0)
        L_0x0088:
            return r1
        L_0x0089:
            qyc r12 = r12.b
            xs r0 = defpackage.y7d.a
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f104reacterrors     // Catch:{ all -> 0x00a4 }
            r12.getClass()     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x00a4 }
            r2 = 0
            java.util.List r1 = r12.h(r1, r2)     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x00ac
            xs r2 = new xs     // Catch:{ all -> 0x00a4 }
            r2.<init>((java.util.Collection) r1)     // Catch:{ all -> 0x00a4 }
            r0 = r2
            goto L_0x00ac
        L_0x00a4:
            r1 = move-exception
            java.lang.String r12 = r12.e
            java.lang.String r2 = "reactErrors parse failure!"
            defpackage.hm9.p(r12, r2, r1)
        L_0x00ac:
            return r0
        L_0x00ad:
            qyc r12 = r12.b
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f28debugmode
            r1 = 0
            long r1 = (long) r1
            long r0 = r12.q(r0, r1)
            int r12 = (int) r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            ml0 r12 = defpackage.ml0.z(r12)
            return r12
        L_0x00c4:
            qyc r12 = r12.b
            java.lang.String r0 = "settings-entry-banners"
            r1 = 0
            java.lang.String r12 = r12.g(r0, r1)
            if (r12 != 0) goto L_0x00d1
        L_0x00cf:
            r0 = r1
            goto L_0x00d6
        L_0x00d1:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00cf }
            r0.<init>((java.lang.String) r12)     // Catch:{ JSONException -> 0x00cf }
        L_0x00d6:
            if (r0 == 0) goto L_0x014c
            int r12 = r0.length()
            if (r12 != 0) goto L_0x00e0
            goto L_0x014c
        L_0x00e0:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = r0.length()
            r12.<init>(r2)
            int r2 = r0.length()
            r3 = 0
        L_0x00ee:
            if (r3 >= r2) goto L_0x0144
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            if (r4 != 0) goto L_0x00f7
            goto L_0x0141
        L_0x00f7:
            java.lang.String r5 = "icon"
            java.lang.String r7 = r4.optString(r5, r1)
            if (r7 != 0) goto L_0x0101
        L_0x00ff:
            r5 = r1
            goto L_0x013c
        L_0x0101:
            java.lang.String r5 = "title"
            java.lang.String r10 = r4.optString(r5, r1)
            if (r10 != 0) goto L_0x010a
            goto L_0x00ff
        L_0x010a:
            java.lang.String r5 = "appid"
            boolean r6 = r4.has(r5)
            if (r6 != 0) goto L_0x0113
            goto L_0x00ff
        L_0x0113:
            long r5 = r4.getLong(r5)     // Catch:{ all -> 0x011c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x011c }
            goto L_0x0123
        L_0x011c:
            r5 = move-exception
            njc r6 = new njc
            r6.<init>(r5)
            r5 = r6
        L_0x0123:
            boolean r6 = r5 instanceof defpackage.njc
            if (r6 == 0) goto L_0x0128
            r5 = r1
        L_0x0128:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x00ff
            long r8 = r5.longValue()
            icd r5 = new icd
            java.lang.String r6 = "startParam"
            java.lang.String r11 = r4.optString(r6, r1)
            r6 = r5
            r6.<init>(r7, r8, r10, r11)
        L_0x013c:
            if (r5 == 0) goto L_0x0141
            r12.add(r5)
        L_0x0141:
            int r3 = r3 + 1
            goto L_0x00ee
        L_0x0144:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r1 = r12
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re5.invoke():java.lang.Object");
    }
}
