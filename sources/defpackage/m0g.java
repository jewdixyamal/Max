package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: m0g  reason: default package */
public final class m0g extends ffe implements a66 {
    public ArrayList X;
    public int Y;
    public int Z;
    public final /* synthetic */ p0g s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0g(p0g p0g, Continuation continuation) {
        super(2, continuation);
        this.s0 = p0g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m0g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m0g(this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r33) {
        /*
            r32 = this;
            r6 = r32
            tx3 r7 = defpackage.tx3.a
            int r0 = r6.Z
            e5f r8 = defpackage.e5f.a
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 2
            if (r0 == 0) goto L_0x002c
            if (r0 == r10) goto L_0x0026
            if (r0 != r12) goto L_0x001e
            int r0 = r6.Y
            java.util.ArrayList r1 = r6.X
            defpackage.od2.a0(r33)
            r2 = r0
            r0 = r33
            goto L_0x0098
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            defpackage.od2.a0(r33)
            r0 = r33
            goto L_0x004c
        L_0x002c:
            defpackage.od2.a0(r33)
            p0g r0 = r6.s0
            je7 r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            mtf r0 = (defpackage.mtf) r0
            p0g r1 = r6.s0
            long r2 = r1.b
            long r4 = r1.c
            r6.Z = r10
            r1 = r2
            r3 = r4
            r5 = r32
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r7) goto L_0x004c
            return r7
        L_0x004c:
            puf r0 = (defpackage.puf) r0
            if (r0 != 0) goto L_0x006d
            p0g r0 = r6.s0
            java.lang.String r1 = r0.X
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0059
            goto L_0x006c
        L_0x0059:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x006c
            us7 r3 = defpackage.us7.s0
            long r4 = r0.c
            java.lang.String r0 = "Can't get webApp info from database, botId: "
            java.lang.String r0 = defpackage.ey8.h(r4, r0)
            r2.d(r3, r1, r0, r9)
        L_0x006c:
            return r8
        L_0x006d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x007c
            boolean r2 = r0.e
            if (r2 == 0) goto L_0x007c
            r2 = r10
            goto L_0x007d
        L_0x007c:
            r2 = r11
        L_0x007d:
            p0g r3 = r6.s0
            je7 r3 = r3.Z
            java.lang.Object r3 = r3.getValue()
            uc6 r3 = (defpackage.uc6) r3
            long r4 = r0.c
            kk0 r0 = defpackage.kk0.a
            r6.X = r1
            r6.Y = r2
            r6.Z = r12
            java.lang.Object r0 = r3.a(r4, r0, r6)
            if (r0 != r7) goto L_0x0098
            return r7
        L_0x0098:
            rc6 r0 = (defpackage.rc6) r0
            java.lang.String r3 = r0.a
            java.lang.String r4 = r0.b
            uc0 r0 = r0.c
            vfd r5 = new vfd
            int r7 = defpackage.mla.i
            eqe r15 = new eqe
            r15.<init>(r7)
            cfd r20 = defpackage.cfd.a
            wed r7 = new wed
            r7.<init>(r0, r4)
            r22 = 0
            r23 = 0
            r13 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r0 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r25 = 952(0x3b8, float:1.334E-42)
            r12 = r5
            r4 = r15
            r15 = r0
            r16 = r4
            r24 = r7
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            v2g r0 = new v2g
            zxf r4 = defpackage.zxf.c
            p0g r7 = r6.s0
            long r12 = r7.c
            r4.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = ":webapp:root?bot_id="
            r4.<init>(r7)
            r4.append(r12)
            java.lang.String r7 = "&entry_point=settings_privacy"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            c64 r14 = new c64
            r14.<init>(r4)
            r17 = 4
            r15 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r12 = r0
            r13 = r5
            r12.<init>(r13, r14, r15, r17)
            r1.add(r0)
            vfd r0 = new vfd
            int r4 = defpackage.mla.g
            eqe r5 = new eqe
            r5.<init>(r4)
            int r4 = defpackage.mla.h
            eqe r7 = new eqe
            r7.<init>(r4)
            ffd r4 = new ffd
            if (r2 == 0) goto L_0x0115
            r11 = r10
        L_0x0115:
            r4.<init>(r11, r10)
            r29 = 0
            r30 = 0
            r19 = 9223372036854775805(0x7ffffffffffffffd, double:NaN)
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r31 = 1960(0x7a8, float:2.747E-42)
            r18 = r0
            r22 = r5
            r24 = r7
            r26 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            u2g r2 = new u2g
            r2.<init>(r0)
            r1.add(r2)
            p0g r0 = r6.s0
            q0e r0 = r0.t0
            l0g r2 = new l0g
            r2.<init>(r3, r1)
            r0.m(r9, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0g.o(java.lang.Object):java.lang.Object");
    }
}
