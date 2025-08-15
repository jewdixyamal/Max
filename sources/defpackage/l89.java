package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l89  reason: default package */
public final class l89 {
    public static final /* synthetic */ bc7[] p;
    public final v69 a;
    public final nx3 b;
    public final sx3 c;
    public final j0e d;
    public final j0e e;
    public final a66 f;
    public final m56 g;
    public final jc6 h;
    public final String i = l89.class.getName();
    public final je7 j;
    public final w4d k;
    public final AtomicReference l;
    public final q0e m;
    public final mn5 n;
    public final wwc o;

    static {
        oi9 oi9 = new oi9(l89.class, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        p = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, jc6] */
    public l89(v69 v69, nx3 nx3, sx3 sx3, j0e j0e, j0e j0e2, vw vwVar, wz7 wz7) {
        o19 o19 = o19.a;
        khe d2 = o19.getAccessor().d(ome.class);
        khe d3 = o19.getAccessor().d(iy2.class);
        Class<r79> cls = r79.class;
        khe d4 = o19.getAccessor().d(cls);
        ? obj = new Object();
        obj.a = (kke) o19.getAccessor().c(kke.class);
        obj.b = jc6.class.getName();
        obj.c = d2;
        obj.o = d3;
        obj.X = d4;
        khe d5 = o19.getAccessor().d(cls);
        this.a = v69;
        this.b = nx3;
        this.c = sx3;
        this.d = j0e;
        this.e = j0e2;
        this.f = vwVar;
        this.g = wz7;
        this.h = obj;
        this.j = d5;
        this.k = mqd.D();
        this.l = new AtomicReference((Object) null);
        q0e a2 = r0e.a(bxc.e);
        this.m = a2;
        this.n = od2.u(new w7c(a2), 60);
        this.o = new wwc();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.l89 r10, long r11, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof defpackage.a89
            if (r0 == 0) goto L_0x0013
            r0 = r13
            a89 r0 = (defpackage.a89) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            a89 r0 = new a89
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            long r11 = r0.X
            l89 r10 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x0091
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            defpackage.od2.a0(r13)
            j0e r13 = r10.e
            java.lang.Object r13 = r13.getValue()
            l29 r13 = (defpackage.l29) r13
            one.me.messages.list.loader.MessageModel r13 = r13.d(r11)
            java.lang.String r2 = r10.i
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0065
            us7 r7 = defpackage.us7.X
            if (r13 == 0) goto L_0x005b
            java.lang.String r8 = r13.m()
            goto L_0x005c
        L_0x005b:
            r8 = r4
        L_0x005c:
            java.lang.String r9 = "loadIfNeedAndScrollToMessage="
            java.lang.String r8 = defpackage.wg0.i(r9, r8)
            r6.d(r7, r2, r8, r4)
        L_0x0065:
            if (r13 == 0) goto L_0x007c
            java.util.concurrent.atomic.AtomicReference r11 = r10.l
            oe2 r12 = new oe2
            r0 = 7
            r12.<init>(r0)
            r11.updateAndGet(r12)
            wwc r10 = r10.o
            long r11 = r13.c
            r13 = 0
            r0 = 6
            defpackage.wwc.j(r10, r11, r13, r0)
            goto L_0x00ad
        L_0x007c:
            je7 r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            r79 r13 = (defpackage.r79) r13
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r13 = r13.a(r11, r0)
            if (r13 != r1) goto L_0x0091
            goto L_0x00c9
        L_0x0091:
            cu8 r13 = (defpackage.cu8) r13
            if (r13 != 0) goto L_0x00af
            java.lang.String r10 = r10.i
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x00ad
            us7 r0 = defpackage.us7.s0
            java.lang.String r1 = "Trying to scroll for non-existing messageId="
            java.lang.String r11 = defpackage.ey8.h(r11, r1)
            r13.d(r0, r10, r11, r4)
        L_0x00ad:
            r1 = r3
            goto L_0x00c9
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference r0 = r10.l
            v79 r1 = new v79
            r2 = 0
            r1.<init>(r11, r2)
            r0.updateAndGet(r1)
            m56 r10 = r10.g
            long r11 = r13.k()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r10.invoke(r13)
            goto L_0x00ad
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.a(l89, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r12 >= 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (((defpackage.l29) r0.e.getValue()).f(r7) >= 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(defpackage.l89 r16, long r17, long r19, boolean r21, int r22, int r23) {
        /*
            r0 = r16
            r7 = r17
            r1 = r23 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r4 = r2
            goto L_0x000e
        L_0x000c:
            r4 = r19
        L_0x000e:
            r1 = r23 & 4
            r6 = 0
            if (r1 == 0) goto L_0x0015
            r9 = r6
            goto L_0x0017
        L_0x0015:
            r9 = r21
        L_0x0017:
            r1 = r23 & 8
            r10 = 4
            if (r1 == 0) goto L_0x001e
            r11 = r10
            goto L_0x0020
        L_0x001e:
            r11 = r22
        L_0x0020:
            r1 = 1
            if (r11 != r1) goto L_0x003a
            j0e r12 = r0.e
            java.lang.Object r12 = r12.getValue()
            l29 r12 = (defpackage.l29) r12
            int r12 = r12.f(r7)
            if (r12 >= 0) goto L_0x0036
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 - r1
        L_0x0036:
            if (r12 < 0) goto L_0x0049
        L_0x0038:
            r6 = r1
            goto L_0x0049
        L_0x003a:
            j0e r12 = r0.e
            java.lang.Object r12 = r12.getValue()
            l29 r12 = (defpackage.l29) r12
            int r12 = r12.f(r7)
            if (r12 < 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            java.lang.String r1 = r0.i
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x0050
            goto L_0x007a
        L_0x0050:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x007a
            us7 r13 = defpackage.us7.X
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "loadIfNeedAndScrollToMessageByTime: is message with time="
            r14.<init>(r15)
            r14.append(r7)
            java.lang.String r15 = " loaded="
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = ", lastMsgTime:"
            r14.append(r15)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            r15 = 0
            r12.d(r13, r1, r14, r15)
        L_0x007a:
            if (r6 == 0) goto L_0x00cc
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0091
            java.util.concurrent.atomic.AtomicReference r1 = r0.l
            oe2 r2 = new oe2
            r3 = 7
            r2.<init>(r3)
            r1.updateAndGet(r2)
            wwc r0 = r0.o
            defpackage.wwc.j(r0, r7, r9, r10)
            goto L_0x00e6
        L_0x0091:
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bb
            java.util.concurrent.atomic.AtomicReference r10 = r0.l
            w79 r12 = new w79
            r5 = 0
            r1 = r12
            r2 = r17
            r4 = r11
            r6 = r9
            r1.<init>(r2, r4, r5, r6)
            r10.updateAndGet(r12)
            j0e r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            e52 r1 = (defpackage.e52) r1
            if (r1 == 0) goto L_0x00e6
            j0e r2 = r0.e
            java.lang.Object r2 = r2.getValue()
            l29 r2 = (defpackage.l29) r2
            r0.b(r2, r1)
            goto L_0x00e6
        L_0x00bb:
            java.util.concurrent.atomic.AtomicReference r1 = r0.l
            oe2 r2 = new oe2
            r3 = 7
            r2.<init>(r3)
            r1.updateAndGet(r2)
            wwc r0 = r0.o
            defpackage.wwc.j(r0, r4, r9, r10)
            goto L_0x00e6
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReference r10 = r0.l
            w79 r12 = new w79
            r5 = 1
            r1 = r12
            r2 = r17
            r4 = r11
            r6 = r9
            r1.<init>(r2, r4, r5, r6)
            r10.updateAndGet(r12)
            m56 r0 = r0.g
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r7)
            r0.invoke(r1)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.d(l89, long, long, boolean, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.l29 r27, defpackage.e52 r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            java.util.concurrent.atomic.AtomicReference r2 = r0.l
            java.lang.Object r2 = r2.get()
            y79 r2 = (defpackage.y79) r2
            if (r2 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r3 = r0.i
            ir6 r4 = defpackage.hm9.m
            r5 = 0
            java.lang.String r6 = "Process scroll work: "
            if (r4 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            boolean r7 = r4.c()
            if (r7 == 0) goto L_0x0030
            us7 r7 = defpackage.us7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r4.d(r7, r3, r8, r5)
        L_0x0030:
            long r3 = r2.e
            long r7 = r2.f
            r9 = r27
            java.util.List r9 = r9.a
            r10 = 0
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r13 = 1
            java.lang.String r14 = ", finished"
            r15 = 2
            r16 = 0
            if (r12 == 0) goto L_0x00ce
            int r1 = r9.size()
            r7 = r16
        L_0x004a:
            if (r7 >= r1) goto L_0x0067
            java.lang.Object r8 = r9.get(r7)
            one.me.messages.list.loader.MessageModel r8 = (one.me.messages.list.loader.MessageModel) r8
            r17 = r6
            long r5 = r8.a
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0061
            long r3 = r8.c
            r19 = r3
            r25 = r7
            goto L_0x006e
        L_0x0061:
            int r7 = r7 + 1
            r6 = r17
            r5 = 0
            goto L_0x004a
        L_0x0067:
            r17 = r6
            r7 = -1
            r25 = r7
            r19 = r10
        L_0x006e:
            int r1 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            int r1 = r2.a
            if (r1 == r15) goto L_0x007d
            r3 = 3
            if (r1 != r3) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r23 = r16
            goto L_0x007f
        L_0x007d:
            r23 = r13
        L_0x007f:
            wwc r1 = r0.o
            boolean r3 = r2.b
            boolean r4 = r2.c
            r22 = r4 ^ 1
            r1.getClass()
            twc r4 = new twc
            r21 = 0
            r18 = r4
            r24 = r3
            r18.<init>(r19, r21, r22, r23, r24, r25)
            java.lang.Object r1 = r1.b
            ti9 r1 = (defpackage.ti9) r1
            r1.setValue(r4)
            java.util.concurrent.atomic.AtomicReference r1 = r0.l
            oe2 r3 = new oe2
            r4 = 7
            r3.<init>(r4)
            r1.updateAndGet(r3)
            java.lang.String r0 = r0.i
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x00af
            goto L_0x0190
        L_0x00af:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0190
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r17
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r14)
            java.lang.String r2 = r4.toString()
            r4 = 0
            r1.d(r3, r0, r2, r4)
            goto L_0x0190
        L_0x00ce:
            r5 = r6
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0190
            int r3 = r2.a
            if (r3 != r13) goto L_0x0105
            k92 r3 = r1.b
            int r3 = r3.m
            if (r3 <= 0) goto L_0x0105
            java.util.Iterator r3 = r9.iterator()
        L_0x00e1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r3.next()
            r6 = r4
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            long r12 = r6.c
            int r6 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            goto L_0x00f8
        L_0x00f5:
            r13 = 1
            goto L_0x00e1
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            if (r4 == 0) goto L_0x0103
            long r3 = r4.c
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            goto L_0x0128
        L_0x0103:
            r4 = 0
            goto L_0x0128
        L_0x0105:
            java.util.Iterator r3 = r9.iterator()
        L_0x0109:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011d
            java.lang.Object r4 = r3.next()
            r6 = r4
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            long r12 = r6.c
            int r6 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0109
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            if (r4 == 0) goto L_0x0103
            long r3 = r4.c
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L_0x0128:
            if (r4 == 0) goto L_0x0190
            long r6 = r4.longValue()
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0190
            int r3 = r2.a
            if (r3 != r15) goto L_0x013c
            k92 r1 = r1.b
            int r1 = r1.m
            if (r1 > 0) goto L_0x0140
        L_0x013c:
            boolean r1 = r2.d
            if (r1 == 0) goto L_0x0142
        L_0x0140:
            r11 = 1
            goto L_0x0144
        L_0x0142:
            r11 = r16
        L_0x0144:
            wwc r1 = r0.o
            long r7 = r4.longValue()
            boolean r12 = r2.b
            boolean r3 = r2.c
            r4 = 1
            r10 = r3 ^ 1
            r1.getClass()
            twc r3 = new twc
            r9 = 0
            r13 = -1
            r6 = r3
            r6.<init>(r7, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r1.b
            ti9 r1 = (defpackage.ti9) r1
            r1.setValue(r3)
            java.util.concurrent.atomic.AtomicReference r1 = r0.l
            oe2 r3 = new oe2
            r4 = 7
            r3.<init>(r4)
            r1.updateAndGet(r3)
            java.lang.String r0 = r0.i
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0175
            goto L_0x0190
        L_0x0175:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0190
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r14)
            java.lang.String r2 = r4.toString()
            r4 = 0
            r1.d(r3, r0, r2, r4)
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.b(l29, e52):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.e52 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.z79
            if (r0 == 0) goto L_0x0013
            r0 = r12
            z79 r0 = (defpackage.z79) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            z79 r0 = new z79
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            e52 r11 = r0.X
            l89 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x005b
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            defpackage.od2.a0(r12)
            v69 r12 = r10.a
            long r6 = r12.c
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00d5
            je7 r12 = r10.j
            java.lang.Object r12 = r12.getValue()
            r79 r12 = (defpackage.r79) r12
            v69 r2 = r10.a
            long r6 = r2.c
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r12 = r12.a(r6, r0)
            if (r12 != r1) goto L_0x005b
            return r1
        L_0x005b:
            cu8 r12 = (defpackage.cu8) r12
            if (r12 != 0) goto L_0x00a9
            x79 r12 = new x79
            long r0 = defpackage.fm9.B(r11)
            r12.<init>(r0, r3)
            java.lang.String r11 = r10.i
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0070
            goto L_0x012c
        L_0x0070:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x012c
            us7 r3 = defpackage.us7.X
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            java.lang.String r0 = defpackage.nu0.G(r5)
            v69 r10 = r10.a
            long r5 = r10.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "getMessageAnchor: Fallback on chatReadMark="
            r10.<init>(r1)
            r10.append(r0)
            java.lang.String r0 = " \n                                    |cause of loadMessageId="
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = " doesn't exists"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = defpackage.x9e.c0(r10)
            r2.d(r3, r11, r10, r4)
            goto L_0x012c
        L_0x00a9:
            x79 r11 = new x79
            long r0 = r12.k()
            r11.<init>(r0, r3)
            java.lang.String r10 = r10.i
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x00b9
            goto L_0x00d3
        L_0x00b9:
            boolean r2 = r12.c()
            if (r2 == 0) goto L_0x00d3
            us7 r2 = defpackage.us7.X
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r0 = defpackage.nu0.G(r3)
            java.lang.String r1 = "getMessageAnchor: loadMessageIdMark="
            java.lang.String r0 = defpackage.wg0.i(r1, r0)
            r12.d(r2, r10, r0, r4)
        L_0x00d3:
            r12 = r11
            goto L_0x012c
        L_0x00d5:
            long r0 = r12.b
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0102
            x79 r12 = new x79
            r12.<init>(r0, r3)
            java.lang.String r10 = r10.i
            ir6 r11 = defpackage.hm9.m
            if (r11 != 0) goto L_0x00e7
            goto L_0x012c
        L_0x00e7:
            boolean r2 = r11.c()
            if (r2 == 0) goto L_0x012c
            us7 r2 = defpackage.us7.X
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r0 = defpackage.nu0.G(r3)
            java.lang.String r1 = "getMessageAnchor: loadMark="
            java.lang.String r0 = defpackage.wg0.i(r1, r0)
            r11.d(r2, r10, r0, r4)
            goto L_0x012c
        L_0x0102:
            x79 r12 = new x79
            long r0 = defpackage.fm9.B(r11)
            r12.<init>(r0, r5)
            java.lang.String r10 = r10.i
            ir6 r11 = defpackage.hm9.m
            if (r11 != 0) goto L_0x0112
            goto L_0x012c
        L_0x0112:
            boolean r2 = r11.c()
            if (r2 == 0) goto L_0x012c
            us7 r2 = defpackage.us7.X
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r0 = defpackage.nu0.G(r3)
            java.lang.String r1 = "getMessageAnchor: chatReadMark="
            java.lang.String r0 = defpackage.wg0.i(r1, r0)
            r11.d(r2, r10, r0, r4)
        L_0x012c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.c(e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.e52 r13, defpackage.l29 r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.j89
            if (r0 == 0) goto L_0x0013
            r0 = r15
            j89 r0 = (defpackage.j89) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            j89 r0 = new j89
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            l29 r14 = r0.Y
            e52 r13 = r0.X
            l89 r12 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x00c4
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            defpackage.od2.a0(r15)
            java.util.List r15 = r14.a
            int r15 = r15.size()
            r0.o = r12
            r0.X = r13
            r0.Y = r14
            r0.t0 = r4
            q0e r0 = r12.m
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            bxc r5 = (defpackage.bxc) r5
            k92 r2 = r13.b
            int r6 = r2.m
            boolean r8 = r13.B()
            q0e r2 = r12.m
            java.lang.Object r2 = r2.getValue()
            bxc r2 = (defpackage.bxc) r2
            boolean r7 = r2.b
            r9 = 0
            r10 = 8
            bxc r2 = defpackage.bxc.a(r5, r6, r7, r8, r9, r10)
            r5 = 0
            r0.m(r5, r2)
            java.lang.String r0 = r12.i
            ir6 r2 = defpackage.hm9.m
            r6 = 0
            if (r2 != 0) goto L_0x0077
            goto L_0x00a3
        L_0x0077:
            boolean r7 = r2.c()
            if (r7 == 0) goto L_0x00a3
            us7 r7 = defpackage.us7.X
            q0e r8 = r12.m
            java.lang.Object r8 = r8.getValue()
            if (r15 == 0) goto L_0x0089
            r9 = r4
            goto L_0x008a
        L_0x0089:
            r9 = r6
        L_0x008a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Update scroll btn, state="
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = ", hasMessages:"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r2.d(r7, r0, r8, r5)
        L_0x00a3:
            k92 r0 = r13.b
            java.lang.String r0 = r0.m0
            if (r0 == 0) goto L_0x00af
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b0
        L_0x00af:
            r6 = r4
        L_0x00b0:
            r0 = r6 ^ 1
            if (r0 == 0) goto L_0x00c1
            if (r15 == 0) goto L_0x00c1
            sx3 r15 = r12.c
            k89 r0 = new k89
            r0.<init>(r13, r12, r5)
            r2 = 3
            defpackage.j47.T(r15, r5, r5, r0, r2)
        L_0x00c1:
            if (r3 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r12.b(r14, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.e(e52, l29, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(vxd vxd) {
        this.k.o1(this, p[0], vxd);
    }
}
