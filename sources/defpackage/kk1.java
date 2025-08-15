package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: kk1  reason: default package */
public final class kk1 extends ffe implements h66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public /* synthetic */ Object t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ Object v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk1(Object obj, Continuation continuation, int i) {
        super(6, continuation);
        this.X = i;
        this.v0 = obj;
    }

    public final void k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.X) {
            case 0:
                kk1 kk1 = new kk1((el1) this.v0, (Continuation) obj6, 0);
                kk1.Y = (d04) obj;
                kk1.Z = (pqa) obj2;
                kk1.s0 = (y21) obj3;
                kk1.t0 = (wvc) obj4;
                kk1.u0 = (aa) obj5;
                kk1.o(e5f.a);
                return;
            default:
                kk1 kk12 = new kk1((ChatsListWidget) this.v0, (Continuation) obj6, 1);
                kk12.Y = (mt2) obj;
                kk12.Z = (List) obj2;
                kk12.s0 = (List) obj3;
                kk12.t0 = (List) obj4;
                kk12.u0 = (List) obj5;
                kk12.o(e5f.a);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b8 A[LOOP:0: B:21:0x0098->B:119:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r41) {
        /*
            r40 = this;
            r0 = r40
            int r1 = r0.X
            switch(r1) {
                case 0: goto L_0x006b;
                default: goto L_0x0007;
            }
        L_0x0007:
            defpackage.od2.a0(r41)
            java.lang.Object r1 = r0.Y
            mt2 r1 = (defpackage.mt2) r1
            java.lang.Object r2 = r0.Z
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.s0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.t0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.u0
            java.util.List r5 = (java.util.List) r5
            mt2 r6 = defpackage.mt2.c
            nz4 r7 = defpackage.nz4.a
            java.lang.Object r0 = r0.v0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            if (r1 != r6) goto L_0x002e
            a3g r2 = r0.B0
            r2.E(r7)
            goto L_0x0033
        L_0x002e:
            a3g r6 = r0.B0
            r6.E(r2)
        L_0x0033:
            ly4 r2 = r0.A0
            java.util.List r6 = r1.a
            r2.E(r6)
            android.view.View r2 = r0.getView()
            boolean r1 = r1.b
            if (r2 == 0) goto L_0x0049
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r0.o0()
            r2.setRefreshingNext(r1)
        L_0x0049:
            a3g r2 = r0.C0
            r2.E(r3)
            a3g r2 = r0.E0
            if (r1 == 0) goto L_0x0056
            r2.E(r7)
            goto L_0x0063
        L_0x0056:
            java.lang.String r1 = "all.chat.folder"
            java.lang.String r3 = r0.b
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 == 0) goto L_0x0063
            r2.E(r5)
        L_0x0063:
            a3g r0 = r0.D0
            r0.E(r4)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x006b:
            defpackage.od2.a0(r41)
            java.lang.Object r1 = r0.Y
            d04 r1 = (defpackage.d04) r1
            java.lang.Object r2 = r0.Z
            pqa r2 = (defpackage.pqa) r2
            java.lang.Object r3 = r0.s0
            y21 r3 = (defpackage.y21) r3
            java.lang.Object r4 = r0.t0
            wvc r4 = (defpackage.wvc) r4
            java.lang.Object r5 = r0.u0
            aa r5 = (defpackage.aa) r5
            fqa r6 = r2.a
            ig1 r6 = r6.a
            boolean r6 = r6.a()
            r7 = 0
            java.lang.Object r0 = r0.v0
            el1 r0 = (defpackage.el1) r0
            if (r6 != 0) goto L_0x0096
            ir1 r6 = r0.c
            r6.j(r7)
        L_0x0096:
            q0e r6 = r0.x0
        L_0x0098:
            java.lang.Object r8 = r6.getValue()
            r9 = r8
            la1 r9 = (defpackage.la1) r9
            ty2 r10 = r0.X
            r10.c = r1
            r10.o = r2
            r10.X = r3
            r10.Y = r4
            r10.Z = r5
            i95 r11 = r9.e
            boolean r12 = r11 instanceof defpackage.c95
            if (r12 == 0) goto L_0x00bd
        L_0x00b1:
            r35 = r0
            r36 = r1
            r37 = r2
            r38 = r3
            r39 = r4
            goto L_0x029f
        L_0x00bd:
            boolean r12 = r11 instanceof defpackage.b95
            java.lang.String r13 = r9.a
            if (r12 != 0) goto L_0x00c4
            goto L_0x00d7
        L_0x00c4:
            i95 r12 = r1.j
            boolean r12 = r12 instanceof defpackage.c95
            if (r12 != 0) goto L_0x00b1
            boolean r12 = r1.g
            if (r12 == 0) goto L_0x00d7
            java.lang.String r12 = r1.c
            boolean r12 = defpackage.tpa.f(r12, r13)
            if (r12 != 0) goto L_0x00d7
            goto L_0x00b1
        L_0x00d7:
            java.lang.Object r12 = r10.c
            d04 r12 = (defpackage.d04) r12
            boolean r12 = r12.f
            java.lang.Object r14 = r10.o
            pqa r14 = (defpackage.pqa) r14
            fqa r15 = r14.a
            ig1 r14 = r15.a
            boolean r17 = r14.isScreenCaptureEnabled()
            java.lang.Object r14 = r10.o
            pqa r14 = (defpackage.pqa) r14
            fqa r14 = r14.a
            ig1 r14 = r14.a
            boolean r21 = r14.f()
            java.lang.Object r14 = r10.o
            pqa r14 = (defpackage.pqa) r14
            fqa r14 = r14.a
            ig1 r14 = r14.a
            boolean r14 = r14.isScreenCaptureEnabled()
            r23 = 0
            if (r14 != 0) goto L_0x0113
            java.lang.Object r14 = r10.o
            pqa r14 = (defpackage.pqa) r14
            gg1 r14 = r14.a()
            if (r14 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r18 = r23
            goto L_0x0115
        L_0x0113:
            r18 = 1
        L_0x0115:
            ig1 r14 = r15.a
            if (r17 == 0) goto L_0x0120
            gg1 r16 = r14.getId()
            r19 = r16
            goto L_0x012a
        L_0x0120:
            java.lang.Object r7 = r10.o
            pqa r7 = (defpackage.pqa) r7
            gg1 r7 = r7.a()
            r19 = r7
        L_0x012a:
            java.lang.Object r7 = r10.Z
            aa r7 = (defpackage.aa) r7
            r35 = r0
            boolean r0 = r7.d
            r16 = 1
            r20 = r0 ^ 1
            ak1 r0 = new ak1
            r36 = r1
            boolean r1 = r7.a
            r16 = r0
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Object r1 = r10.Y
            wvc r1 = (defpackage.wvc) r1
            boolean r7 = r7.e
            yj1 r24 = defpackage.dz7.d(r1, r15, r7)
            java.lang.Object r1 = r10.c
            d04 r1 = (defpackage.d04) r1
            i95 r7 = r1.j
            r37 = r2
            boolean r2 = r7 instanceof defpackage.d95
            r16 = 1
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r7 = 0
        L_0x015f:
            if (r7 != 0) goto L_0x0162
            r7 = r11
        L_0x0162:
            j1e r2 = r9.b
            if (r2 != 0) goto L_0x0168
            j1e r2 = r1.a
        L_0x0168:
            r16 = r2
            java.lang.String r1 = r1.c
            if (r1 != 0) goto L_0x016f
            r1 = r13
        L_0x016f:
            java.lang.Object r2 = r10.X
            y21 r2 = (defpackage.y21) r2
            y21 r11 = defpackage.y21.h
            boolean r2 = defpackage.tpa.f(r2, r11)
            if (r2 == 0) goto L_0x017e
            m31 r2 = r9.f
            goto L_0x017f
        L_0x017e:
            r2 = 0
        L_0x017f:
            if (r2 != 0) goto L_0x018d
            java.lang.Object r2 = r10.b
            z21 r2 = (defpackage.z21) r2
            java.lang.Object r9 = r10.X
            y21 r9 = (defpackage.y21) r9
            m31 r2 = r2.a(r9)
        L_0x018d:
            r20 = r2
            java.lang.Object r2 = r10.c
            d04 r2 = (defpackage.d04) r2
            boolean r9 = r2.h
            java.lang.Object r11 = r10.o
            pqa r11 = (defpackage.pqa) r11
            java.util.Map r11 = r11.c
            int r11 = r11.size()
            r13 = 1
            if (r11 <= r13) goto L_0x01ab
            java.lang.Object r11 = r10.o
            pqa r11 = (defpackage.pqa) r11
            gg1 r11 = r11.d
            r30 = r11
            goto L_0x01ad
        L_0x01ab:
            r30 = 0
        L_0x01ad:
            java.lang.Object r11 = r10.o
            pqa r11 = (defpackage.pqa) r11
            java.util.Map r11 = r11.c
            boolean r29 = r11.isEmpty()
            java.lang.Object r11 = r10.c
            d04 r11 = (defpackage.d04) r11
            boolean r11 = r11.e
            if (r11 != 0) goto L_0x01c5
            if (r29 != 0) goto L_0x01c2
            goto L_0x01c5
        L_0x01c2:
            r26 = r23
            goto L_0x01c7
        L_0x01c5:
            r26 = r13
        L_0x01c7:
            boolean r11 = r0.a()
            m38 r17 = defpackage.m38.c
            m38 r18 = defpackage.m38.a
            m38 r19 = defpackage.m38.b
            m38 r21 = defpackage.m38.X
            java.lang.Object r13 = r10.a
            tta r13 = (defpackage.tta) r13
            if (r11 == 0) goto L_0x01e0
            r38 = r3
        L_0x01db:
            r39 = r4
            r31 = r17
            goto L_0x0215
        L_0x01e0:
            java.lang.Object r11 = r10.Z
            aa r11 = (defpackage.aa) r11
            r38 = r3
            boolean r3 = r11.a
            if (r3 != 0) goto L_0x01ef
            boolean r3 = r11.b
            if (r3 != 0) goto L_0x01ef
            goto L_0x01db
        L_0x01ef:
            java.lang.Object r3 = r10.o
            pqa r3 = (defpackage.pqa) r3
            fqa r3 = r3.a
            ig1 r3 = r3.a
            boolean r3 = r3.a()
            eua r11 = r13.a()
            r39 = r4
            java.lang.String[] r4 = defpackage.eua.l
            boolean r4 = r11.b(r4)
            if (r4 != 0) goto L_0x020c
            r3 = r21
            goto L_0x0213
        L_0x020c:
            if (r3 == 0) goto L_0x0211
            r3 = r19
            goto L_0x0213
        L_0x0211:
            r3 = r18
        L_0x0213:
            r31 = r3
        L_0x0215:
            java.lang.Object r3 = r10.Z
            aa r3 = (defpackage.aa) r3
            boolean r4 = r3.a
            if (r4 != 0) goto L_0x0224
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x0224
            r32 = r17
            goto L_0x0245
        L_0x0224:
            java.lang.Object r3 = r10.o
            pqa r3 = (defpackage.pqa) r3
            fqa r3 = r3.a
            ig1 r3 = r3.a
            boolean r3 = r3.b()
            eua r4 = r13.a()
            java.lang.String[] r11 = defpackage.eua.h
            boolean r4 = r4.b(r11)
            if (r4 != 0) goto L_0x023f
            r18 = r21
            goto L_0x0243
        L_0x023f:
            if (r3 == 0) goto L_0x0243
            r18 = r19
        L_0x0243:
            r32 = r18
        L_0x0245:
            java.lang.Object r3 = r10.c
            d04 r3 = (defpackage.d04) r3
            u8b r3 = r3.i
            if (r3 == 0) goto L_0x0252
            j1e r3 = r3.b
            r17 = r3
            goto L_0x0254
        L_0x0252:
            r17 = 0
        L_0x0254:
            if (r9 == 0) goto L_0x025f
            boolean r3 = r14.m()
            if (r3 == 0) goto L_0x025f
            r28 = 1
            goto L_0x0261
        L_0x025f:
            r28 = r23
        L_0x0261:
            boolean r3 = r7 instanceof defpackage.c95
            if (r3 != 0) goto L_0x0276
            boolean r3 = r7 instanceof defpackage.b95
            if (r3 != 0) goto L_0x0276
            boolean r3 = r7 instanceof defpackage.d95
            if (r3 == 0) goto L_0x026e
            goto L_0x0276
        L_0x026e:
            if (r16 != 0) goto L_0x0273
            if (r3 == 0) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r33 = r23
            goto L_0x0278
        L_0x0276:
            r33 = 1
        L_0x0278:
            java.lang.Object r3 = r10.c
            d04 r3 = (defpackage.d04) r3
            boolean r3 = r3.g
            java.lang.Object r4 = r10.o
            pqa r4 = (defpackage.pqa) r4
            boolean r4 = r4.h
            la1 r10 = new la1
            r14 = r10
            java.lang.String r2 = r2.d
            r25 = r2
            r2 = r15
            r15 = r1
            r18 = r3
            r19 = r7
            r21 = r9
            r22 = r2
            r23 = r0
            r27 = r12
            r34 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x02af
        L_0x029f:
            c95 r11 = defpackage.c95.b
            r15 = 0
            r17 = 1048559(0xfffef, float:1.469344E-39)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            la1 r10 = defpackage.la1.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02af:
            boolean r0 = r6.c(r8, r10)
            if (r0 == 0) goto L_0x02b8
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02b8:
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r7 = 0
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk1.o(java.lang.Object):java.lang.Object");
    }
}
