package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: bgb  reason: default package */
public final class bgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bgb) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bgb bgb = new bgb(this.Y, continuation);
        bgb.X = obj;
        return bgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
