package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bte  reason: default package */
public final class bte extends ffe implements a66 {
    public final /* synthetic */ cte X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bte(cte cte, Continuation continuation) {
        super(2, continuation);
        this.X = cte;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bte) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bte(this.X, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            defpackage.od2.a0(r13)
            cte r12 = r12.X
            java.util.List r13 = r12.o
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.z53.S(r13, r1)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L_0x0016:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r13.next()
            kpa r1 = (defpackage.kpa) r1
            java.lang.Object r2 = r1.a
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.b
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            boolean r2 = r1 instanceof defpackage.m55
            r5 = -1
            if (r2 == 0) goto L_0x0042
            r3 = r1
            m55 r3 = (defpackage.m55) r3
            java.util.concurrent.ExecutorService r3 = r3.a
            boolean r7 = r3 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r7 == 0) goto L_0x0040
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3
            long r5 = r3.getCompletedTaskCount()
        L_0x0040:
            r7 = r5
            goto L_0x004e
        L_0x0042:
            boolean r3 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r3 == 0) goto L_0x0040
            r3 = r1
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3
            long r5 = r3.getCompletedTaskCount()
            goto L_0x0040
        L_0x004e:
            r3 = -1
            if (r2 == 0) goto L_0x0064
            r5 = r1
            m55 r5 = (defpackage.m55) r5
            java.util.concurrent.ExecutorService r5 = r5.a
            boolean r6 = r5 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r6 == 0) goto L_0x0061
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5
            int r5 = r5.getActiveCount()
            goto L_0x0062
        L_0x0061:
            r5 = r3
        L_0x0062:
            r6 = r5
            goto L_0x0071
        L_0x0064:
            boolean r5 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r5 == 0) goto L_0x0070
            r5 = r1
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5
            int r5 = r5.getActiveCount()
            goto L_0x0062
        L_0x0070:
            r6 = r3
        L_0x0071:
            if (r2 == 0) goto L_0x008a
            r5 = r1
            m55 r5 = (defpackage.m55) r5
            java.util.concurrent.ExecutorService r5 = r5.a
            boolean r9 = r5 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r9 == 0) goto L_0x0087
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5
            int r9 = r5.getPoolSize()
            int r5 = r5.getActiveCount()
            goto L_0x0099
        L_0x0087:
            r9 = r3
        L_0x0088:
            r5 = r9
            goto L_0x009c
        L_0x008a:
            boolean r5 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r5 == 0) goto L_0x009b
            r5 = r1
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5
            int r9 = r5.getPoolSize()
            int r5 = r5.getActiveCount()
        L_0x0099:
            int r9 = r9 - r5
            goto L_0x0088
        L_0x009b:
            r5 = r3
        L_0x009c:
            if (r2 == 0) goto L_0x00b3
            r2 = r1
            m55 r2 = (defpackage.m55) r2
            java.util.concurrent.ExecutorService r2 = r2.a
            boolean r9 = r2 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r9 == 0) goto L_0x00b1
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            java.util.concurrent.BlockingQueue r2 = r2.getQueue()
            int r3 = r2.size()
        L_0x00b1:
            r11 = r3
            goto L_0x00c3
        L_0x00b3:
            boolean r2 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r2 == 0) goto L_0x00b1
            r2 = r1
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            java.util.concurrent.BlockingQueue r2 = r2.getQueue()
            int r2 = r2.size()
            r11 = r2
        L_0x00c3:
            n55 r2 = new n55
            boolean r9 = r1.isShutdown()
            boolean r10 = r1.isTerminated()
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r9, r10, r11)
            r0.add(r2)
            goto L_0x0016
        L_0x00d6:
            r13 = 0
            q0e r12 = r12.b
            r12.m(r13, r0)
            e5f r12 = defpackage.e5f.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.o(java.lang.Object):java.lang.Object");
    }
}
