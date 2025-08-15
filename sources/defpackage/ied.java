package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: ied  reason: default package */
public final class ied extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ied(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ied) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ied ied = new ied(continuation, this.Y);
        ied.X = obj;
        return ied;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Map map = (Map) this.X;
        bc7[] bc7Arr = SettingsBlacklistScreen.Z;
        SettingsBlacklistScreen settingsBlacklistScreen = this.Y;
        settingsBlacklistScreen.getClass();
        ((aba) settingsBlacklistScreen.X.T0(settingsBlacklistScreen, SettingsBlacklistScreen.Z[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
        settingsBlacklistScreen.Y.E(x53.D0(map.values()));
        return e5f.a;
    }
}
