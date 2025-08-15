package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x96  reason: default package */
public final class x96 extends ffe implements a66 {
    public List X;
    public z96 Y;
    public Collection Z;
    public Iterator s0;
    public int t0;
    public final /* synthetic */ z96 u0;
    public final /* synthetic */ List v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x96(z96 z96, List list, Continuation continuation) {
        super(2, continuation);
        this.u0 = z96;
        this.v0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x96(this.u0, this.v0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.t0
            r2 = 0
            r3 = 2
            r4 = 1
            z96 r5 = r9.u0
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            java.util.Iterator r1 = r9.s0
            java.util.Collection r4 = r9.Z
            z96 r5 = r9.Y
            java.util.List r6 = r9.X
            defpackage.od2.a0(r10)
            goto L_0x00a4
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0024:
            defpackage.od2.a0(r10)
            goto L_0x0059
        L_0x0028:
            defpackage.od2.a0(r10)
            d86 r10 = r5.b
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x005e
            q0e r10 = r5.O0
            java.lang.Object r10 = r10.getValue()
            o4d r1 = defpackage.o4d.a
            if (r10 != r1) goto L_0x005e
            q0e r10 = r5.O0
            r9.t0 = r4
            t03 r1 = new t03
            r4 = 11
            r1.<init>(r10, r4)
            t03 r10 = new t03
            r4 = 14
            r10.<init>(r1, r4)
            java.lang.Object r10 = defpackage.od2.A(r10, r9)
            if (r10 != r0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            e5f r10 = defpackage.e5f.a
        L_0x0056:
            if (r10 != r0) goto L_0x0059
            return r0
        L_0x0059:
            q0e r10 = r5.O0
            r10.setValue(r2)
        L_0x005e:
            p4d r10 = r5.F0
            r10.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r10 = r10.a
            r1.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r4 = r9.v0
            java.util.Iterator r4 = r4.iterator()
            r6 = r1
            r1 = r4
            r4 = r10
        L_0x0078:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00ac
            java.lang.Object r10 = r1.next()
            zp7 r10 = (defpackage.zp7) r10
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            r9.s0 = r1
            r9.t0 = r3
            kke r7 = r5.s()
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.e()
            w96 r8 = new w96
            r8.<init>(r5, r10, r6, r2)
            java.lang.Object r10 = defpackage.j47.t0(r7, r8, r9)
            if (r10 != r0) goto L_0x00a4
            return r0
        L_0x00a4:
            u86 r10 = (defpackage.u86) r10
            if (r10 == 0) goto L_0x0078
            r4.add(r10)
            goto L_0x0078
        L_0x00ac:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x96.o(java.lang.Object):java.lang.Object");
    }
}
