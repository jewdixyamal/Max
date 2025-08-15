package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.messages.list.loader.MessageModel;

/* renamed from: bx  reason: default package */
public final class bx implements t29, ne3 {
    public static final /* synthetic */ bc7[] F;
    public final q0e A;
    public final w7c B;
    public final q0e C;
    public final sy4 D;
    public final wd6 E;
    public final long a;
    public final kke b;
    public final yx4 c;
    public final v19 d;
    public final je7 e;
    public final je7 f;
    public final ox3 g;
    public final m9a h;
    public final tk6 i;
    public final uu j;
    public final pfc k;
    public final oe3 l;
    public final int m;
    public final int n;
    public final String o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final y77 s;
    public final lx3 t;
    public final ContextScope u;
    public final ContextScope v;
    public final ax w = new ax(new khe(new x5(12, this)), 0, this);
    public final je7 x;
    public final q0e y;
    public final kv z;

    static {
        oi9 oi9 = new oi9(bx.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;");
        nec.a.getClass();
        F = new bc7[]{oi9};
    }

    public bx(je7 je7, je7 je72, je7 je73, je7 je74, long j2, kke kke, yx4 yx4, v19 v19, khe khe, khe khe2, ox3 ox3, m9a m9a, tk6 tk6, uu uuVar, pfc pfc, oe3 oe3, int i2, int i3) {
        long j3 = j2;
        kke kke2 = kke;
        yx4 yx42 = yx4;
        v19 v192 = v19;
        oe3 oe32 = oe3;
        this.a = j3;
        this.b = kke2;
        this.c = yx42;
        this.d = v192;
        this.e = khe;
        this.f = khe2;
        this.g = ox3;
        this.h = m9a;
        this.i = tk6;
        this.j = uuVar;
        this.k = pfc;
        this.l = oe32;
        this.m = i2;
        this.n = i3;
        String str = bx.class.getName() + "#" + j3;
        this.o = str;
        this.p = je7;
        this.q = je72;
        this.r = je73;
        y77 a2 = pag.a();
        this.s = a2;
        w9a w9a = (w9a) kke2;
        lx3 plus = w9a.a().plus(a2).plus(new qj(this));
        this.t = plus;
        ContextScope a3 = j1e.a(plus.plus(w9a.a().limitedParallelism(1, str)).plus(new y77(a2)));
        this.u = a3;
        this.v = j1e.a(plus.plus(w9a.b()).plus(new y77(a2)));
        this.x = je74;
        q0e a4 = r0e.a(0L);
        this.y = a4;
        kv kvVar = new kv(this);
        this.z = kvVar;
        q0e a5 = r0e.a(l29.o);
        this.A = a5;
        this.B = new w7c(a5);
        q0e a6 = r0e.a(mv.a);
        this.C = a6;
        this.D = new sy4(3, (Object) this);
        this.E = new wd6(3, (Object) this);
        od2.L(new mqc(new yw(a6, (Continuation) null, this)), a3);
        od2.L(new zn5(od2.x(new j31(kvVar, a4, new mw(this, (Continuation) null), 4)), new nw(this, (Continuation) null), 5), j1e.a(plus));
        v7c v7c = v192.e;
        qw qwVar = new qw(v7c, 0);
        int i4 = ft4.o;
        kt4 kt4 = kt4.MILLISECONDS;
        od2.L(new zn5(od2.N(new mqc(new uw(new m32(new vn5(z7.R(15, kt4), qwVar, (Continuation) null), hz4.a, -2, 1, 0), (Continuation) null)), nu0.Q(new qw(v7c, 1), z7.R(1000, kt4)), new qw(v7c, 2)), new vw(2, this, bx.class, "handleEvent", "handleEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 5), a3);
        oe32.a(oe3.c | oe3.d, this);
        yx42.b("initialized @" + System.identityHashCode(this));
    }

    public static void A(ArrayList arrayList, vk6 vk6, vk6 vk62) {
        int i2;
        if (vk6 != null && vk62 != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                vk6 vk63 = (vk6) it.next();
                if (!(vk63 instanceof uk6) && vk63.getId() == vk6.getId()) {
                    break;
                }
                i3++;
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                vk6 vk64 = (vk6) listIterator.previous();
                if (!(vk64 instanceof uk6) && vk64.getId() == vk62.getId()) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            }
            if (i3 >= 0 && i2 >= 0 && i3 <= i2) {
                while (true) {
                    if (arrayList.get(i2) instanceof uk6) {
                        arrayList.remove(i2);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.bx r11, defpackage.pfc r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof defpackage.bw
            if (r0 == 0) goto L_0x0014
            r0 = r15
            bw r0 = (defpackage.bw) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Y = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            bw r0 = new bw
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.o
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            defpackage.od2.a0(r15)
            goto L_0x00cb
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            defpackage.od2.a0(r15)
            java.util.List r15 = r11.l(r13)
            boolean r1 = r15 instanceof java.util.Collection
            r3 = -1
            if (r1 == 0) goto L_0x0046
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0046
            goto L_0x008d
        L_0x0046:
            java.util.Iterator r1 = r15.iterator()
        L_0x004a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x008d
            java.lang.Object r5 = r1.next()
            vk6 r5 = (defpackage.vk6) r5
            boolean r5 = r5 instanceof defpackage.uk6
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x004a
            java.lang.Object r1 = defpackage.x53.g0(r15)
            boolean r1 = r1 instanceof defpackage.uk6
            if (r1 == 0) goto L_0x0086
            boolean r13 = r11.q(r15, r13, r2)
            if (r13 == 0) goto L_0x0086
            java.lang.Object r13 = r15.get(r2)
            vk6 r13 = (defpackage.vk6) r13
            long r13 = r13.k()
            sk6 r15 = r11.k()
            i13 r15 = r15.f(r13)
            if (r15 == 0) goto L_0x0081
            long r3 = r15.b()
        L_0x0081:
            int r15 = r11.m
        L_0x0083:
            r6 = r3
            r4 = r15
            goto L_0x0090
        L_0x0086:
            java.lang.Integer r0 = new java.lang.Integer
            r11 = 0
            r0.<init>(r11)
            goto L_0x00d6
        L_0x008d:
            int r15 = r11.n
            goto L_0x0083
        L_0x0090:
            yx4 r11 = r11.c
            if (r11 == 0) goto L_0x00bd
            java.lang.String r15 = defpackage.yx4.a(r13)
            java.lang.String r1 = defpackage.yx4.a(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "loadDataBackwardRemote time: "
            r3.<init>(r5)
            r3.append(r15)
            java.lang.String r15 = ", count: "
            r3.append(r15)
            r3.append(r4)
            java.lang.String r15 = ", limit: "
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = r3.toString()
            r11.b(r15)
        L_0x00bd:
            r10.Y = r2
            r5 = 0
            r8 = -1
            r1 = r12
            r2 = r13
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r8, r10)
            if (r15 != r0) goto L_0x00cb
            goto L_0x00d6
        L_0x00cb:
            java.lang.Number r15 = (java.lang.Number) r15
            int r11 = r15.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
        L_0x00d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.b(bx, pfc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.bx r11, defpackage.pfc r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof defpackage.dw
            if (r0 == 0) goto L_0x0014
            r0 = r15
            dw r0 = (defpackage.dw) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            dw r0 = new dw
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.X
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Z
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            bx r11 = r10.o
            defpackage.od2.a0(r15)
            goto L_0x00d5
        L_0x002c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            defpackage.od2.a0(r15)
            java.util.List r15 = r11.l(r13)
            boolean r1 = r15 instanceof java.util.Collection
            r3 = -1
            if (r1 == 0) goto L_0x0048
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0048
            goto L_0x0095
        L_0x0048:
            java.util.Iterator r1 = r15.iterator()
        L_0x004c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0095
            java.lang.Object r5 = r1.next()
            vk6 r5 = (defpackage.vk6) r5
            boolean r5 = r5 instanceof defpackage.uk6
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x004c
            java.lang.Object r1 = defpackage.x53.p0(r15)
            boolean r1 = r1 instanceof defpackage.uk6
            r5 = 0
            if (r1 == 0) goto L_0x008f
            boolean r13 = r11.q(r15, r13, r5)
            if (r13 == 0) goto L_0x008f
            int r13 = r15.size()
            int r13 = r13 + -2
            java.lang.Object r13 = r15.get(r13)
            vk6 r13 = (defpackage.vk6) r13
            long r13 = r13.k()
            sk6 r15 = r11.k()
            i13 r15 = r15.d(r13)
            if (r15 == 0) goto L_0x008a
            long r3 = r15.a()
        L_0x008a:
            int r15 = r11.m
        L_0x008c:
            r5 = r15
            r8 = r3
            goto L_0x0098
        L_0x008f:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            goto L_0x00e9
        L_0x0095:
            int r15 = r11.n
            goto L_0x008c
        L_0x0098:
            yx4 r15 = r11.c
            if (r15 == 0) goto L_0x00c5
            java.lang.String r1 = defpackage.yx4.a(r13)
            java.lang.String r3 = defpackage.yx4.a(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "loadDataForwardRemote fTime: "
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r1 = ", fCount: "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = ", fLimit: "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r15.b(r1)
        L_0x00c5:
            r10.o = r11
            r10.Z = r2
            r4 = 0
            r6 = -1
            r1 = r12
            r2 = r13
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r8, r10)
            if (r15 != r0) goto L_0x00d5
            goto L_0x00e9
        L_0x00d5:
            java.lang.Number r15 = (java.lang.Number) r15
            int r12 = r15.intValue()
            yx4 r11 = r11.c
            if (r11 == 0) goto L_0x00e4
            java.lang.String r13 = "forward remote fetched"
            r11.b(r13)
        L_0x00e4:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.c(bx, pfc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.bx r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.kw
            if (r0 == 0) goto L_0x0017
            r0 = r12
            kw r0 = (defpackage.kw) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0017
            int r1 = r1 - r2
            r0.s0 = r1
        L_0x0015:
            r6 = r0
            goto L_0x001d
        L_0x0017:
            kw r0 = new kw
            r0.<init>(r9, r12)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            bx r9 = r6.o
            defpackage.od2.a0(r12)
            goto L_0x00ac
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            long r9 = r6.X
            bx r11 = r6.o
            defpackage.od2.a0(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L_0x0094
        L_0x0045:
            defpackage.od2.a0(r12)
            yx4 r12 = r9.c
            if (r12 == 0) goto L_0x0061
            java.lang.String r1 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadPrev: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.b(r1)
        L_0x0061:
            r9.B()
            sk6 r12 = r9.k()
            java.util.List r12 = r12.i()
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r3
            if (r12 == 0) goto L_0x00a1
            java.util.List r12 = r9.l(r10)
            vk6 r12 = defpackage.ft.h(r12)
            if (r12 == 0) goto L_0x0081
            long r10 = r12.k()
        L_0x0081:
            r6.o = r9
            r6.X = r10
            r6.s0 = r3
            uu r2 = r9.j
            sy4 r5 = r9.D
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.t(r2, r3, r5, r6)
            if (r12 != r0) goto L_0x0094
            goto L_0x00bb
        L_0x0094:
            kotlinx.coroutines.internal.ContextScope r12 = r9.v
            lw r0 = new lw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.j47.T(r12, r1, r1, r0, r10)
            goto L_0x00ac
        L_0x00a1:
            r6.o = r9
            r6.s0 = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto L_0x00ac
            goto L_0x00bb
        L_0x00ac:
            yx4 r10 = r9.c
            if (r10 == 0) goto L_0x00b9
            kv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.kq0.u(r10, r9)
        L_0x00b9:
            e5f r0 = defpackage.e5f.a
        L_0x00bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.d(bx, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void e(bx bxVar, ArrayList arrayList) {
        bxVar.getClass();
        for (int L = y53.L(arrayList); -1 < L; L--) {
            if (L > 0 && (arrayList.get(L) instanceof uk6) && (arrayList.get(L - 1) instanceof uk6)) {
                arrayList.remove(L);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(defpackage.bx r8, java.util.ArrayList r9) {
        /*
            sk6 r0 = r8.k()
            long r0 = r0.g()
            sk6 r2 = r8.k()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L_0x003b
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.util.Iterator r2 = r9.iterator()
        L_0x0021:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.next()
            vk6 r4 = (defpackage.vk6) r4
            boolean r5 = r4 instanceof defpackage.uk6
            if (r5 != 0) goto L_0x0021
            long r4 = r4.getId()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            java.lang.Object r4 = defpackage.x53.g0(r9)
            vk6 r4 = (defpackage.vk6) r4
            yx4 r8 = r8.c
            if (r8 == 0) goto L_0x0069
            boolean r5 = r4 instanceof defpackage.uk6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "UpdateFirstGap: firstItemId="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isFirstGap="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", hasFirstBound="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            r8.b(r0)
        L_0x0069:
            if (r2 == 0) goto L_0x0073
            boolean r8 = r4 instanceof defpackage.uk6
            if (r8 == 0) goto L_0x0073
            r9.remove(r3)
            goto L_0x0081
        L_0x0073:
            if (r2 != 0) goto L_0x0081
            boolean r8 = r4 instanceof defpackage.uk6
            if (r8 != 0) goto L_0x0081
            uk6 r8 = new uk6
            r8.<init>()
            r9.add(r3, r8)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.f(bx, java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(defpackage.bx r7, java.util.ArrayList r8) {
        /*
            sk6 r0 = r7.k()
            long r0 = r0.h()
            sk6 r2 = r7.k()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x003c
            int r2 = r8.size()
            java.util.ListIterator r2 = r8.listIterator(r2)
        L_0x001d:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.previous()
            r4 = r3
            vk6 r4 = (defpackage.vk6) r4
            boolean r5 = r4 instanceof defpackage.uk6
            if (r5 != 0) goto L_0x001d
            long r4 = r4.getId()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            java.lang.Object r3 = defpackage.x53.p0(r8)
            vk6 r3 = (defpackage.vk6) r3
            yx4 r7 = r7.c
            if (r7 == 0) goto L_0x006a
            boolean r4 = r3 instanceof defpackage.uk6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "UpdateLastGap: lastItemId="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", isLastGap="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", hasLastBound="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r7.b(r0)
        L_0x006a:
            if (r2 == 0) goto L_0x0074
            boolean r7 = r3 instanceof defpackage.uk6
            if (r7 == 0) goto L_0x0074
            r8.remove(r3)
            goto L_0x0086
        L_0x0074:
            if (r2 != 0) goto L_0x0086
            boolean r7 = r3 instanceof defpackage.uk6
            if (r7 != 0) goto L_0x0086
            int r7 = r8.size()
            uk6 r0 = new uk6
            r0.<init>()
            r8.add(r7, r0)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.g(bx, java.util.ArrayList):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: vk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: vk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: vk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: vk6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void z(long r5, long r7, java.util.ArrayList r9) {
        /*
            java.util.Iterator r0 = r9.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            r3 = r1
            vk6 r3 = (defpackage.vk6) r3
            boolean r4 = r3 instanceof defpackage.uk6
            if (r4 != 0) goto L_0x0004
            long r3 = r3.k()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0004
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            vk6 r1 = (defpackage.vk6) r1
            int r5 = r9.size()
            java.util.ListIterator r5 = r9.listIterator(r5)
        L_0x002a:
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x0044
            java.lang.Object r6 = r5.previous()
            r0 = r6
            vk6 r0 = (defpackage.vk6) r0
            boolean r3 = r0 instanceof defpackage.uk6
            if (r3 != 0) goto L_0x002a
            long r3 = r0.k()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            r2 = r6
        L_0x0044:
            vk6 r2 = (defpackage.vk6) r2
            A(r9, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.z(long, long, java.util.ArrayList):void");
    }

    public final boolean B() {
        List h2;
        ArrayList arrayList;
        sk6 k2 = k();
        sk6 i2 = this.i.i();
        i2.getClass();
        sk6.a.getClass();
        this.w.o1(this, F[0], new rk6(i2));
        kv kvVar = this.z;
        bx bxVar = kvVar.b;
        do {
            h2 = kvVar.getValue();
            arrayList = new ArrayList(h2);
            e(bxVar, arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((vk6) it.next()) instanceof uk6)) {
                            f(bxVar, arrayList);
                            g(bxVar, arrayList);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } while (!kvVar.c(h2, arrayList));
        boolean z2 = !kp.i(k2, k());
        yx4 yx4 = this.c;
        if (yx4 != null && z2) {
            kq0.v(yx4, k());
        }
        return z2;
    }

    public final void a() {
        j47.T(this.u, (lx3) null, (vx3) null, new zw(this, (Continuation) null), 3);
    }

    public final void h() {
        v19 v19 = this.d;
        v19.a.f(v19);
        this.s.cancel((CancellationException) null);
        Set set = (Set) this.l.a.get(Integer.valueOf(oe3.c | oe3.d));
        if (set != null) {
            set.remove(this);
        }
        yx4 yx4 = this.c;
        if (yx4 != null) {
            int identityHashCode = System.identityHashCode(this);
            yx4.b("cleared @" + identityHashCode);
        }
    }

    public final long i() {
        return ((Number) this.y.getValue()).longValue();
    }

    public final long j() {
        Long l2;
        Iterator it = ((l29) this.A.getValue()).a.iterator();
        if (!it.hasNext()) {
            l2 = null;
        } else {
            Long valueOf = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((MessageModel) it.next()).c);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l2 = valueOf;
        }
        if (l2 != null) {
            return l2.longValue();
        }
        return Long.MAX_VALUE;
    }

    public final sk6 k() {
        return (sk6) this.w.T0(this, F[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c4, code lost:
        r1 = r1.subList(r12, r3 + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List l(long r24) {
        /*
            r23 = this;
            r0 = r23
            kv r1 = r0.z
            java.util.List r1 = r1.getValue()
            sk6 r2 = r23.k()
            java.util.List r2 = r2.i()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x0017:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0205
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0025
            goto L_0x0205
        L_0x0025:
            java.util.Iterator r2 = r1.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0205
            java.lang.Object r3 = r2.next()
            vk6 r3 = (defpackage.vk6) r3
            boolean r3 = r3 instanceof defpackage.uk6
            if (r3 == 0) goto L_0x0029
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0041
            goto L_0x0205
        L_0x0041:
            java.util.Iterator r2 = r1.iterator()
        L_0x0045:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0205
            java.lang.Object r3 = r2.next()
            vk6 r3 = (defpackage.vk6) r3
            boolean r3 = r3 instanceof defpackage.uk6
            if (r3 != 0) goto L_0x0045
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.size()
            r4 = 0
            r5 = -1
            r6 = r4
            r7 = r5
        L_0x0062:
            r8 = 1
            if (r6 >= r3) goto L_0x008d
            java.lang.Object r9 = r1.get(r6)
            vk6 r9 = (defpackage.vk6) r9
            boolean r9 = r9 instanceof defpackage.uk6
            if (r9 != 0) goto L_0x0076
            int r9 = r1.size()
            int r9 = r9 - r8
            if (r6 != r9) goto L_0x008a
        L_0x0076:
            if (r7 != r5) goto L_0x007c
            r7 = r4
            if (r6 != 0) goto L_0x007c
            goto L_0x008a
        L_0x007c:
            int r8 = r6 + 1
            java.util.List r7 = r1.subList(r7, r8)
            java.util.List r7 = defpackage.x53.D0(r7)
            r2.add(r7)
            r7 = r6
        L_0x008a:
            int r6 = r6 + 1
            goto L_0x0062
        L_0x008d:
            java.util.Iterator r2 = r2.iterator()
        L_0x0091:
            boolean r3 = r2.hasNext()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -9223372036854775808
            r7 = 0
            if (r3 == 0) goto L_0x016a
            java.lang.Object r3 = r2.next()
            r11 = r3
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r11.iterator()
        L_0x00af:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00c5
            java.lang.Object r14 = r13.next()
            r15 = r14
            vk6 r15 = (defpackage.vk6) r15
            boolean r15 = r15 instanceof defpackage.uk6
            r15 = r15 ^ r8
            if (r15 == 0) goto L_0x00af
            r12.add(r14)
            goto L_0x00af
        L_0x00c5:
            java.lang.Object r13 = defpackage.x53.i0(r11)
            boolean r13 = r13 instanceof defpackage.uk6
            r14 = -1
            if (r13 != 0) goto L_0x00d2
            r19 = r9
            goto L_0x0119
        L_0x00d2:
            java.util.Iterator r13 = r12.iterator()
            boolean r16 = r13.hasNext()
            if (r16 != 0) goto L_0x00df
            r16 = r7
            goto L_0x010c
        L_0x00df:
            java.lang.Object r16 = r13.next()
            boolean r17 = r13.hasNext()
            if (r17 != 0) goto L_0x00ea
            goto L_0x010c
        L_0x00ea:
            r17 = r16
            vk6 r17 = (defpackage.vk6) r17
            long r17 = r17.k()
        L_0x00f2:
            java.lang.Object r19 = r13.next()
            r20 = r19
            vk6 r20 = (defpackage.vk6) r20
            long r20 = r20.k()
            int r22 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0106
            r16 = r19
            r17 = r20
        L_0x0106:
            boolean r19 = r13.hasNext()
            if (r19 != 0) goto L_0x00f2
        L_0x010c:
            vk6 r16 = (defpackage.vk6) r16
            if (r16 == 0) goto L_0x0117
            long r16 = r16.k()
            r19 = r16
            goto L_0x0119
        L_0x0117:
            r19 = r14
        L_0x0119:
            java.lang.Object r11 = defpackage.x53.q0(r11)
            boolean r11 = r11 instanceof defpackage.uk6
            if (r11 != 0) goto L_0x0123
            r14 = r5
            goto L_0x0161
        L_0x0123:
            java.util.Iterator r21 = r12.iterator()
            boolean r11 = r21.hasNext()
            if (r11 != 0) goto L_0x012e
            goto L_0x0159
        L_0x012e:
            java.lang.Object r7 = r21.next()
            boolean r11 = r21.hasNext()
            if (r11 != 0) goto L_0x0139
            goto L_0x0159
        L_0x0139:
            r11 = r7
            vk6 r11 = (defpackage.vk6) r11
            long r11 = r11.k()
        L_0x0140:
            java.lang.Object r13 = r21.next()
            r16 = r13
            vk6 r16 = (defpackage.vk6) r16
            long r16 = r16.k()
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x0153
            r7 = r13
            r11 = r16
        L_0x0153:
            boolean r13 = r21.hasNext()
            if (r13 != 0) goto L_0x0140
        L_0x0159:
            vk6 r7 = (defpackage.vk6) r7
            if (r7 == 0) goto L_0x0161
            long r14 = r7.k()
        L_0x0161:
            int r7 = (r19 > r24 ? 1 : (r19 == r24 ? 0 : -1))
            if (r7 > 0) goto L_0x0091
            int r7 = (r24 > r14 ? 1 : (r24 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x0091
            r7 = r3
        L_0x016a:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x0177
            uk6 r2 = new uk6
            r2.<init>()
            java.util.List r7 = java.util.Collections.singletonList(r2)
        L_0x0177:
            int r2 = r1.size()
            r3 = r4
            r11 = r3
            r12 = r11
        L_0x017e:
            if (r3 >= r2) goto L_0x01e1
            java.lang.Object r13 = r1.get(r3)
            vk6 r13 = (defpackage.vk6) r13
            boolean r14 = r13 instanceof defpackage.uk6
            if (r14 != 0) goto L_0x01a2
            int r14 = defpackage.y53.L(r1)
            if (r3 != r14) goto L_0x0191
            goto L_0x01a2
        L_0x0191:
            long r13 = r13.k()
            int r13 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x019b
        L_0x0199:
            r11 = r8
            goto L_0x01de
        L_0x019b:
            int r13 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x01de
            if (r3 != 0) goto L_0x01de
            goto L_0x0199
        L_0x01a2:
            if (r11 == 0) goto L_0x01bc
            long r14 = r13.k()
            int r14 = (r24 > r14 ? 1 : (r24 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x01c4
            int r14 = r3 + -1
            java.lang.Object r14 = r1.get(r14)
            vk6 r14 = (defpackage.vk6) r14
            long r14 = r14.k()
            int r14 = (r24 > r14 ? 1 : (r24 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x01c4
        L_0x01bc:
            long r13 = r13.k()
            int r13 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x01ca
        L_0x01c4:
            int r3 = r3 + r8
            java.util.List r1 = r1.subList(r12, r3)
            goto L_0x01ea
        L_0x01ca:
            if (r11 == 0) goto L_0x01dc
            int r11 = defpackage.y53.L(r1)
            if (r3 != r11) goto L_0x01dc
            int r11 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x01dc
            int r3 = r3 + r8
            java.util.List r1 = r1.subList(r12, r3)
            goto L_0x01ea
        L_0x01dc:
            r12 = r3
            r11 = r4
        L_0x01de:
            int r3 = r3 + 1
            goto L_0x017e
        L_0x01e1:
            uk6 r1 = new uk6
            r1.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x01ea:
            boolean r1 = defpackage.tpa.f(r1, r7)
            if (r1 != 0) goto L_0x0204
            java.lang.Object r1 = defpackage.x53.i0(r7)
            boolean r1 = r1 instanceof defpackage.uk6
            if (r1 != 0) goto L_0x0204
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The new chunk search algorithm has failed!"
            r1.<init>(r2)
            java.lang.String r0 = r0.o
            defpackage.hm9.p(r0, r2, r1)
        L_0x0204:
            return r7
        L_0x0205:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.l(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(defpackage.su8 r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.rv
            if (r2 == 0) goto L_0x0017
            r2 = r1
            rv r2 = (defpackage.rv) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001c
        L_0x0017:
            rv r2 = new rv
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            e5f r5 = defpackage.e5f.a
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r8) goto L_0x0041
            if (r4 == r7) goto L_0x003c
            if (r4 != r6) goto L_0x0034
            defpackage.od2.a0(r1)
            goto L_0x0130
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            defpackage.od2.a0(r1)
            goto L_0x010f
        L_0x0041:
            java.util.List r0 = r2.X
            bx r4 = r2.o
            defpackage.od2.a0(r1)
            r16 = r1
            r1 = r0
            r0 = r4
            r4 = r16
            goto L_0x0075
        L_0x004f:
            defpackage.od2.a0(r1)
            q0e r1 = r0.A
            java.lang.Object r1 = r1.getValue()
            l29 r1 = (defpackage.l29) r1
            java.util.List r1 = r1.a
            je7 r4 = r0.q
            java.lang.Object r4 = r4.getValue()
            r79 r4 = (defpackage.r79) r4
            r9 = r18
            java.util.Collection r9 = r9.a
            r2.o = r0
            r2.X = r1
            r2.s0 = r8
            java.lang.Object r4 = r4.b(r9, r2)
            if (r4 != r3) goto L_0x0075
            return r3
        L_0x0075:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            boolean r8 = r4.hasNext()
            r9 = 0
            if (r8 != 0) goto L_0x0084
            r8 = r9
            goto L_0x00a9
        L_0x0084:
            java.lang.Object r8 = r4.next()
            boolean r10 = r4.hasNext()
            if (r10 != 0) goto L_0x008f
            goto L_0x00a9
        L_0x008f:
            r10 = r8
            cu8 r10 = (defpackage.cu8) r10
            long r10 = r10.o
        L_0x0094:
            java.lang.Object r12 = r4.next()
            r13 = r12
            cu8 r13 = (defpackage.cu8) r13
            long r13 = r13.o
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00a3
            r8 = r12
            r10 = r13
        L_0x00a3:
            boolean r12 = r4.hasNext()
            if (r12 != 0) goto L_0x0094
        L_0x00a9:
            cu8 r8 = (defpackage.cu8) r8
            if (r8 == 0) goto L_0x00b0
            long r10 = r8.o
            goto L_0x00b4
        L_0x00b0:
            long r10 = r0.j()
        L_0x00b4:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00d3
            yx4 r1 = r0.c
            if (r1 == 0) goto L_0x00cf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handleMessageAdd: No messages in memory, enqueue load around ts="
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.b(r2)
        L_0x00cf:
            r0.r(r10)
            return r5
        L_0x00d3:
            long r12 = r0.j()
            java.util.List r1 = r0.l(r12)
            java.lang.Object r1 = defpackage.x53.p0(r1)
            vk6 r1 = (defpackage.vk6) r1
            boolean r4 = r1 instanceof defpackage.uk6
            yx4 r8 = r0.c
            if (r4 != 0) goto L_0x0110
            if (r8 == 0) goto L_0x00fe
            long r10 = r1.k()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "handleMessageAdd: lastHistoryItem not null and not gap, load after ts="
            r1.<init>(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r8.b(r1)
        L_0x00fe:
            long r10 = r0.j()
            r2.o = r9
            r2.X = r9
            r2.s0 = r7
            java.lang.Object r0 = r0.x(r10, r2)
            if (r0 != r3) goto L_0x010f
            return r3
        L_0x010f:
            return r5
        L_0x0110:
            if (r8 == 0) goto L_0x0123
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "handleMessageAdd: lastHistory is null or gap, load around ts="
            r1.<init>(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r8.b(r1)
        L_0x0123:
            r2.o = r9
            r2.X = r9
            r2.s0 = r6
            java.lang.Object r0 = r0.s(r10, r2)
            if (r0 != r3) goto L_0x0130
            return r3
        L_0x0130:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.m(su8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(defpackage.xu8 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.sv
            if (r0 == 0) goto L_0x0013
            r0 = r15
            sv r0 = (defpackage.sv) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            sv r0 = new sv
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.u0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.w0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 2
            if (r2 == 0) goto L_0x006c
            if (r2 == r4) goto L_0x005f
            if (r2 == r7) goto L_0x0054
            if (r2 == r6) goto L_0x0049
            if (r2 != r5) goto L_0x0041
            long r13 = r0.t0
            fi9 r2 = r0.s0
            java.util.Iterator r6 = r0.Z
            fi9 r7 = r0.Y
            java.lang.Object r8 = r0.X
            e52 r8 = (defpackage.e52) r8
            bx r9 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x0172
        L_0x0041:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0049:
            java.lang.Object r13 = r0.X
            java.util.List r13 = (java.util.List) r13
            bx r14 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x0135
        L_0x0054:
            java.lang.Object r13 = r0.X
            java.util.List r13 = (java.util.List) r13
            bx r14 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x011e
        L_0x005f:
            java.lang.Object r13 = r0.X
            java.util.List r13 = (java.util.List) r13
            bx r14 = r0.o
            defpackage.od2.a0(r15)
            r2 = r13
            r13 = r14
            goto L_0x00e5
        L_0x006c:
            defpackage.od2.a0(r15)
            gi9 r15 = new gi9
            kv r2 = r13.z
            java.util.List r8 = r2.getValue()
            int r8 = r8.size()
            r15.<init>((int) r8)
            java.util.List r2 = r2.getValue()
            java.util.Iterator r2 = r2.iterator()
        L_0x0086:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x009a
            java.lang.Object r8 = r2.next()
            vk6 r8 = (defpackage.vk6) r8
            long r8 = r8.getId()
            r15.a(r8)
            goto L_0x0086
        L_0x009a:
            java.util.Collection r14 = r14.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00a5:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r14.next()
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            boolean r9 = r15.d(r9)
            if (r9 == 0) goto L_0x00a5
            r2.add(r8)
            goto L_0x00a5
        L_0x00c0:
            boolean r14 = r2.isEmpty()
            if (r14 == 0) goto L_0x00d0
            yx4 r13 = r13.c
            if (r13 == 0) goto L_0x00cf
            java.lang.String r14 = "handleMessageUpdate: loaded messages does not intersects with updated ids"
            r13.b(r14)
        L_0x00cf:
            return r3
        L_0x00d0:
            je7 r14 = r13.q
            java.lang.Object r14 = r14.getValue()
            r79 r14 = (defpackage.r79) r14
            r0.o = r13
            r0.X = r2
            r0.w0 = r4
            java.lang.Object r15 = r14.b(r2, r0)
            if (r15 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            java.util.List r15 = (java.util.List) r15
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x0108
            yx4 r13 = r13.c
            if (r13 == 0) goto L_0x0107
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "handleMessageUpdate: not found messages "
            r14.<init>(r15)
            r14.append(r2)
            java.lang.String r15 = " in repository"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.b(r14)
        L_0x0107:
            return r3
        L_0x0108:
            je7 r14 = r13.r
            java.lang.Object r14 = r14.getValue()
            u9a r14 = (defpackage.u9a) r14
            r0.o = r13
            r0.X = r15
            r0.w0 = r7
            r14.i(r15)
            if (r3 != r1) goto L_0x011c
            return r1
        L_0x011c:
            r14 = r13
            r13 = r15
        L_0x011e:
            je7 r15 = r14.p
            java.lang.Object r15 = r15.getValue()
            iy2 r15 = (defpackage.iy2) r15
            r0.o = r14
            r0.X = r13
            r0.w0 = r6
            long r6 = r14.a
            java.lang.Object r15 = r15.d(r6, r0)
            if (r15 != r1) goto L_0x0135
            return r1
        L_0x0135:
            e52 r15 = (defpackage.e52) r15
            fi9 r2 = new fi9
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
            r6 = r13
            r9 = r14
            r8 = r15
        L_0x0143:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0177
            java.lang.Object r13 = r6.next()
            cu8 r13 = (defpackage.cu8) r13
            long r14 = r13.b
            je7 r7 = r9.r
            java.lang.Object r7 = r7.getValue()
            u9a r7 = (defpackage.u9a) r7
            r0.o = r9
            r0.X = r8
            r0.Y = r2
            r0.Z = r6
            r0.s0 = r2
            r0.t0 = r14
            r0.w0 = r5
            java.lang.Object r13 = r7.j(r8, r13, r0)
            if (r13 != r1) goto L_0x016e
            return r1
        L_0x016e:
            r7 = r2
            r11 = r14
            r15 = r13
            r13 = r11
        L_0x0172:
            r2.g(r13, r15)
            r2 = r7
            goto L_0x0143
        L_0x0177:
            kv r13 = r9.z
            bx r14 = r13.b
        L_0x017b:
            java.util.List r15 = r13.getValue()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r15)
            java.util.Iterator r1 = r0.iterator()
            r5 = 0
        L_0x0189:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x01af
            java.lang.Object r6 = r1.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x01aa
            vk6 r6 = (defpackage.vk6) r6
            long r8 = r6.getId()
            java.lang.Object r6 = r2.d(r8)
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            if (r6 == 0) goto L_0x01a8
            r0.set(r5, r6)
        L_0x01a8:
            r5 = r7
            goto L_0x0189
        L_0x01aa:
            defpackage.y53.R()
            r13 = 0
            throw r13
        L_0x01af:
            e(r14, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01b9
            goto L_0x01d4
        L_0x01b9:
            java.util.Iterator r1 = r0.iterator()
        L_0x01bd:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01d4
            java.lang.Object r5 = r1.next()
            vk6 r5 = (defpackage.vk6) r5
            boolean r5 = r5 instanceof defpackage.uk6
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x01bd
            f(r14, r0)
            g(r14, r0)
        L_0x01d4:
            boolean r15 = r13.c(r15, r0)
            if (r15 == 0) goto L_0x017b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.n(xu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void o(long j2, List list, boolean z2, boolean z3) {
        List h2;
        ArrayList arrayList;
        k92 k92;
        List h3;
        ArrayList arrayList2;
        long j3 = j2;
        List i2 = k().i();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : list) {
            if (hashSet.add(Long.valueOf(((vk6) next).getId()))) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (fm9.p(((vk6) next2).k(), i2)) {
                arrayList4.add(next2);
            }
        }
        List x0 = x53.x0(arrayList4, k().c());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int size = x0.size();
        for (int i3 = 0; i3 < size; i3++) {
            vk6 vk6 = (vk6) x0.get(i3);
            arrayList6.add(vk6);
            if (i3 == y53.L(x0) || !tpa.f(fm9.v(vk6.k(), i2), fm9.v(((vk6) x0.get(i3 + 1)).k(), i2))) {
                arrayList5.add(arrayList6);
                arrayList6 = new ArrayList();
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            if (!((List) next3).isEmpty()) {
                arrayList7.add(next3);
            }
        }
        boolean isEmpty = arrayList7.isEmpty();
        kv kvVar = this.z;
        if (isEmpty) {
            List<vk6> h4 = kvVar.getValue();
            if (!(h4 instanceof Collection) || !h4.isEmpty()) {
                for (vk6 vk62 : h4) {
                    if (!(vk62 instanceof uk6)) {
                        return;
                    }
                }
            }
            e52 e52 = (e52) ((jz2) ((iy2) this.p.getValue())).m(this.a).a.getValue();
            if (e52 != null && (k92 = e52.b) != null && k92.j == 0) {
                do {
                    h3 = kvVar.getValue();
                    arrayList2 = new ArrayList(h3);
                    arrayList2.clear();
                    bx bxVar = kvVar.b;
                    e(bxVar, arrayList2);
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!(((vk6) it3.next()) instanceof uk6)) {
                                    f(bxVar, arrayList2);
                                    g(bxVar, arrayList2);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } while (!kvVar.c(h3, arrayList2));
                return;
            }
            return;
        }
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            list2.add(0, new Object());
            list2.add(list2.size(), new Object());
        }
        bx bxVar2 = kvVar.b;
        do {
            h2 = kvVar.getValue();
            arrayList = new ArrayList(h2);
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                List list3 = (List) it5.next();
                p(arrayList, list3);
                A(arrayList, ft.h(list3), ft.o(list3));
            }
            List list4 = (List) x53.g0(arrayList7);
            if (z2 && (!arrayList.isEmpty())) {
                vk6 o2 = ft.o(list4);
                long k2 = o2 != null ? o2.k() : -1;
                if (k2 >= 0) {
                    i13 v2 = fm9.v(k2, i2);
                    i13 v3 = fm9.v(j3, i2);
                    if (v2 != null && v2.equals(v3)) {
                        z(j3, k2, arrayList);
                    }
                }
            }
            List list5 = (List) x53.p0(arrayList7);
            if (z3 && (!arrayList.isEmpty())) {
                vk6 h5 = ft.h(list5);
                long k3 = h5 != null ? h5.k() : -1;
                if (k3 >= 0) {
                    i13 v4 = fm9.v(k3, i2);
                    i13 v5 = fm9.v(j3, i2);
                    if (v4 != null && v4.equals(v5)) {
                        z(k3, j3, arrayList);
                    }
                }
            }
            e(bxVar2, arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it6 = arrayList.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (!(((vk6) it6.next()) instanceof uk6)) {
                            f(bxVar2, arrayList);
                            g(bxVar2, arrayList);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } while (!kvVar.c(h2, arrayList));
    }

    public final void p(ArrayList arrayList, List list) {
        int indexOf;
        int indexOf2;
        boolean z2 = x53.i0(list) instanceof uk6;
        boolean z3 = x53.q0(list) instanceof uk6;
        gi9 a2 = vv7.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vk6 vk6 = (vk6) it.next();
            if (!(vk6 instanceof uk6)) {
                a2.a(vk6.getId());
            }
        }
        List i0 = l6d.i0(l6d.a0(l6d.a0(new at(2, list), new k8(11)), new jv(a2, 1)));
        if (!i0.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Comparator e2 = k().e();
                int L = y53.L(arrayList);
                Iterator it2 = new r08(i0).iterator();
                while (true) {
                    ListIterator listIterator = ((fkc) it2).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    vk6 vk62 = (vk6) listIterator.previous();
                    while (L > 0) {
                        vk6 vk63 = (vk6) arrayList.get(L);
                        boolean z4 = vk63 instanceof uk6;
                        boolean z5 = e2.compare(Long.valueOf(vk63.k()), Long.valueOf(vk62.k())) > 0;
                        if (!z4 && !z5) {
                            break;
                        }
                        L--;
                    }
                    if (L < y53.L(arrayList)) {
                        int i2 = L + 1;
                        if (arrayList.get(i2) instanceof uk6) {
                            L = i2;
                        }
                    }
                    arrayList.add(L + 1, vk62);
                }
            } else {
                arrayList.addAll(i0);
            }
            if (z2 && (indexOf2 = arrayList.indexOf(x53.g0(i0))) > 0) {
                int i3 = indexOf2 - 1;
                if (!(arrayList.get(i3) instanceof uk6)) {
                    arrayList.add(i3, new Object());
                }
            }
            if (z3 && (indexOf = arrayList.indexOf(x53.p0(i0))) > 0) {
                if (!(indexOf == y53.L(arrayList) ? x53.p0(arrayList) instanceof uk6 : arrayList.get(indexOf + 1) instanceof uk6)) {
                    arrayList.add(indexOf + 1, new Object());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(java.util.List r7, long r8, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L_0x0045
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x000d
        L_0x000a:
            r10 = r1
            goto L_0x0084
        L_0x000d:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L_0x0012:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r7.next()
            vk6 r2 = (defpackage.vk6) r2
            boolean r3 = r2 instanceof defpackage.uk6
            if (r3 != 0) goto L_0x0012
            sk6 r3 = r6.k()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.k()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 > 0) goto L_0x0012
            int r10 = r10 + 1
            if (r10 < 0) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            defpackage.y53.Q()
            throw r0
        L_0x0045:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x004c
            goto L_0x000a
        L_0x004c:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L_0x0051:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r7.next()
            vk6 r2 = (defpackage.vk6) r2
            boolean r3 = r2 instanceof defpackage.uk6
            if (r3 != 0) goto L_0x0051
            sk6 r3 = r6.k()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.k()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 < 0) goto L_0x0051
            int r10 = r10 + 1
            if (r10 < 0) goto L_0x0080
            goto L_0x0051
        L_0x0080:
            defpackage.y53.Q()
            throw r0
        L_0x0084:
            int r7 = r6.m
            if (r10 >= r7) goto L_0x008d
            int r6 = r6.n
            if (r10 == r6) goto L_0x008d
            r1 = 1
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.q(java.util.List, long, boolean):boolean");
    }

    public final void r(long j2) {
        if (j2 != i()) {
            yx4 yx4 = this.c;
            if (yx4 != null) {
                yx4.b("load around " + j2);
            }
            this.C.m((Object) null, new nv(j2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(long r20, kotlin.coroutines.Continuation r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = r22
            boolean r1 = r0 instanceof defpackage.tv
            if (r1 == 0) goto L_0x001a
            r1 = r0
            tv r1 = (defpackage.tv) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0018:
            r10 = r1
            goto L_0x0020
        L_0x001a:
            tv r1 = new tv
            r1.<init>(r7, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r10.s0
            tx3 r11 = defpackage.tx3.a
            int r1 = r10.u0
            r12 = 3
            r13 = 0
            r2 = 4
            r14 = 2
            r15 = 1
            if (r1 == 0) goto L_0x006f
            if (r1 == r15) goto L_0x0060
            if (r1 == r14) goto L_0x0053
            if (r1 == r12) goto L_0x0044
            if (r1 != r2) goto L_0x003c
            bx r1 = r10.o
            defpackage.od2.a0(r0)
            goto L_0x015f
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            long r1 = r10.Z
            java.lang.Object r3 = r10.X
            java.util.Collection r3 = (java.util.Collection) r3
            bx r4 = r10.o
            defpackage.od2.a0(r0)
            r7 = r1
            r9 = r4
            goto L_0x00fd
        L_0x0053:
            long r1 = r10.Z
            java.lang.Object r3 = r10.X
            ta3 r3 = (defpackage.ta3) r3
            bx r4 = r10.o
            defpackage.od2.a0(r0)
            goto L_0x00e2
        L_0x0060:
            long r1 = r10.Z
            ua3 r3 = r10.Y
            java.lang.Object r4 = r10.X
            ta3 r4 = (defpackage.ta3) r4
            bx r5 = r10.o
            defpackage.od2.a0(r0)
            r14 = r4
            goto L_0x00ce
        L_0x006f:
            defpackage.od2.a0(r0)
            yx4 r0 = r7.c
            if (r0 == 0) goto L_0x008b
            java.lang.String r1 = defpackage.yx4.a(r20)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "load: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.b(r1)
        L_0x008b:
            r19.B()
            sk6 r0 = r19.k()
            java.util.List r0 = r0.i()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x0153
            ua3 r6 = defpackage.ngg.a()
            ua3 r5 = defpackage.ngg.a()
            wv r4 = new wv
            r16 = 0
            r0 = r4
            r1 = r19
            r2 = r20
            r12 = r4
            r4 = r6
            r17 = r5
            r14 = r6
            r6 = r16
            r0.<init>(r1, r2, r4, r5, r6)
            r10.o = r7
            r10.X = r14
            r0 = r17
            r10.Y = r0
            r10.Z = r8
            r10.u0 = r15
            java.lang.Object r1 = defpackage.j1e.k(r12, r10)
            if (r1 != r11) goto L_0x00cb
            return r11
        L_0x00cb:
            r3 = r0
            r5 = r7
            r1 = r8
        L_0x00ce:
            r10.o = r5
            r10.X = r14
            r10.Y = r13
            r10.Z = r1
            r0 = 2
            r10.u0 = r0
            java.lang.Object r0 = r3.awaitInternal(r10)
            if (r0 != r11) goto L_0x00e0
            return r11
        L_0x00e0:
            r4 = r5
            r3 = r14
        L_0x00e2:
            java.util.Collection r0 = (java.util.Collection) r0
            r10.o = r4
            r10.X = r0
            r10.Z = r1
            r5 = 3
            r10.u0 = r5
            ua3 r3 = (defpackage.ua3) r3
            java.lang.Object r3 = r3.awaitInternal(r10)
            if (r3 != r11) goto L_0x00f6
            return r11
        L_0x00f6:
            r7 = r1
            r9 = r4
            r18 = r3
            r3 = r0
            r0 = r18
        L_0x00fd:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = defpackage.x53.t0(r3, r0)
            r9.B()
            yx4 r0 = r9.c
            if (r0 == 0) goto L_0x0127
            int r1 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "insert "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " items around "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.b(r1)
        L_0x0127:
            r5 = 1
            r6 = 1
            r1 = r9
            r2 = r7
            r1.o(r2, r4, r5, r6)
            yv r0 = new yv
            r0.<init>(r9, r7, r13)
            kotlinx.coroutines.internal.ContextScope r1 = r9.v
            r10 = 3
            zf4 r2 = defpackage.j47.h(r1, r13, r0, r10)
            zv r0 = new zv
            r0.<init>(r9, r7, r13)
            zf4 r3 = defpackage.j47.h(r1, r13, r0, r10)
            xv r0 = new xv
            r11 = 0
            r1 = r0
            r4 = r9
            r5 = r7
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r7)
            kotlinx.coroutines.internal.ContextScope r1 = r9.u
            defpackage.j47.T(r1, r13, r13, r0, r10)
            goto L_0x0160
        L_0x0153:
            r10.o = r7
            r10.u0 = r2
            java.lang.Object r0 = r7.v(r8, r10)
            if (r0 != r11) goto L_0x015e
            return r11
        L_0x015e:
            r1 = r7
        L_0x015f:
            r9 = r1
        L_0x0160:
            yx4 r0 = r9.c
            if (r0 == 0) goto L_0x016d
            kv r1 = r9.z
            java.util.List r1 = r1.getValue()
            defpackage.kq0.u(r0, r1)
        L_0x016d:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.s(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(defpackage.uu r17, long r18, defpackage.lv r20, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r3 = r20
            r4 = r21
            boolean r5 = r4 instanceof defpackage.aw
            if (r5 == 0) goto L_0x001b
            r5 = r4
            aw r5 = (defpackage.aw) r5
            int r6 = r5.s0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.s0 = r6
            goto L_0x0020
        L_0x001b:
            aw r5 = new aw
            r5.<init>(r0, r4)
        L_0x0020:
            java.lang.Object r4 = r5.Y
            tx3 r13 = defpackage.tx3.a
            int r6 = r5.s0
            e5f r14 = defpackage.e5f.a
            r15 = 3
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x004d
            if (r6 == r8) goto L_0x0049
            if (r6 == r7) goto L_0x0040
            if (r6 != r15) goto L_0x0038
            defpackage.od2.a0(r4)
            goto L_0x00fb
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            long r0 = r5.X
            lv r2 = r5.o
            defpackage.od2.a0(r4)
            goto L_0x00ed
        L_0x0049:
            defpackage.od2.a0(r4)
            goto L_0x00a5
        L_0x004d:
            defpackage.od2.a0(r4)
            java.util.List r4 = r0.l(r1)
            boolean r6 = r4 instanceof java.util.Collection
            r9 = -1
            if (r6 == 0) goto L_0x0061
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0061
            goto L_0x00a6
        L_0x0061:
            java.util.Iterator r6 = r4.iterator()
        L_0x0065:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x00a6
            java.lang.Object r11 = r6.next()
            vk6 r11 = (defpackage.vk6) r11
            boolean r11 = r11 instanceof defpackage.uk6
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0065
            java.lang.Object r6 = defpackage.x53.g0(r4)
            boolean r6 = r6 instanceof defpackage.uk6
            if (r6 == 0) goto L_0x009a
            java.lang.Object r1 = r4.get(r8)
            vk6 r1 = (defpackage.vk6) r1
            long r1 = r1.k()
            sk6 r4 = r16.k()
            i13 r4 = r4.f(r1)
            if (r4 == 0) goto L_0x0096
            long r9 = r4.b()
        L_0x0096:
            int r4 = r0.m
        L_0x0098:
            r10 = r9
            goto L_0x00a9
        L_0x009a:
            nz4 r0 = defpackage.nz4.a
            r5.s0 = r8
            e5f r0 = r3.h0(r1, r0)
            if (r0 != r13) goto L_0x00a5
            return r13
        L_0x00a5:
            return r14
        L_0x00a6:
            int r4 = r0.n
            goto L_0x0098
        L_0x00a9:
            if (r4 != 0) goto L_0x00ac
            return r14
        L_0x00ac:
            yx4 r0 = r0.c
            if (r0 == 0) goto L_0x00d9
            java.lang.String r6 = defpackage.yx4.a(r1)
            java.lang.String r8 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "loadDataBackward time: "
            r9.<init>(r12)
            r9.append(r6)
            java.lang.String r6 = ", count: "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r6 = ", limit: "
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r0.b(r6)
        L_0x00d9:
            r5.o = r3
            r5.X = r1
            r5.s0 = r7
            r6 = r17
            r7 = r4
            r8 = r1
            r12 = r5
            java.lang.Object r4 = r6.d(r7, r8, r10, r12)
            if (r4 != r13) goto L_0x00eb
            return r13
        L_0x00eb:
            r0 = r1
            r2 = r3
        L_0x00ed:
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r5.o = r3
            r5.s0 = r15
            e5f r0 = r2.h0(r0, r4)
            if (r0 != r13) goto L_0x00fb
            return r13
        L_0x00fb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.t(uu, long, lv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(defpackage.uu r17, long r18, defpackage.lv r20, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r3 = r20
            r4 = r21
            boolean r5 = r4 instanceof defpackage.cw
            if (r5 == 0) goto L_0x001b
            r5 = r4
            cw r5 = (defpackage.cw) r5
            int r6 = r5.s0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.s0 = r6
            goto L_0x0020
        L_0x001b:
            cw r5 = new cw
            r5.<init>(r0, r4)
        L_0x0020:
            java.lang.Object r4 = r5.Y
            tx3 r13 = defpackage.tx3.a
            int r6 = r5.s0
            e5f r14 = defpackage.e5f.a
            r15 = 3
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x004d
            if (r6 == r8) goto L_0x0049
            if (r6 == r7) goto L_0x0040
            if (r6 != r15) goto L_0x0038
            defpackage.od2.a0(r4)
            goto L_0x00fd
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            long r0 = r5.X
            lv r2 = r5.o
            defpackage.od2.a0(r4)
            goto L_0x00ef
        L_0x0049:
            defpackage.od2.a0(r4)
            goto L_0x00aa
        L_0x004d:
            defpackage.od2.a0(r4)
            java.util.List r4 = r0.l(r1)
            boolean r6 = r4 instanceof java.util.Collection
            r9 = -1
            if (r6 == 0) goto L_0x0061
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0061
            goto L_0x00ab
        L_0x0061:
            java.util.Iterator r6 = r4.iterator()
        L_0x0065:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x00ab
            java.lang.Object r11 = r6.next()
            vk6 r11 = (defpackage.vk6) r11
            boolean r11 = r11 instanceof defpackage.uk6
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0065
            java.lang.Object r6 = defpackage.x53.p0(r4)
            boolean r6 = r6 instanceof defpackage.uk6
            if (r6 == 0) goto L_0x009f
            int r1 = r4.size()
            int r1 = r1 - r7
            java.lang.Object r1 = r4.get(r1)
            vk6 r1 = (defpackage.vk6) r1
            long r1 = r1.k()
            sk6 r4 = r16.k()
            i13 r4 = r4.d(r1)
            if (r4 == 0) goto L_0x009b
            long r9 = r4.a()
        L_0x009b:
            int r4 = r0.m
        L_0x009d:
            r10 = r9
            goto L_0x00ae
        L_0x009f:
            nz4 r0 = defpackage.nz4.a
            r5.s0 = r8
            e5f r0 = r3.h0(r1, r0)
            if (r0 != r13) goto L_0x00aa
            return r13
        L_0x00aa:
            return r14
        L_0x00ab:
            int r4 = r0.n
            goto L_0x009d
        L_0x00ae:
            yx4 r0 = r0.c
            if (r0 == 0) goto L_0x00db
            java.lang.String r6 = defpackage.yx4.a(r1)
            java.lang.String r8 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "loadDataForward time: "
            r9.<init>(r12)
            r9.append(r6)
            java.lang.String r6 = ", count: "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r6 = ", limit: "
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r0.b(r6)
        L_0x00db:
            r5.o = r3
            r5.X = r1
            r5.s0 = r7
            r6 = r17
            r7 = r4
            r8 = r1
            r12 = r5
            java.lang.Object r4 = r6.b(r7, r8, r10, r12)
            if (r4 != r13) goto L_0x00ed
            return r13
        L_0x00ed:
            r0 = r1
            r2 = r3
        L_0x00ef:
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r5.o = r3
            r5.s0 = r15
            e5f r0 = r2.h0(r0, r4)
            if (r0 != r13) goto L_0x00fd
            return r13
        L_0x00fd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.u(uu, long, lv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r15 instanceof defpackage.ew
            if (r2 == 0) goto L_0x0015
            r2 = r15
            ew r2 = (defpackage.ew) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0015
            int r3 = r3 - r4
            r2.t0 = r3
            goto L_0x001a
        L_0x0015:
            ew r2 = new ew
            r2.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r2.Z
            tx3 r10 = defpackage.tx3.a
            int r3 = r2.t0
            if (r3 == 0) goto L_0x0040
            if (r3 == r0) goto L_0x0037
            if (r3 != r1) goto L_0x002f
            java.util.Collection r12 = r2.X
            bx r13 = r2.o
            defpackage.od2.a0(r15)
            goto L_0x009a
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            long r13 = r2.Y
            bx r12 = r2.o
            defpackage.od2.a0(r15)
        L_0x003e:
            r5 = r13
            goto L_0x0080
        L_0x0040:
            defpackage.od2.a0(r15)
            fw r15 = new fw
            r3 = 0
            r15.<init>(r12, r13, r3)
            r4 = 3
            kotlinx.coroutines.internal.ContextScope r5 = r12.v
            defpackage.j47.T(r5, r3, r3, r15, r4)
            yx4 r15 = r12.c
            if (r15 == 0) goto L_0x0068
            java.lang.String r3 = defpackage.yx4.a(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "!WARN! loadEmptyChunksData: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r15.b(r3)
        L_0x0068:
            r2.o = r12
            r2.Y = r13
            r2.t0 = r0
            int r4 = r12.m
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            uu r3 = r12.j
            r5 = r13
            r9 = r2
            java.lang.Object r15 = r3.b(r4, r5, r7, r9)
            if (r15 != r10) goto L_0x003e
            return r10
        L_0x0080:
            r13 = r15
            java.util.Collection r13 = (java.util.Collection) r13
            uu r3 = r12.j
            r2.o = r12
            r2.X = r13
            r2.t0 = r1
            int r4 = r12.m
            r7 = -9223372036854775808
            r9 = r2
            java.lang.Object r15 = r3.d(r4, r5, r7, r9)
            if (r15 != r10) goto L_0x0097
            return r10
        L_0x0097:
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x009a:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r12 = defpackage.x53.t0(r12, r15)
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00ae:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00ce
            java.lang.Object r2 = r12.next()
            r3 = r2
            vk6 r3 = (defpackage.vk6) r3
            long r3 = r3.getId()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            boolean r3 = r14.add(r5)
            if (r3 == 0) goto L_0x00ae
            r15.add(r2)
            goto L_0x00ae
        L_0x00ce:
            m56[] r12 = new defpackage.m56[r1]
            gw r14 = defpackage.gw.a
            r1 = 0
            r12[r1] = r14
            hw r14 = defpackage.hw.a
            r12[r0] = r14
            ca3 r12 = defpackage.xfg.d(r12)
            java.util.List r12 = defpackage.x53.x0(r15, r12)
            kv r14 = r13.z
            bx r15 = r14.b
        L_0x00e5:
            java.util.List r1 = r14.getValue()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r13.p(r2, r12)
            k8 r3 = new k8
            r4 = 12
            r3.<init>(r4)
            defpackage.d63.Y(r2, r3)
            e(r15, r2)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0105
            goto L_0x0120
        L_0x0105:
            java.util.Iterator r3 = r2.iterator()
        L_0x0109:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0120
            java.lang.Object r4 = r3.next()
            vk6 r4 = (defpackage.vk6) r4
            boolean r4 = r4 instanceof defpackage.uk6
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x0109
            f(r15, r2)
            g(r15, r2)
        L_0x0120:
            boolean r1 = r14.c(r1, r2)
            if (r1 == 0) goto L_0x00e5
            e5f r12 = defpackage.e5f.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.v(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w() {
        Object value;
        Object obj;
        Object ovVar = new ov(j(), false);
        q0e q0e = this.C;
        do {
            value = q0e.getValue();
            Object obj2 = (qv) value;
            obj = obj2 instanceof nv ? (nv) obj2 : null;
            if (obj == null) {
                obj = ovVar;
            }
        } while (!q0e.c(value, obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.iw
            if (r0 == 0) goto L_0x0014
            r0 = r12
            iw r0 = (defpackage.iw) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.s0 = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            iw r0 = new iw
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            bx r9 = r6.o
            defpackage.od2.a0(r12)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            long r9 = r6.X
            bx r11 = r6.o
            defpackage.od2.a0(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L_0x0098
        L_0x0042:
            defpackage.od2.a0(r12)
            yx4 r12 = r9.c
            if (r12 == 0) goto L_0x005e
            java.lang.String r1 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadNext: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.b(r1)
        L_0x005e:
            r9.B()
            sk6 r1 = r9.k()
            java.util.List r1 = r1.i()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x00a5
            if (r12 == 0) goto L_0x0077
            java.lang.String r1 = "loadNext: Chunks not empty, started loading from datasources"
            r12.b(r1)
        L_0x0077:
            java.util.List r12 = r9.l(r10)
            vk6 r12 = defpackage.ft.o(r12)
            if (r12 == 0) goto L_0x0085
            long r10 = r12.k()
        L_0x0085:
            r6.o = r9
            r6.X = r10
            r6.s0 = r3
            uu r2 = r9.j
            wd6 r5 = r9.E
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.u(r2, r3, r5, r6)
            if (r12 != r0) goto L_0x0098
            return r0
        L_0x0098:
            kotlinx.coroutines.internal.ContextScope r12 = r9.v
            jw r0 = new jw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.j47.T(r12, r1, r1, r0, r10)
            goto L_0x00b0
        L_0x00a5:
            r6.o = r9
            r6.s0 = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto L_0x00b0
            return r0
        L_0x00b0:
            yx4 r10 = r9.c
            if (r10 == 0) goto L_0x00bd
            kv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.kq0.u(r10, r9)
        L_0x00bd:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.x(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void y() {
        Long l2;
        Object value;
        Object obj;
        Iterator it = ((l29) this.A.getValue()).a.iterator();
        if (!it.hasNext()) {
            l2 = null;
        } else {
            l2 = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((MessageModel) it.next()).c);
                if (l2.compareTo(valueOf) > 0) {
                    l2 = valueOf;
                }
            }
        }
        Object pvVar = new pv(l2 != null ? l2.longValue() : Long.MAX_VALUE, false);
        q0e q0e = this.C;
        do {
            value = q0e.getValue();
            Object obj2 = (qv) value;
            obj = obj2 instanceof nv ? (nv) obj2 : null;
            if (obj == null) {
                obj = pvVar;
            }
        } while (!q0e.c(value, obj));
    }
}
