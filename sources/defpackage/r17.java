package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* renamed from: r17  reason: default package */
public final class r17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((r17) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r17 r17 = new r17(continuation, this.Y);
        r17.X = obj;
        return r17;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        InputNameScreen inputNameScreen = this.Y;
        if (booleanValue) {
            bc7[] bc7Arr = InputNameScreen.B0;
            boolean b = ((eua) inputNameScreen.Y.getValue()).b(eua.f);
            je7 je7 = inputNameScreen.Y;
            je7 je72 = inputNameScreen.Z;
            if (!b) {
                ((hyc) ((q33) je72.getValue())).j("app.writeConctatsRequested", true);
                ((eua) je7.getValue()).e(new l5g(inputNameScreen, 1));
            } else if (!((eua) je7.getValue()).b(eua.g)) {
                hyc hyc = (hyc) ((q33) je72.getValue());
                hyc.getClass();
                if (!((t33) hyc).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((hyc) ((q33) je72.getValue())).j("app.writeConctatsRequested", true);
                    ((eua) je7.getValue()).e(new l5g(inputNameScreen, 1));
                }
            }
        } else {
            int i = vc7.a;
            if (!vc7.b(vc7.c)) {
                bc7[] bc7Arr2 = InputNameScreen.B0;
                mr0.V(inputNameScreen.n0().a);
            }
        }
        return e5f.a;
    }
}
