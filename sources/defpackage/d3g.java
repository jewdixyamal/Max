package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: d3g  reason: default package */
public final class d3g implements x2g {
    public final /* synthetic */ WebAppsSettingScreen a;

    public d3g(WebAppsSettingScreen webAppsSettingScreen) {
        this.a = webAppsSettingScreen;
    }

    public final void a(w2g w2g) {
        bc7[] bc7Arr = WebAppsSettingScreen.X;
        g3g g3g = (g3g) this.a.b.getValue();
        g3g.getClass();
        if (!(w2g instanceof u2g) && !(w2g instanceof t2g)) {
            if (w2g instanceof v2g) {
                pnf.o(g3g.Z, ((v2g) w2g).b);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
