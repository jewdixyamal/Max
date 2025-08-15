package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: n57  reason: default package */
public final class n57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n57) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n57 n57 = new n57(continuation, this.Y);
        n57.X = obj;
        return n57;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        my3 my3 = (my3) this.X;
        eaa eaa = my3.a;
        bc7[] bc7Arr = InviteByPhoneScreen.B0;
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        inviteByPhoneScreen.getClass();
        bc7 bc7 = InviteByPhoneScreen.B0[6];
        inviteByPhoneScreen.z0.b(inviteByPhoneScreen, eaa);
        f47 f47 = inviteByPhoneScreen.y0;
        je7 je7 = inviteByPhoneScreen.x0;
        int i = my3.b;
        eaa eaa2 = my3.a;
        if (f47 == null) {
            f47 f472 = new f47((zua) je7.getValue(), eaa2.a, eaa2.b, i);
            inviteByPhoneScreen.y0 = f472;
            inviteByPhoneScreen.o0().w0.addTextChangedListener(f472);
        } else {
            f47.b(eaa2.b, eaa2.a);
            f47 f473 = inviteByPhoneScreen.y0;
            if (f473 != null) {
                f473.Y = i;
            }
        }
        c67 p0 = inviteByPhoneScreen.p0();
        zua zua = (zua) je7.getValue();
        qva e = zua.e(eaa2.a);
        p0.D0 = !zua.m(e) ? Integer.MAX_VALUE : zua.d(e, 1).length();
        CharSequence b = my3.c.b(inviteByPhoneScreen.getContext());
        if (b == null) {
            b = "";
        }
        lea o0 = inviteByPhoneScreen.o0();
        o0.setHint(b);
        o0.setCountry(eaa2);
        return e5f.a;
    }
}
