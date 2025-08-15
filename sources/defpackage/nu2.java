package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nu2  reason: default package */
public final class nu2 implements mn5 {
    public static final /* synthetic */ bc7[] o;
    public final AtomicInteger a = new AtomicInteger(0);
    public final w4d b = mqd.D();
    public final /* synthetic */ pu2 c;

    static {
        oi9 oi9 = new oi9(nu2.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        o = new bc7[]{oi9};
    }

    public nu2(pu2 pu2) {
        this.c = pu2;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [a66, ffe] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = 5
            r3 = 0
            boolean r4 = r0 instanceof defpackage.lu2
            if (r4 == 0) goto L_0x0019
            r4 = r0
            lu2 r4 = (defpackage.lu2) r4
            int r5 = r4.Z
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.Z = r5
            goto L_0x001e
        L_0x0019:
            lu2 r4 = new lu2
            r4.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r4.X
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.Z
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0040
            if (r6 == r8) goto L_0x0032
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            nu2 r1 = r4.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x003d }
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            goto L_0x0148
        L_0x0040:
            defpackage.od2.a0(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a
            int r0 = r0.incrementAndGet()
            if (r0 != r8) goto L_0x0133
            bc7[] r0 = o
            r6 = r0[r3]
            w4d r9 = r1.b
            java.lang.Object r6 = r9.T0(r1, r6)
            x77 r6 = (defpackage.x77) r6
            if (r6 == 0) goto L_0x0061
            boolean r6 = r6.isActive()
            if (r6 != r8) goto L_0x0061
            goto L_0x0133
        L_0x0061:
            pu2 r6 = r1.c
            r6.getClass()
            y77 r15 = defpackage.pag.a()
            nl6 r9 = r6.a
            r9.j = r6
            ci0 r9 = r6.o
            zn5 r9 = r9.b()
            ju2 r10 = new ju2
            r14 = 2
            r10.<init>(r14, r7)
            zn5 r13 = new zn5
            r13.<init>(r9, r10)
            vw r12 = new vw
            java.lang.Class<pu2> r16 = defpackage.pu2.class
            java.lang.String r17 = "handleEvent"
            r10 = 2
            java.lang.String r18 = "handleEvent(Lru/ok/tamtam/chats/ChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r19 = 0
            r20 = 9
            r9 = r12
            r11 = r6
            r3 = r12
            r12 = r16
            r7 = r13
            r13 = r17
            r14 = r18
            r8 = r15
            r15 = r19
            r16 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            zn5 r9 = new zn5
            r9.<init>(r7, r3, r2)
            vy1 r3 = defpackage.od2.h(r9)
            kotlinx.coroutines.internal.ContextScope r7 = r6.A0
            kotlinx.coroutines.internal.ContextScope r7 = defpackage.j1e.F(r7, r8)
            defpackage.od2.L(r3, r7)
            tm3 r3 = r6.X
            mn5 r3 = r3.a()
            xk1 r7 = new xk1
            r9 = 21
            r7.<init>(r3, r9)
            xk1 r3 = new xk1
            r9 = 20
            r3.<init>(r7, r9)
            int r7 = defpackage.ft4.o
            r7 = 300(0x12c, float:4.2E-43)
            kt4 r9 = defpackage.kt4.MILLISECONDS
            long r9 = defpackage.z7.R(r7, r9)
            ai0 r7 = new ai0
            r11 = 8
            r7.<init>(r11)
            zn5 r3 = defpackage.nu0.e(r3, r9, r7)
            mn5 r3 = defpackage.od2.x(r3)
            vw r7 = new vw
            java.lang.Class<pu2> r12 = defpackage.pu2.class
            java.lang.String r13 = "handleContactsUpdateEvent"
            r10 = 2
            java.lang.String r14 = "handleContactsUpdateEvent(Lru/ok/tamtam/contacts/ContactEvent$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r15 = 0
            r16 = 10
            r9 = r7
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            zn5 r9 = new zn5
            r9.<init>(r3, r7, r2)
            kke r2 = r6.b
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.a()
            java.lang.String r3 = "contactEvents-stream"
            r7 = 1
            nx3 r2 = r2.limitedParallelism(r7, r3)
            mn5 r2 = defpackage.od2.F(r9, r2)
            vy1 r2 = defpackage.od2.h(r2)
            kotlinx.coroutines.internal.ContextScope r3 = r6.A0
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.j1e.F(r3, r8)
            defpackage.od2.L(r2, r3)
            kotlinx.coroutines.internal.ContextScope r2 = r6.A0
            kke r3 = r6.b
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            lx3 r3 = r3.plus(r8)
            ku2 r7 = new ku2
            r9 = 0
            r7.<init>(r6, r9)
            r6 = 2
            defpackage.j47.T(r2, r3, r9, r7, r6)
            r2 = 0
            r0 = r0[r2]
            w4d r2 = r1.b
            r2.o1(r1, r0, r8)
        L_0x0133:
            pu2 r0 = r1.c     // Catch:{ all -> 0x003d }
            q0e r0 = r0.x0     // Catch:{ all -> 0x003d }
            mu2 r2 = new mu2     // Catch:{ all -> 0x003d }
            r3 = r22
            r6 = 0
            r2.<init>(r6, r3)     // Catch:{ all -> 0x003d }
            r4.o = r1     // Catch:{ all -> 0x003d }
            r3 = 1
            r4.Z = r3     // Catch:{ all -> 0x003d }
            r0.d(r2, r4)     // Catch:{ all -> 0x003d }
            return r5
        L_0x0148:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.a
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto L_0x016e
            bc7[] r2 = o
            r3 = 0
            r4 = r2[r3]
            w4d r5 = r1.b
            java.lang.Object r4 = r5.T0(r1, r4)
            x77 r4 = (defpackage.x77) r4
            if (r4 == 0) goto L_0x016e
            boolean r4 = r4.isActive()
            r5 = 1
            if (r4 != r5) goto L_0x016e
            r2 = r2[r3]
            w4d r3 = r1.b
            r4 = 0
            r3.o1(r1, r2, r4)
        L_0x016e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
