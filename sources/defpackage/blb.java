package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: blb  reason: default package */
public final class blb {
    public final adb a;
    public final je7 b;
    public final ContextScope c;
    public final ua3 d = ngg.a();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public blb(adb adb, je7 je7, je7 je72, o45 o45) {
        this.a = adb;
        this.b = je72;
        ContextScope a2 = j1e.a(((w9a) ((kke) je7.getValue())).b().limitedParallelism(1, "profile_repository").plus(new qj(o45)));
        this.c = a2;
        uh uhVar = new uh(adb, 19, xlc.a(0, "SELECT * FROM profile"));
        od2.L(new zn5(new mqc(new cy3((ilc) adb.a, new String[]{"profile"}, uhVar, (Continuation) null)), new xkb(this, je72, (Continuation) null), 5), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ykb
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ykb r0 = (defpackage.ykb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ykb r0 = new ykb
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            long r7 = r0.X
            blb r6 = r0.o
            defpackage.od2.a0(r9)
        L_0x002a:
            r1 = r7
            goto L_0x0046
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            defpackage.od2.a0(r9)
            ua3 r9 = r6.d
            r0.o = r6
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r9 = r9.awaitInternal(r0)
            if (r9 != r1) goto L_0x002a
            return r1
        L_0x0046:
            java.util.concurrent.ConcurrentHashMap r7 = r6.e
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r1)
            java.lang.Object r7 = r7.get(r8)
            oab r7 = (defpackage.oab) r7
            if (r7 == 0) goto L_0x0056
            return r7
        L_0x0056:
            java.lang.Class<blb> r7 = defpackage.blb.class
            java.lang.String r7 = r7.getName()
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x0061
            goto L_0x006f
        L_0x0061:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x006f
            us7 r9 = defpackage.us7.X
            r0 = 0
            java.lang.String r3 = "getProfile: return stubProfile"
            r8.d(r9, r7, r3, r0)
        L_0x006f:
            oab r7 = new oab
            oz4 r3 = defpackage.oz4.a
            nz4 r4 = defpackage.nz4.a
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            uj3 r5 = r6.a(r1)
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(nab nab) {
        String name = blb.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "putProfile: " + nab, (Throwable) null);
        }
        j47.T(this.c, (lx3) null, (vx3) null, new zkb(nab, this, (Continuation) null), 3);
    }
}
