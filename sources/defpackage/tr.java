package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* renamed from: tr  reason: default package */
public final class tr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tr) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tr trVar = new tr(this.Y, continuation);
        trVar.X = obj;
        return trVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = AppearanceSettingsScreen.Z;
        AppearanceSettingsScreen appearanceSettingsScreen = this.Y;
        appearanceSettingsScreen.getClass();
        ((y52) appearanceSettingsScreen.c.T0(appearanceSettingsScreen, AppearanceSettingsScreen.Z[0])).setThemeItems((List) this.X);
        return e5f.a;
    }
}
