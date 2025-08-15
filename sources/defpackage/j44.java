package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j44  reason: default package */
public final class j44 extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ o44 Z;
    public final /* synthetic */ m56 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j44(o44 o44, m56 m56, Continuation continuation) {
        super(2, continuation);
        this.Z = o44;
        this.s0 = m56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j44) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j44(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0066=Splitter:B:22:0x0066, B:27:0x008b=Splitter:B:27:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            o44 r2 = r8.Z
            r3 = 1
            java.lang.String r4 = "finish "
            if (r1 == 0) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            int r8 = r8.X
            defpackage.od2.a0(r9)     // Catch:{ CancellationException -> 0x0015, all -> 0x0013 }
            goto L_0x004a
        L_0x0013:
            r9 = move-exception
            goto L_0x0066
        L_0x0015:
            r9 = move-exception
            goto L_0x008b
        L_0x0018:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0020:
            defpackage.od2.a0(r9)
            java.util.concurrent.atomic.AtomicInteger r9 = r2.i
            int r9 = r9.incrementAndGet()
            java.lang.String r1 = defpackage.o44.k
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "start "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            defpackage.hm9.m(r1, r5, new java.lang.Object[0])
            m56 r1 = r8.s0     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            r8.X = r9     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            r8.Y = r3     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            java.lang.Object r8 = r1.invoke(r8)     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            if (r8 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r8 = r9
        L_0x004a:
            java.lang.String r9 = defpackage.o44.k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
        L_0x0051:
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            defpackage.hm9.m(r9, r8, new java.lang.Object[0])
            goto L_0x0088
        L_0x005c:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0066
        L_0x0061:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x008b
        L_0x0066:
            bc7[] r0 = defpackage.o44.j     // Catch:{ all -> 0x008c }
            r2.getClass()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "DebounceNotificationDispatcher"
            java.lang.String r1 = "failure"
            defpackage.hm9.p(r0, r1, r9)     // Catch:{ all -> 0x008c }
            je7 r0 = r2.b     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008c }
            o45 r0 = (defpackage.o45) r0     // Catch:{ all -> 0x008c }
            cba r0 = (defpackage.cba) r0     // Catch:{ all -> 0x008c }
            r1 = 0
            r0.c(r9, r1)     // Catch:{ all -> 0x008c }
            java.lang.String r9 = defpackage.o44.k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            goto L_0x0051
        L_0x0088:
            e5f r8 = defpackage.e5f.a
            return r8
        L_0x008b:
            throw r9     // Catch:{ all -> 0x008c }
        L_0x008c:
            r9 = move-exception
            java.lang.String r0 = defpackage.o44.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            defpackage.hm9.m(r0, r8, new java.lang.Object[0])
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j44.o(java.lang.Object):java.lang.Object");
    }
}
