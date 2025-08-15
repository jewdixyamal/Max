package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: akd  reason: default package */
public final class akd extends ffe implements a66 {
    public q0e X;
    public int Y;
    public final /* synthetic */ ckd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akd(ckd ckd, Continuation continuation) {
        super(2, continuation);
        this.Z = ckd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((akd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new akd(this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0111, code lost:
        if (defpackage.w9e.C0(r0) == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0231 A[EDGE_INSN: B:143:0x0231->B:128:0x0231 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            tx3 r4 = defpackage.tx3.a
            int r5 = r14.Y
            if (r5 == 0) goto L_0x001b
            if (r5 != r3) goto L_0x0013
            q0e r14 = r14.X
            defpackage.od2.a0(r15)
            goto L_0x025e
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x001b:
            defpackage.od2.a0(r15)
            ckd r15 = r14.Z
            q0e r5 = r15.g
            r14.X = r5
            r14.Y = r3
            aea r14 = r15.b
            r14.getClass()
            r6 = 0
            ru.ok.tamtam.android.util.share.ShareData r15 = r15.a
            if (r15 != 0) goto L_0x003f
            zjd r14 = new zjd
            int r15 = defpackage.jpc.U2
            eqe r0 = new eqe
            r0.<init>(r15)
            r14.<init>(r0, r6, r6, r6)
            r15 = r14
            goto L_0x025a
        L_0x003f:
            java.lang.String r7 = r15.text
            if (r7 == 0) goto L_0x004c
            boolean r7 = defpackage.w9e.C0(r7)
            if (r7 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r7 = r2
            goto L_0x004d
        L_0x004c:
            r7 = r3
        L_0x004d:
            r7 = r7 ^ r3
            java.util.List<android.net.Uri> r8 = r15.images
            if (r8 == 0) goto L_0x0057
            int r8 = r8.size()
            goto L_0x0058
        L_0x0057:
            r8 = r2
        L_0x0058:
            java.util.List<android.net.Uri> r9 = r15.videos
            if (r9 == 0) goto L_0x0061
            int r9 = r9.size()
            goto L_0x0062
        L_0x0061:
            r9 = r2
        L_0x0062:
            int r8 = r8 + r9
            java.util.List<android.net.Uri> r9 = r15.files
            if (r9 == 0) goto L_0x006c
            int r9 = r9.size()
            goto L_0x006d
        L_0x006c:
            r9 = r2
        L_0x006d:
            int r8 = r8 + r9
            java.util.List<android.net.Uri> r9 = r15.shares
            if (r9 == 0) goto L_0x0077
            int r9 = r9.size()
            goto L_0x0078
        L_0x0077:
            r9 = r2
        L_0x0078:
            int r8 = r8 + r9
            java.lang.String r9 = r15.vcard
            if (r9 == 0) goto L_0x0086
            boolean r9 = defpackage.w9e.C0(r9)
            if (r9 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r9 = r2
            goto L_0x0087
        L_0x0086:
            r9 = r3
        L_0x0087:
            r9 = r9 ^ r3
            int r8 = r8 + r9
            if (r8 <= 0) goto L_0x008d
            r9 = r3
            goto L_0x008e
        L_0x008d:
            r9 = r2
        L_0x008e:
            int r10 = defpackage.jpc.U2
            eqe r11 = new eqe
            r11.<init>(r10)
            if (r7 == 0) goto L_0x00b5
            if (r9 != 0) goto L_0x00b5
            lkd r14 = new lkd
            java.lang.String r15 = r15.text
            if (r15 == 0) goto L_0x00a9
            iqe r0 = new iqe
            r0.<init>(r15)
            r14.<init>(r0, r6)
            goto L_0x023c
        L_0x00a9:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x00b5:
            n71 r10 = defpackage.n71.t0
            n71 r12 = defpackage.n71.v0
            je7 r14 = r14.a
            if (r9 == 0) goto L_0x01a5
            if (r8 != r3) goto L_0x01a5
            if (r7 != 0) goto L_0x01a5
            java.util.List<android.net.Uri> r7 = r15.images
            java.util.List<android.net.Uri> r9 = r15.videos
            java.util.List<android.net.Uri> r13 = r15.files
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r13
            c6d r0 = defpackage.ys.Q(r1)
            qk5 r0 = defpackage.l6d.a0(r0, r12)
            um5 r0 = defpackage.l6d.d0(r0, r10)
            java.lang.Object r0 = defpackage.l6d.c0(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x0116
            java.lang.Object r14 = r14.getValue()
            af8 r14 = (defpackage.af8) r14
            java.lang.String r0 = r0.toString()
            cj0 r14 = (defpackage.cj0) r14
            it3 r14 = r14.c(r0)
            if (r14 == 0) goto L_0x0116
            boolean r0 = r14.a()
            if (r0 != 0) goto L_0x0104
            boolean r0 = r14.b()
            if (r0 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r0 = r6
            goto L_0x0105
        L_0x0104:
            r0 = r14
        L_0x0105:
            java.lang.String r14 = r14.c
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = r0.e
            if (r0 == 0) goto L_0x0114
            boolean r1 = defpackage.w9e.C0(r0)
            if (r1 != 0) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = r6
            goto L_0x0118
        L_0x0116:
            r14 = r6
            goto L_0x0114
        L_0x0118:
            java.util.List<android.net.Uri> r1 = r15.images
            if (r1 == 0) goto L_0x0137
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x0137
            int r14 = defpackage.q8a.c
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            cqe r1 = new cqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019e
        L_0x0137:
            java.util.List<android.net.Uri> r1 = r15.videos
            if (r1 == 0) goto L_0x0156
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x0156
            int r14 = defpackage.q8a.d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            cqe r1 = new cqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019e
        L_0x0156:
            java.util.List<android.net.Uri> r1 = r15.files
            if (r1 == 0) goto L_0x017d
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x017d
            if (r14 == 0) goto L_0x0169
            iqe r1 = new iqe
            r1.<init>(r14)
            goto L_0x019e
        L_0x0169:
            int r14 = defpackage.q8a.b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            cqe r1 = new cqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019e
        L_0x017d:
            java.util.List<android.net.Uri> r14 = r15.shares
            if (r14 == 0) goto L_0x0190
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r3
            if (r14 != r3) goto L_0x0190
            int r14 = defpackage.r8a.W
            eqe r1 = new eqe
            r1.<init>(r14)
            goto L_0x019e
        L_0x0190:
            java.lang.String r14 = r15.vcard
            if (r14 == 0) goto L_0x019c
            int r14 = defpackage.r8a.V
            eqe r1 = new eqe
            r1.<init>(r14)
            goto L_0x019e
        L_0x019c:
            iqe r1 = defpackage.jqe.a
        L_0x019e:
            lkd r14 = new lkd
            r14.<init>(r1, r0)
            goto L_0x023c
        L_0x01a5:
            if (r9 == 0) goto L_0x0237
            java.util.List<android.net.Uri> r7 = r15.images
            if (r7 == 0) goto L_0x01b4
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01b4
            int r7 = defpackage.q8a.c
            goto L_0x01c3
        L_0x01b4:
            java.util.List<android.net.Uri> r7 = r15.videos
            if (r7 == 0) goto L_0x01c1
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01c1
            int r7 = defpackage.q8a.d
            goto L_0x01c3
        L_0x01c1:
            int r7 = defpackage.q8a.b
        L_0x01c3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            cqe r13 = new cqe
            java.util.List r9 = defpackage.ys.m0(r9)
            r13.<init>(r9, r7, r8)
            java.util.List<android.net.Uri> r7 = r15.images
            java.util.List<android.net.Uri> r9 = r15.videos
            java.util.List<android.net.Uri> r15 = r15.files
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r15
            c6d r15 = defpackage.ys.Q(r1)
            qk5 r15 = defpackage.l6d.a0(r15, r12)
            um5 r15 = defpackage.l6d.d0(r15, r10)
            pk5 r0 = new pk5
            r0.<init>((defpackage.um5) r15)
        L_0x01f3:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0230
            java.lang.Object r15 = r0.next()
            android.net.Uri r15 = (android.net.Uri) r15
            java.lang.Object r1 = r14.getValue()
            af8 r1 = (defpackage.af8) r1
            java.lang.String r15 = r15.toString()
            cj0 r1 = (defpackage.cj0) r1
            it3 r15 = r1.c(r15)
            if (r15 == 0) goto L_0x022c
            boolean r1 = r15.a()
            if (r1 != 0) goto L_0x021f
            boolean r1 = r15.b()
            if (r1 == 0) goto L_0x021e
            goto L_0x021f
        L_0x021e:
            r15 = r6
        L_0x021f:
            if (r15 == 0) goto L_0x022c
            java.lang.String r15 = r15.e
            if (r15 == 0) goto L_0x022c
            boolean r1 = defpackage.w9e.C0(r15)
            if (r1 != 0) goto L_0x022c
            goto L_0x022d
        L_0x022c:
            r15 = r6
        L_0x022d:
            if (r15 == 0) goto L_0x01f3
            goto L_0x0231
        L_0x0230:
            r15 = r6
        L_0x0231:
            lkd r14 = new lkd
            r14.<init>(r13, r15)
            goto L_0x023c
        L_0x0237:
            lkd r14 = new lkd
            r14.<init>(r6, r6)
        L_0x023c:
            java.lang.String r15 = r14.b
            if (r15 == 0) goto L_0x0245
            java.lang.String r15 = defpackage.j47.O(r15)
            goto L_0x0246
        L_0x0245:
            r15 = r6
        L_0x0246:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            int r1 = r0.intValue()
            if (r1 <= r3) goto L_0x0252
            r6 = r0
        L_0x0252:
            zjd r0 = new zjd
            jqe r14 = r14.a
            r0.<init>(r11, r14, r15, r6)
            r15 = r0
        L_0x025a:
            if (r15 != r4) goto L_0x025d
            return r4
        L_0x025d:
            r14 = r5
        L_0x025e:
            r14.setValue(r15)
            e5f r14 = defpackage.e5f.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akd.o(java.lang.Object):java.lang.Object");
    }
}
