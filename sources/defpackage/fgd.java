package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: fgd  reason: default package */
public final class fgd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fgd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fgd) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fgd fgd = new fgd(this.Y, continuation);
        fgd.X = obj;
        return fgd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.z0.E((List) this.X);
        return e5f.a;
    }
}
