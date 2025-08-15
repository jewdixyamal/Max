package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: qx9  reason: default package */
public final class qx9 {
    public static final /* synthetic */ int e = 0;
    public final kke a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public qx9(je7 je7, je7 je72, je7 je73, kke kke) {
        this.a = kke;
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.qx9 r4, java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.ix9
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ix9 r0 = (defpackage.ix9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            ix9 r0 = new ix9
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            defpackage.od2.a0(r6)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            goto L_0x004a
        L_0x002a:
            r4 = move-exception
            goto L_0x004c
        L_0x002c:
            r4 = move-exception
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            defpackage.od2.a0(r6)
            je7 r4 = r4.b     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            ud5 r4 = (defpackage.ud5) r4     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            r0.Y = r3     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r6 = r4.b(r5, r0)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            if (r6 != r1) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            r1 = r6
            goto L_0x0056
        L_0x004c:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "getAnalyticsEntries: failed"
            defpackage.hm9.l(r5, r6, r4)
            nz4 r4 = defpackage.nz4.a
            r1 = r4
        L_0x0056:
            return r1
        L_0x0057:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.a(qx9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.qx9 r7, long r8, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof defpackage.jx9
            if (r0 == 0) goto L_0x0017
            r0 = r12
            jx9 r0 = (defpackage.jx9) r0
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
            jx9 r0 = new jx9
            r0.<init>(r7, r12)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            long r10 = r6.X
            long r8 = r6.o
            defpackage.od2.a0(r12)     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            goto L_0x0057
        L_0x0030:
            r7 = move-exception
            goto L_0x0059
        L_0x0032:
            r7 = move-exception
            goto L_0x006f
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            defpackage.od2.a0(r12)
            je7 r7 = r7.d     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r1 = r7
            yx9 r1 = (defpackage.yx9) r1     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.o = r8     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.X = r10     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.s0 = r2     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b(r2, r4, r6)     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            if (r12 != r0) goto L_0x0057
            goto L_0x006e
        L_0x0057:
            r0 = r12
            goto L_0x006e
        L_0x0059:
            java.lang.String r12 = "getProcessedMessage: failed for chatServerId="
            java.lang.String r0 = ", messageId="
            java.lang.StringBuilder r8 = defpackage.au1.k(r8, r12, r0)
            java.lang.String r9 = " "
            java.lang.String r8 = defpackage.zr6.k(r8, r10, r9)
            java.lang.String r9 = "qx9"
            defpackage.hm9.l(r9, r8, r7)
            r7 = 0
            r0 = r7
        L_0x006e:
            return r0
        L_0x006f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.b(qx9, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [qpd, java.util.Map] */
    public static final Object c(qx9 qx9, List list, List list2, boolean z, Continuation continuation) {
        Object obj;
        qx9.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            vd5 vd5 = (vd5) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                ux9 ux9 = (ux9) obj;
                if (ux9.a == vd5.b && ux9.b == vd5.c) {
                    break;
                }
            }
            ux9 ux92 = (ux9) obj;
            if (ux92 != null) {
                boolean z2 = ux92 instanceof tx9;
                long j = ux92.a;
                long j2 = ux92.b;
                if (z2) {
                    StringBuilder k = au1.k(j2, "onMessagesProcessed: show, messageId=", ", chatId=");
                    k.append(j);
                    hm9.m("qx9", k.toString(), new Object[0]);
                    boolean z3 = ((tx9) ux92).d;
                    rx9 e2 = qx9.e();
                    e2.getClass();
                    String str = vd5.k;
                    try {
                        if (str.length() != 0) {
                            ? qpd = new qpd(0);
                            rx9.a(qpd, vd5);
                            qpd.put("p_op", "show");
                            e2.b().b(str, qpd);
                        }
                    } catch (Exception e3) {
                        hm9.p(rx9.d, "onNotificationShow: failed", e3);
                        ((cba) e2.c()).c(new Exception("failed to log notification show", e3), true);
                    }
                    arrayList.add(vd5.a(vd5));
                } else if (ux92 instanceof sx9) {
                    StringBuilder k2 = au1.k(j2, "onMessagesProcessed: drop, messageId=", ", chatId=");
                    k2.append(j);
                    k2.append(", reason=");
                    ks4 ks4 = ((sx9) ux92).d;
                    k2.append(ks4);
                    hm9.m("qx9", k2.toString(), new Object[0]);
                    rx9 e4 = qx9.e();
                    e4.getClass();
                    String str2 = vd5.k;
                    try {
                        if (str2.length() != 0) {
                            HashMap hashMap = new HashMap();
                            rx9.a(hashMap, vd5);
                            hashMap.put("p_op", "drop");
                            hashMap.put("p_dr", ks4.a);
                            e4.b().b(str2, hashMap);
                        }
                    } catch (Exception e5) {
                        hm9.p(rx9.d, "onNotificationShow: failed", e5);
                        ((cba) e4.c()).c(new Exception("failed to log notification drop", e5), true);
                    }
                    arrayList.add(vd5.a(vd5));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        boolean z4 = !arrayList.isEmpty();
        e5f e5f = e5f.a;
        if (!z4) {
            return e5f;
        }
        qx9 qx92 = qx9;
        Object h = qx9.h(arrayList, continuation);
        return h == tx3.a ? h : e5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.qx9 r4, java.util.ArrayList r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.px9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            px9 r0 = (defpackage.px9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            px9 r0 = new px9
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.od2.a0(r6)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            goto L_0x0059
        L_0x0027:
            r4 = move-exception
            goto L_0x0052
        L_0x0029:
            r4 = move-exception
            goto L_0x005c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            je7 r4 = r4.d     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            yx9 r4 = (defpackage.yx9) r4     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r4.getClass()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            xx9 r6 = new xx9     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            ilc r4 = r4.a     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = defpackage.ote.j(r4, r6, r0)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            if (r4 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0052:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "storeMessagesProcessed: failed "
            defpackage.hm9.l(r5, r6, r4)
        L_0x0059:
            e5f r1 = defpackage.e5f.a
        L_0x005b:
            return r1
        L_0x005c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.d(qx9, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final rx9 e() {
        return (rx9) this.c.getValue();
    }

    public final Object f(je5 je5, vd5 vd5, cqb cqb) {
        Object t0 = j47.t0(((w9a) this.a).b(), new kx9(vd5, this, je5, (Continuation) null), cqb);
        return t0 == tx3.a ? t0 : e5f.a;
    }

    public final Object g(long j, long j2, Continuation continuation) {
        Object t0 = j47.t0(((w9a) this.a).b(), new mx9(this, j, j2, (Continuation) null), continuation);
        return t0 == tx3.a ? t0 : e5f.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nx9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            nx9 r0 = (defpackage.nx9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            nx9 r0 = new nx9
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.od2.a0(r6)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            goto L_0x005a
        L_0x0027:
            r4 = move-exception
            goto L_0x0053
        L_0x0029:
            r4 = move-exception
            goto L_0x005d
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            je7 r4 = r4.b     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            ud5 r4 = (defpackage.ud5) r4     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r4.getClass()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            uh r6 = new uh     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r2 = 8
            r6.<init>(r4, r2, r5)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            ilc r4 = r4.a     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = defpackage.ote.j(r4, r6, r0)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            if (r4 != r1) goto L_0x005a
            return r1
        L_0x0053:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "putAnalyticsEntries: failed"
            defpackage.hm9.l(r5, r6, r4)
        L_0x005a:
            e5f r4 = defpackage.e5f.a
            return r4
        L_0x005d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.h(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
