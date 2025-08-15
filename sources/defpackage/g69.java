package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: g69  reason: default package */
public final class g69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g69 g69 = new g69(continuation, this.Y);
        g69.X = obj;
        return g69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        s29 s29 = (s29) this.X;
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        znc znc = null;
        if (s29 instanceof fnd) {
            fnd fnd = (fnd) s29;
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            lg3 a = od2.a(fnd.b, dy7.g(new kpa("selected.messageIds.Action", x53.E0(fnd.a))), 4);
            a.f(fnd.c);
            fnd.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6), 6));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(messagesListWidget);
            uu3 uu3 = messagesListWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(messagesListWidget);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (s29 instanceof ond) {
            ond ond = (ond) s29;
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            lg3 a2 = od2.a(ond.e, dy7.g(new kpa("selected.messageIds.Action", new long[]{ond.a}), new kpa("bot.shareContact.confirm.keyboardId", ond.b), new kpa("bot.shareContact.confirm.button", ond.d), new kpa("bot.shareContact.confirm.buttonPosition", ond.c)), 4);
            a2.f(ond.f);
            ond.g.forEach(new hk2(new jk2(1, a2, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 7), 5));
            ConfirmationBottomSheet e2 = a2.e();
            e2.setTargetController(messagesListWidget);
            uu3 uu32 = messagesListWidget;
            while (uu32.getParentController() != null) {
                uu32 = uu32.getParentController();
            }
            foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
            if (foc2 != null) {
                znc = foc2.T();
            }
            e2.z0(messagesListWidget);
            if (znc != null) {
                coc coc2 = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc2, true, "BottomSheetWidget");
                znc.G(coc2);
            }
        } else if (s29 instanceof nnd) {
            g39 v0 = messagesListWidget.v0();
            long j = ((nnd) s29).a;
            v0.getClass();
            pnf.o(v0.t0, new e39(j));
        } else if (s29 instanceof hnd) {
            g39 v02 = messagesListWidget.v0();
            long j2 = ((hnd) s29).a;
            v02.getClass();
            pnf.o(v02.t0, new d39(j2));
        } else if (s29 instanceof pnd) {
            pnd pnd = (pnd) s29;
            CharSequence b = pnd.a.b(messagesListWidget.getContext());
            if (b != null) {
                wha wha = new wha((Widget) messagesListWidget);
                wha.h(b);
                wha.a(pnd.c);
                wha.e(new kia(pnd.b));
                wha.i();
            }
        } else if (s29 instanceof ax8) {
            xx6 xx6 = (xx6) o19.a.getAccessor().e();
            if (xx6 != null) {
                xx6.f(Collections.singleton(new wx6(ux6.MADE_2_PIN, 1)), wuc.CHAT);
            }
        } else if (s29 instanceof x9) {
            y6c y6c = messagesListWidget.W0;
            if (y6c != null) {
                x9 x9Var = (x9) s29;
                y6c.e(x9Var.c, x9Var.a, x9Var.b);
            }
        } else if (tpa.f(s29, fta.a)) {
            View view = messagesListWidget.getView();
            if (view != null) {
                pag.F(view, mi6.CONFIRM);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
