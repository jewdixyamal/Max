package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ui  reason: default package */
public final class ui extends ffe implements a66 {
    public ArrayList X;
    public int Y;
    public final /* synthetic */ gi9 Z;
    public final /* synthetic */ gj s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ui(gj gjVar, gi9 gi9, Continuation continuation) {
        super(2, continuation);
        this.Z = gi9;
        this.s0 = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ui) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ui(this.s0, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0138 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 10
            r2 = 1
            r3 = 2
            tx3 r4 = defpackage.tx3.a
            int r5 = r0.Y
            e5f r6 = defpackage.e5f.a
            r7 = 0
            r8 = 3
            if (r5 == 0) goto L_0x0030
            if (r5 == r2) goto L_0x002a
            if (r5 == r3) goto L_0x0023
            if (r5 != r8) goto L_0x001b
            defpackage.od2.a0(r23)
            goto L_0x0138
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.util.ArrayList r2 = r0.X
            defpackage.od2.a0(r23)
            goto L_0x0101
        L_0x002a:
            defpackage.od2.a0(r23)
            r5 = r23
            goto L_0x007a
        L_0x0030:
            defpackage.od2.a0(r23)
            gi9 r5 = r0.Z
            boolean r5 = r5.i()
            if (r5 == 0) goto L_0x003c
            return r6
        L_0x003c:
            gj r5 = r0.s0
            java.lang.String r5 = r5.f
            gi9 r9 = r0.Z
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0047
            goto L_0x005e
        L_0x0047:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x005e
            us7 r11 = defpackage.us7.X
            r12 = 31
            java.lang.String r9 = defpackage.gi9.k(r9, r7, r7, r12)
            java.lang.String r12 = "fetchAnimojiSets for "
            java.lang.String r9 = r12.concat(r9)
            r10.d(r11, r5, r9, r7)
        L_0x005e:
            gj r5 = r0.s0
            kke r5 = r5.d
            w9a r5 = (defpackage.w9a) r5
            nx3 r5 = r5.b()
            ti r9 = new ti
            gj r10 = r0.s0
            gi9 r11 = r0.Z
            r9.<init>(r10, r11, r7)
            r0.Y = r2
            java.lang.Object r5 = defpackage.j47.t0(r5, r9, r0)
            if (r5 != r4) goto L_0x007a
            return r4
        L_0x007a:
            eu r5 = (defpackage.eu) r5
            if (r5 != 0) goto L_0x0095
            gj r0 = r0.s0
            java.lang.String r0 = r0.f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0094
            us7 r2 = defpackage.us7.Z
            java.lang.String r3 = "response is null"
            r1.d(r2, r0, r3, r7)
        L_0x0094:
            return r6
        L_0x0095:
            java.util.List r5 = r5.Y
            gj r9 = r0.s0
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = defpackage.z53.S(r5, r1)
            r10.<init>(r11)
            java.util.Iterator r5 = r5.iterator()
        L_0x00a6:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x00df
            java.lang.Object r11 = r5.next()
            mj r11 = (defpackage.mj) r11
            bc7[] r12 = defpackage.gj.p
            r9.getClass()
            nj r12 = new nj
            long r14 = r11.a
            r23 = r9
            long r8 = r11.e
            java.util.List r13 = r11.f
            java.lang.String r7 = r11.b
            java.lang.String r1 = r11.c
            java.lang.String r11 = r11.d
            r21 = r13
            r13 = r12
            r16 = r7
            r17 = r1
            r18 = r11
            r19 = r8
            r13.<init>(r14, r16, r17, r18, r19, r21)
            r10.add(r12)
            r9 = r23
            r1 = 10
            r7 = 0
            r8 = 3
            goto L_0x00a6
        L_0x00df:
            gj r1 = r0.s0
            bc7[] r5 = defpackage.gj.p
            khe r1 = r1.h
            java.lang.Object r1 = r1.getValue()
            oj r1 = (defpackage.oj) r1
            r0.X = r10
            r0.Y = r3
            r1.getClass()
            uh r5 = new uh
            r5.<init>(r1, r2, r10)
            ilc r1 = r1.a
            java.lang.Object r1 = defpackage.ote.j(r1, r5, r0)
            if (r1 != r4) goto L_0x0100
            return r4
        L_0x0100:
            r2 = r10
        L_0x0101:
            at r1 = new at
            r1.<init>(r3, r2)
            k8 r2 = new k8
            r3 = 10
            r2.<init>(r3)
            um5 r3 = new um5
            n6d r5 = defpackage.n6d.a
            r3.<init>(r1, r2, r5)
            gj r1 = r0.s0
            l r2 = new l
            r5 = 8
            r2.<init>(r5, r1)
            qk5 r1 = defpackage.l6d.Z(r3, r2)
            java.util.List r1 = defpackage.l6d.i0(r1)
            gj r2 = r0.s0
            gi9 r1 = defpackage.oag.G(r1)
            r3 = 0
            r0.X = r3
            r3 = 3
            r0.Y = r3
            java.lang.Object r0 = r2.e(r1, r0)
            if (r0 != r4) goto L_0x0138
            return r4
        L_0x0138:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui.o(java.lang.Object):java.lang.Object");
    }
}
