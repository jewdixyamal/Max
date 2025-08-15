package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ey7  reason: default package */
public final class ey7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l84 Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey7(l84 l84, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = l84;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ey7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ey7 ey7 = new ey7(this.Z, this.s0, continuation);
        ey7.Y = obj;
        return ey7;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        l84 l84 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            this.Y = sx32;
            this.X = 1;
            fz6 fz6 = (fz6) ((bkg) l84.c).b;
            Object t0 = j47.t0(((w9a) fz6.c).b(), new ty6(fz6, (Continuation) null), this);
            if (t0 == tx3) {
                return tx3;
            }
            sx3 = sx32;
            obj = t0;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qjc qjc = (qjc) obj;
        hm9.m("l84", "onStateChanged: allMediaCountResult is " + qjc, new Object[0]);
        if (qjc instanceof mjc) {
            hm9.l0("l84", "onStateChanged: error", ((mjc) qjc).a);
        } else if (qjc instanceof ojc) {
            if (this.s0 != ((Number) ((ojc) qjc).a).intValue() && j1e.z(sx3)) {
                ((k56) l84.d).invoke();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
