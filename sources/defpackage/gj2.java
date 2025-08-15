package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gj2  reason: default package */
public final class gj2 extends ffe implements a66 {
    public Object X;
    public ej2 Y;
    public e52 Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ ck2 u0;
    public final /* synthetic */ long v0;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj2(ck2 ck2, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.u0 = ck2;
        this.v0 = j;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gj2 gj2 = new gj2(this.u0, this.v0, this.w0, continuation);
        gj2.t0 = obj;
        return gj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: ej2} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e0, code lost:
        r4 = r3.z0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r8 = r16
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.s0
            r9 = 0
            r10 = 5
            r2 = 3
            r3 = 2
            r11 = 1
            if (r1 == 0) goto L_0x0055
            if (r1 == r11) goto L_0x0045
            if (r1 == r3) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            java.lang.Object r0 = r8.X
            r1 = r0
            ej2 r1 = (defpackage.ej2) r1
            java.lang.Object r0 = r8.t0
            r2 = r0
            qb8 r2 = (defpackage.qb8) r2
            defpackage.od2.a0(r17)     // Catch:{ all -> 0x0025 }
            r12 = r1
            r1 = r17
            goto L_0x0116
        L_0x0025:
            r0 = move-exception
            goto L_0x011f
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            e52 r1 = r8.Z
            ej2 r3 = r8.Y
            java.lang.Object r4 = r8.X
            qb8 r4 = (defpackage.qb8) r4
            java.lang.Object r5 = r8.t0
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r17)
            r12 = r3
            r13 = r4
            r3 = r17
            goto L_0x00dc
        L_0x0045:
            ej2 r1 = r8.Y
            java.lang.Object r4 = r8.X
            qb8 r4 = (defpackage.qb8) r4
            java.lang.Object r5 = r8.t0
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r17)
            r6 = r17
            goto L_0x00c0
        L_0x0055:
            defpackage.od2.a0(r17)
            java.lang.Object r1 = r8.t0
            r5 = r1
            sx3 r5 = (defpackage.sx3) r5
            ck2 r1 = r8.u0
            q0e r1 = r1.P0
            java.lang.Object r1 = r1.getValue()
            cj2 r1 = (defpackage.cj2) r1
            java.util.List r1 = r1.a
            long r6 = r8.v0
            java.lang.String r4 = r8.w0
            java.util.Iterator r1 = r1.iterator()
        L_0x0071:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0091
            java.lang.Object r12 = r1.next()
            r13 = r12
            sb8 r13 = (defpackage.sb8) r13
            long r14 = r13.j()
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0071
            java.lang.String r13 = r13.x()
            boolean r13 = defpackage.tpa.f(r4, r13)
            if (r13 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0091:
            r12 = r9
        L_0x0092:
            boolean r1 = r12 instanceof defpackage.qb8
            if (r1 == 0) goto L_0x009a
            qb8 r12 = (defpackage.qb8) r12
            r4 = r12
            goto L_0x009b
        L_0x009a:
            r4 = r9
        L_0x009b:
            ej2 r1 = new ej2
            r1.<init>((defpackage.qb8) r4, (int) r3)
            ck2 r6 = r8.u0
            q0e r6 = r6.V0
            r6.m(r9, r1)
            ck2 r6 = r8.u0
            iy2 r6 = r6.w()
            ck2 r7 = r8.u0
            long r12 = r7.b
            r8.t0 = r5
            r8.X = r4
            r8.Y = r1
            r8.s0 = r11
            java.lang.Object r6 = r6.d(r12, r8)
            if (r6 != r0) goto L_0x00c0
            return r0
        L_0x00c0:
            e52 r6 = (defpackage.e52) r6
            ck2 r7 = r8.u0
            r79 r7 = r7.s0
            long r12 = r8.v0
            r8.t0 = r5
            r8.X = r4
            r8.Y = r1
            r8.Z = r6
            r8.s0 = r3
            java.lang.Object r3 = r7.a(r12, r8)
            if (r3 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r12 = r1
            r13 = r4
            r1 = r6
        L_0x00dc:
            cu8 r3 = (defpackage.cu8) r3
            if (r3 == 0) goto L_0x00eb
            k8g r4 = r3.z0
            if (r4 == 0) goto L_0x00eb
            java.lang.String r5 = r8.w0
            l20 r4 = r4.j(r5)
            goto L_0x00ec
        L_0x00eb:
            r4 = r9
        L_0x00ec:
            if (r4 == 0) goto L_0x0184
            ck2 r5 = r8.u0
            je7 r5 = r5.B0     // Catch:{ all -> 0x011c }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x011c }
            rff r5 = (defpackage.rff) r5     // Catch:{ all -> 0x011c }
            k92 r1 = r1.b     // Catch:{ all -> 0x011c }
            long r6 = r1.a     // Catch:{ all -> 0x011c }
            long r14 = r3.c     // Catch:{ all -> 0x011c }
            r8.t0 = r13     // Catch:{ all -> 0x011c }
            r8.X = r12     // Catch:{ all -> 0x011c }
            r8.Y = r9     // Catch:{ all -> 0x011c }
            r8.Z = r9     // Catch:{ all -> 0x011c }
            r8.s0 = r2     // Catch:{ all -> 0x011c }
            r1 = r5
            r2 = r4
            r3 = r6
            r5 = r14
            r7 = r16
            java.lang.Object r1 = r1.c(r2, r3, r5, r7)     // Catch:{ all -> 0x011c }
            if (r1 != r0) goto L_0x0115
            return r0
        L_0x0115:
            r2 = r13
        L_0x0116:
            gef r1 = (defpackage.gef) r1     // Catch:{ all -> 0x0119 }
            goto L_0x0126
        L_0x0119:
            r0 = move-exception
            r1 = r12
            goto L_0x011f
        L_0x011c:
            r0 = move-exception
            r1 = r12
            r2 = r13
        L_0x011f:
            njc r3 = new njc
            r3.<init>(r0)
            r12 = r1
            r1 = r3
        L_0x0126:
            boolean r0 = r1 instanceof defpackage.njc
            if (r0 == 0) goto L_0x012b
            r1 = r9
        L_0x012b:
            gef r1 = (defpackage.gef) r1
            if (r1 != 0) goto L_0x013b
            ck2 r0 = r8.u0
            s35 r0 = r0.N0
            j35 r3 = new j35
            r3.<init>(r10, r11)
            defpackage.pnf.o(r0, r3)
        L_0x013b:
            ck2 r0 = r8.u0
            java.lang.String r0 = r0.w0
            long r3 = r8.v0
            java.lang.String r5 = r8.w0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0148
            goto L_0x0167
        L_0x0148:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0167
            us7 r7 = defpackage.us7.X
            java.lang.String r10 = "Media viewer. Get video content msg:"
            java.lang.String r11 = ", attach:"
            java.lang.StringBuilder r3 = defpackage.z7b.j(r10, r3, r11, r5)
            java.lang.String r4 = ", content:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r6.d(r7, r0, r3, r9)
        L_0x0167:
            ck2 r0 = r8.u0
            sb8 r0 = r0.x()
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0190
            ck2 r0 = r8.u0
            q0e r0 = r0.V0
            sb8 r2 = r12.a
            ej2 r3 = new ej2
            r3.<init>((defpackage.sb8) r2, (defpackage.gef) r1)
            r0.m(r9, r3)
            goto L_0x0190
        L_0x0184:
            ck2 r0 = r8.u0
            s35 r0 = r0.N0
            j35 r1 = new j35
            r1.<init>(r10, r11)
            defpackage.pnf.o(r0, r1)
        L_0x0190:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj2.o(java.lang.Object):java.lang.Object");
    }
}
