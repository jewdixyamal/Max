package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* renamed from: pu2  reason: default package */
public final class pu2 implements jl6 {
    public final ContextScope A0;
    public final q40 B0;
    public final tm3 X;
    public final a Y;
    public final je7 Z;
    public final nl6 a;
    public final kke b;
    public final ox3 c;
    public final ci0 o;
    public final je7 s0;
    public final je7 t0;
    public final AtomicBoolean u0 = new AtomicBoolean(true);
    public final AtomicBoolean v0 = new AtomicBoolean(false);
    public final dx3 w0 = new dx3();
    public final q0e x0 = r0e.a(mt2.c);
    public final nu2 y0 = new nu2(this);
    public final String z0;

    public pu2(String str, khe khe, nl6 nl6, khe khe2, kke kke, ox3 ox3, et5 et5, tm3 tm3, a aVar, je7 je7) {
        this.a = nl6;
        this.b = kke;
        this.c = ox3;
        this.o = et5;
        this.X = tm3;
        this.Y = aVar;
        this.Z = khe;
        this.s0 = khe2;
        this.t0 = je7;
        String concat = pu2.class.getName().concat(str.replace('.', '_'));
        this.z0 = concat;
        ContextScope a2 = j1e.a(((w9a) kke).a().plus(ox3));
        this.A0 = a2;
        q40 q40 = new q40(a2, "chats-list-job-executor#".concat(str), new ai0(7));
        this.B0 = q40;
        hm9.m(concat, "init " + this, new Object[0]);
        od2.L(new zn5((kld) q40.o, new q87(q40, new xt2(this, (Continuation) null), (Continuation) null), 5), a2);
    }

    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.List, xs] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e A[LOOP:2: B:45:0x0138->B:47:0x013e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0202 A[LOOP:5: B:75:0x01fc->B:77:0x0202, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.pu2 r16, defpackage.gt2 r17, kotlin.coroutines.Continuation r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 1
            r16.getClass()
            boolean r4 = r2 instanceof defpackage.yt2
            if (r4 == 0) goto L_0x001d
            r4 = r2
            yt2 r4 = (defpackage.yt2) r4
            int r5 = r4.u0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r4.u0 = r5
            goto L_0x0022
        L_0x001d:
            yt2 r4 = new yt2
            r4.<init>(r0, r2)
        L_0x0022:
            java.lang.Object r2 = r4.s0
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.u0
            e5f r7 = defpackage.e5f.a
            r8 = 0
            r9 = 0
            r10 = 3
            r11 = 2
            if (r6 == 0) goto L_0x0061
            if (r6 == r3) goto L_0x005d
            if (r6 == r11) goto L_0x0049
            if (r6 != r10) goto L_0x0041
            java.lang.Object r0 = r4.X
            xs r0 = (defpackage.xs) r0
            pu2 r1 = r4.o
            defpackage.od2.a0(r2)
            goto L_0x02fb
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            xs r0 = r4.Z
            java.util.List r1 = r4.Y
            java.lang.Object r6 = r4.X
            gt2 r6 = (defpackage.gt2) r6
            pu2 r11 = r4.o
            defpackage.od2.a0(r2)
            r10 = r2
            r2 = r1
            r1 = r6
            r6 = r0
            r0 = r11
            goto L_0x00e4
        L_0x005d:
            defpackage.od2.a0(r2)
            goto L_0x00a5
        L_0x0061:
            defpackage.od2.a0(r2)
            java.lang.String r2 = r0.z0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            boolean r12 = r6.c()
            if (r12 == 0) goto L_0x008b
            us7 r12 = defpackage.us7.X
            java.util.Set r13 = r1.c
            int r13 = r13.size()
            nl6 r14 = r0.a
            dx3 r14 = r14.h
            java.lang.Object[] r14 = r14.b
            int r14 = r14.length
            java.lang.String r15 = "handleChatsUpdate start "
            java.lang.String r10 = ", history = "
            java.lang.String r10 = defpackage.rh4.h(r15, r13, r14, r10)
            r6.d(r12, r2, r10, r9)
        L_0x008b:
            q0e r2 = r0.x0
            java.lang.Object r2 = r2.getValue()
            mt2 r2 = (defpackage.mt2) r2
            java.util.List r2 = r2.a
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00a8
            r4.u0 = r3
            java.lang.Object r0 = r0.d(r4)
            if (r0 != r5) goto L_0x00a5
            goto L_0x032d
        L_0x00a5:
            r5 = r7
            goto L_0x032d
        L_0x00a8:
            xs r6 = new xs
            r6.<init>((int) r8)
            java.util.Iterator r10 = r2.iterator()
        L_0x00b1:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00c8
            java.lang.Object r12 = r10.next()
            nl2 r12 = (defpackage.nl2) r12
            long r12 = r12.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            r6.add(r14)
            goto L_0x00b1
        L_0x00c8:
            java.util.Set r10 = r1.a
            je7 r12 = r0.s0
            java.lang.Object r12 = r12.getValue()
            ft2 r12 = (defpackage.ft2) r12
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r4.Z = r6
            r4.u0 = r11
            java.io.Serializable r10 = r12.a(r10, r4)
            if (r10 != r5) goto L_0x00e4
            goto L_0x032d
        L_0x00e4:
            java.util.List r10 = (java.util.List) r10
            java.lang.String r11 = r0.z0
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x00ed
            goto L_0x0105
        L_0x00ed:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x0105
            us7 r13 = defpackage.us7.X
            nl6 r14 = r0.a
            dx3 r14 = r14.h
            java.lang.Object[] r14 = r14.b
            int r14 = r14.length
            java.lang.String r15 = "handleChatsUpdate step 1; history = "
            java.lang.String r14 = defpackage.zr6.h(r14, r15)
            r12.d(r13, r11, r14, r9)
        L_0x0105:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r10.iterator()
        L_0x010e:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x012d
            java.lang.Object r13 = r12.next()
            r3 = r13
            nl2 r3 = (defpackage.nl2) r3
            r16 = r10
            long r9 = r3.B0
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0128
            r11.add(r13)
        L_0x0128:
            r10 = r16
            r3 = 1
            r9 = 0
            goto L_0x010e
        L_0x012d:
            r16 = r10
            xs r3 = new xs
            r3.<init>((int) r8)
            java.util.Iterator r9 = r11.iterator()
        L_0x0138:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x014f
            java.lang.Object r10 = r9.next()
            nl2 r10 = (defpackage.nl2) r10
            long r12 = r10.a
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r12)
            r3.add(r10)
            goto L_0x0138
        L_0x014f:
            java.util.Set r1 = r1.a
            java.util.Set r1 = defpackage.bcd.Y(r3, r1)
            r6.retainAll(r1)
            nl6 r1 = r0.a
            r1.c(r6)
            gi9 r1 = new gi9
            int r3 = r2.size()
            r1.<init>((int) r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x016a:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0182
            java.lang.Object r9 = r3.next()
            nl2 r9 = (defpackage.nl2) r9
            long r12 = r9.B0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x016a
            long r9 = r9.a
            r1.a(r9)
            goto L_0x016a
        L_0x0182:
            java.lang.String r3 = r0.z0
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x0189
            goto L_0x01a2
        L_0x0189:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x01a2
            us7 r10 = defpackage.us7.X
            nl6 r12 = r0.a
            dx3 r12 = r12.h
            java.lang.Object[] r12 = r12.b
            int r12 = r12.length
            java.lang.String r13 = "handleChatsUpdate step 2; history = "
            java.lang.String r12 = defpackage.zr6.h(r12, r13)
            r13 = 0
            r9.d(r10, r3, r12, r13)
        L_0x01a2:
            java.util.Iterator r3 = r11.iterator()
            r9 = r8
            r10 = r9
        L_0x01a8:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01d6
            java.lang.Object r11 = r3.next()
            nl2 r11 = (defpackage.nl2) r11
            long r12 = r11.a
            boolean r12 = r1.d(r12)
            if (r12 == 0) goto L_0x01c4
            r12 = 1
            int r10 = r10 + r12
            nl6 r13 = r0.a
            r13.r(r11)
            goto L_0x01d3
        L_0x01c4:
            r12 = 1
            long r14 = r11.a
            boolean r13 = r1.d(r14)
            if (r13 != 0) goto L_0x01d3
            int r9 = r9 + r12
            nl6 r12 = r0.a
            r12.b(r11)
        L_0x01d3:
            r14 = 0
            goto L_0x01a8
        L_0x01d6:
            java.lang.String r1 = r0.z0
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x01dd
            goto L_0x01f1
        L_0x01dd:
            boolean r11 = r3.c()
            if (r11 == 0) goto L_0x01f1
            us7 r11 = defpackage.us7.X
            java.lang.String r12 = "handleChatsUpdate step 3: insert="
            java.lang.String r13 = ", update="
            java.lang.String r9 = defpackage.rh4.h(r12, r9, r10, r13)
            r10 = 0
            r3.d(r11, r1, r9, r10)
        L_0x01f1:
            fi9 r1 = defpackage.rv7.a
            fi9 r1 = new fi9
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020e
            java.lang.Object r3 = r2.next()
            nl2 r3 = (defpackage.nl2) r3
            long r9 = r3.a
            r1.f(r9, r3)
            goto L_0x01fc
        L_0x020e:
            xs r2 = new xs
            r2.<init>((int) r8)
            boolean r3 = r6.isEmpty()
            r9 = 1
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x0252
            dx3 r3 = r0.w0
            boolean r9 = r3 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0228
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x0228
            goto L_0x0252
        L_0x0228:
            java.util.Iterator r3 = r3.iterator()
        L_0x022c:
            r9 = r3
            ax3 r9 = (defpackage.ax3) r9
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0252
            java.lang.Object r9 = r9.next()
            nl2 r9 = (defpackage.nl2) r9
            long r9 = r9.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            boolean r9 = r6.contains(r11)
            if (r9 == 0) goto L_0x022c
            r9 = 1
            int r8 = r8 + r9
            if (r8 < 0) goto L_0x024d
            goto L_0x022c
        L_0x024d:
            defpackage.y53.Q()
            r0 = 0
            throw r0
        L_0x0252:
            java.lang.String r3 = r0.z0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0259
            goto L_0x0272
        L_0x0259:
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x0272
            us7 r9 = defpackage.us7.X
            nl6 r10 = r0.a
            dx3 r10 = r10.h
            java.lang.Object[] r10 = r10.b
            int r10 = r10.length
            java.lang.String r11 = "handleChatsUpdate step 4 ; history = "
            java.lang.String r10 = defpackage.zr6.h(r10, r11)
            r11 = 0
            r6.d(r9, r3, r10, r11)
        L_0x0272:
            java.util.Iterator r3 = r16.iterator()
        L_0x0276:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02c4
            java.lang.Object r6 = r3.next()
            nl2 r6 = (defpackage.nl2) r6
            long r9 = r6.a
            java.lang.Object r9 = r1.d(r9)
            nl2 r9 = (defpackage.nl2) r9
            if (r9 != 0) goto L_0x0299
            long r10 = r6.B0
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0299
            r10 = 1
            int r8 = r8 + r10
        L_0x0296:
            r14 = 0
            goto L_0x0276
        L_0x0299:
            if (r9 == 0) goto L_0x0296
            long r10 = r9.B0
            long r12 = r6.B0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0296
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x02b0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x02b0
            r10 = 1
        L_0x02ae:
            int r8 = r8 + r10
            goto L_0x0276
        L_0x02b0:
            r10 = 1
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x02c1
            int r8 = r8 + r10
            long r11 = r9.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r11)
            r2.add(r6)
            goto L_0x0276
        L_0x02c1:
            if (r6 <= 0) goto L_0x0276
            goto L_0x02ae
        L_0x02c4:
            java.lang.String r1 = r0.z0
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x02cc
        L_0x02ca:
            r10 = 0
            goto L_0x02e5
        L_0x02cc:
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x02ca
            us7 r6 = defpackage.us7.X
            nl6 r9 = r0.a
            dx3 r9 = r9.h
            java.lang.Object[] r9 = r9.b
            int r9 = r9.length
            java.lang.String r10 = "handleChatsUpdate step 5; history = "
            java.lang.String r9 = defpackage.zr6.h(r9, r10)
            r10 = 0
            r3.d(r6, r1, r9, r10)
        L_0x02e5:
            if (r8 <= 0) goto L_0x02fd
            r4.o = r0
            r4.X = r2
            r4.Y = r10
            r4.Z = r10
            r1 = 3
            r4.u0 = r1
            java.lang.Object r1 = r0.g(r4)
            if (r1 != r5) goto L_0x02f9
            goto L_0x032d
        L_0x02f9:
            r1 = r0
            r0 = r2
        L_0x02fb:
            r2 = r0
            r0 = r1
        L_0x02fd:
            boolean r1 = r2.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x030a
            nl6 r1 = r0.a
            r1.c(r2)
        L_0x030a:
            java.lang.String r1 = r0.z0
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0312
            goto L_0x00a5
        L_0x0312:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00a5
            us7 r3 = defpackage.us7.X
            nl6 r0 = r0.a
            dx3 r0 = r0.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            java.lang.String r4 = "handleChatsUpdate finish; history = "
            java.lang.String r0 = defpackage.zr6.h(r0, r4)
            r4 = 0
            r2.d(r3, r1, r0, r4)
            goto L_0x00a5
        L_0x032d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.a(pu2, gt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [a66, ffe] */
    /* JADX WARNING: type inference failed for: r12v0, types: [jec, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.pu2 r16, defpackage.mm3 r17, kotlin.coroutines.Continuation r18) {
        /*
            r6 = r16
            r0 = r18
            r16.getClass()
            boolean r1 = r0 instanceof defpackage.au2
            if (r1 == 0) goto L_0x001b
            r1 = r0
            au2 r1 = (defpackage.au2) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001b
            int r2 = r2 - r3
            r1.s0 = r2
        L_0x0019:
            r7 = r1
            goto L_0x0021
        L_0x001b:
            au2 r1 = new au2
            r1.<init>(r6, r0)
            goto L_0x0019
        L_0x0021:
            java.lang.Object r0 = r7.Y
            tx3 r8 = defpackage.tx3.a
            int r1 = r7.s0
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r10) goto L_0x0036
            jec r1 = r7.X
            pu2 r2 = r7.o
            defpackage.od2.a0(r0)
            goto L_0x00ca
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.od2.a0(r0)
            java.lang.String r0 = r6.z0
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x004a
        L_0x0047:
            r11 = r17
            goto L_0x0065
        L_0x004a:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0047
            us7 r2 = defpackage.us7.X
            r11 = r17
            gi9 r3 = r11.a
            r4 = 31
            java.lang.String r3 = defpackage.gi9.k(r3, r9, r9, r4)
            java.lang.String r4 = "handleContactsUpdateEvent "
            java.lang.String r3 = r4.concat(r3)
            r1.d(r2, r0, r3, r9)
        L_0x0065:
            jec r12 = new jec
            r12.<init>()
            q0e r0 = r6.x0
            java.lang.Object r0 = r0.getValue()
            mt2 r0 = (defpackage.mt2) r0
            java.util.List r0 = r0.a
            kke r1 = r6.b
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            ox3 r2 = r6.c
            lx3 r1 = r1.plus(r2)
            if (r1 != 0) goto L_0x0086
            lx3 r1 = r7.b
        L_0x0086:
            kotlinx.coroutines.internal.ContextScope r13 = defpackage.j1e.a(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.z53.S(r0, r1)
            r14.<init>(r1)
            java.util.Iterator r15 = r0.iterator()
        L_0x0099:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r15.next()
            zt2 r5 = new zt2
            r2 = 0
            r0 = r5
            r3 = r16
            r4 = r12
            r10 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 3
            zf4 r0 = defpackage.j47.h(r13, r9, r10, r0)
            r14.add(r0)
            r10 = 1
            goto L_0x0099
        L_0x00ba:
            r7.o = r6
            r7.X = r12
            r0 = 1
            r7.s0 = r0
            java.lang.Object r0 = defpackage.pag.c(r14, r7)
            if (r0 != r8) goto L_0x00c8
            goto L_0x00ef
        L_0x00c8:
            r2 = r6
            r1 = r12
        L_0x00ca:
            java.lang.String r0 = r2.z0
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x00d1
            goto L_0x00de
        L_0x00d1:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00de
            us7 r4 = defpackage.us7.X
            java.lang.String r5 = "handleContactsUpdateEvent finish"
            r3.d(r4, r0, r5, r9)
        L_0x00de:
            boolean r0 = r1.a
            if (r0 == 0) goto L_0x00ed
            q40 r0 = r2.B0
            bu2 r1 = new bu2
            r2 = 2
            r1.<init>(r2, r9)
            defpackage.q40.o(r0, r1)
        L_0x00ed:
            e5f r8 = defpackage.e5f.a
        L_0x00ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.b(pu2, mm3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.du2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            du2 r0 = (defpackage.du2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            du2 r0 = new du2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.v0
            r5.set(r3)
            nl6 r5 = r4.a
            r5.j = r4
            q40 r5 = r4.B0
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.v0
            r5.set(r3)
            q40 r5 = r4.B0
            eu2 r0 = new eu2
            r1 = 0
            r0.<init>(r4, r1)
            defpackage.q40.o(r5, r0)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fu2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            fu2 r0 = (defpackage.fu2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            fu2 r0 = new fu2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.u0
            r2 = 0
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L_0x005f
            je7 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            qd5 r5 = (defpackage.qd5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0050
            return r1
        L_0x0050:
            java.util.List r5 = (java.util.List) r5
            dx3 r0 = r4.w0
            r0.addAll(r5)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f(r0)
        L_0x005f:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (this.v0.compareAndSet(false, true)) {
            q40.o(this.B0, new gu2(this, (Continuation) null)).invokeOnCompletion(new l(28, this));
        }
    }

    public final void f(long j) {
        String str = this.z0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.h(j, "loadNext: "), (Throwable) null);
        }
        nl6 nl6 = this.a;
        yx4 yx4 = nl6.e;
        if (yx4 != null) {
            String a2 = yx4.a(j);
            yx4.b("loadNext: " + a2);
        }
        nl6.q();
        if (!nl6.d().i().isEmpty()) {
            if (yx4 != null) {
                yx4.b("loadNext: Chunks not empty, started loading from datasources");
            }
            vk6 o2 = ft.o(nl6.f(j));
            if (o2 != null) {
                j = o2.k();
            }
            nl6.j(nl6.b, j, false, true, false);
            nl6.k(nl6.c, j, false, true);
        } else {
            nl6.l(j);
        }
        if (yx4 != null) {
            kq0.u(yx4, nl6.e());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ou2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ou2 r0 = (defpackage.ou2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ou2 r0 = new ou2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r5)
            je7 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            qd5 r5 = (defpackage.qd5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r5 = (java.util.List) r5
            dx3 r0 = r4.w0
            r0.clear()
            dx3 r4 = r4.w0
            r4.addAll(r5)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
