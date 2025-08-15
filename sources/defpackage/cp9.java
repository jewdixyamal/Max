package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: cp9  reason: default package */
public final class cp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cp9) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cp9 cp9 = new cp9(continuation, this.Y);
        cp9.X = obj;
        return cp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.I0.E((List) this.X);
        return e5f.a;
    }
}
