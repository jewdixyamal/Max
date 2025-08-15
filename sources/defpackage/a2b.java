package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: a2b  reason: default package */
public final class a2b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PipScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2b(PipScreen pipScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pipScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((a2b) n((qma) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a2b a2b = new a2b(this.Y, continuation);
        a2b.X = obj;
        return a2b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qma qma = (qma) this.X;
        bc7[] bc7Arr = PipScreen.o;
        xg1 xg1 = ((t1b) this.Y.b.getValue()).c;
        if (xg1 != null) {
            xg1.d(qma);
        }
        return e5f.a;
    }
}
