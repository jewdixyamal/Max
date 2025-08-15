package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: hlb  reason: default package */
public final class hlb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hlb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hlb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hlb hlb = new hlb(continuation, this.Y);
        hlb.X = obj;
        return hlb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = ProfileScreen.D0;
        hdc adapter = this.Y.q0().getAdapter();
        qlb qlb = adapter instanceof qlb ? (qlb) adapter : null;
        if (qlb != null) {
            qlb.E(list);
        }
        return e5f.a;
    }
}
