package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: kcb  reason: default package */
public final class kcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kcb) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kcb kcb = new kcb(continuation, this.Y);
        kcb.X = obj;
        return kcb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.Y.E((List) this.X);
        return e5f.a;
    }
}
