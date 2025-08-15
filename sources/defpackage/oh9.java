package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: oh9  reason: default package */
public final class oh9 extends ffe implements a66 {
    public Bundle X;
    public int Y;
    public final /* synthetic */ ju0 Z;
    public final /* synthetic */ uh9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oh9(ju0 ju0, uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.Z = ju0;
        this.s0 = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oh9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oh9(this.Z, this.s0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: l20} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0093, code lost:
        r0 = defpackage.dae.f0(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = 2
            tx3 r3 = defpackage.tx3.a
            int r0 = r1.Y
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r6) goto L_0x001c
            if (r0 != r2) goto L_0x0014
            defpackage.od2.a0(r33)
            goto L_0x0318
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            android.os.Bundle r0 = r1.X
            defpackage.od2.a0(r33)
            r14 = r0
            r0 = r33
            goto L_0x00f8
        L_0x0026:
            defpackage.od2.a0(r33)
            ju0 r0 = r1.Z
            boolean r7 = r0 instanceof defpackage.yg9
            if (r7 == 0) goto L_0x02df
            java.lang.String r7 = "MediaMetadata.Extra.CHAT_ID"
            yg9 r0 = (defpackage.yg9) r0
            long r8 = r0.d
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            kpa r8 = new kpa
            r8.<init>(r7, r0)
            java.lang.String r0 = "MediaMetadata.Extra.MESSAGE_ID"
            ju0 r7 = r1.Z
            yg9 r7 = (defpackage.yg9) r7
            long r9 = r7.e
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r9)
            kpa r9 = new kpa
            r9.<init>(r0, r7)
            java.lang.String r0 = "MediaMetadata.Extra.ATTACH_ID"
            ju0 r7 = r1.Z
            yg9 r7 = (defpackage.yg9) r7
            java.lang.String r7 = r7.f
            kpa r10 = new kpa
            r10.<init>(r0, r7)
            kpa[] r0 = new defpackage.kpa[]{r8, r9, r10}
            android.os.Bundle r7 = defpackage.dy7.g(r0)
            eh9 r14 = new eh9
            uh9 r15 = r1.s0
            ju0 r0 = r1.Z
            yg9 r0 = (defpackage.yg9) r0
            long r10 = r0.e
            java.lang.String r12 = r0.f
            java.lang.String r13 = r0.g
            r8 = r14
            r9 = r15
            r16 = r13
            r8.<init>(r9, r10, r12, r13)
            r1.X = r7
            r1.Y = r6
            android.net.Uri r0 = android.net.Uri.parse(r16)     // Catch:{ all -> 0x009e }
            java.lang.String r8 = "expires"
            java.lang.String r0 = r0.getQueryParameter(r8)     // Catch:{ all -> 0x009e }
            q33 r8 = r15.e     // Catch:{ all -> 0x009e }
            hyc r8 = (defpackage.hyc) r8     // Catch:{ all -> 0x009e }
            long r8 = r8.n()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x00a0
            java.lang.Long r0 = defpackage.dae.f0(r0)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x00a0
            long r10 = r0.longValue()     // Catch:{ all -> 0x009e }
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            goto L_0x00b1
        L_0x00a0:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00a5:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            r0 = r6
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x009e }
            goto L_0x00b7
        L_0x00b1:
            njc r8 = new njc
            r8.<init>(r0)
            r0 = r8
        L_0x00b7:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof defpackage.njc
            if (r9 == 0) goto L_0x00be
            r0 = r8
        L_0x00be:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            taa r8 = r15.g
            long r9 = r14.b
            java.lang.String r9 = java.lang.String.valueOf(r9)
            so4 r8 = r8.a()
            d9g r8 = r8.b
            q94 r8 = (defpackage.q94) r8
            dn4 r8 = r8.d(r9)
            if (r8 == 0) goto L_0x00e1
            int r8 = r8.b
            r9 = 4
            if (r8 != r9) goto L_0x00e1
            r8 = r6
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            boolean r9 = defpackage.w9e.C0(r16)
            if (r9 != 0) goto L_0x00f0
            if (r0 != 0) goto L_0x00f0
            if (r8 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            r0 = r16
            goto L_0x00f4
        L_0x00f0:
            java.lang.Object r0 = r14.a(r1)
        L_0x00f4:
            if (r0 != r3) goto L_0x00f7
            return r3
        L_0x00f7:
            r14 = r7
        L_0x00f8:
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x02c1
            boolean r0 = defpackage.w9e.C0(r19)
            if (r0 == 0) goto L_0x0106
            goto L_0x02c1
        L_0x0106:
            uh9 r0 = r1.s0
            ju0 r7 = r1.Z
            yg9 r7 = (defpackage.yg9) r7
            long r7 = r7.e
            java.lang.String r10 = java.lang.String.valueOf(r7)
            ub8 r16 = defpackage.ub8.c
            ju0 r7 = r1.Z
            yg9 r7 = (defpackage.yg9) r7
            java.lang.String r13 = r7.h
            java.lang.String r12 = r7.i
            int r7 = defpackage.uh9.K
            kke r7 = r0.b
            w9a r7 = (defpackage.w9a) r7
            cx7 r15 = r7.c()
            ph9 r11 = new ph9
            r17 = 0
            r7 = r11
            r8 = r0
            r9 = r19
            r5 = r11
            r11 = r16
            r6 = r15
            r15 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            kotlinx.coroutines.internal.ContextScope r0 = r0.h
            defpackage.j47.T(r0, r6, r4, r5, r2)
            uh9 r0 = r1.s0
            ju0 r5 = r1.Z
            yg9 r5 = (defpackage.yg9) r5
            long r13 = r5.e
            java.lang.String r6 = r5.f
            long r11 = r5.d
            r1.X = r4
            r1.Y = r2
            taa r5 = r0.g
            java.lang.String r7 = java.lang.String.valueOf(r13)
            so4 r8 = r5.a()
            d9g r8 = r8.b
            q94 r8 = (defpackage.q94) r8
            dn4 r7 = r8.d(r7)
            if (r7 == 0) goto L_0x0165
            int r8 = r7.b
            r9 = 3
            if (r8 == r9) goto L_0x0168
        L_0x0165:
            r23 = r3
            goto L_0x01c4
        L_0x0168:
            vo4 r7 = r7.a
            android.net.Uri r7 = r7.b
            android.net.Uri$Builder r7 = r7.buildUpon()
            kj6 r8 = defpackage.ub8.a
            r8.getClass()
            java.lang.String r8 = "MediaItemType"
            r9 = 1
            java.lang.String r10 = java.lang.String.valueOf(r9)
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r8, r10)
            android.net.Uri r7 = r7.build()
            java.lang.String r7 = r7.toString()
            je7 r8 = r5.d
            java.lang.Object r8 = r8.getValue()
            spd r8 = (defpackage.spd) r8
            b94 r8 = r8.i(r7)
            long r8 = defpackage.dt3.a(r8)
            je7 r5 = r5.d
            java.lang.Object r5 = r5.getValue()
            spd r5 = (defpackage.spd) r5
            monitor-enter(r5)
            bwf r10 = r5.c     // Catch:{ all -> 0x01b8 }
            mx0 r7 = r10.h(r7)     // Catch:{ all -> 0x01b8 }
            if (r7 == 0) goto L_0x01ba
            r23 = r3
            r2 = 0
            long r2 = r7.a(r2, r8)     // Catch:{ all -> 0x01b8 }
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x01bc
            r18 = 1
            goto L_0x01be
        L_0x01b8:
            r0 = move-exception
            goto L_0x01c2
        L_0x01ba:
            r23 = r3
        L_0x01bc:
            r18 = 0
        L_0x01be:
            monitor-exit(r5)
            r5 = r18
            goto L_0x01c5
        L_0x01c2:
            monitor-exit(r5)     // Catch:{ all -> 0x01b8 }
            throw r0
        L_0x01c4:
            r5 = 0
        L_0x01c5:
            if (r5 == 0) goto L_0x0208
            au8 r1 = r0.d
            cu8 r1 = r1.q(r13)
            if (r1 == 0) goto L_0x01f5
            k8g r2 = r1.z0
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01f5
            java.util.Iterator r2 = r2.iterator()
        L_0x01dd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f3
            java.lang.Object r3 = r2.next()
            r5 = r3
            l20 r5 = (defpackage.l20) r5
            java.lang.String r5 = r5.r
            boolean r5 = defpackage.tpa.f(r5, r6)
            if (r5 == 0) goto L_0x01dd
            r4 = r3
        L_0x01f3:
            l20 r4 = (defpackage.l20) r4
        L_0x01f5:
            if (r4 == 0) goto L_0x0202
            d20 r2 = r4.o
            d20 r3 = defpackage.d20.c
            if (r2 == r3) goto L_0x0202
            au8 r0 = r0.d
            r0.u(r1, r6, r3)
        L_0x0202:
            e5f r0 = defpackage.e5f.a
        L_0x0204:
            r1 = r23
            goto L_0x02be
        L_0x0208:
            java.lang.String r2 = "MediaMetadata.Extra.CHAT_ID"
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r11)
            kpa r5 = new kpa
            r5.<init>(r2, r3)
            java.lang.String r2 = "MediaMetadata.Extra.ATTACH_ID"
            kpa r3 = new kpa
            r3.<init>(r2, r6)
            java.lang.String r2 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            kpa r8 = new kpa
            r8.<init>(r2, r7)
            kpa[] r2 = new defpackage.kpa[]{r5, r3, r8}
            android.os.Bundle r2 = defpackage.dy7.g(r2)
            taa r3 = r0.g
            java.lang.String r8 = java.lang.String.valueOf(r13)
            r10 = 0
            r5 = 0
            r7 = r19
            r9 = r16
            r21 = r11
            r11 = r5
            r12 = r2
            tb8 r2 = defpackage.uh9.j(r7, r8, r9, r10, r11, r12)
            r3.getClass()
            ib8 r5 = r2.b
            if (r5 == 0) goto L_0x0287
            android.net.Uri r5 = r5.a
            if (r5 == 0) goto L_0x0287
            android.net.Uri r7 = defpackage.ay7.G(r5, r2)
            java.lang.String r30 = r7.toString()
            vo4 r7 = new vo4
            ls5 r8 = defpackage.zw6.b
            ffc r28 = defpackage.ffc.X
            java.lang.String r8 = r2.a
            r29 = 0
            r31 = 0
            r27 = 0
            r24 = r7
            r25 = r8
            r26 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            je7 r5 = r3.c
            java.lang.Object r5 = r5.getValue()
            fx7 r5 = (defpackage.fx7) r5
            cx7 r5 = r5.a
            cx7 r5 = r5.getImmediate()
            hz4 r8 = defpackage.hz4.a
            do9 r9 = new do9
            r10 = 2
            r9.<init>(r3, r10, r7)
            r5.dispatch(r8, r9)
            goto L_0x0288
        L_0x0287:
            r10 = 2
        L_0x0288:
            java.lang.String r2 = r2.a
            saa r5 = new saa
            r5.<init>(r3, r2, r4)
            kq1 r2 = defpackage.od2.g(r5)
            r3 = 1
            mn5 r2 = defpackage.od2.e(r2, r3, r10)
            kke r3 = r0.b
            w9a r3 = (defpackage.w9a) r3
            cx7 r3 = r3.c()
            mn5 r2 = defpackage.od2.F(r2, r3)
            lh9 r3 = new lh9
            r15 = r3
            r16 = r13
            r18 = r6
            r20 = r0
            r15.<init>(r16, r18, r19, r20, r21)
            java.lang.Object r0 = r2.d(r3, r1)
            tx3 r1 = defpackage.tx3.a
            if (r0 != r1) goto L_0x02ba
            goto L_0x0204
        L_0x02ba:
            e5f r0 = defpackage.e5f.a
            goto L_0x0204
        L_0x02be:
            if (r0 != r1) goto L_0x0318
            return r1
        L_0x02c1:
            int r0 = defpackage.uh9.K
            java.lang.String r0 = "uh9"
            ju0 r1 = r1.Z
            yg9 r1 = (defpackage.yg9) r1
            java.lang.String r1 = r1.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid audio url: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.hm9.m0(r0, r1, new java.lang.Object[0])
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02df:
            boolean r2 = r0 instanceof defpackage.zg9
            if (r2 == 0) goto L_0x031b
            uh9 r2 = r1.s0
            kk5 r3 = r2.c
            zg9 r0 = (defpackage.zg9) r0
            long r5 = r0.d
            java.io.File r0 = r3.d(r5)
            java.lang.String r7 = r0.getAbsolutePath()
            ju0 r0 = r1.Z
            zg9 r0 = (defpackage.zg9) r0
            long r0 = r0.d
            java.lang.String r8 = java.lang.String.valueOf(r0)
            ub8 r9 = defpackage.ub8.o
            kke r0 = r2.b
            w9a r0 = (defpackage.w9a) r0
            cx7 r0 = r0.c()
            ph9 r1 = new ph9
            r13 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r1
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            kotlinx.coroutines.internal.ContextScope r2 = r2.h
            r3 = 2
            defpackage.j47.T(r2, r0, r4, r1, r3)
        L_0x0318:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x031b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh9.o(java.lang.Object):java.lang.Object");
    }
}
