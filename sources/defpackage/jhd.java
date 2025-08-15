package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: jhd  reason: default package */
public final /* synthetic */ class jhd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    public /* synthetic */ jhd(SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        this.a = i;
        this.b = settingsPrivacyScreen;
    }

    public final Object invoke() {
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = SettingsPrivacyScreen.Z;
                ehd ehd = ehd.a;
                khe d = ehd.getAccessor().d(kxc.class);
                khe d2 = ehd.getAccessor().d(pk.class);
                khe d3 = ehd.getAccessor().d(xie.class);
                Class<q33> cls = q33.class;
                return new cid(new rdd(ehd.getAccessor().d(av0.class), (kke) ((khe) ehd.b()).getValue()), new l7b(ehd.getAccessor().d(cls), 10, new jhd(settingsPrivacyScreen, 1)), (kke) ((khe) ehd.b()).getValue(), d, ehd.getAccessor().d(y7d.class), ehd.getAccessor().d(cls), ehd.getAccessor().d(qe5.class), d2, d3, (ie3) ehd.getAccessor().c(ie3.class));
            default:
                bc7[] bc7Arr2 = SettingsPrivacyScreen.Z;
                return settingsPrivacyScreen.getContext();
        }
    }
}
