package defpackage;

import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* renamed from: q  reason: default package */
public final class q extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((q) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q qVar = new q(continuation, this.Y);
        qVar.X = obj;
        return qVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean f = tpa.f(wm9, g43.b);
        AboutAppSettingsScreen aboutAppSettingsScreen = this.Y;
        if (f) {
            aboutAppSettingsScreen.getRouter().C();
        } else if (wm9 instanceof u) {
            tpa.o(aboutAppSettingsScreen.getContext(), ((u) wm9).b);
        }
        return e5f.a;
    }
}
