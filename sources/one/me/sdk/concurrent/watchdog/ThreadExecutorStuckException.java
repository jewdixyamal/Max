package one.me.sdk.concurrent.watchdog;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/concurrent/watchdog/ThreadExecutorStuckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-concurrent"}, k = 1, mv = {2, 0, 0})
public final class ThreadExecutorStuckException extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ThreadExecutorStuckException(java.lang.Iterable r11) {
        /*
            r10 = this;
            int r0 = defpackage.ft4.o
            long r0 = java.lang.System.nanoTime()
            kt4 r2 = defpackage.kt4.NANOSECONDS
            long r0 = defpackage.z7.S(r0, r2)
            c08 r2 = new c08
            r3 = 2
            r2.<init>(r0, r3)
            java.util.List r4 = defpackage.x53.x0(r11, r2)
            boolean r2 = r11 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0023
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            goto L_0x003b
        L_0x0023:
            java.util.Iterator r2 = r11.iterator()
            r5 = 0
        L_0x0028:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x003a
            r2.next()
            int r5 = r5 + 1
            if (r5 < 0) goto L_0x0036
            goto L_0x0028
        L_0x0036:
            defpackage.y53.Q()
            throw r3
        L_0x003a:
            r2 = r5
        L_0x003b:
            java.lang.String r5 = "Tasks in queue: "
            java.lang.String r6 = "\n"
            java.lang.String r6 = defpackage.wg0.g(r2, r5, r6)
            jh2 r8 = new jh2
            r2 = 7
            r8.<init>(r0, r2)
            r5 = 0
            r7 = 0
            r9 = 29
            java.lang.String r0 = defpackage.x53.n0(r4, r5, r6, r7, r8, r9)
            r10.<init>(r0)
            int r0 = defpackage.ft4.o
            long r0 = java.lang.System.nanoTime()
            kt4 r2 = defpackage.kt4.NANOSECONDS
            long r0 = defpackage.z7.S(r0, r2)
            java.util.Iterator r11 = r11.iterator()
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L_0x006b
            goto L_0x00a0
        L_0x006b:
            java.lang.Object r3 = r11.next()
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L_0x0076
            goto L_0x00a0
        L_0x0076:
            r2 = r3
            urf r2 = (defpackage.urf) r2
            long r4 = r2.b(r0)
            ft4 r2 = new ft4
            r2.<init>(r4)
        L_0x0082:
            java.lang.Object r4 = r11.next()
            r5 = r4
            urf r5 = (defpackage.urf) r5
            long r5 = r5.b(r0)
            ft4 r7 = new ft4
            r7.<init>(r5)
            int r5 = r2.compareTo(r7)
            if (r5 >= 0) goto L_0x009a
            r3 = r4
            r2 = r7
        L_0x009a:
            boolean r4 = r11.hasNext()
            if (r4 != 0) goto L_0x0082
        L_0x00a0:
            urf r3 = (defpackage.urf) r3
            if (r3 == 0) goto L_0x00b1
            java.lang.Thread r11 = r3.d
            if (r11 == 0) goto L_0x00b1
            java.lang.StackTraceElement[] r11 = r11.getStackTrace()
            if (r11 == 0) goto L_0x00b1
            r10.setStackTrace(r11)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException.<init>(java.lang.Iterable):void");
    }
}
