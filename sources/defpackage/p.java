package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* renamed from: p  reason: default package */
public final class p extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p pVar = new p(continuation, this.Y);
        pVar.X = obj;
        return pVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.b.E((List) this.X);
        return e5f.a;
    }
}
