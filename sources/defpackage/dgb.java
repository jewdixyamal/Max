package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: dgb  reason: default package */
public final class dgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dgb) n((jgb) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dgb dgb = new dgb(this.Y, continuation);
        dgb.X = obj;
        return dgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jgb jgb = (jgb) this.X;
        if (jgb instanceof jgb) {
            jqe jqe = jgb.a;
            ProfileEditScreen profileEditScreen = this.Y;
            CharSequence b = jqe.b(profileEditScreen.getContext());
            e5f e5f = e5f.a;
            if (b == null) {
                return e5f;
            }
            wha wha = new wha((Widget) profileEditScreen);
            wha.e(nia.a);
            wha.h(b);
            wha.f(pia.a);
            wha.c(new eia(0, 0, jgb.b, 3));
            wha.d(jgb.c);
            wha.i();
            return e5f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
