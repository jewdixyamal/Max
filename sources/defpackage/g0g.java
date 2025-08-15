package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: g0g  reason: default package */
public final class g0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g0g) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g0g g0g = new g0g(continuation, this.Y);
        g0g.X = obj;
        return g0g;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        j0g j0g = (j0g) this.X;
        bc7[] bc7Arr = WebAppSettingsScreen.s0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (j0g instanceof j0g) {
            bwf bwf = webAppSettingsScreen.Y;
            if (bwf != null) {
                bwf.e(j0g.b, j0g.a, (String) null);
            }
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
