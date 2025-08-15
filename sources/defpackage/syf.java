package defpackage;

import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: syf  reason: default package */
public final /* synthetic */ class syf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ syf(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    public final Object invoke() {
        WebAppRootScreen webAppRootScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = WebAppRootScreen.G0;
                webAppRootScreen.getClass();
                bc7[] bc7Arr2 = WebAppRootScreen.G0;
                bc7 bc7 = bc7Arr2[1];
                long longValue = ((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue();
                bc7 bc72 = bc7Arr2[2];
                bc7 bc73 = bc7Arr2[0];
                bc7 bc74 = bc7Arr2[3];
                return new zzf(longValue, (osf) webAppRootScreen.u0.a(webAppRootScreen), (Long) webAppRootScreen.s0.a(webAppRootScreen), (String) webAppRootScreen.v0.a(webAppRootScreen));
            default:
                bc7[] bc7Arr3 = WebAppRootScreen.G0;
                return new t3g(webAppRootScreen.A0());
        }
    }
}
