package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: h0g  reason: default package */
public final class h0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h0g) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h0g h0g = new h0g(continuation, this.Y);
        h0g.X = obj;
        return h0g;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        bc7[] bc7Arr = WebAppSettingsScreen.s0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (wm9 instanceof g43) {
            webAppSettingsScreen.getRouter().C();
        } else if (wm9 instanceof c64) {
            zxf.c.R1((c64) wm9);
        } else if (wm9 instanceof k0g) {
            webAppSettingsScreen.getRouter().C();
            zxf.c.R1(((k0g) wm9).b);
        }
        return e5f.a;
    }
}
