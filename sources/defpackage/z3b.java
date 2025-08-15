package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: z3b  reason: default package */
public final class z3b {
    public static final /* synthetic */ bc7[] i;
    public final ch9 a;
    public final t50 b;
    public final ContextScope c;
    public final w4d d = mqd.D();
    public final q0e e = r0e.a((Object) null);
    public final w7c f;
    public final y8 g;
    public final AtomicReference h;

    static {
        oi9 oi9 = new oi9(z3b.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9};
    }

    public z3b(kke kke, ch9 ch9, t50 t50) {
        this.a = ch9;
        this.b = t50;
        this.c = j1e.a(((w9a) kke).a());
        this.f = ((uh9) ch9).H;
        this.g = new y8((Object) this);
        this.h = new AtomicReference((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r15, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            r0 = r14
            t50 r0 = r0.b
            ch9 r0 = r0.a
            uh9 r0 = (defpackage.uh9) r0
            bh9 r1 = r0.n()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.util.Map r1 = r1.c
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Object r1 = r1.get(r3)
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            boolean r3 = r1 instanceof java.lang.Long
            if (r3 == 0) goto L_0x0021
            java.lang.Long r1 = (java.lang.Long) r1
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            if (r1 == 0) goto L_0x0029
            long r3 = r1.longValue()
            goto L_0x002b
        L_0x0029:
            r3 = 0
        L_0x002b:
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0037
            boolean r3 = r0.y
            if (r3 == 0) goto L_0x0037
            r0.t()
            goto L_0x006f
        L_0x0037:
            if (r1 != 0) goto L_0x0041
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x0041
            r0.q()
            goto L_0x006f
        L_0x0041:
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x004b
            r0.r()
            goto L_0x006f
        L_0x004b:
            yg9 r1 = new yg9
            r5 = r1
            r6 = r15
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r5.<init>(r6, r8, r10, r11, r12, r13)
            kke r3 = r0.b
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.b()
            oh9 r4 = new oh9
            r4.<init>(r1, r0, r2)
            r1 = 2
            kotlinx.coroutines.internal.ContextScope r0 = r0.h
            defpackage.j47.T(r0, r3, r2, r4, r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3b.a(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void b() {
        vxd T = j47.T(this.c, (lx3) null, (vx3) null, new x3b(this, (Continuation) null), 3);
        this.d.o1(this, i[0], T);
    }
}
