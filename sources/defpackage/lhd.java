package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: lhd  reason: default package */
public final class lhd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lhd(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lhd) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lhd lhd = new lhd(continuation, this.Y);
        lhd.X = obj;
        return lhd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = new wha((Widget) this.Y);
        wha.h((String) this.X);
        wha.i();
        return e5f.a;
    }
}
