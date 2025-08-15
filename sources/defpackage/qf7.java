package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qf7  reason: default package */
public final class qf7 {
    public final mz6 a;
    public final je7 b;
    public final q0e c;
    public final w7c d;
    public final ContextScope e;
    public final aj9 f = bj9.a();

    public qf7(av0 av0, mz6 mz6, je7 je7, kke kke) {
        this.a = mz6;
        this.b = je7;
        q0e a2 = r0e.a(new g4f(new wv7(10)));
        this.c = a2;
        this.d = new w7c(a2);
        this.e = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    public static final void a(qf7 qf7, long j) {
        CharSequence g = ((ld2) ((lr2) qf7.b.getValue())).g(j);
        if (g == null) {
            g = "";
        }
        ns2 ns2 = new ns2(g, j);
        q0e q0e = qf7.c;
        g4f g4f = (g4f) q0e.getValue();
        wv7 wv7 = new wv7(g4f.a.h());
        wv7 wv72 = g4f.a;
        int h = wv72.h();
        for (int i = 0; i < h; i++) {
            wv7.f(wv72.e(i), wv72.i(i));
        }
        wv7.f(j, ns2);
        q0e.m((Object) null, new g4f(wv7));
    }

    public static final void b(qf7 qf7, long j) {
        q0e q0e = qf7.c;
        g4f g4f = (g4f) q0e.getValue();
        wv7 wv7 = new wv7(g4f.a.h());
        wv7 wv72 = g4f.a;
        int h = wv72.h();
        for (int i = 0; i < h; i++) {
            wv7.f(wv72.e(i), wv72.i(i));
        }
        wv7.g(j);
        q0e.m((Object) null, new g4f(wv7));
    }

    @uae
    public final void onEvent(f4f f4f) {
        j47.T(this.e, (lx3) null, (vx3) null, new pf7(this, f4f, (Continuation) null), 3);
    }
}
