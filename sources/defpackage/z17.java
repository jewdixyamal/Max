package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: z17  reason: default package */
public final class z17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z17(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z17) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z17 z17 = new z17(continuation, this.Y);
        z17.X = obj;
        return z17;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof x17) {
            x37 x37 = (x37) this.Y.A0.getValue();
            x17 x17 = (x17) wm9;
            String str = x17.b;
            x37.getClass();
            x37.a(i24.e(new ConfirmPhoneScreen(str, x17.c, x17.d), (zu3) null, (zu3) null), "ConfirmPhoneScreen");
        } else if (wm9 instanceof c64) {
            du7.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
