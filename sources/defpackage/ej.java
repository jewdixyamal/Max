package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ej  reason: default package */
public final class ej extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gj Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ej(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Y = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ej) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ej(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[LOOP:0: B:23:0x007c->B:25:0x0082, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            tx3 r1 = defpackage.tx3.a
            int r2 = r7.X
            r3 = 3
            r4 = 2
            r5 = 1
            gj r6 = r7.Y
            if (r2 == 0) goto L_0x0026
            if (r2 == r5) goto L_0x0022
            if (r2 == r4) goto L_0x001e
            if (r2 != r3) goto L_0x0016
            defpackage.od2.a0(r8)
            goto L_0x0076
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001e:
            defpackage.od2.a0(r8)
            goto L_0x0052
        L_0x0022:
            defpackage.od2.a0(r8)
            goto L_0x003c
        L_0x0026:
            defpackage.od2.a0(r8)
            bc7[] r8 = defpackage.gj.p
            khe r8 = r6.i
            java.lang.Object r8 = r8.getValue()
            a7c r8 = (defpackage.a7c) r8
            r7.X = r5
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r1) goto L_0x003c
            return r1
        L_0x003c:
            z6c r8 = (defpackage.z6c) r8
            if (r8 == 0) goto L_0x004b
            r7.X = r4
            bc7[] r2 = defpackage.gj.p
            java.lang.Object r8 = r6.f(r8, r7)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x004b:
            java.lang.String r8 = r6.f
            java.lang.String r2 = "Didn't find section with Reactions. Warmup"
            defpackage.hm9.m(r8, r2, new java.lang.Object[0])
        L_0x0052:
            bc7[] r8 = defpackage.gj.p
            wh r8 = r6.h()
            r7.X = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM animoji"
            xlc r2 = defpackage.xlc.a(r0, r2)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            vh r4 = new vh
            r4.<init>(r8, r2, r0)
            ilc r8 = r8.a
            java.lang.Object r8 = defpackage.ote.i(r8, r3, r4, r7)
            if (r8 != r1) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r7 = r8.iterator()
        L_0x007c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0095
            java.lang.Object r8 = r7.next()
            ii r8 = (defpackage.ii) r8
            bc7[] r0 = defpackage.gj.p
            r6.getClass()
            ph r8 = defpackage.gj.l(r8)
            r6.j(r8)
            goto L_0x007c
        L_0x0095:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej.o(java.lang.Object):java.lang.Object");
    }
}
