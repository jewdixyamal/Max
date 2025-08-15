package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;

/* renamed from: m6a  reason: default package */
public final class m6a extends ffe implements a66 {
    public final /* synthetic */ n6a X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m6a(n6a n6a, Continuation continuation) {
        super(2, continuation);
        this.X = n6a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m6a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m6a(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Activity d = ((haa) this.X.f.getValue()).f().C().d();
        ao6 ao6 = null;
        MainActivity mainActivity = d instanceof MainActivity ? (MainActivity) d : null;
        e5f e5f = e5f.a;
        if (mainActivity == null) {
            return e5f;
        }
        RootController s = a14.s(mainActivity);
        coc coc = (coc) x53.q0(s.C().e());
        if ((coc != null ? coc.a : null) instanceof ForceUpdateScreen) {
            return e5f;
        }
        if (!s.C().e().isEmpty()) {
            ao6 = new ao6(0);
        }
        s.C().R(i24.e(new ForceUpdateScreen(), ao6, ao6));
        return e5f;
    }
}
