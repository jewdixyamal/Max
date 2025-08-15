package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: edd  reason: default package */
public final class edd extends ffe implements a66 {
    public final /* synthetic */ ndd X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public edd(ndd ndd, Continuation continuation) {
        super(2, continuation);
        this.X = ndd;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((edd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new edd(this.X, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        od2.a0(obj);
        kl7 l = j1e.l();
        bc7[] bc7Arr = ndd.A0;
        ndd ndd = this.X;
        ndd.getClass();
        l.add(new b1d(new eqe(gha.r), 0, (long) fha.y));
        l.add(new c1d(1, new eqe(gha.p), 0, (long) fha.o, new dfd(ndd.t(ndd.r().g.getInt("app.media.load.photo", 0), false), (Integer) null)));
        l.add(new c1d(2, new eqe(gha.l), 0, (long) fha.l, new dfd(ndd.t(ndd.r().g.getInt("app.media.load.gif", 0), false), (Integer) null)));
        l.add(new c1d(2, new eqe(gha.i), 0, (long) fha.k, new dfd(ndd.t(ndd.r().g.getInt("app.media.load.audio", 0), false), (Integer) null)));
        l.add(new c1d(3, new eqe(gha.o), 0, (long) fha.n, new ffd(ndd.r().n(), true)));
        l.add(new b1d(new eqe(gha.s), 1, (long) fha.z));
        l.add(new c1d(1, new eqe(gha.v), 1, (long) fha.p, new dfd(ndd.t(ndd.r().g.getInt("app.video.auto.play", 1), true), (Integer) null)));
        je7 je7 = ndd.o;
        qyc qyc = (qyc) ((y7d) ((rj) je7.getValue()).b.getValue());
        qyc.getClass();
        boolean n = qyc.n(PmsKey.f21chatanimojienabled, false);
        long j = (long) fha.m;
        l.add(new c1d(n ? 2 : 3, new eqe(gha.m), 1, j, new ffd(((jp) ndd.r()).g.getBoolean("app.media.autoplay.gif", true), true)));
        if (n) {
            l.add(new c1d(3, new eqe(gha.h), 1, (long) fha.j, new ffd(((rj) je7.getValue()).a(), true)));
        }
        l.add(new b1d(new eqe(gha.t), 2, (long) fha.A));
        l.add(new c1d(4, new eqe(gha.w), 2, (long) fha.r, new dfd(new iqe(ndd.r().q().a.a), (Integer) null)));
        l.add(new c1d(4, new eqe(gha.k), 3, (long) fha.q, cfd.a));
        kl7 d = j1e.d(l);
        do {
            q0e = ndd.X;
            value = q0e.getValue();
            List list = (List) value;
        } while (!q0e.c(value, d));
        return e5f.a;
    }
}
