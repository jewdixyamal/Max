package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: u22  reason: default package */
public final class u22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u22) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u22 u22 = new u22(continuation, this.Y);
        u22.X = obj;
        return u22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qo8 qo8 = (qo8) this.X;
        boolean z = qo8 instanceof mo8;
        ChangeOwnerScreen changeOwnerScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = ChangeOwnerScreen.u0;
            a32 a32 = (a32) changeOwnerScreen.Y.getValue();
            long j = ((mo8) qo8).a;
            boolean n0 = changeOwnerScreen.n0();
            uj3 uj3 = (uj3) ((ds3) a32.X.getValue()).c(j).a.getValue();
            String d = uj3 != null ? uj3.d() : null;
            if (d == null) {
                d = "";
            }
            e52 e52 = (e52) ((jz2) ((iy2) a32.o.getValue())).m(a32.b).a.getValue();
            if (e52 != null) {
                pnf.o(a32.Z, new y22(new eqe(n0 ? yea.e0 : yea.l0), e52.I() ? new gqe(yea.h0, ys.m0(new Object[]{d, e52.q()})) : new gqe(yea.j0, ys.m0(new Object[]{e52.q(), d})), j));
            }
        } else if (qo8 instanceof po8) {
            wha wha = new wha((Widget) changeOwnerScreen);
            wha.h(z7.B(changeOwnerScreen.getContext(), jpc.A2));
            wha.i();
        }
        return e5f.a;
    }
}
