package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: bw2  reason: default package */
public final class bw2 extends ffe implements a66 {
    public nv2 X;
    public long Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ gw2 t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ List v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bw2(gw2 gw2, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = gw2;
        this.u0 = str;
        this.v0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bw2 bw2 = new bw2(this.t0, this.u0, this.v0, continuation);
        bw2.s0 = obj;
        return bw2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: sx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0027
            if (r2 != r5) goto L_0x001f
            long r1 = r0.Y
            nv2 r6 = r0.X
            java.lang.Object r7 = r0.s0
            sx3 r7 = (defpackage.sx3) r7
            defpackage.od2.a0(r17)
            r8 = r1
            r11 = r6
            r2 = r17
            goto L_0x00a2
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            defpackage.od2.a0(r17)
            java.lang.Object r2 = r0.s0
            r7 = r2
            sx3 r7 = (defpackage.sx3) r7
            gw2 r2 = r0.t0
            q0e r2 = r2.E0
            java.lang.Object r2 = r2.getValue()
            ov2 r2 = (defpackage.ov2) r2
            java.lang.String r2 = r2.b
            java.lang.String r6 = r0.u0
            boolean r2 = defpackage.tpa.f(r2, r6)
            if (r2 != 0) goto L_0x0044
            return r3
        L_0x0044:
            java.util.List r2 = r0.v0
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0051
            nv2 r2 = defpackage.nv2.o
        L_0x004f:
            r6 = r2
            goto L_0x0054
        L_0x0051:
            nv2 r2 = defpackage.nv2.X
            goto L_0x004f
        L_0x0054:
            long r8 = java.lang.System.nanoTime()
            gw2 r2 = r0.t0
            java.lang.String r2 = r2.J0
            java.lang.String r10 = "chats search: start UI mapping"
            defpackage.hm9.G(r2, r10, r4)
            java.util.List r2 = r0.v0
            gw2 r10 = r0.t0
            lx3 r11 = r0.b
            kotlinx.coroutines.internal.ContextScope r11 = defpackage.j1e.a(r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.z53.S(r2, r13)
            r12.<init>(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x007a:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0092
            java.lang.Object r13 = r2.next()
            aw2 r14 = new aw2
            r14.<init>(r13, r4, r10)
            r13 = 3
            zf4 r13 = defpackage.j47.h(r11, r4, r14, r13)
            r12.add(r13)
            goto L_0x007a
        L_0x0092:
            r0.s0 = r7
            r0.X = r6
            r0.Y = r8
            r0.Z = r5
            java.lang.Object r2 = defpackage.pag.c(r12, r0)
            if (r2 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r11 = r6
        L_0x00a2:
            java.util.List r2 = (java.util.List) r2
            gw2 r1 = r0.t0
            java.lang.String r1 = r1.J0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x00ad
            goto L_0x00cf
        L_0x00ad:
            boolean r10 = r6.c()
            if (r10 == 0) goto L_0x00cf
            us7 r10 = defpackage.us7.Y
            int r12 = defpackage.ft4.o
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r8
            kt4 r8 = defpackage.kt4.NANOSECONDS
            long r8 = defpackage.z7.S(r12, r8)
            java.lang.String r8 = defpackage.ft4.j(r8)
            java.lang.String r9 = "chats search: UI mapping finish: "
            java.lang.String r8 = r9.concat(r8)
            r6.d(r10, r1, r8, r4)
        L_0x00cf:
            gw2 r1 = r0.t0
            q0e r1 = r1.E0
            java.lang.Object r1 = r1.getValue()
            ov2 r1 = (defpackage.ov2) r1
            java.lang.String r1 = r1.b
            java.lang.String r6 = r0.u0
            boolean r1 = defpackage.tpa.f(r1, r6)
            if (r1 != 0) goto L_0x00e4
            return r3
        L_0x00e4:
            gw2 r1 = r0.t0
            java.lang.String r1 = r1.J0
            java.lang.String r6 = "chats search: update_search_state"
            defpackage.hm9.G(r1, r6, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r1 = r2.size()
            r13.<init>(r1)
            gi9 r1 = new gi9
            r1.<init>((java.lang.Object) r4)
            gi9 r6 = new gi9
            r6.<init>((java.lang.Object) r4)
            gi9 r8 = new gi9
            r8.<init>((java.lang.Object) r4)
            java.util.Iterator r9 = r2.iterator()
        L_0x0109:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r9.next()
            izc r10 = (defpackage.izc) r10
            boolean r12 = defpackage.j1e.z(r7)
            if (r12 == 0) goto L_0x016b
            boolean r12 = r10 instanceof defpackage.vq2
            if (r12 == 0) goto L_0x0133
            r12 = r10
            vq2 r12 = (defpackage.vq2) r12
            long r14 = r12.c
            boolean r14 = r1.d(r14)
            if (r14 != 0) goto L_0x0133
            long r14 = r12.c
            r1.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x0133:
            boolean r12 = r10 instanceof defpackage.jq3
            if (r12 == 0) goto L_0x014b
            r12 = r10
            jq3 r12 = (defpackage.jq3) r12
            long r14 = r12.c
            boolean r14 = r6.d(r14)
            if (r14 != 0) goto L_0x014b
            long r14 = r12.c
            r6.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x014b:
            boolean r12 = r10 instanceof defpackage.mx8
            if (r12 == 0) goto L_0x0167
            r12 = r10
            mx8 r12 = (defpackage.mx8) r12
            fs8 r14 = r12.X
            long r14 = r14.a
            boolean r14 = r8.d(r14)
            if (r14 != 0) goto L_0x0167
            fs8 r12 = r12.X
            long r14 = r12.a
            r8.a(r14)
            r13.add(r10)
            goto L_0x0109
        L_0x0167:
            r13.add(r10)
            goto L_0x0109
        L_0x016b:
            boolean r1 = defpackage.j1e.z(r7)
            if (r1 == 0) goto L_0x01fb
            gw2 r1 = r0.t0
            q0e r1 = r1.E0
            java.lang.Object r1 = r1.getValue()
            ov2 r1 = (defpackage.ov2) r1
            java.lang.String r1 = r1.b
            java.lang.String r6 = r0.u0
            boolean r1 = defpackage.tpa.f(r1, r6)
            if (r1 != 0) goto L_0x0187
            goto L_0x01fb
        L_0x0187:
            int r1 = r13.size()
            int r6 = r2.size()
            if (r1 == r6) goto L_0x01d2
            ru.ok.tamtam.search.DuplicateDetectException r1 = new ru.ok.tamtam.search.DuplicateDetectException
            int r2 = r2.size()
            int r6 = r13.size()
            int r2 = r2 - r6
            java.lang.String r6 = "diff="
            java.lang.String r2 = defpackage.zr6.h(r2, r6)
            r1.<init>(r2)
            gw2 r2 = r0.t0
            je7 r2 = r2.D0
            java.lang.Object r2 = r2.getValue()
            ty3 r2 = (defpackage.ty3) r2
            java.lang.String r6 = "ONEME-15837"
            r2.a(r6, r1)
            gw2 r2 = r0.t0
            java.lang.String r2 = r2.J0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x01bd
            goto L_0x01d2
        L_0x01bd:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x01d2
            us7 r7 = defpackage.us7.Z
            java.lang.String r1 = r1.getMessage()
            java.lang.String r8 = "found duplicates for ONEME-15837! "
            java.lang.String r1 = defpackage.wg0.i(r8, r1)
            r6.d(r7, r2, r1, r4)
        L_0x01d2:
            gw2 r1 = r0.t0
            q0e r1 = r1.E0
            java.lang.Object r2 = r1.getValue()
            r10 = r2
            ov2 r10 = (defpackage.ov2) r10
            it6 r12 = defpackage.it6.d
            gw2 r0 = r0.t0
            q0e r0 = r0.E0
            java.lang.Object r0 = r0.getValue()
            ov2 r0 = (defpackage.ov2) r0
            nv2 r0 = r0.a
            nv2 r2 = defpackage.nv2.b
            if (r0 == r2) goto L_0x01f1
        L_0x01ef:
            r14 = r5
            goto L_0x01f3
        L_0x01f1:
            r5 = 0
            goto L_0x01ef
        L_0x01f3:
            r15 = 2
            ov2 r0 = defpackage.ov2.a(r10, r11, r12, r13, r14, r15)
            r1.m(r4, r0)
        L_0x01fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.o(java.lang.Object):java.lang.Object");
    }
}
