package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: un9  reason: default package */
public final class un9 implements dab {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public un9(dab dab, s2b s2b, Executor executor) {
        dab.getClass();
        this.b = dab;
        this.c = s2b;
        executor.getClass();
        this.d = executor;
    }

    public static void e(rq8 rq8, int i, fi0 fi0) {
        v84 o0 = o43.o0(rq8.n());
        g05 g05 = null;
        try {
            g05 g052 = new g05(o0);
            try {
                g052.S();
                fi0.g(i, g052);
                g05.d(g052);
                o43.S(o0);
            } catch (Throwable th) {
                th = th;
                g05 = g052;
                g05.d(g05);
                o43.S(o0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g05.d(g05);
            o43.S(o0);
            throw th;
        }
    }

    public final void a(fi0 fi0, eab eab) {
        switch (this.a) {
            case 0:
                ((oj0) eab).c.j(eab, "NetworkFetchProducer");
                mr0 mr0 = (mr0) this.d;
                hf5 n = mr0.n(fi0, eab);
                mr0.t(n, new h7b((Object) this, 26, (Object) n));
                return;
            default:
                hab hab = ((oj0) eab).c;
                q6b q6b = ((oj0) eab).a.q;
                q6b.getClass();
                ((dab) this.b).a(new q9(new r6b(this, fi0, hab, q6b, eab), 1), eab);
                return;
        }
    }

    public void c(rq8 rq8, hf5 hf5) {
        int i = rq8.c;
        hab a2 = hf5.a();
        eab eab = hf5.b;
        HashMap D = !a2.i(eab, "NetworkFetchProducer") ? null : ((mr0) this.d).D(hf5, i);
        hab a3 = hf5.a();
        a3.a(eab, "NetworkFetchProducer", D);
        a3.e(eab, "NetworkFetchProducer", true);
        ((oj0) eab).h("network", "default");
        e(rq8, 1, hf5.a);
    }

    public void d(rq8 rq8, hf5 hf5) {
        oj0 oj0 = (oj0) hf5.b;
        if (oj0.w0.o != null && oj0.f()) {
            ((mr0) this.d).getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - hf5.c >= 100) {
                hf5.c = uptimeMillis;
                hf5.a().b(hf5.b);
                e(rq8, 0, hf5.a);
            }
        }
    }

    public un9(y7g y7g, ja6 ja6, mr0 mr0) {
        this.b = y7g;
        this.c = ja6;
        this.d = mr0;
    }
}
