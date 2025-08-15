package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: xn2  reason: default package */
public final class xn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xn2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xn2 xn2 = new xn2(continuation, this.Y);
        xn2.X = obj;
        return xn2;
    }

    public final Object o(Object obj) {
        xx6 xx6;
        od2.a0(obj);
        gp2 gp2 = (gp2) this.X;
        boolean z = gp2 instanceof dp2;
        ChatScreen chatScreen = this.Y;
        if (z) {
            dp2 dp2 = (dp2) gp2;
            List list = dp2.a;
            bc7[] bc7Arr = ChatScreen.k1;
            chatScreen.getClass();
            dy7.c(1).I(list).S(dp2.b).Y(dp2.c).s().build().q(chatScreen);
        } else if (gp2 instanceof fp2) {
            fp2 fp2 = (fp2) gp2;
            chatScreen.Y.e(zs1.CHAT_HEAD, false);
            if (fp2.a != 0) {
                chatScreen.C0().l(fp2.a, false, new in2(fp2, 0));
            } else {
                String str = fp2.c;
                if (!(str == null || str.length() == 0)) {
                    rg1 C0 = chatScreen.C0();
                    if (str != null) {
                        C0.j(str, true, false, false, new in2(fp2, 1));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    long j = fp2.b;
                    if (j != 0) {
                        chatScreen.C0().i(j, false, new in2(fp2, 2));
                    }
                }
            }
        } else if (gp2 instanceof ep2) {
            ep2 ep2 = (ep2) gp2;
            ChatScreen.U0(this.Y, new Integer(ep2.a), (String) null, ep2.b, ep2.c, 2);
        } else {
            znc znc = null;
            if (gp2 instanceof bp2) {
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                bp2 bp2 = (bp2) gp2;
                lg3 a = od2.a(bp2.a, (Bundle) null, 6);
                bp2.b.forEach(new oo2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1), 0));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(chatScreen);
                uu3 uu3 = chatScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(chatScreen);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (gp2 instanceof cp2) {
                cp2 cp2 = (cp2) gp2;
                bc7[] bc7Arr3 = ChatScreen.k1;
                MessageWriteWidget G0 = chatScreen.G0();
                if (G0 != null) {
                    CharSequence charSequence = cp2.a;
                    G0.q0().setText(charSequence);
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        G0.q0().h(charSequence.length());
                    }
                }
                ((yce) chatScreen.G0.getValue()).r(cp2.a);
                Long l = cp2.b;
                if (l != null) {
                    chatScreen.F0().D(l);
                } else {
                    Long l2 = cp2.c;
                    if (l2 != null) {
                        xz8.C(chatScreen.F0(), l2, (CharSequence) null, (Integer) null, 6);
                    }
                }
            } else if (gp2 instanceof zo2) {
                zo2 zo2 = (zo2) gp2;
                int i = zo2.a;
                bc7[] bc7Arr4 = ChatScreen.k1;
                chatScreen.F0().D((Long) null);
                if (!zo2.c) {
                    chatScreen.F0().s();
                }
                chatScreen.H0().q((kpa) null);
                je7 je7 = chatScreen.h1;
                xx6 xx62 = (xx6) je7.getValue();
                if (xx62 != null) {
                    xx62.f(Collections.singleton(new wx6(ux6.SEND_5_MESSAGES, i)), wuc.CHAT);
                }
                zy5 zy5 = zo2.b;
                if (!(zy5 == null || (xx6 = (xx6) je7.getValue()) == null)) {
                    xx6.f(zy5.a, zy5.b);
                }
            } else if (gp2 instanceof xo2) {
                bc7[] bc7Arr5 = ChatScreen.k1;
                chatScreen.F0().s();
                if (!((xo2) gp2).a) {
                    chatScreen.getRouter().C();
                }
            } else if (tpa.f(gp2, ap2.a)) {
                bc7[] bc7Arr6 = ChatScreen.k1;
                chatScreen.J0().r(true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
