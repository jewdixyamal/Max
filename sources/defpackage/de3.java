package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* renamed from: de3  reason: default package */
public final class de3 extends ol implements lme, hua {
    public final boolean X;
    public final gaf Y;
    public final boolean Z;
    public final long o;
    public final long[] s0;
    public final boolean t0;
    public final List u0;
    public final List v0;

    public de3(long j, long j2, boolean z, gaf gaf, boolean z2, long[] jArr, boolean z3, ArrayList arrayList, ArrayList arrayList2) {
        super(j);
        this.o = j2;
        this.X = z;
        this.Y = gaf;
        this.Z = z2;
        this.s0 = jArr;
        this.t0 = z3;
        this.u0 = arrayList;
        this.v0 = arrayList2;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, eaf] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0271, code lost:
        if (r10.equals("3M") == false) goto L_0x025e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.de3 v(byte[] r30) {
        /*
            r1 = 1
            ru.ok.tamtam.nano.Tasks$Config r2 = new ru.ok.tamtam.nano.Tasks$Config
            r2.<init>()
            r3 = r30
            qw8 r2 = defpackage.qw8.mergeFrom(r2, r3)     // Catch:{ InvalidProtocolBufferNanoException -> 0x02f8 }
            ru.ok.tamtam.nano.Tasks$Config r2 = (ru.ok.tamtam.nano.Tasks.Config) r2     // Catch:{ InvalidProtocolBufferNanoException -> 0x02f8 }
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.String[] r3 = r2.excludedFolders
            java.util.List r3 = java.util.Arrays.asList(r3)
            r14.<init>(r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            ru.ok.tamtam.nano.a[] r3 = r2.folders
            int r3 = r3.length
            r13.<init>(r3)
            r3 = 0
        L_0x0022:
            ru.ok.tamtam.nano.a[] r4 = r2.folders
            int r5 = r4.length
            r6 = 0
            if (r3 >= r5) goto L_0x00e8
            r4 = r4[r3]
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            long[] r7 = r4.d
            int r8 = r7.length
            r9 = 0
        L_0x0033:
            if (r9 >= r8) goto L_0x0040
            r10 = r7[r9]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5.add(r10)
            int r9 = r9 + r1
            goto L_0x0033
        L_0x0040:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            long[] r8 = r4.e
            int r9 = r8.length
            r10 = 0
        L_0x0049:
            if (r10 >= r9) goto L_0x0056
            r11 = r8[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7.add(r11)
            int r10 = r10 + r1
            goto L_0x0049
        L_0x0056:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String[] r9 = r4.f
            int r10 = r9.length
            r11 = 0
        L_0x005f:
            if (r11 >= r10) goto L_0x006c
            r12 = r9[r11]
            pa2 r12 = defpackage.pa2.valueOf(r12)
            r8.add(r12)
            int r11 = r11 + r1
            goto L_0x005f
        L_0x006c:
            java.lang.String r9 = r4.c
            java.lang.String r10 = "NO_EMOJI"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0079
            r18 = r6
            goto L_0x007b
        L_0x0079:
            r18 = r9
        L_0x007b:
            ru.ok.tamtam.nano.Protos$MessageElements r6 = r4.h
            ru.ok.tamtam.nano.Protos$MessageElement[] r6 = r6.elements
            java.util.ArrayList r6 = defpackage.ou8.a(r6)
            java.util.ArrayList r6 = defpackage.iz7.v(r6)
            qa2 r9 = new qa2
            java.lang.String r10 = r4.a
            java.lang.String r11 = r4.b
            boolean r12 = r4.g
            if (r6 == 0) goto L_0x0094
        L_0x0091:
            r23 = r6
            goto L_0x0099
        L_0x0094:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x0091
        L_0x0099:
            long r0 = r4.i
            zw5 r6 = r4.j
            java.util.EnumMap r15 = new java.util.EnumMap
            r30 = r14
            java.lang.Class<pa2> r14 = defpackage.pa2.class
            r15.<init>(r14)
            java.io.Serializable r6 = r6.b
            long[] r6 = (long[]) r6
            int r14 = r6.length
            if (r14 != 0) goto L_0x00b1
            r14 = 1
            r29 = 1
            goto L_0x00b4
        L_0x00b1:
            r14 = 1
            r29 = 0
        L_0x00b4:
            r16 = r29 ^ 1
            if (r16 == 0) goto L_0x00bd
            pa2 r14 = defpackage.pa2.A0
            r15.put(r14, r6)
        L_0x00bd:
            zw5 r6 = r4.k
            java.util.ArrayList r27 = defpackage.xfg.n(r6)
            zw5 r4 = r4.l
            java.util.EnumSet r28 = defpackage.xfg.m(r4)
            r4 = r15
            r15 = r9
            r16 = r10
            r17 = r11
            r19 = r5
            r20 = r7
            r21 = r8
            r22 = r12
            r24 = r0
            r26 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            r13.add(r9)
            r0 = 1
            int r3 = r3 + r0
            r14 = r30
            r1 = r0
            goto L_0x0022
        L_0x00e8:
            r0 = r1
            r30 = r14
            de3 r1 = new de3
            long r4 = r2.requestId
            long r7 = r2.chatId
            boolean r9 = r2.isPushToken
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.userSettings
            if (r3 == 0) goto L_0x02e7
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L_0x00ff
            goto L_0x02e7
        L_0x00ff:
            eaf r6 = new eaf
            r6.<init>()
            java.lang.String r10 = "pushNewContacts"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x011c
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.a = r10
        L_0x011c:
            java.lang.String r10 = "dontDustirbUntil"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0134
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            long r10 = java.lang.Long.parseLong(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.b = r10
        L_0x0134:
            java.lang.String r10 = "dialogsPushNotification"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0144
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.c = r10
        L_0x0144:
            java.lang.String r10 = "chatsPushNotification"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0154
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.d = r10
        L_0x0154:
            java.lang.String r10 = "pushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0164
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.e = r10
        L_0x0164:
            java.lang.String r10 = "dialogsPushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0174
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.f = r10
        L_0x0174:
            java.lang.String r10 = "chatsPushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0184
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.g = r10
        L_0x0184:
            java.lang.String r10 = "hiddenOnline"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0198
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.h = r10
        L_0x0198:
            java.lang.String r10 = "led"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01ac
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.i = r10
        L_0x01ac:
            java.lang.String r10 = "dialogsLed"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01c0
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.j = r10
        L_0x01c0:
            java.lang.String r10 = "chatsLed"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01d4
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.k = r10
        L_0x01d4:
            java.lang.String r10 = "vibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01ec
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.l = r10
        L_0x01ec:
            java.lang.String r10 = "dialogsVibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0204
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.m = r10
        L_0x0204:
            java.lang.String r10 = "chatsVibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x021c
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.n = r10
        L_0x021c:
            java.lang.String r10 = "chatsInvite"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0230
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = defpackage.h4f.d(r10)
            r6.o = r10
        L_0x0230:
            java.lang.String r10 = "incomingCall"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0244
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = defpackage.h4f.d(r10)
            r6.p = r10
        L_0x0244:
            java.lang.String r10 = "inactiveTTL"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0289
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            faf r11 = defpackage.faf.TTL_6M
            if (r10 == 0) goto L_0x0287
            r12 = -1
            int r14 = r10.hashCode()
            switch(r14) {
                case 1596: goto L_0x0274;
                case 1658: goto L_0x026b;
                case 1751: goto L_0x0260;
                default: goto L_0x025e;
            }
        L_0x025e:
            r0 = r12
            goto L_0x027e
        L_0x0260:
            java.lang.String r0 = "6M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0269
            goto L_0x025e
        L_0x0269:
            r0 = 2
            goto L_0x027e
        L_0x026b:
            java.lang.String r14 = "3M"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x027e
            goto L_0x025e
        L_0x0274:
            java.lang.String r0 = "1M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x027d
            goto L_0x025e
        L_0x027d:
            r0 = 0
        L_0x027e:
            switch(r0) {
                case 0: goto L_0x0285;
                case 1: goto L_0x0282;
                case 2: goto L_0x0287;
                default: goto L_0x0281;
            }
        L_0x0281:
            goto L_0x0287
        L_0x0282:
            faf r11 = defpackage.faf.TTL_3M
            goto L_0x0287
        L_0x0285:
            faf r11 = defpackage.faf.TTL_1M
        L_0x0287:
            r6.q = r11
        L_0x0289:
            java.lang.String r0 = "groupChatCallNotificationStatus"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x029d
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.h4f.c(r0)
            r6.r = r0
        L_0x029d:
            java.lang.String r0 = "suggestStickersStatus"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x02b1
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.h4f.e(r0)
            r6.s = r0
        L_0x02b1:
            java.lang.String r0 = "audioTranscriptionEnabled"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x02c9
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.t = r0
        L_0x02c9:
            java.lang.String r0 = "unsafeFiles"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x02e1
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.w = r0
        L_0x02e1:
            gaf r0 = new gaf
            r0.<init>(r6)
            goto L_0x02e8
        L_0x02e7:
            r0 = r6
        L_0x02e8:
            boolean r10 = r2.reset
            long[] r11 = r2.syncChatIds
            boolean r12 = r2.isForFolders
            r3 = r1
            r6 = r7
            r8 = r9
            r9 = r0
            r14 = r30
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x02f8:
            r0 = move-exception
            ru.ok.tamtam.nano.ProtoException r1 = new ru.ok.tamtam.nano.ProtoException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.v(byte[]):de3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r7 = this;
            pl r0 = r7.c
            eoe r0 = r0.e()
            iua r1 = defpackage.iua.TYPE_CONFIG
            long r2 = r7.a
            java.util.List r0 = r0.h(r2, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "de3"
            r3 = 3
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()
            une r1 = (defpackage.une) r1
            hua r4 = r1.f
            de3 r4 = (defpackage.de3) r4
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0012
            goe r4 = defpackage.goe.FAILED
            goe r1 = r1.b
            if (r1 == r4) goto L_0x0012
            java.lang.String r7 = "onPreExecute: removed existent config task"
            defpackage.hm9.m(r2, r7, new java.lang.Object[0])
            return r3
        L_0x0037:
            boolean r0 = r7.Z
            r1 = 1
            if (r0 == 0) goto L_0x003d
            return r1
        L_0x003d:
            boolean r0 = r7.X
            if (r0 == 0) goto L_0x005f
            java.lang.String r7 = r7.u()
            boolean r7 = defpackage.oag.t(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onPreExecute: tokenEmpty="
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.hm9.m(r2, r0, new java.lang.Object[0])
            if (r7 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = r1
        L_0x005e:
            return r3
        L_0x005f:
            gaf r0 = r7.Y
            if (r0 == 0) goto L_0x0064
            return r1
        L_0x0064:
            long[] r0 = r7.s0
            if (r0 == 0) goto L_0x006c
            int r0 = r0.length
            if (r0 <= 0) goto L_0x006c
            return r1
        L_0x006c:
            boolean r0 = r7.t0
            if (r0 == 0) goto L_0x0071
            return r1
        L_0x0071:
            pl r0 = r7.c
            p82 r0 = r0.c()
            long r4 = r7.o
            e52 r7 = r0.C(r4)
            if (r7 == 0) goto L_0x00af
            boolean r0 = r7.C()
            if (r0 != 0) goto L_0x0086
            goto L_0x00af
        L_0x0086:
            k92 r7 = r7.b
            j92 r0 = r7.b
            int r0 = r0.ordinal()
            r2 = 2
            if (r0 == 0) goto L_0x00a7
            if (r0 == r1) goto L_0x009e
            if (r0 != r2) goto L_0x0096
            goto L_0x009e
        L_0x0096:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid chat type"
            r7.<init>(r0)
            throw r7
        L_0x009e:
            long r3 = r7.a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00ae
            goto L_0x00ad
        L_0x00a7:
            i92 r0 = defpackage.i92.Z
            i92 r7 = r7.c
            if (r7 != r0) goto L_0x00ae
        L_0x00ad:
            return r2
        L_0x00ae:
            return r1
        L_0x00af:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.c():int");
    }

    public final void d() {
        this.c.e().d(this.a);
    }

    public final void e(gle gle) {
        List list;
        if (gle instanceof fe3) {
            fe3 fe3 = (fe3) gle;
            ((p7b) ((m7b) this.c.c.getValue())).b.m("hash", fe3.c);
            this.c.b().c(new che(true));
            if (fe3.o != null) {
                ((p7b) ((m7b) this.c.c.getValue())).c.z(fe3.o);
                if (Boolean.FALSE.equals(fe3.o.u)) {
                    t33 t33 = (t33) ((q33) this.c.e.getValue());
                    t33.m("app.pin_" + t33.t(), (String) null);
                }
                this.c.b().c(new su(2));
            }
            List list2 = this.v0;
            if (list2 != null && (list = this.u0) != null && ((ta2) this.c.v.getValue()) != null && this.t0) {
                ((zb2) ((ta2) this.c.v.getValue())).f(list, new HashSet(list2));
            }
        }
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj == null || de3.class != obj.getClass()) {
            return false;
        }
        de3 de3 = (de3) obj;
        if (this.o != de3.o || this.X != de3.X || this.Z != de3.Z || this.t0 != de3.t0) {
            return false;
        }
        List list3 = this.v0;
        if (list3 != null && (list2 = de3.v0) != null && !list3.equals(list2)) {
            return false;
        }
        List list4 = this.u0;
        if (list4 != null && (list = de3.u0) != null && !list4.equals(list)) {
            return false;
        }
        gaf gaf = de3.Y;
        gaf gaf2 = this.Y;
        return gaf2 != null ? gaf2.equals(gaf) : gaf == null;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [qpd, java.util.Map<java.lang.String, java.lang.String>] */
    public final byte[] f() {
        List list;
        Tasks.Config config = new Tasks.Config();
        config.requestId = this.a;
        config.chatId = this.o;
        config.isPushToken = this.X;
        config.reset = this.Z;
        config.isForFolders = this.t0;
        gaf gaf = this.Y;
        if (gaf == null) {
            config.userSettings = new HashMap();
        } else {
            ? qpd = new qpd(0);
            Boolean bool = gaf.a;
            if (bool != null) {
                qpd.put("pushNewContacts", String.valueOf(bool));
            }
            Long l = gaf.b;
            if (l != null) {
                qpd.put("dontDustirbUntil", String.valueOf(l));
            }
            String str = gaf.c;
            if (str != null) {
                qpd.put("dialogsPushNotification", str);
            }
            String str2 = gaf.d;
            if (str2 != null) {
                qpd.put("chatsPushNotification", str2);
            }
            String str3 = gaf.e;
            if (str3 != null) {
                qpd.put("pushSound", str3);
            }
            String str4 = gaf.f;
            if (str4 != null) {
                qpd.put("dialogsPushSound", str4);
            }
            String str5 = gaf.g;
            if (str5 != null) {
                qpd.put("chatsPushSound", str5);
            }
            Boolean bool2 = gaf.h;
            if (bool2 != null) {
                qpd.put("hiddenOnline", String.valueOf(bool2));
            }
            Integer num = gaf.i;
            if (num != null) {
                qpd.put("led", String.valueOf(num));
            }
            Integer num2 = gaf.j;
            if (num2 != null) {
                qpd.put("dialogsLed", String.valueOf(num2));
            }
            Integer num3 = gaf.k;
            if (num3 != null) {
                qpd.put("chatsLed", String.valueOf(num3));
            }
            Boolean bool3 = gaf.l;
            if (bool3 != null) {
                qpd.put("vibration", String.valueOf(bool3));
            }
            Boolean bool4 = gaf.m;
            if (bool4 != null) {
                qpd.put("dialogsVibration", String.valueOf(bool4));
            }
            Boolean bool5 = gaf.n;
            if (bool5 != null) {
                qpd.put("chatsVibration", String.valueOf(bool5));
            }
            int i = gaf.o;
            if (i != 0) {
                qpd.put("chatsInvite", h4f.k(i));
            }
            int i2 = gaf.p;
            if (i2 != 0) {
                qpd.put("incomingCall", h4f.k(i2));
            }
            faf faf = gaf.q;
            if (faf != null) {
                qpd.put("inactiveTTL", faf.a);
            }
            int i3 = gaf.r;
            if (i3 != 0) {
                qpd.put("groupChatCallNotificationStatus", h4f.j(i3));
            }
            int i4 = gaf.s;
            if (i4 != 0) {
                qpd.put("suggestStickersStatus", h4f.l(i4));
            }
            Boolean bool6 = gaf.t;
            if (bool6 != null) {
                qpd.put("audioTranscriptionEnabled", String.valueOf(bool6));
            }
            Boolean bool7 = gaf.u;
            if (bool7 != null) {
                qpd.put("safeMode", String.valueOf(bool7));
            }
            config.userSettings = qpd;
        }
        List list2 = this.v0;
        if (!(list2 == null || (list = this.u0) == null)) {
            a[] aVarArr = new a[list.size()];
            String[] strArr = new String[list2.size()];
            for (int i5 = 0; i5 < list2.size(); i5++) {
                strArr[i5] = (String) list2.get(i5);
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                a aVar = new a();
                qa2 qa2 = (qa2) list.get(i6);
                aVar.a = qa2.a;
                aVar.b = qa2.b;
                Set set = qa2.Y;
                String[] strArr2 = new String[set.size()];
                pa2[] pa2Arr = (pa2[]) set.toArray(new pa2[0]);
                for (int i7 = 0; i7 < set.size(); i7++) {
                    strArr2[i7] = pa2Arr[i7].name();
                }
                aVar.f = strArr2;
                aVar.g = qa2.Z;
                Set set2 = qa2.X;
                long[] jArr = new long[set2.size()];
                Long[] lArr = (Long[]) set2.toArray(new Long[0]);
                for (int i8 = 0; i8 < set2.size(); i8++) {
                    jArr[i8] = lArr[i8].longValue();
                }
                aVar.e = jArr;
                String str6 = qa2.c;
                if (str6 == null || str6.isEmpty()) {
                    str6 = "NO_EMOJI";
                }
                aVar.c = str6;
                Set set3 = qa2.o;
                long[] jArr2 = new long[set3.size()];
                Long[] lArr2 = (Long[]) set3.toArray(new Long[0]);
                for (int i9 = 0; i9 < set3.size(); i9++) {
                    jArr2[i9] = lArr2[i9].longValue();
                }
                aVar.d = jArr2;
                aVar.h = ou8.c(iz7.u(qa2.s0));
                aVar.i = qa2.t0;
                aVar.j = xfg.i(qa2.u0);
                aVar.k = xfg.k(qa2.v0);
                aVar.l = xfg.j(qa2.w0);
                aVarArr[i6] = aVar;
            }
            config.folders = aVarArr;
            config.excludedFolders = strArr;
        }
        config.syncChatIds = this.s0;
        return qw8.toByteArray(config);
    }

    public final void g(pke pke) {
        this.c.b().c(new che(false));
        if ("favorite.chats.limit".equals(pke.b)) {
            this.c.c().V(this.o, false);
        }
        String str = pke.b;
        if (oag.u(str) && (str.equals("wrong.device.token") || str.equals("WRONG_DEVICE_TOKEN"))) {
            ((hyc) ((q33) this.c.e.getValue())).m("user.fcmToken", "");
            ((xie) ((ti4) ((ri4) this.c.b.getValue())).i.getValue()).d();
        }
        if (!(pke instanceof gke)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CONFIG;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [ik5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14, types: [ik5, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dle i() {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            long r2 = r0.o
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 0
            java.lang.String r8 = "de3"
            if (r6 <= 0) goto L_0x0081
            pl r6 = r0.c
            p82 r6 = r6.c()
            e52 r6 = r6.C(r2)
            if (r6 != 0) goto L_0x0045
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "chat is null, chatId = "
            r6.<init>(r9)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            defpackage.hm9.p(r8, r2, r7)
            pl r2 = r0.c
            je7 r2 = r2.u
            java.lang.Object r2 = r2.getValue()
            o45 r2 = (defpackage.o45) r2
            ru.ok.tamtam.util.HandledException r3 = new ru.ok.tamtam.util.HandledException
            java.lang.String r6 = "chat is null"
            r3.<init>(r6)
            cba r2 = (defpackage.cba) r2
            r2.c(r3, r1)
        L_0x0041:
            r19 = r7
            goto L_0x0154
        L_0x0045:
            ik5 r1 = new ik5
            r1.<init>()
            k92 r2 = r6.b
            b92 r3 = r2.a()
            java.util.List r3 = r3.b
            java.util.ArrayList r3 = defpackage.iz7.o(r3)
            r1.b = r3
            b92 r3 = r2.a()
            long r9 = r3.a
            r1.a = r9
            b92 r3 = r2.a()
            long r9 = r3.e
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r1.c = r3
            xq2 r3 = new xq2
            r3.<init>(r1)
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            long r9 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.put(r2, r3)
            r13 = r1
            goto L_0x00d4
        L_0x0081:
            long[] r2 = r0.s0
            if (r2 == 0) goto L_0x00d3
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00d3
            android.util.ArrayMap r3 = new android.util.ArrayMap
            r3.<init>()
            int r6 = r2.length
            r9 = 0
        L_0x008f:
            if (r9 >= r6) goto L_0x00d1
            r10 = r2[r9]
            pl r12 = r0.c
            p82 r12 = r12.c()
            e52 r10 = r12.C(r10)
            if (r10 == 0) goto L_0x00cf
            boolean r11 = r10.C()
            if (r11 != 0) goto L_0x00a6
            goto L_0x00cf
        L_0x00a6:
            ik5 r11 = new ik5
            r11.<init>()
            k92 r10 = r10.b
            b92 r12 = r10.a()
            java.util.List r12 = r12.b
            java.util.ArrayList r12 = defpackage.iz7.o(r12)
            r11.b = r12
            b92 r12 = r10.a()
            long r12 = r12.a
            r11.a = r12
            xq2 r12 = new xq2
            r12.<init>(r11)
            long r10 = r10.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.put(r10, r12)
        L_0x00cf:
            int r9 = r9 + r1
            goto L_0x008f
        L_0x00d1:
            r13 = r3
            goto L_0x00d4
        L_0x00d3:
            r13 = r7
        L_0x00d4:
            if (r13 == 0) goto L_0x00dc
            int r1 = r13.size()
            if (r1 > 0) goto L_0x00e0
        L_0x00dc:
            gaf r1 = r0.Y
            if (r1 == 0) goto L_0x00ee
        L_0x00e0:
            le3 r1 = new le3
            r11 = 0
            r12 = 0
            gaf r14 = r0.Y
            r15 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00eb:
            r19 = r1
            goto L_0x0154
        L_0x00ee:
            boolean r1 = r0.t0
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r0.u0
            if (r1 == 0) goto L_0x0041
            java.util.List r2 = r0.v0
            if (r2 == 0) goto L_0x0041
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0108:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x011f
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0118 }
            r6.add(r9)     // Catch:{ all -> 0x0118 }
            goto L_0x0108
        L_0x0118:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x011f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0123:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r1.next()
            qa2 r2 = (defpackage.qa2) r2     // Catch:{ all -> 0x013d }
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "all.chat.folder"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x013d }
            if (r9 != 0) goto L_0x0123
            r3.add(r2)     // Catch:{ all -> 0x013d }
            goto L_0x0123
        L_0x013d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0144:
            le3 r1 = new le3
            sa2 r14 = new sa2
            r14.<init>(r3, r6)
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x00eb
        L_0x0154:
            java.lang.String r16 = r21.u()
            if (r19 != 0) goto L_0x016a
            boolean r1 = defpackage.oag.t(r16)
            if (r1 == 0) goto L_0x016a
            boolean r1 = r0.Z
            if (r1 != 0) goto L_0x016a
            java.lang.String r0 = "config is null and token is empty"
            defpackage.hm9.m(r8, r0, new java.lang.Object[0])
            goto L_0x017e
        L_0x016a:
            boolean r1 = defpackage.oag.t(r16)
            if (r1 != 0) goto L_0x0172
            r4 = 16384(0x4000, double:8.0948E-320)
        L_0x0172:
            r17 = r4
            tq2 r7 = new tq2
            boolean r0 = r0.Z
            r15 = r7
            r20 = r0
            r15.<init>(r16, r17, r19, r20)
        L_0x017e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.i():dle");
    }

    public final String u() {
        if (!this.X || !((xe6) ((ti4) ((ri4) this.c.b.getValue())).g).a()) {
            return null;
        }
        String d = ((xie) ((ti4) ((ri4) this.c.b.getValue())).i.getValue()).d();
        if (!oag.t(d)) {
            return d;
        }
        return null;
    }
}
