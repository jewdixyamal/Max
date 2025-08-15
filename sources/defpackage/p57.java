package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: p57  reason: default package */
public final class p57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p57) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p57 p57 = new p57(continuation, this.Y);
        p57.X = obj;
        return p57;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            e57.c.R1((c64) wm9);
        }
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        mr0.G(inviteByPhoneScreen);
        View view = inviteByPhoneScreen.getView();
        if (view != null) {
            view.postDelayed(new nn6(4, inviteByPhoneScreen), 600);
        }
        return e5f.a;
    }
}
