package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: eva  reason: default package */
public final class eva extends ffe implements a66 {
    public List X;
    public List Y;
    public List Z;
    public List s0;
    public long t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ jva w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eva(jva jva, Continuation continuation) {
        super(2, continuation);
        this.w0 = jva;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eva) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eva eva = new eva(this.w0, continuation);
        eva.v0 = obj;
        return eva;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: sx3} */
    /* JADX WARNING: type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0207 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x029c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x029d  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = 2
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.u0
            e5f r4 = defpackage.e5f.a
            java.lang.String r5 = "Phonebook"
            r7 = 3
            r8 = 10
            r9 = 1
            if (r3 == 0) goto L_0x006f
            if (r3 == r9) goto L_0x0053
            if (r3 == r1) goto L_0x0036
            if (r3 != r7) goto L_0x002e
            long r2 = r0.t0
            java.util.List r7 = r0.Z
            java.util.List r8 = r0.Y
            java.util.List r10 = r0.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r0.v0
            sx3 r11 = (defpackage.sx3) r11
            defpackage.od2.a0(r36)
            r1 = r36
            r31 = r5
            goto L_0x0294
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            long r10 = r0.t0
            java.util.List r3 = r0.s0
            java.util.List r12 = r0.Z
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.List r13 = r0.Y
            java.util.List r14 = r0.X
            java.lang.Object r15 = r0.v0
            sx3 r15 = (defpackage.sx3) r15
            defpackage.od2.a0(r36)
            r1 = r36
            r8 = r3
            r31 = r5
            r3 = r12
            r12 = r14
            r14 = r15
            goto L_0x01fe
        L_0x0053:
            long r10 = r0.t0
            java.util.List r3 = r0.Z
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r12 = r0.Y
            java.util.List r13 = r0.X
            java.lang.Object r14 = r0.v0
            sx3 r14 = (defpackage.sx3) r14
            defpackage.od2.a0(r36)
            r31 = r5
            r5 = r36
            r33 = r13
            r13 = r12
            r12 = r33
            goto L_0x017a
        L_0x006f:
            defpackage.od2.a0(r36)
            java.lang.Object r3 = r0.v0
            r14 = r3
            sx3 r14 = (defpackage.sx3) r14
            java.lang.String r3 = "checkUpdatesWorker"
            defpackage.hm9.m(r5, r3, new java.lang.Object[0])
            jva r3 = r0.w0
            je7 r3 = r3.Y
            java.lang.Object r3 = r3.getValue()
            f5a r3 = (defpackage.f5a) r3
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x009c
            jva r3 = r0.w0
            je7 r3 = r3.Y
            java.lang.Object r3 = r3.getValue()
            f5a r3 = (defpackage.f5a) r3
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x009f
        L_0x009c:
            r7 = r5
            goto L_0x035e
        L_0x009f:
            jva r3 = r0.w0
            je7 r3 = r3.X
            java.lang.Object r3 = r3.getValue()
            f6a r3 = (defpackage.f6a) r3
            je7 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            eua r3 = (defpackage.eua) r3
            java.lang.String[] r10 = defpackage.eua.f
            boolean r3 = r3.b(r10)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r0 = "checkUpdates: no permission"
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])
            return r4
        L_0x00bf:
            jva r3 = r0.w0
            r3.e()
            int r3 = defpackage.ft4.o
            long r10 = android.os.SystemClock.elapsedRealtime()
            kt4 r3 = defpackage.kt4.MILLISECONDS
            long r10 = defpackage.z7.S(r10, r3)
            jva r3 = r0.w0
            android.content.Context r12 = r3.a
            o45 r3 = r3.c
            java.util.Collection r3 = defpackage.mqd.p(r12, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = defpackage.z53.S(r3, r8)
            r12.<init>(r13)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e7:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0135
            java.lang.Object r13 = r3.next()
            vua r13 = (defpackage.vua) r13
            wua r15 = new wua
            long r7 = r13.a
            int r1 = r13.b
            java.lang.String r6 = r13.c
            r29 = r10
            long r9 = r13.d
            java.lang.String r11 = r13.e
            r36 = r3
            java.lang.String r3 = r13.f
            r31 = r5
            java.lang.String r5 = r13.g
            int r13 = r13.h
            r16 = 0
            r24 = 0
            r32 = r15
            r18 = r7
            r20 = r1
            r21 = r6
            r22 = r9
            r25 = r11
            r26 = r3
            r27 = r5
            r28 = r13
            r15.<init>(r16, r18, r20, r21, r22, r24, r25, r26, r27, r28)
            r1 = r32
            r12.add(r1)
            r3 = r36
            r10 = r29
            r5 = r31
            r1 = 2
            r7 = 3
            r8 = 10
            r9 = 1
            goto L_0x00e7
        L_0x0135:
            r31 = r5
            r29 = r10
            boolean r1 = defpackage.j1e.z(r14)
            if (r1 != 0) goto L_0x0140
            return r4
        L_0x0140:
            jva r1 = r0.w0
            je7 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            wlc r1 = r1.e
            java.util.ArrayList r1 = r1.e()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            jva r5 = r0.w0
            r0.v0 = r14
            r0.X = r12
            r0.Y = r1
            r0.Z = r3
            r6 = r29
            r0.t0 = r6
            r8 = 1
            r0.u0 = r8
            r5.getClass()
            hva r8 = new hva
            r9 = 0
            r8.<init>(r12, r5, r1, r9)
            java.lang.Object r5 = defpackage.j1e.k(r8, r0)
            if (r5 != r2) goto L_0x0178
            return r2
        L_0x0178:
            r13 = r1
            r10 = r6
        L_0x017a:
            java.util.List r5 = (java.util.List) r5
            boolean r1 = defpackage.j1e.z(r14)
            if (r1 != 0) goto L_0x0183
            return r4
        L_0x0183:
            boolean r1 = r5.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x01dc
            jva r1 = r0.w0
            je7 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            wlc r1 = r1.e
            rva r6 = r1.c()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = defpackage.z53.S(r5, r8)
            r7.<init>(r9)
            java.util.Iterator r8 = r5.iterator()
        L_0x01ac:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01c0
            java.lang.Object r9 = r8.next()
            wua r9 = (defpackage.wua) r9
            xua r9 = defpackage.wlc.b(r1, r9)
            r7.add(r9)
            goto L_0x01ac
        L_0x01c0:
            ilc r1 = r6.a
            r1.b()
            r1.c()
            ha4 r6 = r6.c     // Catch:{ all -> 0x01d7 }
            r6.C(r7)     // Catch:{ all -> 0x01d7 }
            r1.r()     // Catch:{ all -> 0x01d7 }
            r1.l()
            r3.addAll(r5)
            goto L_0x01dc
        L_0x01d7:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x01dc:
            jva r1 = r0.w0
            r0.v0 = r14
            r0.X = r12
            r0.Y = r13
            r0.Z = r3
            r0.s0 = r5
            r0.t0 = r10
            r6 = 2
            r0.u0 = r6
            r1.getClass()
            fva r6 = new fva
            r7 = 0
            r6.<init>(r13, r1, r12, r7)
            java.lang.Object r1 = defpackage.j1e.k(r6, r0)
            if (r1 != r2) goto L_0x01fd
            return r2
        L_0x01fd:
            r8 = r5
        L_0x01fe:
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            boolean r1 = defpackage.j1e.z(r14)
            if (r1 != 0) goto L_0x0208
            return r4
        L_0x0208:
            boolean r1 = r7.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0267
            jva r1 = r0.w0
            je7 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            wlc r1 = r1.e
            rva r1 = r1.c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.z53.S(r7, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L_0x0231:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x024d
            java.lang.Object r9 = r6.next()
            wua r9 = (defpackage.wua) r9
            r16 = r12
            r15 = r13
            long r12 = r9.b
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r5.add(r9)
            r13 = r15
            r12 = r16
            goto L_0x0231
        L_0x024d:
            r16 = r12
            r15 = r13
            ilc r6 = r1.a
            r6.c()
            defpackage.rva.a(r1, r5)     // Catch:{ all -> 0x0262 }
            r6.r()     // Catch:{ all -> 0x0262 }
            r6.l()
            r3.addAll(r7)
            goto L_0x026a
        L_0x0262:
            r0 = move-exception
            r6.l()
            throw r0
        L_0x0267:
            r16 = r12
            r15 = r13
        L_0x026a:
            jva r1 = r0.w0
            r0.v0 = r14
            r0.X = r3
            r0.Y = r8
            r0.Z = r7
            r5 = 0
            r0.s0 = r5
            r0.t0 = r10
            r6 = 3
            r0.u0 = r6
            r1.getClass()
            gva r6 = new gva
            r13 = r15
            r12 = r16
            r6.<init>(r12, r1, r13, r5)
            java.lang.Object r1 = defpackage.j1e.k(r6, r0)
            if (r1 != r2) goto L_0x028e
            return r2
        L_0x028e:
            r33 = r10
            r10 = r3
            r2 = r33
            r11 = r14
        L_0x0294:
            java.util.List r1 = (java.util.List) r1
            boolean r5 = defpackage.j1e.z(r11)
            if (r5 != 0) goto L_0x029d
            return r4
        L_0x029d:
            boolean r5 = r1.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x02da
            jva r5 = r0.w0
            je7 r5 = r5.o
            java.lang.Object r5 = r5.getValue()
            c34 r5 = (defpackage.c34) r5
            k24 r5 = (defpackage.k24) r5
            wlc r5 = r5.e
            jlc r6 = r5.a
            ilc r6 = r6.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r6 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r6
            flc r9 = new flc
            r12 = 2
            r9.<init>(r1, r12, r5)
            r6.q(r9)
            boolean r5 = defpackage.j1e.z(r11)
            if (r5 != 0) goto L_0x02cb
            return r4
        L_0x02cb:
            r10.addAll(r1)
            jva r5 = r0.w0
            av0 r5 = r5.b
            sva r6 = new sva
            r6.<init>()
            r5.c(r6)
        L_0x02da:
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x02e1
        L_0x02de:
            r7 = r31
            goto L_0x030c
        L_0x02e1:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x02de
            us7 r6 = defpackage.us7.X
            int r8 = r8.size()
            int r7 = r7.size()
            int r1 = r1.size()
            java.lang.String r9 = "updatePhones="
            java.lang.String r12 = ",deletedPhones="
            java.lang.String r13 = ",newPhones="
            java.lang.StringBuilder r7 = defpackage.wg0.j(r9, r8, r12, r7, r13)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r7 = r31
            r8 = 0
            r5.d(r6, r7, r1, r8)
        L_0x030c:
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0311
            goto L_0x0337
        L_0x0311:
            boolean r5 = r1.c()
            if (r5 == 0) goto L_0x0337
            us7 r5 = defpackage.us7.X
            int r6 = defpackage.ft4.o
            long r8 = android.os.SystemClock.elapsedRealtime()
            kt4 r6 = defpackage.kt4.MILLISECONDS
            long r8 = defpackage.z7.S(r8, r6)
            long r2 = defpackage.ft4.g(r8, r2)
            java.lang.String r2 = defpackage.ft4.j(r2)
            java.lang.String r3 = "checkUpdates completed in time="
            java.lang.String r2 = r3.concat(r2)
            r3 = 0
            r1.d(r5, r7, r2, r3)
        L_0x0337:
            boolean r1 = defpackage.j1e.z(r11)
            if (r1 == 0) goto L_0x035d
            boolean r1 = r10.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x035d
            jva r0 = r0.w0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.Z
            java.util.Iterator r0 = r0.iterator()
        L_0x034d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035d
            java.lang.Object r1 = r0.next()
            ava r1 = (defpackage.ava) r1
            r1.a(r10)
            goto L_0x034d
        L_0x035d:
            return r4
        L_0x035e:
            java.lang.String r0 = "checkUpdates: not authorized"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eva.o(java.lang.Object):java.lang.Object");
    }
}
