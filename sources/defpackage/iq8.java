package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: iq8  reason: default package */
public final class iq8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jq8 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq8(jq8 jq8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = jq8;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iq8) n((on8) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iq8 iq8 = new iq8(this.Y, this.Z, continuation);
        iq8.X = obj;
        return iq8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        on8 on8 = (on8) this.X;
        bc7[] bc7Arr = jq8.K0;
        jq8 jq8 = this.Y;
        e52 t = jq8.t();
        e5f e5f = e5f.a;
        if (t == null) {
            return e5f;
        }
        if (tpa.f(on8, mn8.a)) {
            vxd n = pnf.n(jq8, ((w9a) jq8.Z).a(), (vx3) null, new gq8(jq8, t, (Continuation) null), 2);
            jq8.C0.o1(jq8, jq8.K0[1], n);
        } else if (!tpa.f(on8, nn8.a)) {
            throw new NoWhenBranchMatchedException();
        } else if (!this.Z) {
            return e5f;
        } else {
            vxd n2 = pnf.n(jq8, ((w9a) jq8.Z).a(), (vx3) null, new hq8(jq8, t, (Continuation) null), 2);
            jq8.D0.o1(jq8, jq8.K0[2], n2);
        }
        return e5f;
    }
}
