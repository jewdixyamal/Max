package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: mk1  reason: default package */
public final class mk1 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ pnf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk1(pnf pnf, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.t0 = pnf;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                mk1 mk1 = new mk1((el1) this.t0, (Continuation) obj4, 0);
                mk1.Y = (la1) obj;
                mk1.Z = (to1) obj2;
                mk1.s0 = (Map) obj3;
                e5f e5f = e5f.a;
                mk1.o(e5f);
                return e5f;
            case 1:
                mk1 mk12 = new mk1((sn1) this.t0, (Continuation) obj4, 1);
                mk12.Y = (la1) obj;
                mk12.Z = (nnf) obj2;
                mk12.s0 = (vwe) obj3;
                return mk12.o(e5f.a);
            default:
                mk1 mk13 = new mk1((bp8) this.t0, (Continuation) obj4, 2);
                mk13.Y = (List) obj;
                mk13.Z = (List) obj2;
                mk13.s0 = (hn8) obj3;
                return mk13.o(e5f.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0454 A[LOOP:3: B:67:0x0177->B:198:0x0454, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0451 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            pnf r2 = r0.t0
            r4 = 1
            int r5 = r0.X
            switch(r5) {
                case 0: goto L_0x0164;
                case 1: goto L_0x00e3;
                default: goto L_0x000a;
            }
        L_0x000a:
            defpackage.od2.a0(r36)
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.Z
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.s0
            hn8 r0 = (defpackage.hn8) r0
            if (r5 == 0) goto L_0x001d
            r10 = r4
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            r3 = 10
            bp8 r2 = (defpackage.bp8) r2
            if (r10 == 0) goto L_0x005d
            if (r5 == 0) goto L_0x0051
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = defpackage.z53.S(r5, r3)
            r1.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0033:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            uj3 r5 = (defpackage.uj3) r5
            khe r6 = r2.w0
            java.lang.Object r6 = r6.getValue()
            pc4 r6 = (defpackage.pc4) r6
            kn8 r5 = r6.f(r5)
            r1.add(r5)
            goto L_0x0033
        L_0x004f:
            r7 = r1
            goto L_0x006e
        L_0x0051:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.Integer r4 = r2.o
            if (r4 == 0) goto L_0x0069
            int r4 = r4.intValue()
            java.util.List r1 = defpackage.x53.y0(r1, r4)
        L_0x0069:
            java.util.List r1 = defpackage.x53.D0(r1)
            goto L_0x004f
        L_0x006e:
            java.util.List r1 = r0.a
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = defpackage.z53.S(r1, r3)
            r8.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x007d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r1.next()
            dn8 r4 = (defpackage.dn8) r4
            en8 r5 = new en8
            int r12 = r4.a
            java.lang.Integer r15 = r4.o
            hfd r6 = r4.X
            jqe r13 = r4.b
            jfd r14 = r4.c
            r11 = r5
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r8.add(r5)
            goto L_0x007d
        L_0x009f:
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r0 = r0.b
            int r1 = defpackage.z53.S(r0, r3)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r1 = r0.next()
            dn8 r1 = (defpackage.dn8) r1
            en8 r3 = new en8
            int r12 = r1.a
            java.lang.Integer r15 = r1.o
            hfd r4 = r1.X
            jqe r13 = r1.b
            jfd r14 = r1.c
            r11 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r9.add(r3)
            goto L_0x00ae
        L_0x00d0:
            je7 r0 = r2.s0
            java.lang.Object r0 = r0.getValue()
            lp8 r0 = (defpackage.lp8) r0
            boolean r11 = r0.c()
            so8 r0 = new so8
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x00e3:
            defpackage.od2.a0(r36)
            java.lang.Object r5 = r0.Y
            la1 r5 = (defpackage.la1) r5
            java.lang.Object r6 = r0.Z
            nnf r6 = (defpackage.nnf) r6
            java.lang.Object r0 = r0.s0
            r16 = r0
            vwe r16 = (defpackage.vwe) r16
            boolean r8 = r5.g
            boolean r0 = r5.m
            if (r8 != 0) goto L_0x0103
            boolean r7 = r5.t
            if (r7 == 0) goto L_0x0101
            if (r0 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r9 = 0
            goto L_0x0104
        L_0x0103:
            r9 = r4
        L_0x0104:
            if (r8 != 0) goto L_0x0108
            r10 = 0
            goto L_0x0109
        L_0x0108:
            r10 = r6
        L_0x0109:
            boolean r1 = r5.s
            r11 = r1 ^ 1
            if (r8 == 0) goto L_0x0138
            boolean r1 = r5.l
            if (r1 != 0) goto L_0x0138
            sn1 r2 = (defpackage.sn1) r2
            el1 r1 = r2.b
            khe r1 = r1.z0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0138
            el1 r1 = r2.b
            khe r1 = r1.B0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r12 = 0
            goto L_0x0139
        L_0x0138:
            r12 = r4
        L_0x0139:
            yj1 r1 = r5.j
            boolean r13 = r1.c
            i95 r1 = r5.e
            boolean r2 = r1 instanceof defpackage.h95
            boolean r5 = r5.g
            if (r2 != 0) goto L_0x0150
            boolean r6 = r1 instanceof defpackage.e95
            if (r6 == 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            if (r5 == 0) goto L_0x014e
            r14 = r4
            goto L_0x0151
        L_0x014e:
            r14 = r0
            goto L_0x0151
        L_0x0150:
            r14 = 0
        L_0x0151:
            if (r2 != 0) goto L_0x015c
            boolean r0 = r1 instanceof defpackage.e95
            if (r0 == 0) goto L_0x0158
            goto L_0x015c
        L_0x0158:
            if (r5 == 0) goto L_0x015c
            r15 = r4
            goto L_0x015d
        L_0x015c:
            r15 = 0
        L_0x015d:
            dxe r0 = new dxe
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0164:
            defpackage.od2.a0(r36)
            java.lang.Object r5 = r0.Y
            la1 r5 = (defpackage.la1) r5
            java.lang.Object r6 = r0.Z
            to1 r6 = (defpackage.to1) r6
            java.lang.Object r0 = r0.s0
            java.util.Map r0 = (java.util.Map) r0
            el1 r2 = (defpackage.el1) r2
            q0e r7 = r2.E0
        L_0x0177:
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            j41 r9 = (defpackage.j41) r9
            c11 r10 = r2.o
            r10.e = r5
            nnf r11 = r6.e
            r10.f = r11
            gg1 r11 = r6.b
            r10.g = r11
            gg1 r12 = r6.a
            r10.h = r12
            r10.i = r0
            boolean r12 = r6.d
            r10.a = r12
            i95 r12 = r5.e
            boolean r12 = r12 instanceof defpackage.c95
            if (r12 == 0) goto L_0x01a8
            i41 r9 = defpackage.i41.a
        L_0x019c:
            r35 = r0
            r36 = r2
            r3 = r4
            r23 = r5
            r24 = r6
            r0 = r7
            goto L_0x044b
        L_0x01a8:
            boolean r12 = r9 instanceof defpackage.h41
            if (r12 == 0) goto L_0x019c
            h41 r9 = (defpackage.h41) r9
            m38 r12 = defpackage.m38.b
            m38 r13 = r5.q
            if (r13 != r12) goto L_0x01b6
            r13 = r4
            goto L_0x01b7
        L_0x01b6:
            r13 = 0
        L_0x01b7:
            if (r13 != 0) goto L_0x01bb
        L_0x01b9:
            r11 = 0
            goto L_0x01dd
        L_0x01bb:
            boolean r13 = r5.g
            if (r13 == 0) goto L_0x01c0
            goto L_0x01b9
        L_0x01c0:
            if (r11 == 0) goto L_0x01cf
            gg1 r13 = defpackage.gg1.c
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x01cf
            java.lang.Object r11 = r10.g
            gg1 r11 = (defpackage.gg1) r11
            goto L_0x01dd
        L_0x01cf:
            java.lang.Object r11 = r10.e
            la1 r11 = (defpackage.la1) r11
            fqa r11 = r11.h
            if (r11 == 0) goto L_0x01b9
            ig1 r11 = r11.a
            gg1 r11 = r11.getId()
        L_0x01dd:
            java.lang.Object r13 = r10.f
            nnf r13 = (defpackage.nnf) r13
            java.lang.Object r14 = r10.i
            java.util.Map r14 = (java.util.Map) r14
            zx7 r13 = r10.c(r13, r14, r11)
            java.lang.Object r14 = r10.e
            la1 r14 = (defpackage.la1) r14
            boolean r15 = r14.g
            if (r15 != 0) goto L_0x0201
            boolean r15 = r14.s
            if (r15 != 0) goto L_0x0201
            ak1 r14 = r14.i
            boolean r14 = r14.a()
            if (r14 == 0) goto L_0x01fe
            goto L_0x0201
        L_0x01fe:
            r22 = 0
            goto L_0x0203
        L_0x0201:
            r22 = r4
        L_0x0203:
            h41 r14 = new h41
            java.lang.Object r15 = r10.f
            nnf r15 = (defpackage.nnf) r15
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r4 = r1.s
            nnf r3 = defpackage.nnf.a
            if (r4 == 0) goto L_0x0222
            nz4 r1 = defpackage.nz4.a
            r35 = r0
            r17 = r1
        L_0x0219:
            r36 = r2
            r23 = r5
            r24 = r6
            r4 = 0
            goto L_0x02f9
        L_0x0222:
            ak1 r1 = r1.i
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0267
            sd1 r1 = new sd1
            int r4 = defpackage.b8a.Z
            java.lang.Object r11 = r10.i
            java.util.Map r11 = (java.util.Map) r11
            r35 = r0
            java.lang.Object r0 = r10.e
            la1 r0 = (defpackage.la1) r0
            ak1 r0 = r0.i
            gg1 r0 = r0.c
            java.lang.Object r0 = r11.get(r0)
            hb1 r0 = (defpackage.hb1) r0
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r0.b
            if (r0 != 0) goto L_0x024a
        L_0x0248:
            java.lang.String r0 = ""
        L_0x024a:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            gqe r11 = new gqe
            java.util.List r0 = defpackage.ys.m0(r0)
            r11.<init>(r4, r0)
            java.lang.Object r0 = r10.e
            la1 r0 = (defpackage.la1) r0
            ak1 r0 = r0.i
            r1.<init>(r11, r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r17 = r0
            goto L_0x0219
        L_0x0267:
            r35 = r0
            java.lang.Object r0 = r10.e
            la1 r0 = (defpackage.la1) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x02d4
            qd1 r1 = new qd1
            nnf r4 = defpackage.nnf.c
            r36 = r2
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r2 = r2.values()
            java.util.List r0 = r10.a(r2, r4, r0)
            java.lang.Object r2 = r10.e
            la1 r2 = (defpackage.la1) r2
            boolean r4 = r2.s
            if (r4 == 0) goto L_0x028d
            r4 = 0
            goto L_0x0292
        L_0x028d:
            lg6 r4 = new lg6
            r4.<init>(r0)
        L_0x0292:
            r1.<init>(r4)
            boolean r0 = r2.l
            if (r0 == 0) goto L_0x02bf
            ud1 r0 = new ud1
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            zx7 r4 = r10.c(r3, r2, r11)
            r23 = r5
            java.lang.Object r5 = r10.e
            la1 r5 = (defpackage.la1) r5
            r24 = r6
            java.lang.Object r6 = r10.i
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.util.List r5 = r10.a(r6, r3, r5)
            mvd r2 = r10.b(r2, r4, r5, r11)
            r0.<init>(r2)
            goto L_0x02c4
        L_0x02bf:
            r23 = r5
            r24 = r6
            r0 = 0
        L_0x02c4:
            r2 = 2
            vd1[] r2 = new defpackage.vd1[r2]
            r4 = 0
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            java.util.ArrayList r0 = defpackage.ys.d0(r2)
        L_0x02d1:
            r17 = r0
            goto L_0x02f9
        L_0x02d4:
            r36 = r2
            r23 = r5
            r24 = r6
            r4 = 0
            java.lang.Object r1 = r10.i
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r1 = r1.values()
            java.util.List r0 = r10.a(r1, r15, r0)
            ud1 r1 = new ud1
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            mvd r0 = r10.b(r2, r13, r0, r11)
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            goto L_0x02d1
        L_0x02f9:
            java.lang.Object r0 = r10.c
            je7 r0 = (defpackage.je7) r0
            if (r13 == 0) goto L_0x030d
            java.lang.Object r1 = r10.f
            nnf r1 = (defpackage.nnf) r1
            if (r1 != r3) goto L_0x030d
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r2 = r1.s
            if (r2 == 0) goto L_0x0314
        L_0x030d:
            r34 = r7
            r16 = r15
            r3 = 1
            goto L_0x03be
        L_0x0314:
            qd7 r2 = new qd7
            boolean r3 = r1.g
            haf r5 = r13.h
            if (r3 != 0) goto L_0x0328
            boolean r1 = r1.t
            if (r1 == 0) goto L_0x0321
            goto L_0x0328
        L_0x0321:
            r34 = r7
            r16 = r15
            r27 = 0
            goto L_0x0363
        L_0x0328:
            java.lang.Object r1 = r0.getValue()
            r25 = r1
            bn1 r25 = (defpackage.bn1) r25
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r3 = r1.g
            if (r5 == 0) goto L_0x033d
            boolean r6 = r5.g
            r32 = r6
            goto L_0x033f
        L_0x033d:
            r32 = r4
        L_0x033f:
            boolean r6 = r1.m
            i95 r1 = r1.e
            boolean r11 = r13.i
            int r4 = r13.k
            r16 = r15
            java.lang.CharSequence r15 = r13.b
            r34 = r7
            boolean r7 = r13.g
            r26 = r11
            r27 = r4
            r28 = r15
            r29 = r3
            r30 = r7
            r31 = r6
            r33 = r1
            android.text.SpannableStringBuilder r1 = r25.g(r26, r27, r28, r29, r30, r31, r32, r33)
            r27 = r1
        L_0x0363:
            java.lang.Object r1 = r10.h
            gg1 r1 = (defpackage.gg1) r1
            gg1 r3 = r13.c
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 == 0) goto L_0x037a
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x037a
            r28 = 1
            goto L_0x037c
        L_0x037a:
            r28 = 0
        L_0x037c:
            boolean r1 = r13.i
            if (r1 == 0) goto L_0x0394
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x0394
            if (r5 == 0) goto L_0x0394
            boolean r1 = r5.c
            r3 = 1
            if (r1 != r3) goto L_0x0394
            iaf r1 = defpackage.iaf.b
        L_0x0391:
            r30 = r1
            goto L_0x03a2
        L_0x0394:
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x039f
            iaf r1 = defpackage.iaf.a
            goto L_0x0391
        L_0x039f:
            iaf r1 = defpackage.iaf.o
            goto L_0x0391
        L_0x03a2:
            gg1 r1 = r13.c
            boolean r3 = r13.d
            r25 = r2
            r26 = r1
            r29 = r3
            r25.<init>(r26, r27, r28, r29, r30)
            qd7 r1 = defpackage.qd7.f
            boolean r1 = r2.equals(r1)
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x03ba
            goto L_0x03bb
        L_0x03ba:
            r2 = 0
        L_0x03bb:
            r19 = r2
            goto L_0x03c0
        L_0x03be:
            r19 = 0
        L_0x03c0:
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r2 = r1.s
            if (r2 != 0) goto L_0x03cb
            r18 = 0
            goto L_0x0427
        L_0x03cb:
            w4f r2 = new w4f
            m31 r1 = r1.f
            if (r1 == 0) goto L_0x03d6
            java.lang.CharSequence r1 = r1.b
            r26 = r1
            goto L_0x03d8
        L_0x03d6:
            r26 = 0
        L_0x03d8:
            java.lang.Object r0 = r0.getValue()
            bn1 r0 = (defpackage.bn1) r0
            java.lang.Object r1 = r10.e
            la1 r1 = (defpackage.la1) r1
            boolean r4 = r1.d
            boolean r5 = r1.g
            boolean r6 = r1.m
            i95 r1 = r1.e
            java.lang.String r27 = r0.f(r5, r4, r6, r1)
            java.lang.Object r0 = r10.e
            la1 r0 = (defpackage.la1) r0
            m31 r1 = r0.f
            j1e r4 = r0.c
            if (r4 == 0) goto L_0x03fb
            r29 = r3
            goto L_0x03fd
        L_0x03fb:
            r29 = 0
        L_0x03fd:
            m38 r4 = r0.q
            if (r4 != r12) goto L_0x0404
            r30 = r3
            goto L_0x0406
        L_0x0404:
            r30 = 0
        L_0x0406:
            i95 r0 = r0.e
            boolean r4 = r0 instanceof defpackage.b95
            if (r4 == 0) goto L_0x040f
            b95 r0 = (defpackage.b95) r0
            goto L_0x0410
        L_0x040f:
            r0 = 0
        L_0x0410:
            if (r0 == 0) goto L_0x0415
            int r0 = r0.b
            goto L_0x0416
        L_0x0415:
            r0 = 0
        L_0x0416:
            r4 = 3
            if (r0 != r4) goto L_0x041c
            r31 = r3
            goto L_0x041e
        L_0x041c:
            r31 = 0
        L_0x041e:
            r25 = r2
            r28 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r18 = r2
        L_0x0427:
            java.lang.Object r0 = r10.e
            la1 r0 = (defpackage.la1) r0
            boolean r0 = r0.g
            if (r13 == 0) goto L_0x0434
            md0 r1 = r13.a
            r21 = r1
            goto L_0x0436
        L_0x0434:
            r21 = 0
        L_0x0436:
            jp1 r1 = r9.a
            r1.getClass()
            jp1 r1 = new jp1
            r2 = r16
            r15 = r1
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r14.<init>(r1)
            r9 = r14
            r0 = r34
        L_0x044b:
            boolean r1 = r0.c(r8, r9)
            if (r1 == 0) goto L_0x0454
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0454:
            r2 = r36
            r7 = r0
            r4 = r3
            r5 = r23
            r6 = r24
            r0 = r35
            goto L_0x0177
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk1.o(java.lang.Object):java.lang.Object");
    }
}
