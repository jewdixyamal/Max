package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: f0g  reason: default package */
public final class f0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((f0g) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f0g f0g = new f0g(continuation, this.Y);
        f0g.X = obj;
        return f0g;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l0g l0g = (l0g) this.X;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.Z.E(l0g.b);
        webAppSettingsScreen.getClass();
        ((cla) webAppSettingsScreen.X.T0(webAppSettingsScreen, WebAppSettingsScreen.s0[2])).setTitle((CharSequence) l0g.a);
        return e5f.a;
    }
}
