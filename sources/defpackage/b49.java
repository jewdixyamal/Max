package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b49  reason: default package */
public final class b49 extends ffe implements a66 {
    public e52 X;
    public ta3 Y;
    public cu8 Z;
    public int s0;
    public final /* synthetic */ n59 t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ String v0;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b49(n59 n59, long j, String str, long j2, Continuation continuation) {
        super(2, continuation);
        this.t0 = n59;
        this.u0 = j;
        this.v0 = str;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b49(this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v43, types: [ta3] */
    /* JADX WARNING: type inference failed for: r1v45, types: [ta3] */
    /* JADX WARNING: type inference failed for: r2v25, types: [ta3] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r1 = r2.b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f8  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            tx3 r7 = defpackage.tx3.a
            int r1 = r0.s0
            e5f r8 = defpackage.e5f.a
            r11 = 0
            r12 = 5
            r13 = 4
            r14 = 3
            java.lang.String r15 = r0.v0
            r6 = 2
            r4 = 1
            n59 r5 = r0.t0
            if (r1 == 0) goto L_0x0062
            if (r1 == r4) goto L_0x005c
            if (r1 == r6) goto L_0x004c
            if (r1 == r14) goto L_0x003d
            if (r1 == r13) goto L_0x0031
            if (r1 != r12) goto L_0x0029
            e52 r0 = r0.X
            defpackage.od2.a0(r20)
            r6 = r0
            r11 = r5
            r0 = r20
            goto L_0x019f
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            cu8 r1 = r0.Z
            ta3 r2 = r0.Y
            e52 r3 = r0.X
            defpackage.od2.a0(r20)
            r11 = r5
            goto L_0x016c
        L_0x003d:
            ta3 r1 = r0.Y
            e52 r2 = r0.X
            defpackage.od2.a0(r20)
            r3 = r2
            r12 = r4
            r11 = r5
            r2 = r1
            r1 = r20
            goto L_0x012e
        L_0x004c:
            ta3 r1 = r0.Y
            e52 r2 = r0.X
            defpackage.od2.a0(r20)
            r10 = r1
            r12 = r4
            r11 = r5
            r9 = r6
            r1 = r20
            r6 = r2
            goto L_0x00e6
        L_0x005c:
            defpackage.od2.a0(r20)
            r1 = r20
            goto L_0x0074
        L_0x0062:
            defpackage.od2.a0(r20)
            iy2 r1 = r5.s0
            r0.s0 = r4
            jz2 r1 = (defpackage.jz2) r1
            long r2 = r0.u0
            java.lang.Object r1 = r1.k(r2, r0)
            if (r1 != r7) goto L_0x0074
            return r7
        L_0x0074:
            r2 = r1
            e52 r2 = (defpackage.e52) r2
            if (r2 != 0) goto L_0x007f
            if (r15 == 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            r11 = r5
            goto L_0x020d
        L_0x007f:
            if (r2 == 0) goto L_0x0093
            boolean r1 = r2.I()
            if (r1 != r4) goto L_0x0093
            boolean r1 = r2.Z()
            if (r1 == 0) goto L_0x0093
            boolean r1 = r2.e0()
            if (r1 == 0) goto L_0x007c
        L_0x0093:
            if (r2 == 0) goto L_0x009c
            k92 r1 = r2.b
            if (r1 == 0) goto L_0x009c
            i92 r1 = r1.c
            goto L_0x009d
        L_0x009c:
            r1 = r11
        L_0x009d:
            i92 r3 = defpackage.i92.o
            if (r1 == r3) goto L_0x007c
            if (r2 == 0) goto L_0x00aa
            k92 r1 = r2.b
            if (r1 == 0) goto L_0x00aa
            i92 r1 = r1.c
            goto L_0x00ab
        L_0x00aa:
            r1 = r11
        L_0x00ab:
            i92 r3 = defpackage.i92.Y
            if (r1 != r3) goto L_0x00b0
            goto L_0x007c
        L_0x00b0:
            ua3 r3 = defpackage.ngg.a()
            if (r2 != 0) goto L_0x00bd
            r3.makeCompleting$kotlinx_coroutines_core(r11)
            r6 = r2
            r11 = r5
            goto L_0x018c
        L_0x00bd:
            r79 r1 = defpackage.n59.r(r5)
            r0.X = r2
            r0.Y = r3
            r0.s0 = r6
            vlc r1 = r1.a
            r16 = r5
            long r4 = r2.a
            long r9 = r0.w0
            r17 = r2
            r18 = r3
            r2 = r4
            r11 = r16
            r12 = 1
            r4 = r9
            r9 = r6
            r6 = r19
            java.lang.Object r1 = r1.j(r2, r4, r6)
            if (r1 != r7) goto L_0x00e2
            return r7
        L_0x00e2:
            r6 = r17
            r10 = r18
        L_0x00e6:
            cu8 r1 = (defpackage.cu8) r1
            if (r1 == 0) goto L_0x00fa
            java.lang.Long r2 = new java.lang.Long
            long r3 = r1.b
            r2.<init>(r3)
            r1 = r10
            ua3 r1 = (defpackage.ua3) r1
            r1.makeCompleting$kotlinx_coroutines_core(r2)
            r3 = r10
            goto L_0x018c
        L_0x00fa:
            w7c r1 = r11.o1
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            e52 r1 = (defpackage.e52) r1
            if (r1 == 0) goto L_0x0186
            je7 r2 = r11.G0
            java.lang.Object r2 = r2.getValue()
            r79 r2 = (defpackage.r79) r2
            r0.X = r6
            r0.Y = r10
            r0.s0 = r14
            vlc r2 = r2.a
            long r3 = r1.a
            r20 = r10
            long r9 = r0.w0
            r1 = r2
            r2 = r3
            r4 = r9
            r17 = r6
            r6 = r19
            java.lang.Object r1 = r1.j(r2, r4, r6)
            if (r1 != r7) goto L_0x012a
            return r7
        L_0x012a:
            r2 = r20
            r3 = r17
        L_0x012e:
            cu8 r1 = (defpackage.cu8) r1
            if (r1 == 0) goto L_0x0179
            r79 r4 = defpackage.n59.r(r11)
            long r5 = r3.a
            r0.X = r3
            r0.Y = r2
            r0.Z = r1
            r0.s0 = r13
            vlc r4 = r4.a
            t19 r4 = r4.d()
            ilc r9 = r4.a
            r9.b()
            p19 r4 = r4.g
            q36 r10 = r4.f()
            r10.j(r12, r5)
            long r5 = r1.b
            r12 = 2
            r10.j(r12, r5)
            r9.c()     // Catch:{ all -> 0x0181 }
            r10.n()     // Catch:{ all -> 0x017c }
            r9.r()     // Catch:{ all -> 0x017c }
            r9.l()     // Catch:{ all -> 0x0181 }
            r4.t(r10)
            if (r8 != r7) goto L_0x016c
            return r7
        L_0x016c:
            long r4 = r1.b
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r4 = r2
            ua3 r4 = (defpackage.ua3) r4
            r4.makeCompleting$kotlinx_coroutines_core(r1)
        L_0x0179:
            r6 = r3
            r3 = r2
            goto L_0x018c
        L_0x017c:
            r0 = move-exception
            r9.l()     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            r4.t(r10)
            throw r0
        L_0x0186:
            r17 = r6
            r20 = r10
            r3 = r20
        L_0x018c:
            r0.X = r6
            r1 = 0
            r0.Y = r1
            r0.Z = r1
            r1 = 5
            r0.s0 = r1
            ua3 r3 = (defpackage.ua3) r3
            java.lang.Object r0 = r3.awaitInternal(r0)
            if (r0 != r7) goto L_0x019f
            return r7
        L_0x019f:
            java.lang.Long r0 = (java.lang.Long) r0
            if (r6 == 0) goto L_0x01e3
            boolean r1 = r6.I()
            if (r1 == 0) goto L_0x01e3
            boolean r1 = r6.a0()
            if (r1 != 0) goto L_0x01b5
            boolean r1 = r6.e0()
            if (r1 == 0) goto L_0x01e3
        L_0x01b5:
            if (r0 == 0) goto L_0x01e3
            s35 r1 = r11.v1
            u29 r2 = defpackage.u29.c
            long r3 = r0.longValue()
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = ":chats?id="
            r0.<init>(r2)
            long r5 = r6.a
            r0.append(r5)
            java.lang.String r2 = "&type=local&message_id="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "&highlight_message=true"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.wg0.k(r0, r1)
            goto L_0x020c
        L_0x01e3:
            if (r15 == 0) goto L_0x01f8
            je7 r0 = r11.V0
            java.lang.Object r0 = r0.getValue()
            vj7 r0 = (defpackage.vj7) r0
            r0.getClass()
            android.net.Uri r1 = android.net.Uri.parse(r15)
            r0.e(r1)
            goto L_0x020c
        L_0x01f8:
            s35 r0 = r11.u1
            pnd r1 = new pnd
            int r2 = defpackage.oda.T0
            eqe r3 = new eqe
            r3.<init>(r2)
            r2 = 0
            r4 = 6
            r5 = 0
            r1.<init>(r3, r2, r5, r4)
            defpackage.pnf.o(r0, r1)
        L_0x020c:
            return r8
        L_0x020d:
            s35 r0 = r11.u1
            pnd r1 = new pnd
            int r2 = defpackage.oda.T0
            eqe r3 = new eqe
            r3.<init>(r2)
            r2 = 0
            r4 = 6
            r5 = 0
            r1.<init>(r3, r2, r5, r4)
            defpackage.pnf.o(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b49.o(java.lang.Object):java.lang.Object");
    }
}
