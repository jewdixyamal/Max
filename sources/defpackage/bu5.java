package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: bu5  reason: default package */
public final class bu5 extends ffe implements a66 {
    public at5 X;
    public Set Y;
    public ArrayList Z;
    public int s0;
    public final /* synthetic */ nu5 t0;
    public final /* synthetic */ je7 u0;
    public final /* synthetic */ je7 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bu5(nu5 nu5, je7 je7, je7 je72, Continuation continuation) {
        super(2, continuation);
        this.t0 = nu5;
        this.u0 = je7;
        this.v0 = je72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bu5(this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = 0
            r2 = 2
            r3 = 1
            tx3 r4 = defpackage.tx3.a
            int r5 = r0.s0
            e5f r6 = defpackage.e5f.a
            r7 = 0
            if (r5 == 0) goto L_0x002e
            if (r5 == r3) goto L_0x0028
            if (r5 != r2) goto L_0x0020
            java.util.ArrayList r2 = r0.Z
            java.util.Set r4 = r0.Y
            at5 r5 = r0.X
            defpackage.od2.a0(r26)
            r9 = r2
            r2 = r26
            goto L_0x00e5
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            defpackage.od2.a0(r26)
            r5 = r26
            goto L_0x0042
        L_0x002e:
            defpackage.od2.a0(r26)
            nu5 r5 = r0.t0
            ta2 r8 = r5.X
            java.lang.String r5 = r5.b
            r0.s0 = r3
            zb2 r8 = (defpackage.zb2) r8
            java.lang.Object r5 = r8.d(r5, r0)
            if (r5 != r4) goto L_0x0042
            return r4
        L_0x0042:
            at5 r5 = (defpackage.at5) r5
            if (r5 != 0) goto L_0x0053
            nu5 r0 = r0.t0
            q0e r0 = r0.t0
            xt5 r1 = new xt5
            r1.<init>()
            r0.m(r7, r1)
            return r6
        L_0x0053:
            nu5 r8 = r0.t0
            r8.A0 = r5
            je7 r8 = r0.u0
            java.lang.Object r8 = r8.getValue()
            hda r8 = (defpackage.hda) r8
            java.lang.CharSequence r9 = r5.b
            java.util.List r10 = r5.y0
            java.lang.CharSequence r8 = r8.a(r9, r10, 2, false, 0, true)
            nu5 r9 = r0.t0
            q0e r10 = r9.t0
            yt5 r11 = new yt5
            java.lang.String r9 = r9.b
            r12 = 4
            r11.<init>((java.lang.String) r9, (java.lang.CharSequence) r8, (int) r12)
            r10.m(r7, r11)
            st5 r9 = new st5
            iqe r10 = new iqe
            r10.<init>(r8)
            java.util.Set r8 = r5.C0
            cv5 r11 = defpackage.cv5.NO_TITLE_EDIT
            boolean r8 = r8.contains(r11)
            r8 = r8 ^ r3
            r9.<init>(r10, r8)
            nu5 r8 = r0.t0
            q0e r8 = r8.v0
            ou5 r10 = new ou5
            r10.<init>(r2)
            ol7[] r11 = new defpackage.ol7[r2]
            r11[r1] = r9
            r11[r3] = r10
            java.util.List r10 = defpackage.y53.M(r11)
            r8.m(r7, r10)
            java.util.Set r8 = r5.v0
            ou5 r10 = new ou5
            boolean r11 = r8.isEmpty()
            r11 = r11 ^ r3
            if (r11 == 0) goto L_0x00ae
            r11 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x00af
        L_0x00ae:
            r11 = r2
        L_0x00af:
            r10.<init>(r11)
            ol7[] r11 = new defpackage.ol7[r2]
            r11[r1] = r9
            r11[r3] = r10
            java.util.ArrayList r9 = defpackage.y53.N(r11)
            boolean r10 = r8.isEmpty()
            r10 = r10 ^ r3
            if (r10 == 0) goto L_0x0177
            nu5 r10 = r0.t0
            ta2 r11 = r10.X
            java.lang.String r10 = r10.b
            r0.X = r5
            r0.Y = r8
            r0.Z = r9
            r0.s0 = r2
            zb2 r11 = (defpackage.zb2) r11
            r11.getClass()
            fb2 r2 = new fb2
            r2.<init>(r11, r10, r7)
            lx3 r10 = r11.Y
            java.lang.Object r2 = defpackage.j47.t0(r10, r2, r0)
            if (r2 != r4) goto L_0x00e4
            return r4
        L_0x00e4:
            r4 = r8
        L_0x00e5:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            nu5 r8 = r0.t0
            je7 r10 = r0.v0
            java.util.Iterator r2 = r2.iterator()
            r11 = r1
        L_0x00f0:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0177
            java.lang.Object r12 = r2.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x0173
            e52 r12 = (defpackage.e52) r12
            bc7[] r14 = defpackage.nu5.D0
            r8.getClass()
            android.net.Uri r14 = defpackage.nu5.t(r12)
            int r15 = r4.size()
            int r15 = r15 - r3
            if (r11 != r15) goto L_0x0116
            r11 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x0113:
            r24 = r11
            goto L_0x011a
        L_0x0116:
            r11 = 1073741828(0x40000004, float:2.000001)
            goto L_0x0113
        L_0x011a:
            pu5 r11 = new pu5
            k92 r15 = r12.b
            r26 = r2
            long r1 = r15.a
            if (r14 == 0) goto L_0x012b
            java.lang.String r14 = r14.toString()
            r18 = r14
            goto L_0x012d
        L_0x012b:
            r18 = r7
        L_0x012d:
            java.lang.Object r14 = r10.getValue()
            lr2 r14 = (defpackage.lr2) r14
            ld2 r14 = (defpackage.ld2) r14
            r14.getClass()
            r12.k0()
            java.lang.CharSequence r14 = r12.u0
            long r20 = r12.f()
            r12.l0()
            java.lang.CharSequence r15 = r12.x0
            boolean r16 = r12.X()
            if (r16 != 0) goto L_0x015d
            uj3 r12 = r12.l()
            if (r12 == 0) goto L_0x0159
            boolean r12 = r12.u()
            if (r12 != r3) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            r12 = r15
            r23 = 0
            goto L_0x0160
        L_0x015d:
            r23 = r3
            r12 = r15
        L_0x0160:
            r15 = r11
            r16 = r1
            r19 = r14
            r22 = r12
            r15.<init>(r16, r18, r19, r20, r22, r23, r24)
            r9.add(r11)
            r2 = r26
            r11 = r13
            r1 = 0
            goto L_0x00f0
        L_0x0173:
            defpackage.y53.R()
            throw r7
        L_0x0177:
            java.util.Set r1 = r5.C0
            cv5 r2 = defpackage.cv5.NO_DELETE
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0186
            lt5 r1 = defpackage.lt5.a
            r9.add(r1)
        L_0x0186:
            nu5 r0 = r0.t0
            q0e r0 = r0.v0
            r0.setValue(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu5.o(java.lang.Object):java.lang.Object");
    }
}
