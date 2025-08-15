package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cv4  reason: default package */
public final class cv4 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dv4 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ CharSequence u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cv4(dv4 dv4, long j, long j2, CharSequence charSequence, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = dv4;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = charSequence;
        this.v0 = z;
        this.w0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cv4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cv4 cv4 = new cv4(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
        cv4.Y = obj;
        return cv4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        if (r13 == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001e
            if (r2 != r4) goto L_0x0016
            java.lang.Object r1 = r0.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r19)
            r5 = r19
            goto L_0x004a
        L_0x0016:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001e:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Y
            sx3 r2 = (defpackage.sx3) r2
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "Edit message."
            defpackage.hm9.G(r5, r6, r3)
            dv4 r5 = r0.Z
            je7 r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            r79 r5 = (defpackage.r79) r5
            long r6 = r0.s0
            r0.Y = r2
            r0.X = r4
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r1 = r2
        L_0x004a:
            cu8 r5 = (defpackage.cu8) r5
            e5f r2 = defpackage.e5f.a
            if (r5 != 0) goto L_0x0051
            return r2
        L_0x0051:
            dv4 r6 = r0.Z
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            dc6 r6 = (defpackage.dc6) r6
            long r7 = r0.t0
            java.lang.CharSequence r9 = r0.u0
            java.util.List r14 = r6.b(r9, r7)
            java.lang.CharSequence r6 = r0.u0
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x006a
            r6 = r7
        L_0x006a:
            java.lang.String r6 = r6.toString()
            dv4 r8 = r0.Z
            r8.getClass()
            boolean r8 = r5.C()
            r9 = 0
            if (r8 == 0) goto L_0x0103
            c20 r8 = r5.i()
            if (r8 == 0) goto L_0x0083
            java.lang.String r8 = r8.b
            goto L_0x0084
        L_0x0083:
            r8 = r3
        L_0x0084:
            if (r8 == 0) goto L_0x0103
            int r8 = r8.length()
            if (r8 != 0) goto L_0x008e
            goto L_0x0103
        L_0x008e:
            c20 r8 = r5.i()
            if (r8 == 0) goto L_0x0103
            java.lang.String r8 = r8.b
            if (r8 != 0) goto L_0x009a
            goto L_0x0103
        L_0x009a:
            java.lang.String r10 = "http://"
            java.lang.String r11 = defpackage.w9e.K0(r8, r10)
            java.lang.String r12 = "https://"
            java.lang.String r11 = defpackage.w9e.K0(r11, r12)
            at r13 = new at
            r15 = 2
            r13.<init>(r15, r14)
            pz2 r15 = new pz2
            r3 = 15
            r15.<init>(r3)
            qk5 r3 = defpackage.l6d.Z(r13, r15)
            pz2 r13 = new pz2
            r15 = 16
            r13.<init>(r15)
            qk5 r3 = defpackage.l6d.e0(r3, r13)
            boolean r13 = defpackage.w9e.p0(r6, r11, r4)
            if (r13 != 0) goto L_0x00d1
            boolean r13 = defpackage.w9e.p0(r6, r8, r9)
            if (r13 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r13 = r9
            goto L_0x00d2
        L_0x00d1:
            r13 = r4
        L_0x00d2:
            pk5 r15 = new pk5
            r15.<init>((defpackage.qk5) r3)
        L_0x00d7:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r15.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r17 = defpackage.eae.k0(r3, r8, r4)
            if (r17 != 0) goto L_0x0101
            boolean r17 = defpackage.eae.k0(r3, r11, r4)
            if (r17 != 0) goto L_0x0101
            java.lang.String r3 = defpackage.w9e.K0(r3, r10)
            java.lang.String r3 = defpackage.w9e.K0(r3, r12)
            boolean r3 = r3.equalsIgnoreCase(r11)
            if (r3 == 0) goto L_0x00d7
            goto L_0x0101
        L_0x00fe:
            if (r13 != 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r4 = r9
        L_0x0102:
            r9 = r4
        L_0x0103:
            boolean r3 = r0.v0
            if (r3 != 0) goto L_0x0160
            if (r9 == 0) goto L_0x010a
            goto L_0x0160
        L_0x010a:
            java.lang.CharSequence r3 = r0.u0
            if (r3 == 0) goto L_0x0114
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0124
        L_0x0114:
            g20 r3 = defpackage.g20.c
            boolean r3 = r5.m(r3)
            if (r3 != 0) goto L_0x0124
            g20 r3 = defpackage.g20.o
            boolean r3 = r5.m(r3)
            if (r3 == 0) goto L_0x01c7
        L_0x0124:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "Edit message. Text scenario"
            defpackage.hm9.m(r1, r3, new java.lang.Object[0])
            dv4 r1 = r0.Z
            long r3 = r0.t0
            long r11 = r0.s0
            java.lang.CharSequence r0 = r0.u0
            if (r0 != 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r7 = r0
        L_0x013d:
            r1.getClass()
            java.lang.CharSequence r0 = defpackage.w9e.b1(r7)
            java.lang.String r13 = r0.toString()
            n8d r0 = new n8d
            r10 = r0
            r15 = r3
            r10.<init>(r11, r13, r14, r15)
            o8d r3 = new o8d
            r3.<init>(r0)
            je7 r0 = r1.d
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            r0.a(r3)
            goto L_0x01c7
        L_0x0160:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.util.List r3 = r0.w0
            boolean r4 = r0.v0
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x0171
            goto L_0x01a0
        L_0x0171:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x01a0
            us7 r8 = defpackage.us7.X
            if (r3 == 0) goto L_0x0185
            int r3 = r3.size()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            goto L_0x0186
        L_0x0185:
            r9 = 0
        L_0x0186:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r10 = "Edit message. Attachments scenario, media size:"
            r3.<init>(r10)
            r3.append(r9)
            java.lang.String r9 = ", media changed:"
            r3.append(r9)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r7.d(r8, r1, r3, r4)
        L_0x01a0:
            java.util.List r1 = r0.w0
            if (r1 != 0) goto L_0x01a6
            nz4 r1 = defpackage.nz4.a
        L_0x01a6:
            r12 = r1
            long r8 = r5.b
            long r10 = r0.t0
            l8d r1 = new l8d
            r7 = r1
            r7.<init>(r8, r10, r12)
            r1.m = r6
            r1.n = r14
            m8d r3 = new m8d
            r3.<init>(r1)
            dv4 r0 = r0.Z
            je7 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            r0.a(r3)
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv4.o(java.lang.Object):java.lang.Object");
    }
}
