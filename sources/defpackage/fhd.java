package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;

/* renamed from: fhd  reason: default package */
public final /* synthetic */ class fhd implements k64, m66 {
    public static final fhd X = new fhd(3);
    public static final fhd b = new fhd(0);
    public static final fhd c = new fhd(1);
    public static final fhd o = new fhd(2);
    public final /* synthetic */ int a;

    public /* synthetic */ fhd(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsPrivacyScreen();
            case 1:
                return new SettingsBlacklistScreen();
            case 2:
                return new SafeModeOnboardingScreen();
            default:
                return new SetupPinCodeScreen();
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof k64) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof k64) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
            case 2:
                if (!(obj instanceof k64) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof k64) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
    }

    public final f66 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new p66(0, SettingsPrivacyScreen.class, "<init>", "<init>()V", 0);
            case 1:
                return new p66(0, SettingsBlacklistScreen.class, "<init>", "<init>()V", 0);
            case 2:
                return new p66(0, SafeModeOnboardingScreen.class, "<init>", "<init>()V", 0);
            default:
                return new p66(0, SetupPinCodeScreen.class, "<init>", "<init>()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            case 1:
                return getFunctionDelegate().hashCode();
            case 2:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
