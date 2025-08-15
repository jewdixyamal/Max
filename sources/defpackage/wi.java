package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: wi  reason: default package */
public final class wi extends ffe implements a66 {
    public ArrayList X;
    public int Y;
    public final /* synthetic */ gj Z;
    public final /* synthetic */ gi9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi(gj gjVar, gi9 gi9, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
        this.s0 = gi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wi) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wi(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6 A[LOOP:1: B:33:0x00f0->B:35:0x00f6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0026
            if (r2 == r6) goto L_0x0020
            if (r2 != r5) goto L_0x0018
            java.util.ArrayList r1 = r0.X
            defpackage.od2.a0(r20)
            goto L_0x00ea
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            defpackage.od2.a0(r20)
            r2 = r20
            goto L_0x0067
        L_0x0026:
            defpackage.od2.a0(r20)
            gj r2 = r0.Z
            java.lang.String r2 = r2.f
            gi9 r7 = r0.s0
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x0034
            goto L_0x004b
        L_0x0034:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x004b
            us7 r9 = defpackage.us7.X
            r10 = 31
            java.lang.String r7 = defpackage.gi9.k(r7, r4, r4, r10)
            java.lang.String r10 = "fetchAnimojis for "
            java.lang.String r7 = r10.concat(r7)
            r8.d(r9, r2, r7, r4)
        L_0x004b:
            gj r2 = r0.Z
            kke r2 = r2.d
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            vi r7 = new vi
            gj r8 = r0.Z
            gi9 r9 = r0.s0
            r7.<init>(r8, r9, r4)
            r0.Y = r6
            java.lang.Object r2 = defpackage.j47.t0(r2, r7, r0)
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            eu r2 = (defpackage.eu) r2
            if (r2 != 0) goto L_0x0082
            gj r0 = r0.Z
            java.lang.String r0 = r0.f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0081
            us7 r2 = defpackage.us7.Z
            java.lang.String r5 = "response is null"
            r1.d(r2, r0, r5, r4)
        L_0x0081:
            return r3
        L_0x0082:
            java.util.List r2 = r2.X
            gj r4 = r0.Z
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.z53.S(r2, r7)
            r6.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x0095:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00cb
            java.lang.Object r7 = r2.next()
            oh r7 = (defpackage.oh) r7
            bc7[] r8 = defpackage.gj.p
            r4.getClass()
            ii r8 = new ii
            long r10 = r7.a
            long r12 = r7.d
            java.lang.Long r17 = java.lang.Long.valueOf(r12)
            java.lang.String r15 = r7.f
            java.lang.String r14 = r7.g
            long r12 = r7.b
            java.lang.String r9 = r7.c
            java.lang.String r7 = r7.e
            r16 = r9
            r9 = r8
            r18 = r14
            r14 = r16
            r16 = r15
            r15 = r7
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            r6.add(r8)
            goto L_0x0095
        L_0x00cb:
            gj r2 = r0.Z
            bc7[] r4 = defpackage.gj.p
            wh r2 = r2.h()
            r0.X = r6
            r0.Y = r5
            r2.getClass()
            uh r4 = new uh
            r5 = 0
            r4.<init>(r2, r5, r6)
            ilc r2 = r2.a
            java.lang.Object r2 = defpackage.ote.j(r2, r4, r0)
            if (r2 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            r1 = r6
        L_0x00ea:
            gj r0 = r0.Z
            java.util.Iterator r1 = r1.iterator()
        L_0x00f0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0109
            java.lang.Object r2 = r1.next()
            ii r2 = (defpackage.ii) r2
            bc7[] r4 = defpackage.gj.p
            r0.getClass()
            ph r2 = defpackage.gj.l(r2)
            r0.j(r2)
            goto L_0x00f0
        L_0x0109:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi.o(java.lang.Object):java.lang.Object");
    }
}
