package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: gz5  reason: default package */
public final class gz5 extends ffe implements a66 {
    public zy5 X;
    public Set Y;
    public int Z;
    public final /* synthetic */ iz5 s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ Set u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ Long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gz5(iz5 iz5, CharSequence charSequence, Set set, boolean z, Long l, Continuation continuation) {
        super(2, continuation);
        this.s0 = iz5;
        this.t0 = charSequence;
        this.u0 = set;
        this.v0 = z;
        this.w0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gz5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gz5(this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r32) {
        /*
            r31 = this;
            r6 = r31
            tx3 r7 = defpackage.tx3.a
            int r0 = r6.Z
            e5f r8 = defpackage.e5f.a
            r9 = 0
            boolean r10 = r6.v0
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 1
            iz5 r5 = r6.s0
            if (r0 == 0) goto L_0x0048
            if (r0 == r15) goto L_0x0041
            if (r0 == r14) goto L_0x0038
            if (r0 == r13) goto L_0x002e
            if (r0 == r12) goto L_0x002e
            if (r0 != r11) goto L_0x0026
            zy5 r0 = r6.X
            defpackage.od2.a0(r32)
            r11 = r5
            goto L_0x0177
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.util.Set r0 = r6.Y
            zy5 r1 = r6.X
            defpackage.od2.a0(r32)
            r11 = r5
            goto L_0x00d1
        L_0x0038:
            zy5 r0 = r6.X
            defpackage.od2.a0(r32)
            r1 = r32
            r11 = r5
            goto L_0x0076
        L_0x0041:
            defpackage.od2.a0(r32)
            r0 = r32
            r11 = r5
            goto L_0x0067
        L_0x0048:
            defpackage.od2.a0(r32)
            je7 r0 = r5.h
            java.lang.Object r0 = r0.getValue()
            lu0 r0 = (defpackage.lu0) r0
            r6.Z = r15
            java.lang.CharSequence r3 = r6.t0
            java.util.Set r4 = r6.u0
            java.util.Set r1 = r5.a
            java.lang.Long r2 = r5.d
            r11 = r5
            r5 = r31
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0067
            return r7
        L_0x0067:
            zy5 r0 = (defpackage.zy5) r0
            x3c r1 = r11.c
            r6.X = r0
            r6.Z = r14
            java.lang.Object r1 = r1.f(r6)
            if (r1 != r7) goto L_0x0076
            return r7
        L_0x0076:
            java.util.Set r1 = (java.util.Set) r1
            cz5 r2 = new cz5
            java.util.Set r3 = r11.a
            w7c r4 = r11.t
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r21 = r4 ^ 1
            java.lang.CharSequence r4 = r6.t0
            java.lang.Long r5 = r11.d
            boolean r14 = r11.e
            r16 = r2
            r17 = r3
            r18 = r5
            r19 = r14
            r20 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.Long r3 = r11.d
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r11.e
            if (r3 == 0) goto L_0x00d7
            je7 r3 = r11.i
            java.lang.Object r3 = r3.getValue()
            sy5 r3 = (defpackage.sy5) r3
            java.util.List r4 = defpackage.x53.D0(r1)
            r6.X = r0
            r6.Y = r1
            r6.Z = r13
            r3.getClass()
            ry5 r5 = new ry5
            r5.<init>(r3, r2, r4, r9)
            java.lang.Object r2 = defpackage.j1e.k(r5, r6)
            if (r2 != r7) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            if (r2 != r7) goto L_0x00cc
            return r7
        L_0x00cc:
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x00d1:
            r30 = r1
            r1 = r0
            r0 = r30
            goto L_0x00fc
        L_0x00d7:
            je7 r3 = r11.j
            java.lang.Object r3 = r3.getValue()
            bz5 r3 = (defpackage.bz5) r3
            java.util.List r4 = defpackage.x53.D0(r1)
            r6.X = r0
            r6.Y = r1
            r6.Z = r12
            r3.getClass()
            az5 r5 = new az5
            r5.<init>(r3, r2, r4, r9)
            java.lang.Object r2 = defpackage.j1e.k(r5, r6)
            if (r2 != r7) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r2 = r8
        L_0x00f9:
            if (r2 != r7) goto L_0x00cc
            return r7
        L_0x00fc:
            java.util.Set r2 = r6.u0
            int r3 = r2.size()
            if (r3 <= r15) goto L_0x017a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r3 = r11.f
            android.content.res.Resources r3 = r3.getResources()
            int r4 = defpackage.n8a.a
            java.util.Set r5 = r11.a
            int r5 = r5.size()
            java.lang.String r3 = r3.getQuantityString(r4, r5)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            android.content.Context r3 = r11.f
            android.content.res.Resources r3 = r3.getResources()
            int r4 = defpackage.n8a.b
            int r5 = r2.size()
            java.lang.String r3 = r3.getQuantityString(r4, r5)
            int r2 = r2.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r15)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.append(r2)
            je7 r2 = r11.g
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            cx7 r2 = r2.c()
            fz5 r3 = new fz5
            r3.<init>(r11, r1, r9)
            r6.X = r0
            r6.Y = r9
            r1 = 5
            r6.Z = r1
            java.lang.Object r1 = defpackage.j47.t0(r2, r3, r6)
            if (r1 != r7) goto L_0x0177
            return r7
        L_0x0177:
            r28 = r0
            goto L_0x019b
        L_0x017a:
            if (r10 != 0) goto L_0x0177
            kld r2 = r11.p
            jz5 r3 = new jz5
            java.lang.Object r1 = defpackage.x53.f0(r1)
            r17 = r1
            java.lang.Long r17 = (java.lang.Long) r17
            r19 = 0
            r20 = 0
            r18 = 0
            r22 = 14
            r16 = r3
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.g(r3)
            goto L_0x0177
        L_0x019b:
            if (r10 == 0) goto L_0x01b5
            kld r0 = r11.p
            jz5 r1 = new jz5
            r26 = 0
            r27 = 0
            java.lang.Long r2 = r6.w0
            r25 = 0
            r29 = 14
            r23 = r1
            r24 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r0.g(r1)
        L_0x01b5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz5.o(java.lang.Object):java.lang.Object");
    }
}
