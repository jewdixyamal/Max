package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nw  reason: default package */
public final class nw extends ffe implements a66 {
    public e52 X;
    public bx Y;
    public Iterator Z;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ bx x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nw(bx bxVar, Continuation continuation) {
        super(2, continuation);
        this.x0 = bxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nw) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nw nwVar = new nw(this.x0, continuation);
        nwVar.w0 = obj;
        return nwVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: tx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0181 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0182 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.v0
            e5f r4 = defpackage.e5f.a
            r5 = 3
            r6 = 2
            bx r8 = r0.x0
            if (r3 == 0) goto L_0x004a
            if (r3 == r1) goto L_0x003a
            if (r3 == r6) goto L_0x0022
            if (r3 != r5) goto L_0x001a
            defpackage.od2.a0(r23)
            goto L_0x0182
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            int r3 = r0.u0
            int r9 = r0.t0
            int r10 = r0.s0
            java.util.Iterator r11 = r0.Z
            bx r12 = r0.Y
            e52 r13 = r0.X
            java.lang.Object r14 = r0.w0
            java.util.List r14 = (java.util.List) r14
            defpackage.od2.a0(r23)
            r15 = r14
            r14 = r3
            r3 = r13
            goto L_0x012f
        L_0x003a:
            int r3 = r0.t0
            int r9 = r0.s0
            java.lang.Object r10 = r0.w0
            java.util.List r10 = (java.util.List) r10
            defpackage.od2.a0(r23)
            r11 = r10
            r10 = r3
            r3 = r23
            goto L_0x0093
        L_0x004a:
            defpackage.od2.a0(r23)
            java.lang.Object r3 = r0.w0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = defpackage.x53.i0(r3)
            boolean r9 = r9 instanceof defpackage.uk6
            java.lang.Object r10 = defpackage.x53.q0(r3)
            boolean r10 = r10 instanceof defpackage.uk6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0078
            java.lang.Object r12 = r3.next()
            boolean r13 = r12 instanceof one.me.messages.list.loader.MessageModel
            if (r13 == 0) goto L_0x0066
            r11.add(r12)
            goto L_0x0066
        L_0x0078:
            bc7[] r3 = defpackage.bx.F
            je7 r3 = r8.p
            java.lang.Object r3 = r3.getValue()
            iy2 r3 = (defpackage.iy2) r3
            r0.w0 = r11
            r0.s0 = r9
            r0.t0 = r10
            r0.v0 = r1
            long r12 = r8.a
            java.lang.Object r3 = r3.d(r12, r0)
            if (r3 != r2) goto L_0x0093
            return r2
        L_0x0093:
            e52 r3 = (defpackage.e52) r3
            java.util.Iterator r12 = r11.iterator()
            r15 = r11
            r11 = r12
            r14 = 0
            r12 = r8
            r21 = r10
            r10 = r9
            r9 = r21
        L_0x00a2:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x015b
            java.lang.Object r13 = r11.next()
            int r5 = r14 + 1
            if (r14 < 0) goto L_0x0156
            one.me.messages.list.loader.MessageModel r13 = (one.me.messages.list.loader.MessageModel) r13
            m9a r13 = r12.h
            r0.w0 = r15
            r0.X = r3
            r0.Y = r12
            r0.Z = r11
            r0.s0 = r10
            r0.t0 = r9
            r0.u0 = r5
            r0.v0 = r6
            r13.getClass()
            java.lang.Object r16 = defpackage.x53.j0(r14, r15)
            r1 = r16
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.String r6 = r13.a
            if (r1 == 0) goto L_0x0134
            pw8 r7 = r1.y0
            if (r7 == 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            tc9 r7 = r1.z0
            if (r7 == 0) goto L_0x00e3
        L_0x00dc:
            r19 = r11
            r20 = r12
        L_0x00e0:
            r23 = r15
            goto L_0x0125
        L_0x00e3:
            je7 r7 = r13.d
            java.lang.Object r7 = r7.getValue()
            t6b r7 = (defpackage.t6b) r7
            java.util.concurrent.ConcurrentHashMap r7 = r7.c
            r19 = r11
            r20 = r12
            long r11 = r1.a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r7 = r7.get(r11)
            r18 = r7
            u6b r18 = (defpackage.u6b) r18
            if (r18 != 0) goto L_0x0108
            java.lang.String r7 = "Trying to update message with non-existed preProcessedData!"
            r11 = 0
            defpackage.hm9.p(r6, r7, r11)
            goto L_0x00e0
        L_0x0108:
            yy7 r6 = new yy7
            r6.<init>()
            h9a r7 = new h9a
            r11 = r13
            r13 = r7
            r12 = r14
            r14 = r3
            r23 = r15
            r15 = r12
            r16 = r1
            r17 = r23
            r13.<init>(r14, r15, r16, r17, r18)
            zy7 r1 = r6.a(r7)
            java.lang.Object r1 = r11.e(r1, r0)
        L_0x0125:
            if (r1 != r2) goto L_0x0128
            return r2
        L_0x0128:
            r15 = r23
            r14 = r5
            r11 = r19
            r12 = r20
        L_0x012f:
            r1 = 1
            r5 = 3
            r6 = 2
            goto L_0x00a2
        L_0x0134:
            r12 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to update message with index="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = " which not exists!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            defpackage.hm9.p(r6, r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0156:
            r1 = 0
            defpackage.y53.R()
            throw r1
        L_0x015b:
            r23 = r15
            r1 = 0
            q0e r3 = r8.A
            l29 r5 = new l29
            if (r9 == 0) goto L_0x0166
            r6 = 1
            goto L_0x0167
        L_0x0166:
            r6 = 0
        L_0x0167:
            r15 = r23
            if (r10 == 0) goto L_0x016d
            r7 = 1
            goto L_0x016e
        L_0x016d:
            r7 = 0
        L_0x016e:
            r5.<init>(r15, r6, r7)
            r0.w0 = r1
            r0.X = r1
            r0.Y = r1
            r0.Z = r1
            r6 = 3
            r0.v0 = r6
            r3.m(r1, r5)
            if (r4 != r2) goto L_0x0182
            return r2
        L_0x0182:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.o(java.lang.Object):java.lang.Object");
    }
}
