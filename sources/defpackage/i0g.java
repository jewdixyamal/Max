package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* renamed from: i0g  reason: default package */
public final class i0g implements x2g {
    public final /* synthetic */ WebAppSettingsScreen a;

    public i0g(WebAppSettingsScreen webAppSettingsScreen) {
        this.a = webAppSettingsScreen;
    }

    public final void a(w2g w2g) {
        bc7[] bc7Arr = WebAppSettingsScreen.s0;
        p0g m0 = this.a.m0();
        m0.getClass();
        if (w2g instanceof v2g) {
            pnf.o(m0.w0, new k0g(((v2g) w2g).b));
        }
    }

    public final void b(u2g u2g, boolean z) {
        bc7[] bc7Arr = WebAppSettingsScreen.s0;
        p0g m0 = this.a.m0();
        m0.getClass();
        vxd S = j47.S(m0.a, ((w9a) ((kke) m0.s0.getValue())).b(), vx3.b, new o0g(z, m0, (Continuation) null));
        m0.x0.o1(m0, p0g.z0[0], S);
        m0.q();
    }
}
