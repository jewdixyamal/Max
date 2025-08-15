package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: c3g  reason: default package */
public final class c3g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c3g(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c3g) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c3g c3g = new c3g(continuation, this.Y);
        c3g.X = obj;
        return c3g;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        bc7[] bc7Arr = WebAppsSettingScreen.X;
        WebAppsSettingScreen webAppsSettingScreen = this.Y;
        webAppsSettingScreen.getClass();
        if (wm9 instanceof g43) {
            webAppsSettingScreen.getRouter().C();
        } else if (wm9 instanceof c64) {
            zxf.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
