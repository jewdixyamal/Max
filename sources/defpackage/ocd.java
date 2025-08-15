package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ocd  reason: default package */
public final class ocd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ocd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ocd) n((ygb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ocd ocd = new ocd(this.Y, continuation);
        ocd.X = obj;
        return ocd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ygb ygb = (ygb) this.X;
        if (ygb instanceof ygb) {
            Long l = ygb.a;
            add add = this.Y;
            long j = add.G0.get();
            jqe jqe = ygb.b;
            s35 s35 = add.z0;
            if (l != null && l.longValue() == j) {
                j47.T(add.a, ((w9a) add.r()).a(), (vx3) null, new tcd(add, (Continuation) null), 2);
                pnf.o(s35, new ahd(jqe, Integer.valueOf(woc.I)));
            } else if (l == null) {
                pnf.o(s35, new ahd(jqe, Integer.valueOf(woc.I)));
            }
        }
        return e5f.a;
    }
}
