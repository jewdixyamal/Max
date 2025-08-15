package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ezd  reason: default package */
public final class ezd extends ffe implements a66 {
    public final /* synthetic */ jzd X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ezd(jzd jzd, Continuation continuation) {
        super(2, continuation);
        this.X = jzd;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ezd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ezd(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jzd jzd = this.X;
        q0e q0e = jzd.w0;
        kl7 l = j1e.l();
        l.add(new uy3(zia.s, woc.f2, new eqe(jpc.A)));
        qyc qyc = (qyc) jzd.c;
        qyc.getClass();
        if (qyc.n(PmsKey.f19channelsenabled, false)) {
            l.add(new uy3(zia.r, yfa.j, new eqe(jpc.S)));
        }
        q0e.setValue(j1e.d(l));
        return e5f.a;
    }
}
