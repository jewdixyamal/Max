package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: kd1  reason: default package */
public final class kd1 {
    public final kg1 a;
    public final a4c b;
    public final a66 c;
    public final yb9 d;
    public final k56 e;
    public final aq7 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public hi9 i = new hi9();

    public kd1(kg1 kg1, a4c a4c, bk bkVar, yb9 yb9, ky0 ky0, aq7 aq7) {
        this.a = kg1;
        this.b = a4c;
        this.c = bkVar;
        this.d = yb9;
        this.e = ky0;
        this.f = aq7;
    }

    public static rd8 a(qd8 qd8, rd8 rd8, List list, ArrayList arrayList, boolean z) {
        rd8 rd82 = rd8.a;
        if (rd8 == null) {
            return rd82;
        }
        int i2 = jd1.$EnumSwitchMapping$0[rd8.ordinal()];
        return i2 != 1 ? (i2 == 2 && z) ? rd82 : rd8 : (list.contains(eg1.a) || list.contains(eg1.b)) ? rd8.b : arrayList.contains(qd8) ? rd8.o : rd8;
    }

    public static boolean d(ni9 ni9) {
        Object obj = ni9.get();
        rd8 rd8 = rd8.c;
        if (obj == rd8) {
            return false;
        }
        if (ni9.get() == rd8.b) {
            ni9.set(rd8.a);
        }
        if (ni9.get() != rd8.o) {
            return true;
        }
        ni9.set(rd8);
        return true;
    }

    public static void e(ni9 ni9) {
        rd8 rd8 = (rd8) ni9.get();
        if (rd8 == rd8.c) {
            ni9.set(rd8.b);
        } else if (rd8 == rd8.o) {
            ni9.set(rd8.a);
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r20v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r20v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v2, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v2, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v2, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v2, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v2, types: [rpa, java.lang.Object] */
    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.d.getClass();
        zad e2 = yb9.e(jSONObject);
        kg1 kg1 = this.a;
        bg1 bg1 = kg1.a.a;
        String t = f8.t(jSONObject2, "adminId");
        bg1 b2 = t != null ? bg1.b(t) : null;
        String t2 = f8.t(jSONObject2, "participantId");
        bg1 b3 = t2 != null ? bg1.b(t2) : null;
        boolean optBoolean = jSONObject2.optBoolean("muteAll", false);
        Map map = oz4.a;
        if (b3 != null && !b3.equals(bg1)) {
            kg1.f(new dqa(b3, new Object(), new wmc(f(jSONObject, b3, "handleMuteParticipant", jSONObject2.has("muteStates") ? f46.n(jSONObject) : map, false), false), new Object(), new Object(), new Object(), new Object()), (zad) null);
        } else if (b2 != null && b2.equals(bg1)) {
            m(jSONObject, "handleMuteParticipant", 3, e2, false);
            ArrayList arrayList = new ArrayList(kg1.r());
            for (bg1 bg12 : kg1.d(e2).keySet()) {
                arrayList.add(new dqa(bg12, new Object(), new wmc(f(jSONObject, bg12, "handleMuteParticipant", map, false), false), new Object(), new Object(), new Object(), new Object()));
            }
            kg1.g(e2, arrayList);
        } else if (optBoolean) {
            c(jSONObject2, e2, true);
            m(jSONObject, "handleMuteParticipant", 3, e2, false);
            ArrayList arrayList2 = new ArrayList(kg1.r());
            for (bg1 bg13 : kg1.d(e2).keySet()) {
                arrayList2.add(new dqa(bg13, new Object(), new wmc(f(jSONObject, bg13, "handleMuteParticipant", map, false), false), new Object(), new Object(), new Object(), new Object()));
            }
            kg1.g(e2, arrayList2);
        } else {
            c(jSONObject2, e2, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r7v11, types: [oz4] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0223 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0137 A[Catch:{ JSONException -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(org.json.JSONObject r24, defpackage.zad r25, boolean r26) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            java.lang.String r10 = "SCREEN_SHARING"
            java.lang.String r11 = "VIDEO"
            java.lang.String r12 = "AUDIO"
            java.lang.String r13 = "MOVIE_SHARING"
            r16 = 0
            r6 = 1
            qd8 r5 = defpackage.qd8.o
            qd8 r4 = defpackage.qd8.a
            qd8 r3 = defpackage.qd8.b
            qd8 r2 = defpackage.qd8.c
            k56 r0 = r8.e
            java.lang.Object r0 = r0.invoke()
            r1 = r25
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            r17 = 0
            java.lang.String r0 = "mediaOptions"
            boolean r18 = r9.has(r0)     // Catch:{ JSONException -> 0x0091 }
            if (r18 != 0) goto L_0x0036
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x0091 }
            goto L_0x009d
        L_0x0036:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0091 }
            r7.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r0 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x0091 }
            r14 = r16
        L_0x0041:
            int r15 = r0.length()     // Catch:{ JSONException -> 0x0091 }
            if (r14 >= r15) goto L_0x008f
            java.lang.String r15 = r0.getString(r14)     // Catch:{ JSONException -> 0x0091 }
            if (r15 != 0) goto L_0x0050
        L_0x004d:
            r15 = r17
            goto L_0x0088
        L_0x0050:
            int r19 = r15.hashCode()
            switch(r19) {
                case -214017395: goto L_0x0074;
                case 62628790: goto L_0x006b;
                case 81665115: goto L_0x0062;
                case 1982835689: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            r15 = -1
            goto L_0x007d
        L_0x0059:
            boolean r15 = r15.equals(r10)
            if (r15 != 0) goto L_0x0060
            goto L_0x0057
        L_0x0060:
            r15 = 3
            goto L_0x007d
        L_0x0062:
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0069
            goto L_0x0057
        L_0x0069:
            r15 = 2
            goto L_0x007d
        L_0x006b:
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0072
            goto L_0x0057
        L_0x0072:
            r15 = r6
            goto L_0x007d
        L_0x0074:
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L_0x007b
            goto L_0x0057
        L_0x007b:
            r15 = r16
        L_0x007d:
            switch(r15) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0085;
                case 2: goto L_0x0083;
                case 3: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x004d
        L_0x0081:
            r15 = r2
            goto L_0x0088
        L_0x0083:
            r15 = r3
            goto L_0x0088
        L_0x0085:
            r15 = r4
            goto L_0x0088
        L_0x0087:
            r15 = r5
        L_0x0088:
            if (r15 == 0) goto L_0x008d
            r7.add(r15)     // Catch:{ JSONException -> 0x0091 }
        L_0x008d:
            int r14 = r14 + r6
            goto L_0x0041
        L_0x008f:
            r0 = r7
            goto L_0x009d
        L_0x0091:
            r0 = move-exception
            java.lang.String r7 = "media options parsing error"
            a4c r14 = r8.b
            java.lang.String r15 = "CallMediaOptionsDelegate"
            r14.logException(r15, r7, r0)
            nz4 r0 = defpackage.nz4.a
        L_0x009d:
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00f3
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x00ae
            oz4 r7 = defpackage.oz4.a
            r14 = r7
            goto L_0x00da
        L_0x00ae:
            java.util.HashMap r7 = defpackage.f46.n(r24)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x00bb:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x00da
            java.lang.Object r19 = r15.next()
            r6 = r19
            qd8 r6 = (defpackage.qd8) r6
            java.lang.Object r19 = r7.get(r6)
            r1 = r19
            rd8 r1 = (defpackage.rd8) r1
            if (r1 == 0) goto L_0x00d6
            r14.put(r6, r1)
        L_0x00d6:
            r1 = r25
            r6 = 1
            goto L_0x00bb
        L_0x00da:
            boolean r1 = r0.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "unmuteOptions"
            boolean r1 = r9.has(r1)
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "unmute"
            boolean r1 = r9.has(r1)
            if (r1 == 0) goto L_0x00f3
            goto L_0x00fd
        L_0x00f3:
            r20 = r2
            r21 = r3
            r22 = r4
            r19 = r5
            r14 = r6
            goto L_0x011a
        L_0x00fd:
            r7 = 0
            r15 = 0
            java.lang.String r19 = "handleMuteParticipant"
            r1 = r23
            r20 = r2
            r2 = r24
            r21 = r3
            r3 = r19
            r22 = r4
            r4 = r14
            r14 = r5
            r5 = r7
            r7 = r6
            r6 = r25
            r19 = r14
            r14 = r7
            r7 = r15
            r1.n(r2, r3, r4, r5, r6, r7)
        L_0x011a:
            hi9 r1 = r8.i
            rd8 r2 = r1.a
            rd8 r3 = r1.b
            rd8 r4 = r1.c
            rd8 r1 = r1.d
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ JSONException -> 0x0183 }
            r5.<init>()     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r6 = "requestedMedia"
            org.json.JSONArray r6 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x0183 }
            r7 = r16
        L_0x0131:
            int r9 = r6.length()     // Catch:{ JSONException -> 0x0183 }
            if (r7 >= r9) goto L_0x0187
            java.lang.String r9 = r6.getString(r7)     // Catch:{ JSONException -> 0x0183 }
            if (r9 != 0) goto L_0x0140
        L_0x013d:
            r9 = r17
            goto L_0x017c
        L_0x0140:
            int r15 = r9.hashCode()
            switch(r15) {
                case -214017395: goto L_0x0164;
                case 62628790: goto L_0x015b;
                case 81665115: goto L_0x0152;
                case 1982835689: goto L_0x0149;
                default: goto L_0x0147;
            }
        L_0x0147:
            r9 = -1
            goto L_0x016d
        L_0x0149:
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0150
            goto L_0x0147
        L_0x0150:
            r9 = 3
            goto L_0x016d
        L_0x0152:
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0159
            goto L_0x0147
        L_0x0159:
            r9 = 2
            goto L_0x016d
        L_0x015b:
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0162
            goto L_0x0147
        L_0x0162:
            r9 = r14
            goto L_0x016d
        L_0x0164:
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x016b
            goto L_0x0147
        L_0x016b:
            r9 = r16
        L_0x016d:
            switch(r9) {
                case 0: goto L_0x017a;
                case 1: goto L_0x0177;
                case 2: goto L_0x0174;
                case 3: goto L_0x0171;
                default: goto L_0x0170;
            }
        L_0x0170:
            goto L_0x013d
        L_0x0171:
            r9 = r20
            goto L_0x017c
        L_0x0174:
            r9 = r21
            goto L_0x017c
        L_0x0177:
            r9 = r22
            goto L_0x017c
        L_0x017a:
            r9 = r19
        L_0x017c:
            if (r9 == 0) goto L_0x0181
            r5.add(r9)     // Catch:{ JSONException -> 0x0183 }
        L_0x0181:
            int r7 = r7 + r14
            goto L_0x0131
        L_0x0183:
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0187:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r14
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0195:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01d9
            java.lang.Object r9 = r0.next()
            qd8 r9 = (defpackage.qd8) r9
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x01cb
            if (r9 == r14) goto L_0x01bf
            r10 = 2
            if (r9 == r10) goto L_0x01b6
            r11 = 3
            if (r9 == r11) goto L_0x01b0
            goto L_0x0195
        L_0x01b0:
            r9 = r19
            r7.put(r9, r1)
            goto L_0x0195
        L_0x01b6:
            r9 = r19
            r12 = r20
            r11 = 3
            r7.put(r12, r4)
            goto L_0x0195
        L_0x01bf:
            r9 = r19
            r12 = r20
            r13 = r21
            r10 = 2
            r11 = 3
            r7.put(r13, r3)
            goto L_0x0195
        L_0x01cb:
            r9 = r19
            r12 = r20
            r13 = r21
            r15 = r22
            r10 = 2
            r11 = 3
            r7.put(r15, r2)
            goto L_0x0195
        L_0x01d9:
            r9 = r19
            r12 = r20
            r13 = r21
            r15 = r22
            rd8 r0 = defpackage.rd8.c
            if (r2 != r0) goto L_0x01f1
            boolean r2 = r5.contains(r15)
            if (r2 == 0) goto L_0x01f1
            r5.remove(r15)
            r7.remove(r15)
        L_0x01f1:
            if (r3 != r0) goto L_0x01ff
            boolean r2 = r5.contains(r13)
            if (r2 == 0) goto L_0x01ff
            r5.remove(r13)
            r7.remove(r13)
        L_0x01ff:
            if (r4 != r0) goto L_0x020d
            boolean r2 = r5.contains(r12)
            if (r2 == 0) goto L_0x020d
            r5.remove(r12)
            r7.remove(r12)
        L_0x020d:
            if (r1 != r0) goto L_0x021b
            boolean r0 = r5.contains(r9)
            if (r0 == 0) goto L_0x021b
            r5.remove(r9)
            r7.remove(r9)
        L_0x021b:
            if (r6 == 0) goto L_0x0224
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0224
            return
        L_0x0224:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0230
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0243
        L_0x0230:
            wi9 r0 = new wi9
            vi9 r1 = new vi9
            r1.<init>(r7)
            r2 = r26
            r0.<init>(r1, r2)
            w51 r1 = defpackage.w51.K0
            a66 r2 = r8.c
            r2.invoke(r1, r0)
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd1.c(org.json.JSONObject, zad, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        if (r6 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0175, code lost:
        if (r6 == null) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hi9 f(org.json.JSONObject r17, defpackage.bg1 r18, java.lang.String r19, java.util.Map r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            kg1 r5 = r0.a
            if (r2 == 0) goto L_0x0013
            fg1 r7 = r5.j(r2)
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            boolean r8 = r20.isEmpty()
            r8 = r8 ^ 1
            qd8 r9 = defpackage.qd8.o
            qd8 r10 = defpackage.qd8.c
            qd8 r11 = defpackage.qd8.b
            qd8 r12 = defpackage.qd8.a
            java.lang.String r13 = "CallMediaOptionsDelegate"
            a4c r14 = r0.b
            if (r8 == 0) goto L_0x0077
            java.util.HashMap r2 = new java.util.HashMap
            qd8[] r5 = defpackage.qd8.values()
            int r5 = r5.length
            r2.<init>(r5)
            hi9 r5 = r0.i
            rd8 r5 = r5.a
            java.lang.Object r8 = r4.get(r12)
            rd8 r8 = (defpackage.rd8) r8
            if (r8 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r8
        L_0x0040:
            r2.put(r12, r5)
            hi9 r5 = r0.i
            rd8 r5 = r5.b
            java.lang.Object r8 = r4.get(r11)
            rd8 r8 = (defpackage.rd8) r8
            if (r8 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r8
        L_0x0051:
            r2.put(r11, r5)
            hi9 r5 = r0.i
            rd8 r5 = r5.c
            java.lang.Object r8 = r4.get(r10)
            rd8 r8 = (defpackage.rd8) r8
            if (r8 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r5 = r8
        L_0x0062:
            r2.put(r10, r5)
            hi9 r0 = r0.i
            rd8 r0 = r0.d
            java.lang.Object r4 = r4.get(r9)
            rd8 r4 = (defpackage.rd8) r4
            if (r4 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = r4
        L_0x0073:
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x0077:
            fg1 r4 = r5.a
            bg1 r4 = r4.a
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 == 0) goto L_0x00a8
            java.util.HashMap r2 = new java.util.HashMap
            qd8[] r4 = defpackage.qd8.values()
            int r4 = r4.length
            r2.<init>(r4)
            hi9 r4 = r0.i
            rd8 r4 = r4.a
            r2.put(r12, r4)
            hi9 r4 = r0.i
            rd8 r4 = r4.b
            r2.put(r11, r4)
            hi9 r4 = r0.i
            rd8 r4 = r4.c
            r2.put(r10, r4)
            hi9 r0 = r0.i
            rd8 r0 = r0.d
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x00a8:
            if (r7 == 0) goto L_0x00ad
            hi9 r0 = r7.b
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 == 0) goto L_0x00d3
            java.util.HashMap r2 = new java.util.HashMap
            qd8[] r0 = defpackage.qd8.values()
            int r0 = r0.length
            r2.<init>(r0)
            hi9 r0 = r7.b
            rd8 r0 = r0.a
            r2.put(r12, r0)
            hi9 r0 = r7.b
            rd8 r4 = r0.b
            r2.put(r11, r4)
            rd8 r4 = r0.c
            r2.put(r10, r4)
            rd8 r0 = r0.d
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x00d3:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "createParticipantMediaOptions null participant or null media options"
            r14.log(r13, r0)
        L_0x00dd:
            if (r21 == 0) goto L_0x0109
            java.util.HashMap r0 = defpackage.f46.n(r17)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00eb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0109
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            qd8 r5 = (defpackage.qd8) r5
            java.lang.Object r4 = r4.getValue()
            rd8 r4 = (defpackage.rd8) r4
            if (r4 == 0) goto L_0x00eb
            r2.put(r5, r4)
            goto L_0x00eb
        L_0x0109:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "unmuteOptions"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            if (r5 == 0) goto L_0x014e
            int r15 = r5.length()     // Catch:{ JSONException -> 0x012d }
            r6 = 0
        L_0x011b:
            if (r6 >= r15) goto L_0x014e
            java.lang.Object r0 = r5.get(r6)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x012d }
            qd8 r0 = defpackage.qd8.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x012f }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x012f }
            r18 = r5
            goto L_0x0146
        L_0x012d:
            r0 = move-exception
            goto L_0x014b
        L_0x012f:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x012d }
            r8.<init>()     // Catch:{ JSONException -> 0x012d }
            r18 = r5
            java.lang.String r5 = "invalid MediaOption in "
            r8.append(r5)     // Catch:{ JSONException -> 0x012d }
            r8.append(r3)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r5 = r8.toString()     // Catch:{ JSONException -> 0x012d }
            r14.logException(r13, r5, r0)     // Catch:{ JSONException -> 0x012d }
        L_0x0146:
            int r6 = r6 + 1
            r5 = r18
            goto L_0x011b
        L_0x014b:
            r14.logException(r13, r3, r0)
        L_0x014e:
            java.lang.String r0 = "unmute"
            r3 = 0
            boolean r0 = r1.optBoolean(r0, r3)
            java.lang.String r3 = "roles"
            boolean r3 = r1.has(r3)
            nz4 r5 = defpackage.nz4.a
            if (r3 == 0) goto L_0x016f
            java.util.ArrayList r5 = defpackage.f46.y(r17)     // Catch:{ Exception -> 0x0164 }
            goto L_0x0177
        L_0x0164:
            if (r7 == 0) goto L_0x0169
            java.util.List r6 = r7.e
            goto L_0x016a
        L_0x0169:
            r6 = 0
        L_0x016a:
            if (r6 != 0) goto L_0x016d
            goto L_0x0177
        L_0x016d:
            r5 = r6
            goto L_0x0177
        L_0x016f:
            if (r7 == 0) goto L_0x0174
            java.util.List r6 = r7.e
            goto L_0x0175
        L_0x0174:
            r6 = 0
        L_0x0175:
            if (r6 != 0) goto L_0x016d
        L_0x0177:
            hi9 r1 = new hi9
            r1.<init>()
            java.lang.Object r3 = r2.get(r12)
            rd8 r3 = (defpackage.rd8) r3
            rd8 r3 = a(r12, r3, r5, r4, r0)
            r1.a = r3
            java.lang.Object r3 = r2.get(r11)
            rd8 r3 = (defpackage.rd8) r3
            rd8 r3 = a(r11, r3, r5, r4, r0)
            r1.b = r3
            java.lang.Object r3 = r2.get(r10)
            rd8 r3 = (defpackage.rd8) r3
            rd8 r3 = a(r10, r3, r5, r4, r0)
            r1.c = r3
            java.lang.Object r2 = r2.get(r9)
            rd8 r2 = (defpackage.rd8) r2
            rd8 r0 = a(r9, r2, r5, r4, r0)
            r1.d = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd1.f(org.json.JSONObject, bg1, java.lang.String, java.util.Map, boolean):hi9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = (java.util.Map) r2.g.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map g(defpackage.zad r3, int r4) {
        /*
            r2 = this;
            int[] r0 = defpackage.jd1.$EnumSwitchMapping$1
            int r4 = defpackage.au1.s(r4)
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L_0x001e
            oz4 r0 = defpackage.oz4.a
            r1 = 2
            if (r4 == r1) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            java.util.LinkedHashMap r2 = r2.g
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            r0 = r2
            goto L_0x0026
        L_0x001e:
            hi9 r2 = r2.h(r3)
            java.util.EnumMap r0 = r2.a()
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd1.g(zad, int):java.util.Map");
    }

    public final hi9 h(zad zad) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(zad);
        if (obj == null) {
            obj = new hi9();
            linkedHashMap.put(zad, obj);
        }
        return (hi9) obj;
    }

    public final void i(bg1 bg1, boolean z) {
        if (!z && tpa.f(this.a.a.a, bg1)) {
            sq1 sq1 = new sq1(0, 4, hi9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            Object obj = sq1.get();
            rd8 rd8 = rd8.c;
            rd8 rd82 = rd8.o;
            if (obj == rd8) {
                sq1.set(rd82);
            }
            sq1 sq12 = new sq1(0, 5, hi9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (sq12.get() == rd8) {
                sq12.set(rd82);
            }
            sq1 sq13 = new sq1(0, 6, hi9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (sq13.get() == rd8) {
                sq13.set(rd82);
            }
            sq1 sq14 = new sq1(0, 7, hi9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (sq14.get() == rd8) {
                sq14.set(rd82);
            }
        }
    }

    public final void j(ArrayList arrayList, bg1 bg1) {
        ArrayList arrayList2 = arrayList;
        fg1 fg1 = this.a.a;
        if (bg1.equals(fg1.a)) {
            ArrayList arrayList3 = fg1.d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            if (arrayList2.contains(eg1.b)) {
                e(new sq1(0, 8, hi9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 9, hi9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 10, hi9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 11, hi9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
            }
        }
    }

    public final void k() {
        EnumMap a2 = this.i.a();
        this.c.invoke(w51.Q0, new vi9(a2));
    }

    public final void l(Map map, JSONObject jSONObject, String str, int i2, zad zad, boolean z) {
        hi9 hi9 = new hi9();
        qd8 qd8 = qd8.a;
        rd8 rd8 = (rd8) map.get(qd8);
        if (rd8 != null) {
            hi9.a = rd8;
        }
        qd8 qd82 = qd8.b;
        rd8 rd82 = (rd8) map.get(qd82);
        if (rd82 != null) {
            hi9.b = rd82;
        }
        qd8 qd83 = qd8.c;
        rd8 rd83 = (rd8) map.get(qd83);
        if (rd83 != null) {
            hi9.c = rd83;
        }
        qd8 qd84 = qd8.o;
        rd8 rd84 = (rd8) map.get(qd84);
        if (rd84 != null) {
            hi9.d = rd84;
        }
        hi9 h2 = h(zad);
        EnumMap enumMap = new EnumMap(qd8.class);
        rd8 rd85 = hi9.a;
        if (rd85 != h2.a) {
            enumMap.put(qd8, rd85);
        }
        rd8 rd86 = hi9.b;
        if (rd86 != h2.b) {
            enumMap.put(qd82, rd86);
        }
        rd8 rd87 = hi9.c;
        if (rd87 != h2.c) {
            enumMap.put(qd83, rd87);
        }
        rd8 rd88 = hi9.d;
        if (rd88 != h2.d) {
            enumMap.put(qd84, rd88);
        }
        if (!enumMap.isEmpty()) {
            this.g.put(zad, enumMap);
            this.h.put(zad, hi9);
            if (z) {
                n(jSONObject, str, g(zad, i2), false, zad, (zad) null);
            }
        }
    }

    public final void m(JSONObject jSONObject, String str, int i2, zad zad, boolean z) {
        Map map;
        if (jSONObject.has("muteStates")) {
            map = f46.n(jSONObject);
        } else if (!jSONObject.has("requestedMedia")) {
            map = oz4.a;
        } else {
            return;
        }
        l(map, jSONObject, str, i2, zad, z);
    }

    public final void n(JSONObject jSONObject, String str, Map map, boolean z, zad zad, zad zad2) {
        if (zad2 == null) {
            zad2 = (zad) this.e.invoke();
        }
        if (zad.equals(zad2)) {
            hi9 f2 = f(jSONObject, this.a.a.a, str, map, z);
            if (!f2.equals(this.i)) {
                this.i = f2;
                k();
            }
            this.g.put(zad, oz4.a);
        }
    }
}
