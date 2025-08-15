package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* renamed from: sr  reason: default package */
public final class sr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sr) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sr srVar = new sr(this.Y, continuation);
        srVar.X = obj;
        return srVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
