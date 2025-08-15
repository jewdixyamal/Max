package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* renamed from: b3g  reason: default package */
public final class b3g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b3g(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b3g) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b3g b3g = new b3g(continuation, this.Y);
        b3g.X = obj;
        return b3g;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.o.E((List) this.X);
        return e5f.a;
    }
}
