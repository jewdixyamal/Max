package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: y03  reason: default package */
public final class y03 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y03(int i, Continuation continuation) {
        super(3, continuation);
        this.X = 5;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                y03 y03 = new y03(3, (Continuation) obj3, 0);
                y03.Z = (on5) obj;
                y03.s0 = (gq9) obj2;
                return y03.o(e5f.a);
            case 1:
                y03 y032 = new y03(3, (Continuation) obj3, 1);
                y032.Z = (on5) obj;
                y032.s0 = (h8f) obj2;
                return y032.o(e5f.a);
            case 2:
                on5 on5 = (on5) obj;
                y03 y033 = new y03((yj5) this.s0, (Continuation) obj3);
                y033.Z = (Throwable) obj2;
                return y033.o(e5f.a);
            case 3:
                y03 y034 = new y03(3, (Continuation) obj3, 3);
                y034.Z = (on5) obj;
                y034.s0 = (Throwable) obj2;
                return y034.o(e5f.a);
            case 4:
                y03 y035 = new y03(3, (Continuation) obj3, 4);
                y035.Z = (on5) obj;
                y035.s0 = obj2;
                return y035.o(e5f.a);
            case 5:
                y03 y036 = new y03(this.Y, (Continuation) obj3);
                y036.Z = (cmd) obj;
                y036.s0 = (fka) obj2;
                e5f e5f = e5f.a;
                y036.o(e5f);
                return e5f;
            case 6:
                y03 y037 = new y03(3, (Continuation) obj3, 6);
                y037.Z = (on5) obj;
                y037.s0 = (Conversation) obj2;
                return y037.o(e5f.a);
            default:
                on5 on52 = (on5) obj;
                Throwable th = (Throwable) obj2;
                return new y03((cge) this.Z, (d7f) this.s0, (Continuation) obj3).o(e5f.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026d, code lost:
        if ((r6 instanceof defpackage.eq9) == false) goto L_0x026f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.X
            switch(r1) {
                case 0: goto L_0x022d;
                case 1: goto L_0x01ec;
                case 2: goto L_0x015d;
                case 3: goto L_0x011f;
                case 4: goto L_0x00dc;
                case 5: goto L_0x009d;
                case 6: goto L_0x005c;
                default: goto L_0x0007;
            }
        L_0x0007:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x001c
            if (r2 != r3) goto L_0x0014
            defpackage.od2.a0(r19)
            goto L_0x0059
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            cge r2 = (defpackage.cge) r2
            java.lang.String r2 = r2.b
            java.lang.Object r4 = r0.s0
            d7f r4 = (defpackage.d7f) r4
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0048
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "On uploading complete for="
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r7 = 0
            r5.d(r6, r2, r4, r7)
        L_0x0048:
            java.lang.Object r2 = r0.Z
            cge r2 = (defpackage.cge) r2
            java.lang.Object r4 = r0.s0
            d7f r4 = (defpackage.d7f) r4
            r0.Y = r3
            java.lang.Object r0 = r2.g(r4, r0)
            if (r0 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            e5f r1 = defpackage.e5f.a
        L_0x005b:
            return r1
        L_0x005c:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0078
            if (r2 == r4) goto L_0x0074
            if (r2 != r3) goto L_0x006c
            defpackage.od2.a0(r19)
            goto L_0x009a
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0074:
            defpackage.od2.a0(r19)
            goto L_0x008f
        L_0x0078:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            on5 r2 = (defpackage.on5) r2
            java.lang.Object r5 = r0.s0
            ru.ok.android.externcalls.sdk.Conversation r5 = (ru.ok.android.externcalls.sdk.Conversation) r5
            r6 = 0
            r0.Z = r6
            r0.Y = r4
            java.lang.Object r2 = r2.a(r5, r0)
            if (r2 != r1) goto L_0x008f
            goto L_0x009c
        L_0x008f:
            r0.Y = r3
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = defpackage.j47.x(r2, r0)
            if (r0 != r1) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            e5f r1 = defpackage.e5f.a
        L_0x009c:
            return r1
        L_0x009d:
            defpackage.od2.a0(r19)
            java.lang.Object r1 = r0.Z
            cmd r1 = (defpackage.cmd) r1
            java.lang.Object r2 = r0.s0
            fka r2 = (defpackage.fka) r2
            bkg r3 = new bkg
            r4 = 25
            r3.<init>(r4)
            r4 = 0
            java.lang.Object r5 = r3.b
            yld r5 = (defpackage.yld) r5
            r5.k = r4
            r4 = 0
            r5.i = r4
            ne0 r4 = r2.b()
            int r4 = r4.l
            r3.v(r4)
            ne0 r2 = r2.b()
            int r2 = r2.k
            r5.d = r2
            r3.u()
            int r0 = r0.Y
            r3.x(r0)
            yld r0 = r3.m()
            r1.a(r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00dc:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x00f1
            if (r2 != r3) goto L_0x00e9
            defpackage.od2.a0(r19)
            goto L_0x011c
        L_0x00e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            on5 r2 = (defpackage.on5) r2
            java.lang.Object r4 = r0.s0
            ej7 r4 = (defpackage.ej7) r4
            boolean r5 = r4 instanceof defpackage.vi7
            if (r5 == 0) goto L_0x010c
            yj7 r5 = new yj7
            r6 = 0
            r5.<init>(r4, r6)
            mqc r4 = new mqc
            r4.<init>(r5)
            goto L_0x0113
        L_0x010c:
            qn5 r5 = new qn5
            r6 = 3
            r5.<init>(r6, r4)
            r4 = r5
        L_0x0113:
            r0.Y = r3
            java.lang.Object r0 = defpackage.od2.y(r4, r2, r0)
            if (r0 != r1) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            e5f r1 = defpackage.e5f.a
        L_0x011e:
            return r1
        L_0x011f:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0134
            if (r2 != r3) goto L_0x012c
            defpackage.od2.a0(r19)
            goto L_0x0159
        L_0x012c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0134:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            on5 r2 = (defpackage.on5) r2
            java.lang.Object r4 = r0.s0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r5 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r5 == 0) goto L_0x015c
            njc r5 = new njc
            r5.<init>(r4)
            pjc r4 = new pjc
            r4.<init>(r5)
            r5 = 0
            r0.Z = r5
            r0.Y = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            e5f r1 = defpackage.e5f.a
        L_0x015b:
            return r1
        L_0x015c:
            throw r4
        L_0x015d:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0174
            if (r2 != r4) goto L_0x016c
            defpackage.od2.a0(r19)
            goto L_0x01b4
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0174:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r5 = r0.s0
            yj5 r5 = (defpackage.yj5) r5
            java.lang.String r5 = r5.d
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0186
            goto L_0x01a0
        L_0x0186:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x01a0
            us7 r7 = defpackage.us7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Releasing connectionFactory after using "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            r8 = 0
            r6.d(r7, r5, r2, r8)
        L_0x01a0:
            java.lang.Object r2 = r0.s0
            yj5 r2 = (defpackage.yj5) r2
            je7 r2 = r2.f
            java.lang.Object r2 = r2.getValue()
            zve r2 = (defpackage.zve) r2
            r0.Y = r4
            r2.getClass()
            if (r3 != r1) goto L_0x01b4
            goto L_0x01eb
        L_0x01b4:
            java.lang.Object r1 = r0.s0
            yj5 r1 = (defpackage.yj5) r1
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            ct0 r1 = (defpackage.ct0) r1
            java.lang.Object r2 = r0.s0
            yj5 r2 = (defpackage.yj5) r2
            khe r2 = r2.m
            java.lang.Object r2 = r2.getValue()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.b(r2)
            java.lang.Object r1 = r0.s0
            yj5 r1 = (defpackage.yj5) r1
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            ct0 r1 = (defpackage.ct0) r1
            java.lang.Object r0 = r0.s0
            yj5 r0 = (defpackage.yj5) r0
            khe r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.b(r0)
            r1 = r3
        L_0x01eb:
            return r1
        L_0x01ec:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0205
            if (r2 != r3) goto L_0x01fd
            java.lang.Object r0 = r0.Z
            h8f r0 = (defpackage.h8f) r0
            defpackage.od2.a0(r19)
            goto L_0x021c
        L_0x01fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0205:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            on5 r2 = (defpackage.on5) r2
            java.lang.Object r4 = r0.s0
            h8f r4 = (defpackage.h8f) r4
            r0.Z = r4
            r0.Y = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L_0x021b
            goto L_0x022c
        L_0x021b:
            r0 = r4
        L_0x021c:
            float r0 = r0.a
            r1 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0226
            r0 = r3
            goto L_0x0227
        L_0x0226:
            r0 = 0
        L_0x0227:
            r0 = r0 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x022c:
            return r1
        L_0x022d:
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0260
            if (r2 == r5) goto L_0x0254
            if (r2 != r4) goto L_0x024c
            java.lang.Object r2 = r0.s0
            gq9 r2 = (defpackage.gq9) r2
            java.lang.Object r6 = r0.Z
            on5 r6 = (defpackage.on5) r6
            defpackage.od2.a0(r19)
        L_0x0246:
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x0272
        L_0x024c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0254:
            java.lang.Object r2 = r0.s0
            gq9 r2 = (defpackage.gq9) r2
            java.lang.Object r6 = r0.Z
            on5 r6 = (defpackage.on5) r6
            defpackage.od2.a0(r19)
            goto L_0x0297
        L_0x0260:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Z
            on5 r2 = (defpackage.on5) r2
            java.lang.Object r6 = r0.s0
            gq9 r6 = (defpackage.gq9) r6
            boolean r7 = r6 instanceof defpackage.eq9
            if (r7 != 0) goto L_0x0272
        L_0x026f:
            r1 = r3
            goto L_0x02f1
        L_0x0272:
            lx3 r7 = r0.b
            boolean r7 = defpackage.pag.r(r7)
            if (r7 == 0) goto L_0x026f
            r7 = r6
            eq9 r7 = (defpackage.eq9) r7
            boolean r7 = r7.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.Z = r2
            r0.s0 = r6
            r0.Y = r5
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L_0x0292
            goto L_0x02f1
        L_0x0292:
            r17 = r6
            r6 = r2
            r2 = r17
        L_0x0297:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            java.util.Date r7 = r7.getTime()
            r8 = r2
            eq9 r8 = (defpackage.eq9) r8
            java.util.Date r9 = r8.a(r7)
            int r10 = r9.compareTo(r7)
            r11 = 1
            if (r10 >= 0) goto L_0x02bc
            long r13 = r9.getTime()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r15 = r10.toMillis(r11)
            long r13 = r13 + r15
            r9.setTime(r13)
        L_0x02bc:
            java.util.Date r8 = r8.c(r7)
            int r10 = r8.compareTo(r7)
            if (r10 >= 0) goto L_0x02d4
            long r13 = r8.getTime()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r15 = r10.toMillis(r11)
            long r13 = r13 + r15
            r8.setTime(r13)
        L_0x02d4:
            int r10 = r8.compareTo(r9)
            if (r10 > 0) goto L_0x02db
            r9 = r8
        L_0x02db:
            long r8 = r9.getTime()
            long r13 = r7.getTime()
            long r8 = r8 - r13
            long r8 = r8 + r11
            r0.Z = r6
            r0.s0 = r2
            r0.Y = r4
            java.lang.Object r7 = defpackage.j47.x(r8, r0)
            if (r7 != r1) goto L_0x0246
        L_0x02f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y03(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y03(yj5 yj5, Continuation continuation) {
        super(3, continuation);
        this.X = 2;
        this.s0 = yj5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y03(cge cge, d7f d7f, Continuation continuation) {
        super(3, continuation);
        this.X = 7;
        this.Z = cge;
        this.s0 = d7f;
    }
}
