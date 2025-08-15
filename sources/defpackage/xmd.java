package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: xmd  reason: default package */
public final class xmd extends ffe implements a66 {
    public ArrayList X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ and t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xmd(and and, Continuation continuation) {
        super(2, continuation);
        this.t0 = and;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xmd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xmd xmd = new xmd(this.t0, continuation);
        xmd.s0 = obj;
        return xmd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Z
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.util.Iterator r1 = r9.Y
            java.util.ArrayList r4 = r9.X
            java.lang.Object r5 = r9.s0
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r10)
            goto L_0x009e
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0022:
            java.util.ArrayList r1 = r9.X
            java.lang.Object r4 = r9.s0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r10)
            goto L_0x0065
        L_0x002c:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.s0
            sx3 r10 = (defpackage.sx3) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            and r5 = r9.t0
            khe r5 = r5.t0
            java.lang.Object r5 = r5.getValue()
            umd r5 = (defpackage.umd) r5
            r1.add(r5)
            and r5 = r9.t0
            je7 r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            iy2 r5 = (defpackage.iy2) r5
            r9.s0 = r10
            r9.X = r1
            r9.Z = r4
            jz2 r5 = (defpackage.jz2) r5
            p82 r4 = r5.l()
            java.util.ArrayList r4 = r4.x(r2)
            if (r4 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r8 = r4
            r4 = r10
            r10 = r8
        L_0x0065:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            v00 r5 = defpackage.p82.I
            java.util.List r10 = defpackage.x53.x0(r10, r5)
            defpackage.j1e.o(r4)
            java.util.Iterator r10 = r10.iterator()
            r5 = r4
            r4 = r1
            r1 = r10
        L_0x0077:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00a6
            java.lang.Object r10 = r1.next()
            e52 r10 = (defpackage.e52) r10
            int r6 = r4.size()
            r7 = 5
            if (r6 >= r7) goto L_0x00a6
            defpackage.j1e.o(r5)
            and r6 = r9.t0
            r9.s0 = r5
            r9.X = r4
            r9.Y = r1
            r9.Z = r3
            java.lang.Object r10 = defpackage.and.b(r6, r10, r9)
            if (r10 != r0) goto L_0x009e
            return r0
        L_0x009e:
            umd r10 = (defpackage.umd) r10
            if (r10 == 0) goto L_0x0077
            r4.add(r10)
            goto L_0x0077
        L_0x00a6:
            and r9 = r9.t0
            java.lang.String r9 = r9.u0
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x00af
            goto L_0x00c4
        L_0x00af:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x00c4
            us7 r0 = defpackage.us7.X
            int r1 = r4.size()
            java.lang.String r3 = "buildShortcuts: result size: "
            java.lang.String r1 = defpackage.zr6.h(r1, r3)
            r10.d(r0, r9, r1, r2)
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmd.o(java.lang.Object):java.lang.Object");
    }
}
