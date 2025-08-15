package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: so1  reason: default package */
public final class so1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public so1(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je73;
        this.b = je72;
        this.c = je7;
        this.d = je74;
        this.e = je75;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable a(defpackage.so1 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qo1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qo1 r0 = (defpackage.qo1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            qo1 r0 = new qo1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r7)
            goto L_0x0051
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            defpackage.od2.a0(r7)
            je7 r7 = r6.e
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r4 = r6.t()
            r0.Y = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            oab r7 = (defpackage.oab) r7
            uj3 r1 = r7.d
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.a(so1, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final Object b(Set set, Continuation continuation) {
        return j47.t0(((w9a) ((kke) this.c.getValue())).b(), new oo1(set, this, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ro1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ro1 r0 = (defpackage.ro1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ro1 r0 = new ro1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r7)
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ds3 r4 = (defpackage.ds3) r4
            r0.Y = r3
            java.lang.Comparable r7 = r4.b(r5, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            uj3 r7 = (defpackage.uj3) r7
            if (r7 == 0) goto L_0x004b
            boolean r3 = r7.w()
        L_0x004b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Set set, Continuation continuation) {
        boolean isEmpty = set.isEmpty();
        e5f e5f = e5f.a;
        if (isEmpty) {
            return e5f;
        }
        gi9 G = oag.G(set);
        int i = ft4.o;
        Object t = ((xb9) this.d.getValue()).t(G, z7.R(30, kt4.SECONDS), continuation);
        return t == tx3.a ? t : e5f;
    }
}
