package defpackage;

import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: vkb  reason: default package */
public final class vkb implements qab {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public vkb(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
    }

    public static void c(List list, uj3 uj3, jqe jqe, String str, boolean z, rdb rdb) {
        long n = uj3.n();
        String d2 = uj3.d();
        if (d2 == null) {
            d2 = "";
        }
        String str2 = d2;
        List list2 = list;
        list.add(new zm3(n, str2, rdb == rdb.SETUP_NEW_ADMIN ? jqe.a : jqe, str, z, uj3.m(), rdb, 0, true, 128));
    }

    public static void d(List list, pdb pdb, boolean z) {
        List list2 = list;
        int i = sea.I;
        long j = tea.c;
        eqe eqe = new eqe(vea.U0);
        odb odb = pdb.m;
        boolean z2 = odb.b;
        vfd vfd = r3;
        vfd vfd2 = new vfd(j, 0, eqe, z2 ? jfd.b : jfd.o, (jqe) null, (Integer) null, new ffd(odb.a, z2), (zed) null, (jqe) null, 0, (wed) null, 1968);
        list2.add(new x6(i, vfd));
        if (z) {
            list2.add(new s0d(new eqe(vea.V0), i4f.p, 4096, 2));
        }
    }

    public static void e(List list, pdb pdb, boolean z) {
        int i = sea.F;
        long j = tea.b;
        eqe eqe = new eqe(z ? vea.y1 : vea.J1);
        eqe eqe2 = new eqe(vea.K1);
        odb odb = pdb.k;
        boolean z2 = odb.b;
        vfd vfd = r2;
        vfd vfd2 = new vfd(j, 0, eqe, z2 ? jfd.b : jfd.o, eqe2, (Integer) null, new ffd(odb.a, z2), (zed) null, (jqe) null, 0, (wed) null, 1952);
        list.add(new x6(i, vfd));
    }

    public static void g(List list, boolean z, boolean z2, rdb rdb) {
        List list2 = list;
        if (z && rdb == rdb.CHANGE_ADMIN) {
            if (z2) {
                int i = sea.D;
                vfd vfd = r3;
                vfd vfd2 = new vfd(tea.a, 0, new eqe(vea.e), (jfd) null, (jqe) null, Integer.valueOf(woc.R0), cfd.a, (zed) null, (jqe) null, 0, (wed) null, 1944);
                list2.add(new x6(i, vfd, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            }
            list2.add(new gh4(new eqe(vea.W0)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: kl7} */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.uj3 r32, defpackage.e52 r33, defpackage.pdb r34, defpackage.rdb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.rkb
            if (r5 == 0) goto L_0x001d
            r5 = r4
            rkb r5 = (defpackage.rkb) r5
            int r6 = r5.A0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.A0 = r6
            goto L_0x0022
        L_0x001d:
            rkb r5 = new rkb
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.y0
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.A0
            r8 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0080
            if (r7 == r10) goto L_0x0057
            if (r7 != r8) goto L_0x004f
            int r0 = r5.x0
            java.lang.Object r1 = r5.w0
            jqe r1 = (defpackage.jqe) r1
            java.io.Serializable r2 = r5.v0
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.u0
            java.lang.Object r6 = r5.t0
            java.util.List r6 = (java.util.List) r6
            rdb r7 = r5.s0
            pdb r8 = r5.Z
            e52 r11 = r5.Y
            uj3 r12 = r5.X
            vkb r5 = r5.o
            defpackage.od2.a0(r4)
            goto L_0x010f
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            int r0 = r5.x0
            java.lang.Object r1 = r5.w0
            java.lang.String r1 = (java.lang.String) r1
            java.io.Serializable r2 = r5.v0
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.u0
            java.lang.Object r7 = r5.t0
            java.lang.Long r7 = (java.lang.Long) r7
            rdb r11 = r5.s0
            pdb r12 = r5.Z
            e52 r13 = r5.Y
            uj3 r14 = r5.X
            vkb r15 = r5.o
            defpackage.od2.a0(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00e1
        L_0x0080:
            defpackage.od2.a0(r4)
            kl7 r4 = defpackage.j1e.l()
            je7 r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            u7b r7 = (defpackage.u7b) r7
            long r11 = r32.n()
            r7b r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00a7
            r11 = 20
            if (r7 == r11) goto L_0x00a7
            r11 = 40
            if (r7 == r11) goto L_0x00a7
            r7 = 0
            goto L_0x00a8
        L_0x00a7:
            r7 = r10
        L_0x00a8:
            kk0 r11 = defpackage.kk0.c
            java.lang.String r11 = r1.p(r11)
            if (r11 != 0) goto L_0x00b2
            java.lang.String r11 = ""
        L_0x00b2:
            r5.o = r0
            r5.X = r1
            r5.Y = r2
            r12 = r34
            r5.Z = r12
            r13 = r35
            r5.s0 = r13
            r5.t0 = r3
            r5.u0 = r4
            r5.v0 = r4
            r5.w0 = r11
            r5.x0 = r7
            r5.A0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00d3
            return r6
        L_0x00d3:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00e1:
            jqe r1 = (defpackage.jqe) r1
            boolean r9 = r13.s()
            r5.o = r15
            r5.X = r14
            r5.Y = r13
            r5.Z = r12
            r5.s0 = r11
            r5.t0 = r7
            r5.u0 = r4
            r5.v0 = r2
            r5.w0 = r1
            r5.x0 = r0
            r5.A0 = r8
            java.lang.Boolean r3 = r15.h(r3, r9, r13)
            if (r3 != r6) goto L_0x0104
            return r6
        L_0x0104:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x010f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r0 == 0) goto L_0x0119
            r0 = r10
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            e(r3, r8, r10)
            x6 r0 = new x6
            int r1 = defpackage.sea.R
            vfd r2 = new vfd
            long r14 = defpackage.tea.i
            int r9 = defpackage.vea.v1
            eqe r13 = new eqe
            r13.<init>(r9)
            odb r9 = r8.g
            boolean r10 = r9.b
            jfd r27 = defpackage.jfd.o
            jfd r28 = defpackage.jfd.b
            r31 = r6
            if (r10 == 0) goto L_0x014d
            r18 = r28
            goto L_0x014f
        L_0x014d:
            r18 = r27
        L_0x014f:
            ffd r6 = new ffd
            boolean r9 = r9.a
            r6.<init>(r9, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r9 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            x6 r0 = new x6
            int r1 = defpackage.sea.O
            vfd r2 = new vfd
            long r14 = defpackage.tea.g
            int r6 = defpackage.vea.u1
            eqe r9 = new eqe
            r9.<init>(r6)
            odb r6 = r8.h
            boolean r10 = r6.b
            if (r10 == 0) goto L_0x0190
            r18 = r28
            goto L_0x0192
        L_0x0190:
            r18 = r27
        L_0x0192:
            ffd r13 = new ffd
            boolean r6 = r6.a
            r13.<init>(r6, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            x6 r0 = new x6
            int r1 = defpackage.sea.L
            vfd r2 = new vfd
            long r14 = defpackage.tea.d
            int r9 = defpackage.vea.r1
            eqe r10 = new eqe
            r10.<init>(r9)
            odb r9 = r8.i
            boolean r13 = r9.b
            if (r13 == 0) goto L_0x01d3
            r18 = r28
            goto L_0x01d5
        L_0x01d3:
            r18 = r27
        L_0x01d5:
            ffd r6 = new ffd
            boolean r9 = r9.a
            r6.<init>(r9, r13)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r13 = r2
            r17 = r10
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            x6 r0 = new x6
            int r1 = defpackage.sea.P
            vfd r2 = new vfd
            long r14 = defpackage.tea.h
            int r6 = defpackage.vea.i1
            eqe r9 = new eqe
            r9.<init>(r6)
            odb r6 = r8.j
            boolean r10 = r6.b
            if (r10 == 0) goto L_0x0215
            r18 = r28
            goto L_0x0217
        L_0x0215:
            r18 = r27
        L_0x0217:
            ffd r13 = new ffd
            boolean r6 = r6.a
            r13.<init>(r6, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            r0 = 0
            r1 = 1
            r5.f(r3, r8, r1, r0)
            boolean r2 = r12.Y
            if (r2 != 0) goto L_0x0255
            long r5 = r12.n()
            boolean r5 = r11.Y(r5)
            if (r5 != 0) goto L_0x0255
            r5 = r1
            goto L_0x0256
        L_0x0255:
            r5 = r0
        L_0x0256:
            d(r3, r8, r5)
            if (r4 == 0) goto L_0x0269
            if (r2 != 0) goto L_0x0269
            long r4 = r12.n()
            boolean r2 = r11.Y(r4)
            if (r2 != 0) goto L_0x0269
            r9 = r1
            goto L_0x026a
        L_0x0269:
            r9 = r0
        L_0x026a:
            boolean r0 = r11.d0()
            g(r3, r9, r0, r7)
            kl7 r0 = defpackage.j1e.d(r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.a(uj3, e52, pdb, rdb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: kl7} */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.uj3 r32, defpackage.e52 r33, defpackage.pdb r34, defpackage.rdb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.skb
            if (r5 == 0) goto L_0x001d
            r5 = r4
            skb r5 = (defpackage.skb) r5
            int r6 = r5.A0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.A0 = r6
            goto L_0x0022
        L_0x001d:
            skb r5 = new skb
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.y0
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.A0
            r8 = 2
            r9 = 0
            r10 = 1
            if (r7 == 0) goto L_0x0082
            if (r7 == r10) goto L_0x0058
            if (r7 != r8) goto L_0x0050
            int r0 = r5.x0
            java.lang.Object r1 = r5.w0
            jqe r1 = (defpackage.jqe) r1
            java.io.Serializable r2 = r5.v0
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.u0
            java.lang.Object r6 = r5.t0
            java.util.List r6 = (java.util.List) r6
            rdb r7 = r5.s0
            pdb r8 = r5.Z
            e52 r11 = r5.Y
            uj3 r12 = r5.X
            vkb r5 = r5.o
            defpackage.od2.a0(r4)
            goto L_0x0111
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            int r0 = r5.x0
            java.lang.Object r1 = r5.w0
            java.lang.String r1 = (java.lang.String) r1
            java.io.Serializable r2 = r5.v0
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.u0
            java.lang.Object r7 = r5.t0
            java.lang.Long r7 = (java.lang.Long) r7
            rdb r11 = r5.s0
            pdb r12 = r5.Z
            e52 r13 = r5.Y
            uj3 r14 = r5.X
            vkb r15 = r5.o
            defpackage.od2.a0(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00e3
        L_0x0082:
            defpackage.od2.a0(r4)
            kl7 r4 = defpackage.j1e.l()
            je7 r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            u7b r7 = (defpackage.u7b) r7
            long r11 = r32.n()
            r7b r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00a9
            r11 = 20
            if (r7 == r11) goto L_0x00a9
            r11 = 40
            if (r7 == r11) goto L_0x00a9
            r7 = r9
            goto L_0x00aa
        L_0x00a9:
            r7 = r10
        L_0x00aa:
            kk0 r11 = defpackage.kk0.c
            java.lang.String r11 = r1.p(r11)
            if (r11 != 0) goto L_0x00b4
            java.lang.String r11 = ""
        L_0x00b4:
            r5.o = r0
            r5.X = r1
            r5.Y = r2
            r12 = r34
            r5.Z = r12
            r13 = r35
            r5.s0 = r13
            r5.t0 = r3
            r5.u0 = r4
            r5.v0 = r4
            r5.w0 = r11
            r5.x0 = r7
            r5.A0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00d5
            return r6
        L_0x00d5:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00e3:
            jqe r1 = (defpackage.jqe) r1
            boolean r10 = r13.s()
            r5.o = r15
            r5.X = r14
            r5.Y = r13
            r5.Z = r12
            r5.s0 = r11
            r5.t0 = r7
            r5.u0 = r4
            r5.v0 = r2
            r5.w0 = r1
            r5.x0 = r0
            r5.A0 = r8
            java.lang.Boolean r3 = r15.h(r3, r10, r13)
            if (r3 != r6) goto L_0x0106
            return r6
        L_0x0106:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x0111:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0121
            odb r10 = r8.l
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x0121
            r10 = 1
            goto L_0x0122
        L_0x0121:
            r10 = r9
        L_0x0122:
            if (r0 == 0) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = r9
        L_0x0127:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            e(r3, r8, r9)
            x6 r0 = new x6
            int r1 = defpackage.sea.O
            vfd r2 = new vfd
            long r14 = defpackage.tea.d
            int r13 = defpackage.vea.c1
            eqe r9 = new eqe
            r9.<init>(r13)
            odb r13 = r8.i
            r31 = r6
            boolean r6 = r13.b
            jfd r27 = defpackage.jfd.o
            jfd r28 = defpackage.jfd.b
            r32 = r7
            if (r6 == 0) goto L_0x015c
            r18 = r28
            goto L_0x015e
        L_0x015c:
            r18 = r27
        L_0x015e:
            ffd r7 = new ffd
            boolean r13 = r13.a
            r7.<init>(r13, r6)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r13 = r2
            r17 = r9
            r21 = r7
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            x6 r0 = new x6
            int r1 = defpackage.sea.P
            vfd r2 = new vfd
            long r14 = defpackage.tea.h
            int r6 = defpackage.vea.i1
            eqe r7 = new eqe
            r7.<init>(r6)
            odb r6 = r8.j
            boolean r9 = r6.b
            if (r9 == 0) goto L_0x019e
            r18 = r28
            goto L_0x01a0
        L_0x019e:
            r18 = r27
        L_0x01a0:
            ffd r13 = new ffd
            boolean r6 = r6.a
            r13.<init>(r6, r9)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r7
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            r0 = 0
            r5.f(r3, r8, r0, r10)
            boolean r1 = r12.Y
            if (r1 != 0) goto L_0x01dd
            long r5 = r12.n()
            boolean r2 = r11.Y(r5)
            if (r2 != 0) goto L_0x01dd
            r2 = 1
            goto L_0x01de
        L_0x01dd:
            r2 = r0
        L_0x01de:
            d(r3, r8, r2)
            if (r4 == 0) goto L_0x01f1
            if (r1 != 0) goto L_0x01f1
            long r1 = r12.n()
            boolean r1 = r11.Y(r1)
            if (r1 != 0) goto L_0x01f1
            r9 = 1
            goto L_0x01f2
        L_0x01f1:
            r9 = r0
        L_0x01f2:
            boolean r0 = r11.d0()
            r11 = r32
            g(r3, r9, r0, r11)
            kl7 r0 = defpackage.j1e.d(r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.b(uj3, e52, pdb, rdb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(List list, pdb pdb, boolean z, boolean z2) {
        List list2 = list;
        pdb pdb2 = pdb;
        int i = sea.N;
        long j = tea.f;
        eqe eqe = new eqe(z ? vea.s1 : vea.b1);
        odb odb = pdb2.l;
        boolean z3 = odb.b;
        jfd jfd = jfd.o;
        jfd jfd2 = jfd.b;
        odb odb2 = odb;
        vfd vfd = r4;
        vfd vfd2 = new vfd(j, 0, eqe, z3 ? jfd2 : jfd, (jqe) null, (Integer) null, new ffd(odb.a, z3), (zed) null, (jqe) null, 0, (wed) null, 1968);
        je7 je7 = this.d;
        list2.add(new x6(i, vfd, (!((se5) ((qe5) je7.getValue())).p() || z) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 536871936));
        if (((se5) ((qe5) je7.getValue())).p() && !z) {
            list2.add(new x6(sea.M, new vfd(tea.e, 0, new eqe(vea.a1), odb2.b ? jfd2 : jfd, (jqe) null, (Integer) null, new ffd(pdb2.f, z2), (zed) null, (jqe) null, 0, (wed) null, 1936), -2147482624));
        }
    }

    public final Boolean h(Long l, boolean z, e52 e52) {
        return Boolean.valueOf((l != null && l.longValue() == ((hyc) ((q33) this.e.getValue())).t() && z) || e52.d0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Long r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tkb
            if (r0 == 0) goto L_0x0013
            r0 = r9
            tkb r0 = (defpackage.tkb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            tkb r0 = new tkb
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            defpackage.od2.a0(r9)
            goto L_0x0064
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0030:
            defpackage.od2.a0(r9)
            if (r8 == 0) goto L_0x007d
            long r8 = r8.longValue()
            je7 r2 = r7.e
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r5 = r2.t()
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            int r7 = defpackage.vea.f1
            eqe r3 = new eqe
            r3.<init>(r7)
            goto L_0x007d
        L_0x0053:
            je7 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            ds3 r7 = (defpackage.ds3) r7
            r0.Y = r4
            java.lang.Comparable r9 = r7.b(r8, r0)
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x0064:
            uj3 r9 = (defpackage.uj3) r9
            if (r9 == 0) goto L_0x007d
            java.lang.String r7 = r9.d()
            if (r7 == 0) goto L_0x007d
            int r8 = defpackage.vea.e1
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            gqe r3 = new gqe
            java.util.List r7 = defpackage.ys.m0(r7)
            r3.<init>(r8, r7)
        L_0x007d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.i(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Long r5, defpackage.uj3 r6, defpackage.e52 r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ukb
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ukb r0 = (defpackage.ukb) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            ukb r0 = new ukb
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            e52 r7 = r0.Y
            uj3 r6 = r0.X
            vkb r4 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.od2.a0(r8)
            r0.o = r4
            r0.X = r6
            r0.Y = r7
            r0.t0 = r3
            java.lang.Object r8 = r4.i(r5, r0)
            if (r8 != r1) goto L_0x0047
            return r1
        L_0x0047:
            jqe r8 = (defpackage.jqe) r8
            boolean r5 = r6.Y
            if (r5 == 0) goto L_0x0055
            int r4 = defpackage.vea.g1
            eqe r8 = new eqe
            r8.<init>(r4)
            goto L_0x0082
        L_0x0055:
            long r0 = r6.n()
            boolean r5 = r7.Y(r0)
            if (r5 == 0) goto L_0x0067
            int r4 = defpackage.vea.d1
            eqe r8 = new eqe
            r8.<init>(r4)
            goto L_0x0082
        L_0x0067:
            if (r8 != 0) goto L_0x0082
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            y7b r4 = (defpackage.y7b) r4
            je7 r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            w7b r4 = (defpackage.w7b) r4
            java.lang.CharSequence r4 = r4.b(r6)
            iqe r8 = new iqe
            r8.<init>(r4)
        L_0x0082:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.j(java.lang.Long, uj3, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
