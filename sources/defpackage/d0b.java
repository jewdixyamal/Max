package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: d0b  reason: default package */
public final class d0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d0b) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d0b d0b = new d0b(continuation, this.Y);
        d0b.X = obj;
        return d0b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ch6 ch6 = (ch6) this.X;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (ch6 instanceof ch6) {
            ((rg1) pinBarsWidget.o.getValue()).j(ch6.a, true, false, false, new lwa(1, ch6));
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
