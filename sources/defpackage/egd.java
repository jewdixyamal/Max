package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: egd  reason: default package */
public final class egd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public egd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((egd) n((did) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        egd egd = new egd(this.Y, continuation);
        egd.X = obj;
        return egd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        did did = (did) this.X;
        bc7[] bc7Arr = SettingsListScreen.B0;
        SettingsListScreen settingsListScreen = this.Y;
        settingsListScreen.p0().setTopBarContent(did);
        ((cla) settingsListScreen.t0.T0(settingsListScreen, SettingsListScreen.B0[1])).setTitle((CharSequence) did.c);
        return e5f.a;
    }
}
