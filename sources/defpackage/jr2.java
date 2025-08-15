package defpackage;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: jr2  reason: default package */
public final class jr2 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final y7d b;
    public final iy2 c;
    public final k56 d;
    public final je7 e;
    public x77 f;
    public volatile i92 g;
    public volatile long h;
    public volatile long i = 0;
    public volatile boolean j;
    public final je7 k = tu0.r(2, new md1(14, this));
    public final lx3 l;

    public jr2(long j2, qqd qqd, je7 je7, y7d y7d, iy2 iy2, b7c b7c) {
        this.a = j2;
        this.b = y7d;
        this.c = iy2;
        this.d = b7c;
        this.e = je7;
        int i2 = ft4.o;
        this.l = ((nx3) qqd.b).plus(new hr2(qx7.c, 0));
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "jr2", ey8.h(j2, "init #"), (Throwable) null);
        }
    }

    public final e52 a() {
        return (e52) ((jz2) this.c).m(this.a).a.getValue();
    }

    public final boolean b() {
        if (a() != null) {
            e52 a2 = a();
            Long l2 = null;
            Long valueOf = a2 != null ? Long.valueOf(a2.a) : null;
            ty2 ty2 = ((jz2) this.c).b;
            e52 e52 = (e52) ((j0e) ((ConcurrentHashMap) ty2.Z).computeIfAbsent(0L, new di(4, new jy2(0, ty2)))).getValue();
            if (e52 != null) {
                l2 = Long.valueOf(e52.a);
            }
            if (tpa.f(valueOf, l2)) {
                return true;
            }
        }
        return false;
    }

    public final e5f c(long j2, Continuation continuation) {
        boolean b2 = b();
        e5f e5f = e5f.a;
        if (!b2 || j2 != 0) {
            int i2 = ft4.o;
            long S = z7.S(System.nanoTime(), kt4.NANOSECONDS);
            long g2 = ft4.g(S, this.i);
            if (ft4.c(g2, ((ft4) this.k.getValue()).a) < 0) {
                hm9.k0("jr2", (Exception) null, "requestForChatSubscribeIfNeed #%d: request diff = %s", Arrays.copyOf(new Object[]{new Long(this.a), new ft4(g2)}, 2));
                return e5f;
            } else if (!((Boolean) this.d.invoke()).booleanValue()) {
                hm9.m0("jr2", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!", new Object[0]);
                return e5f;
            } else {
                this.i = S;
                k4a k4a = (k4a) ((pk) this.e.getValue());
                k4a.v(k4a, new br2(((p7b) k4a.y()).a.o(), j2, true));
                iy2 iy2 = this.c;
                ((jz2) iy2).l().Y(this.a, true);
                return e5f;
            }
        } else {
            hm9.k0("jr2", (Exception) null, "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", Arrays.copyOf(new Object[]{new Long(this.a)}, 1));
            return e5f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r5 = ((defpackage.ft4) r7.k.getValue()).a;
        r0.o = r7;
        r0.Z = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (defpackage.j47.y(r5, r0) != r1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r7.j == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r0.o = null;
        r0.Z = 5;
        r7.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r3 != r1) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r0.o = null;
        r0.Z = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r7.d(r0) != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ir2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ir2 r0 = (defpackage.ir2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ir2 r0 = new ir2
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0043;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002c:
            defpackage.od2.a0(r8)
            goto L_0x00db
        L_0x0031:
            defpackage.od2.a0(r8)
            goto L_0x00ce
        L_0x0036:
            jr2 r7 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x00bf
        L_0x003d:
            jr2 r7 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x00a9
        L_0x0043:
            defpackage.od2.a0(r8)
            goto L_0x0069
        L_0x0047:
            defpackage.od2.a0(r8)
            long r5 = r7.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "jr2"
            java.lang.String r5 = "subscribe() #%d"
            defpackage.hm9.m(r2, r5, r8)
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x006a
            r8 = 1
            r0.Z = r8
            r7.e(r0)
            if (r3 != r1) goto L_0x0069
            return r1
        L_0x0069:
            return r3
        L_0x006a:
            e52 r8 = r7.a()
            if (r8 == 0) goto L_0x0075
            e52 r8 = r7.f(r8)
            goto L_0x0076
        L_0x0075:
            r8 = r4
        L_0x0076:
            if (r8 != 0) goto L_0x008e
            iy2 r8 = r7.c
            long r5 = r7.a
            r0.o = r7
            r2 = 2
            r0.Z = r2
            jz2 r8 = (defpackage.jz2) r8
            p82 r8 = r8.l()
            r2 = 0
            r8.Y(r5, r2)
            if (r3 != r1) goto L_0x00a9
            return r1
        L_0x008e:
            k92 r2 = r8.b
            i92 r2 = r2.c
            r7.g = r2
            k92 r2 = r8.b
            long r5 = r2.a
            r7.h = r5
            k92 r8 = r8.b
            long r5 = r8.a
            r0.o = r7
            r8 = 3
            r0.Z = r8
            r7.c(r5, r0)
            if (r3 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            je7 r8 = r7.k
            java.lang.Object r8 = r8.getValue()
            ft4 r8 = (defpackage.ft4) r8
            long r5 = r8.a
            r0.o = r7
            r8 = 4
            r0.Z = r8
            java.lang.Object r8 = defpackage.j47.y(r5, r0)
            if (r8 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x00cf
            r0.o = r4
            r8 = 5
            r0.Z = r8
            r7.e(r0)
            if (r3 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            return r3
        L_0x00cf:
            r0.o = r4
            r8 = 6
            r0.Z = r8
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L_0x00db
            return r1
        L_0x00db:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e5f e(Continuation continuation) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "jr2", ey8.h(this.a, "unsubscribe() #"), (Throwable) null);
        }
        int i2 = ft4.o;
        this.i = 0;
        e52 f2 = f(a());
        e5f e5f = e5f.a;
        if (f2 == null) {
            return e5f;
        }
        ((k4a) ((pk) this.e.getValue())).k(f2.b.a, false);
        iy2 iy2 = this.c;
        ((jz2) iy2).l().Y(this.a, false);
        return e5f;
    }

    public final e52 f(e52 e52) {
        e52 a2 = a();
        long j2 = this.a;
        if (a2 == null) {
            hm9.m0("jr2", "validate #%d: chat is null", Long.valueOf(j2));
            return null;
        } else if (b()) {
            return a2;
        } else {
            k92 k92 = a2.b;
            if (k92.a == 0) {
                hm9.m0("jr2", "validate #%d: chatServerId == 0L", Long.valueOf(j2));
                return null;
            } else if (a2.C() || a2.R()) {
                hm9.m("jr2", "validate #%d: chat is valid!", Long.valueOf(j2));
                return e52;
            } else {
                hm9.m0("jr2", "validate #%d: invalid chat status %s", Long.valueOf(j2), k92.c);
                return null;
            }
        }
    }
}
