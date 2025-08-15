package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: uw7  reason: default package */
public final class uw7 extends ffe implements a66 {
    public final /* synthetic */ MainActivity X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uw7) n((Boolean) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uw7(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.i0();
        return e5f.a;
    }
}
