package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: eqb  reason: default package */
public final class eqb implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final ContextScope x0;

    public eqb(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, kke kke, ox3 ox3) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.o = je74;
        this.X = je75;
        this.Y = je76;
        this.Z = je77;
        this.s0 = je78;
        this.t0 = je79;
        this.u0 = je710;
        this.v0 = je711;
        this.w0 = je712;
        this.x0 = j1e.a(((w9a) kke).b().limitedParallelism(1, "push").plus(ox3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.eqb r4, defpackage.je5 r5, defpackage.vd5 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.cqb
            if (r0 == 0) goto L_0x0016
            r0 = r7
            cqb r0 = (defpackage.cqb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            cqb r0 = new cqb
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            defpackage.od2.a0(r7)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            goto L_0x0051
        L_0x002a:
            r4 = move-exception
            goto L_0x004a
        L_0x002c:
            r4 = move-exception
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            defpackage.od2.a0(r7)
            je7 r4 = r4.t0     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            qx9 r4 = (defpackage.qx9) r4     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            r0.Y = r3     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.f(r5, r6, r0)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            if (r4 != r1) goto L_0x0051
            goto L_0x0053
        L_0x004a:
            java.lang.String r5 = "eqb"
            java.lang.String r6 = "notifyTracker: failed"
            defpackage.hm9.p(r5, r6, r4)
        L_0x0051:
            e5f r1 = defpackage.e5f.a
        L_0x0053:
            return r1
        L_0x0054:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqb.b(eqb, je5, vd5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        pag.e(this.x0.getCoroutineContext(), new CancellationException("logout"));
    }

    public final boolean c() {
        if (!((ri4) this.b.getValue()).d()) {
            je7 je7 = this.a;
            return ((ch3) je7.getValue()).e() || ((!((ch3) je7.getValue()).d() || !((ch3) je7.getValue()).a().g()) && !((ch3) je7.getValue()).c());
        }
    }

    public final boolean d(long j, long j2) {
        oq0 c2 = ((f5a) this.v0.getValue()).c();
        boolean z = c2.b;
        boolean z2 = c2.a;
        if (z2 && !z) {
            return false;
        }
        hm9.m0("eqb", "onMessagePush: skipped (authorized=" + z2 + ", external=" + z + "), chatServerId=" + j + ", messageId=" + j2, new Object[0]);
        return true;
    }

    public final void e(je5 je5, vd5 vd5) {
        long j = je5.a;
        long j2 = je5.b;
        if (!d(j, j2)) {
            StringBuilder k = au1.k(j, "onMessagePush: chatServerId=", ", messageId=");
            k.append(j2);
            hm9.m("eqb", k.toString(), new Object[0]);
            j47.T(this.x0, (lx3) null, (vx3) null, new dqb(this, je5, vd5, (Continuation) null), 3);
            f(false, c());
        }
    }

    public final void f(boolean z, boolean z2) {
        hm9.m("eqb", "onPush: callPush=" + z + ", forceConnection=" + z2, new Object[0]);
        je7 je7 = this.c;
        ((p7b) ((m7b) je7.getValue())).a.l("app.last.firebase_push_time", Long.valueOf(System.currentTimeMillis()));
        if (z2) {
            ((p7b) ((m7b) je7.getValue())).a.y(true);
            ((k4a) ((pk) this.Z.getValue())).G(((ri4) this.b.getValue()).d());
            ((boe) this.X.getValue()).a();
        }
        ((ad) this.Y.getValue()).f("ACTION_FCM_PUSH");
    }
}
