package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rv2  reason: default package */
public final class rv2 extends ffe implements a66 {
    public List X;
    public gw2 Y;
    public Collection Z;
    public Iterator s0;
    public List t0;
    public Collection u0;
    public int v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ gw2 x0;
    public final /* synthetic */ boolean y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rv2(gw2 gw2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.x0 = gw2;
        this.y0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rv2 rv2 = new rv2(this.x0, this.y0, continuation);
        rv2.w0 = obj;
        return rv2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 5
            r2 = 2
            r3 = 0
            r4 = 1
            tx3 r5 = defpackage.tx3.a
            int r6 = r0.v0
            gw2 r7 = r0.x0
            r8 = 10
            if (r6 == 0) goto L_0x003e
            if (r6 == r4) goto L_0x0021
            if (r6 != r2) goto L_0x0019
            defpackage.od2.a0(r22)
            goto L_0x01a9
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            java.util.Collection r6 = r0.u0
            java.util.List r9 = r0.t0
            java.util.Iterator r10 = r0.s0
            java.util.Collection r11 = r0.Z
            gw2 r12 = r0.Y
            java.util.List r13 = r0.X
            java.lang.Object r14 = r0.w0
            sx3 r14 = (defpackage.sx3) r14
            defpackage.od2.a0(r22)
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r10
            r10 = r9
            r9 = r11
            r11 = r22
            goto L_0x00de
        L_0x003e:
            defpackage.od2.a0(r22)
            java.lang.Object r6 = r0.w0
            sx3 r6 = (defpackage.sx3) r6
            k9c r9 = r7.b
            java.util.List r9 = r9.a()
            k9c r10 = r7.b
            java.util.List r10 = r10.b()
            rr3 r11 = r7.c
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.m
            boolean r12 = r12.get()
            if (r12 == 0) goto L_0x006d
            java.lang.String r12 = r11.k
            boolean r12 = defpackage.oag.t(r12)
            if (r12 == 0) goto L_0x0066
            java.util.List r11 = r11.f
            goto L_0x0068
        L_0x0066:
            java.util.List r11 = r11.g
        L_0x0068:
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            goto L_0x0071
        L_0x006d:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x0071:
            java.util.List r12 = defpackage.gw2.r(r7)
            defpackage.j1e.o(r6)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x00a1
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = defpackage.z53.S(r9, r8)
            r12.<init>(r13)
            java.util.Iterator r9 = r9.iterator()
        L_0x008b:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x00a1
            java.lang.Object r13 = r9.next()
            uj3 r13 = (defpackage.uj3) r13
            kz2 r14 = r7.X
            v8c r13 = r14.b(r13)
            r12.add(r13)
            goto L_0x008b
        L_0x00a1:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r13 = defpackage.z53.S(r10, r8)
            r9.<init>(r13)
            java.util.Iterator r10 = r10.iterator()
            r14 = r6
            r6 = r9
            r13 = r11
            r9 = r12
            r12 = r7
        L_0x00b3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00ea
            java.lang.Object r11 = r10.next()
            kzc r11 = (defpackage.kzc) r11
            nzc r15 = r12.Y
            r0.w0 = r14
            r0.X = r13
            r0.Y = r12
            r0.Z = r6
            r0.s0 = r10
            r0.t0 = r9
            r0.u0 = r6
            r0.v0 = r4
            java.lang.Object r11 = r15.b(r11, r0)
            if (r11 != r5) goto L_0x00d8
            return r5
        L_0x00d8:
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r10
            r10 = r9
            r9 = r6
        L_0x00de:
            izc r11 = (defpackage.izc) r11
            r6.add(r11)
            r6 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            goto L_0x00b3
        L_0x00ea:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r10 = new java.util.ArrayList
            int r8 = defpackage.z53.S(r13, r8)
            r10.<init>(r8)
            java.util.Iterator r8 = r13.iterator()
        L_0x00f9:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x010f
            java.lang.Object r11 = r8.next()
            uj3 r11 = (defpackage.uj3) r11
            kz2 r12 = r7.X
            nn3 r11 = r12.a(r11)
            r10.add(r11)
            goto L_0x00f9
        L_0x010f:
            it6 r8 = new it6
            r8.<init>(r9, r6, r10)
            defpackage.j1e.o(r14)
            q0e r6 = r7.E0
            ov2 r9 = new ov2
            nv2 r16 = defpackage.nv2.c
            nz4 r19 = defpackage.nz4.a
            boolean r10 = r0.y0
            java.lang.String r17 = ""
            r15 = r9
            r18 = r8
            r20 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            r8 = 0
            r6.m(r8, r9)
            je7 r6 = r7.C0
            java.lang.Object r6 = r6.getValue()
            tm3 r6 = (defpackage.tm3) r6
            mn5 r6 = r6.a()
            je7 r9 = r7.B0
            java.lang.Object r9 = r9.getValue()
            ci0 r9 = (defpackage.ci0) r9
            zn5 r9 = r9.b()
            mn5[] r10 = new defpackage.mn5[r2]
            r10[r3] = r6
            r10[r4] = r9
            m32 r6 = defpackage.od2.N(r10)
            int r9 = defpackage.ft4.o
            kt4 r9 = defpackage.kt4.SECONDS
            long r9 = defpackage.z7.R(r4, r9)
            m32 r6 = defpackage.nu0.Q(r6, r9)
            wv2 r9 = new wv2
            r9.<init>(r6, r7, r3)
            wv2 r6 = new wv2
            r6.<init>(r9, r7, r4)
            yv2 r4 = new yv2
            r4.<init>(r7, r8)
            zn5 r9 = new zn5
            r9.<init>(r6, r4, r1)
            xh0 r4 = new xh0
            r4.<init>((java.lang.Object) r7, (kotlin.coroutines.Continuation) r8, (int) r1)
            ac r1 = new ac
            r6 = 18
            r1.<init>(r9, r6, r4)
            kke r4 = r7.Z
            w9a r4 = (defpackage.w9a) r4
            nx3 r4 = r4.a()
            mn5 r1 = defpackage.od2.F(r1, r4)
            r4 = 3
            mn5 r1 = defpackage.od2.f(r1, r3, r4)
            vxd r1 = defpackage.od2.L(r1, r14)
            r0.w0 = r8
            r0.X = r8
            r0.Y = r8
            r0.Z = r8
            r0.s0 = r8
            r0.t0 = r8
            r0.u0 = r8
            r0.v0 = r2
            java.lang.Object r0 = r1.join(r0)
            if (r0 != r5) goto L_0x01a9
            return r5
        L_0x01a9:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv2.o(java.lang.Object):java.lang.Object");
    }
}
