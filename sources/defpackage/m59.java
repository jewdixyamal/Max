package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m59  reason: default package */
public final class m59 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m59(n59 n59, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Z = n59;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m59 m59 = new m59(this.Z, this.s0, this.t0, this.u0, continuation);
        m59.Y = obj;
        return m59;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        n59 n59 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 = (sx3) this.Y;
            iy2 iy2 = n59.s0;
            this.Y = sx3;
            this.X = 1;
            p82 l = ((jz2) iy2).l();
            Long l2 = new Long(this.s0);
            l.getClass();
            l.c(l2.longValue(), v82.o);
            l.h(l2.longValue(), false, new un0(17));
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ua3 a = ngg.a();
        lx3 plus = ((w9a) n59.Y).b().plus(xq9.a);
        vx3 vx3 = vx3.c;
        ua3 ua3 = a;
        e5f e5f2 = e5f;
        k59 k59 = r7;
        tx3 tx32 = tx3;
        k59 k592 = new k59(ua3, this.Z, this.s0, this.t0, this.u0, (Continuation) null);
        j47.g(sx3, plus, vx3, k59);
        cx7 c = ((w9a) n59.Y).c();
        l59 l59 = new l59(n59, ua3, (Continuation) null);
        this.Y = null;
        this.X = 2;
        Object t02 = j47.t0(c, l59, this);
        tx3 tx33 = tx32;
        return t02 == tx33 ? tx33 : e5f2;
    }
}
