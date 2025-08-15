package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: n6e  reason: default package */
public final class n6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n6e) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n6e n6e = new n6e(continuation, this.Y);
        n6e.X = obj;
        return n6e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
