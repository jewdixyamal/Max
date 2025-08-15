package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: c50  reason: default package */
public final class c50 implements am7 {
    public static final /* synthetic */ bc7[] h;
    public final je7 a;
    public final ContextScope b;
    public final w4d c = mqd.D();
    public final w4d d = new w4d(3, (Object) this);
    public volatile Long e;
    public final q0e f;
    public final zn5 g;

    static {
        oi9 oi9 = new oi9(c50.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        h = new bc7[]{oi9};
    }

    public c50(je7 je7, je7 je72) {
        this.a = je72;
        this.b = j1e.a(((w9a) ((kke) je7.getValue())).c().getImmediate().plus(pag.a()));
        q0e a2 = r0e.a(new zl7((Float) null, false));
        this.f = a2;
        this.g = new zn5(a2, new a50(je72, this, (Continuation) null));
    }

    public static final void f(c50 c50) {
        vxd T = j47.T(c50.b, (lx3) null, vx3.b, new b50(c50, (Continuation) null), 1);
        c50.c.o1(c50, h[0], T);
    }

    public final void a() {
        if (((uh9) g()).x) {
            ((uh9) g()).t();
        }
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void c() {
        q0e q0e = this.f;
        ((zl7) q0e.getValue()).getClass();
        q0e.m((Object) null, new zl7((Float) null, false));
    }

    public final mn5 d() {
        return this.g;
    }

    public final void e() {
        uh9 uh9 = (uh9) g();
        uh9.getClass();
        j47.T(uh9.h, (lx3) null, (vx3) null, new rh9(uh9, 1.0f, (Continuation) null), 3);
        long l = ((uh9) g()).l();
        Long l2 = this.e;
        boolean z = l2 != null && l == l2.longValue();
        if (((uh9) g()).x && z) {
            ((uh9) g()).q();
        } else if (!((uh9) g()).w || !z) {
            Long l3 = this.e;
            if (l3 != null) {
                long longValue = l3.longValue();
                ch9 g2 = g();
                uh9 uh92 = (uh9) g2;
                j47.T(uh92.h, ((w9a) uh92.b).b(), (vx3) null, new oh9(new zg9(longValue), uh92, (Continuation) null), 2);
            }
        } else {
            ((uh9) g()).r();
        }
    }

    public final ch9 g() {
        return (ch9) this.a.getValue();
    }

    public final void release() {
        j1e.i(this.b, (CancellationException) null);
        ((uh9) g()).s(this.d);
    }

    public final void seekTo(long j) {
        uh9 uh9 = (uh9) g();
        uh9.getClass();
        j47.T(uh9.h, (lx3) null, (vx3) null, new qh9(j, uh9, (Continuation) null), 3);
    }
}
