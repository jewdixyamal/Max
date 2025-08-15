package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: yr7  reason: default package */
public final class yr7 extends ffe implements a66 {
    public ArrayList X;
    public Iterator Y;
    public Object Z;
    public int s0;
    public int t0;
    public long u0;
    public int v0;
    public final /* synthetic */ bs7 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr7(bs7 bs7, Continuation continuation) {
        super(2, continuation);
        this.w0 = bs7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yr7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yr7(this.w0, continuation);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:31|(1:32)|33|(4:35|(1:37)|(1:39)|(1:41))|65|66|67|68|24|(1:(3:88|(1:90)|91))(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(1:(1:(1:(11:5|82|(1:84)|85|24|(5:26|27|28|(1:30)(10:31|32|33|(4:35|(1:37)|(1:39)|(1:41))|65|66|67|68|24|(1:(3:88|(1:90)|91))(0))|30)|88|(0)|91|92|(1:94)(6:95|(1:99)|100|(1:102)(1:103)|104|(5:106|(7:109|(1:111)|112|(1:114)|(2:116|122)(1:123)|117|107)|121|118|124)(2:119|120)))(2:6|7))(3:8|9|10))(11:14|15|16|17|32|33|(11:65|66|67|68|24|(0)|88|(0)|91|92|(0)(0))|35|(0)|(0)|(0)))(10:18|(1:22)|23|24|(0)(0)|88|(0)|91|92|(0)(0))|11|42|43|44|45|46|47|48|49|50|51|52|53|24|(0)|88|(0)|91|92|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        r14 = r9;
        r9 = r10;
        r13 = r27;
        r12 = r28;
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0183, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0188, code lost:
        r33 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018a, code lost:
        r28 = r12;
        r27 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ab, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f5, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fa, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fe, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        r10 = r0;
        r0 = r5;
        r11 = r13;
        r9 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0259 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r32
            tx3 r2 = defpackage.tx3.a
            int r0 = r1.v0
            e5f r3 = defpackage.e5f.a
            java.lang.String r4 = "ONEME-11049"
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            if (r0 == 0) goto L_0x0064
            if (r0 == r6) goto L_0x0053
            if (r0 == r5) goto L_0x0037
            if (r0 != r8) goto L_0x002f
            int r0 = r1.t0
            int r9 = r1.s0
            java.lang.Object r10 = r1.Z
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.util.Iterator r11 = r1.Y
            java.util.ArrayList r12 = r1.X
            defpackage.od2.a0(r33)
            r26 = r3
            r6 = r8
            r29 = r12
            r12 = r9
            r9 = r29
            goto L_0x0203
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            long r9 = r1.u0
            int r11 = r1.t0
            int r12 = r1.s0
            java.lang.Object r0 = r1.Z
            ps7 r0 = (defpackage.ps7) r0
            java.util.Iterator r13 = r1.Y
            java.util.ArrayList r14 = r1.X
            defpackage.od2.a0(r33)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r5 = r11
            r10 = r9
            r9 = r14
            goto L_0x011c
        L_0x004d:
            r0 = move-exception
            r26 = r3
            r3 = r6
            goto L_0x01be
        L_0x0053:
            long r9 = r1.u0
            int r11 = r1.t0
            int r12 = r1.s0
            java.util.Iterator r13 = r1.Y
            java.util.ArrayList r14 = r1.X
            defpackage.od2.a0(r33)     // Catch:{ all -> 0x004d }
            r0 = r33
            goto L_0x00e4
        L_0x0064:
            defpackage.od2.a0(r33)
            bs7 r0 = r1.w0
            java.lang.String r9 = r0.Z
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0070
            goto L_0x008b
        L_0x0070:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x008b
            us7 r11 = defpackage.us7.X
            java.util.List r0 = r0.X
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Creating LogApiTask for tasks="
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r10.d(r11, r9, r0, r7)
        L_0x008b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bs7 r9 = r1.w0
            java.util.List r9 = r9.X
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = r10
            r12 = r11
            r10 = r9
            r9 = r0
        L_0x009d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            bs7 r0 = r1.w0     // Catch:{ all -> 0x01ba }
            js7 r0 = r0.o()     // Catch:{ all -> 0x01ba }
            r1.X = r9     // Catch:{ all -> 0x01ba }
            r1.Y = r10     // Catch:{ all -> 0x01ba }
            r1.Z = r7     // Catch:{ all -> 0x01ba }
            r1.s0 = r11     // Catch:{ all -> 0x01ba }
            r1.t0 = r12     // Catch:{ all -> 0x01ba }
            r1.u0 = r13     // Catch:{ all -> 0x01ba }
            r1.v0 = r6     // Catch:{ all -> 0x01ba }
            hmc r0 = r0.b()     // Catch:{ all -> 0x01ba }
            kke r15 = r0.a     // Catch:{ all -> 0x01ba }
            w9a r15 = (defpackage.w9a) r15     // Catch:{ all -> 0x01ba }
            nx3 r15 = r15.b()     // Catch:{ all -> 0x01ba }
            dmc r8 = new dmc     // Catch:{ all -> 0x01ba }
            r8.<init>(r0, r13, r7)     // Catch:{ all -> 0x01ba }
            java.lang.Object r0 = defpackage.j47.t0(r15, r8, r1)     // Catch:{ all -> 0x01ba }
            if (r0 != r2) goto L_0x00d9
            return r2
        L_0x00d9:
            r29 = r13
            r14 = r9
            r13 = r10
            r9 = r29
            r31 = r12
            r12 = r11
            r11 = r31
        L_0x00e4:
            ps7 r0 = (defpackage.ps7) r0     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0195
            bs7 r8 = r1.w0     // Catch:{ all -> 0x0191 }
            js7 r8 = r8.o()     // Catch:{ all -> 0x0191 }
            r1.X = r14     // Catch:{ all -> 0x0191 }
            r1.Y = r13     // Catch:{ all -> 0x0191 }
            r1.Z = r0     // Catch:{ all -> 0x0191 }
            r1.s0 = r12     // Catch:{ all -> 0x0191 }
            r1.t0 = r11     // Catch:{ all -> 0x0191 }
            r1.u0 = r9     // Catch:{ all -> 0x0191 }
            r1.v0 = r5     // Catch:{ all -> 0x0191 }
            hmc r8 = r8.b()     // Catch:{ all -> 0x0191 }
            kke r15 = r8.a     // Catch:{ all -> 0x0191 }
            w9a r15 = (defpackage.w9a) r15     // Catch:{ all -> 0x0191 }
            nx3 r15 = r15.b()     // Catch:{ all -> 0x0191 }
            fmc r5 = new fmc     // Catch:{ all -> 0x0191 }
            r5.<init>(r8, r9, r7)     // Catch:{ all -> 0x0191 }
            java.lang.Object r5 = defpackage.j47.t0(r15, r5, r1)     // Catch:{ all -> 0x0191 }
            if (r5 != r2) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r5 = r3
        L_0x0115:
            if (r5 != r2) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r5 = r3
        L_0x0119:
            if (r5 != r2) goto L_0x0048
            return r2
        L_0x011c:
            ms7 r0 = r0.X     // Catch:{ all -> 0x0185 }
            long r14 = r0.a     // Catch:{ all -> 0x0185 }
            long r7 = r0.b     // Catch:{ all -> 0x0185 }
            java.lang.String r6 = r0.c     // Catch:{ all -> 0x0185 }
            r26 = r3
            java.lang.String r3 = r0.d     // Catch:{ all -> 0x0183 }
            r33 = r5
            java.util.Map r5 = r0.e     // Catch:{ all -> 0x0181 }
            r28 = r12
            r27 = r13
            long r12 = r0.f     // Catch:{ all -> 0x0176 }
            bl r0 = new bl     // Catch:{ all -> 0x0176 }
            r16 = r0
            r17 = r14
            r19 = r7
            r21 = r12
            r23 = r6
            r24 = r3
            r25 = r5
            r16.<init>(r17, r19, r21, r23, r24, r25)     // Catch:{ all -> 0x0176 }
            r9.add(r0)     // Catch:{ all -> 0x0176 }
            bs7 r3 = r1.w0     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r3.Z     // Catch:{ all -> 0x0176 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r5.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = "Create entry for request: taskId:"
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            r5.append(r10)     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = ", event:"
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            r5.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0176 }
            defpackage.hm9.m(r3, r0, new java.lang.Object[0])     // Catch:{ all -> 0x0176 }
            r12 = r33
            r3 = r26
            r10 = r27
            r11 = r28
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            goto L_0x009d
        L_0x0176:
            r0 = move-exception
        L_0x0177:
            r14 = r9
            r9 = r10
            r13 = r27
            r12 = r28
            r3 = 1
            r11 = r33
            goto L_0x01be
        L_0x0181:
            r0 = move-exception
            goto L_0x018a
        L_0x0183:
            r0 = move-exception
            goto L_0x0188
        L_0x0185:
            r0 = move-exception
            r26 = r3
        L_0x0188:
            r33 = r5
        L_0x018a:
            r28 = r12
            r27 = r13
            goto L_0x0177
        L_0x018f:
            r3 = 1
            goto L_0x01be
        L_0x0191:
            r0 = move-exception
            r26 = r3
            goto L_0x018f
        L_0x0195:
            r26 = r3
            int r3 = r12 + 1
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01aa }
            r0.<init>(r12)     // Catch:{ all -> 0x01aa }
            r12 = r11
            r10 = r13
            r9 = r14
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            r11 = r3
            r3 = r26
            goto L_0x009d
        L_0x01aa:
            r0 = move-exception
            r12 = r3
            goto L_0x018f
        L_0x01ad:
            r3 = 1
            r29 = r13
            r14 = r9
            r13 = r10
            r9 = r29
            r31 = r12
            r12 = r11
            r11 = r31
            goto L_0x01be
        L_0x01ba:
            r0 = move-exception
            r26 = r3
            goto L_0x01ad
        L_0x01be:
            int r5 = r11 + 1
            bs7 r3 = r1.w0
            js7 r3 = r3.o()
            r1.X = r14
            r1.Y = r13
            r1.Z = r0
            r1.s0 = r12
            r1.t0 = r5
            r6 = 3
            r1.v0 = r6
            hmc r3 = r3.b()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r9)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            kke r8 = r3.a
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            amc r9 = new amc
            r10 = 0
            r9.<init>(r3, r7, r10)
            java.lang.Object r3 = defpackage.j47.t0(r8, r9, r1)
            if (r3 != r2) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r3 = r26
        L_0x01f7:
            if (r3 != r2) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r3 = r26
        L_0x01fc:
            if (r3 != r2) goto L_0x01ff
            return r2
        L_0x01ff:
            r10 = r0
            r0 = r5
            r11 = r13
            r9 = r14
        L_0x0203:
            bs7 r3 = r1.w0
            pl r3 = r3.c
            if (r3 == 0) goto L_0x020a
            goto L_0x020b
        L_0x020a:
            r3 = 0
        L_0x020b:
            je7 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            o45 r3 = (defpackage.o45) r3
            ru.ok.tamtam.ExceptionHandler$HandledException r5 = new ru.ok.tamtam.ExceptionHandler$HandledException
            r7 = 1
            r8 = 0
            r5.<init>(r8, r10, r7, r4)
            cba r3 = (defpackage.cba) r3
            r3.c(r5, r7)
            r8 = r6
            r6 = r7
            r10 = r11
            r11 = r12
            r3 = r26
            r5 = 2
            r7 = 0
            r12 = r0
            goto L_0x009d
        L_0x022a:
            if (r12 != 0) goto L_0x022e
            if (r11 == 0) goto L_0x0253
        L_0x022e:
            bs7 r0 = r1.w0
            pl r0 = r0.c
            if (r0 == 0) goto L_0x0235
            goto L_0x0236
        L_0x0235:
            r0 = 0
        L_0x0236:
            je7 r0 = r0.u
            java.lang.Object r0 = r0.getValue()
            o45 r0 = (defpackage.o45) r0
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            java.lang.String r3 = "Skipped events in task = "
            java.lang.String r5 = ", deleted due error = "
            java.lang.String r3 = defpackage.rh4.h(r3, r11, r12, r5)
            r5 = 2
            r6 = 0
            r2.<init>(r3, r6, r5, r4)
            cba r0 = (defpackage.cba) r0
            r3 = 1
            r0.c(r2, r3)
        L_0x0253:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x025c
            r7 = 0
            goto L_0x0340
        L_0x025c:
            long r2 = java.lang.System.currentTimeMillis()
            bs7 r0 = r1.w0
            java.lang.String r4 = r0.Z
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x0269
            goto L_0x0296
        L_0x0269:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0296
            us7 r6 = defpackage.us7.X
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r2)
            java.lang.String r7 = defpackage.nu0.G(r7)
            boolean r0 = r0.o
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Updating lastSuccessful sent time="
            r8.<init>(r10)
            r8.append(r7)
            java.lang.String r7 = " for isCritical="
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7 = 0
            r5.d(r6, r4, r0, r7)
        L_0x0296:
            bs7 r0 = r1.w0
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x02ae
            m7b r0 = r0.r()
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentCriticalLogTime"
            r0.l(r2, r1)
            goto L_0x02bf
        L_0x02ae:
            m7b r0 = r0.r()
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentLogTime"
            r0.l(r2, r1)
        L_0x02bf:
            cs7 r0 = new cs7
            r10 = 0
            r0.<init>((defpackage.sla) r10)
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x0341
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x02d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x033a
            java.lang.Object r3 = r2.next()
            bl r3 = (defpackage.bl) r3
            r3.getClass()
            ky7 r4 = new ky7
            r4.<init>()
            long r5 = r3.a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "time"
            r4.put(r6, r5)
            long r5 = r3.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "userId"
            r4.put(r6, r5)
            java.lang.String r5 = "type"
            java.lang.String r6 = r3.d
            r4.put(r5, r6)
            java.lang.String r5 = "event"
            java.lang.String r6 = r3.e
            r4.put(r5, r6)
            java.util.Map r5 = r3.f
            if (r5 == 0) goto L_0x0315
            java.lang.String r6 = "params"
            r4.put(r6, r5)
        L_0x0315:
            long r5 = r3.c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0322
            goto L_0x0323
        L_0x0322:
            r3 = r10
        L_0x0323:
            if (r3 == 0) goto L_0x0332
            long r5 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "sessionId"
            r4.put(r5, r3)
        L_0x0332:
            ky7 r3 = r4.b()
            r1.add(r3)
            goto L_0x02d4
        L_0x033a:
            java.lang.String r2 = "events"
            r0.g(r2, r1)
            r7 = r0
        L_0x0340:
            return r7
        L_0x0341:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "status can't be null or empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr7.o(java.lang.Object):java.lang.Object");
    }
}
