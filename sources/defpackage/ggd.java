package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: ggd  reason: default package */
public final class ggd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ggd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ggd) n((o35) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ggd ggd = new ggd(this.Y, continuation);
        ggd.X = obj;
        return ggd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        o35 o35 = (o35) this.X;
        bgd bgd = o35 instanceof bgd ? (bgd) o35 : null;
        boolean z = bgd instanceof zfd;
        e5f e5f = e5f.a;
        SettingsListScreen settingsListScreen = this.Y;
        if (z) {
            zfd zfd = (zfd) bgd;
            tpa.o(settingsListScreen.getContext(), zfd.a);
            CharSequence b = zfd.b.b(settingsListScreen.getContext());
            if (b != null && tpa.s()) {
                wha wha = (wha) settingsListScreen.u0.getValue();
                wha.e(new kia(woc.r));
                wha.h(b);
                wha.i();
            }
        } else if (bgd instanceof agd) {
            ((cn3) settingsListScreen.Y.getValue()).a(settingsListScreen.getContext(), ((agd) bgd).a);
        }
        return e5f;
    }
}
