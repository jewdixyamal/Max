package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: ux2  reason: default package */
public final class ux2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ux2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ux2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ux2 ux2 = new ux2(continuation, this.Y);
        ux2.X = obj;
        return ux2;
    }

    public final Object o(Object obj) {
        View view;
        od2.a0(obj);
        tt2 tt2 = (tt2) this.X;
        boolean z = tt2 instanceof exc;
        ChatsListWidget chatsListWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = ChatsListWidget.M0;
            chatsListWidget.o0().x0(0);
            ((exc) tt2).getClass();
            xx6 xx6 = (xx6) ys2.a.getAccessor().e();
            if (xx6 != null) {
                xx6.f(Collections.singleton(new wx6(ux6.MADE_2_PIN, 1)), wuc.CHATS_LIST_TAB);
            }
        } else if (tt2 instanceof rnd) {
            CharSequence b = ((rnd) tt2).a.b(chatsListWidget.getContext());
            if (b != null) {
                wha wha = new wha((Widget) chatsListWidget);
                wha.h(b);
                wha.i();
            }
        } else {
            znc znc = null;
            if (tt2 instanceof gnd) {
                gnd gnd = (gnd) tt2;
                bc7[] bc7Arr2 = ChatsListWidget.M0;
                chatsListWidget.getClass();
                bc7[] bc7Arr3 = BottomSheetWidget.x0;
                lg3 a = od2.a(gnd.b, dy7.g(new kpa("selected.chatId.Action", Long.valueOf(gnd.a))), 4);
                a.f(gnd.c);
                gnd.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3), 2));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(chatsListWidget);
                uu3 uu3 = chatsListWidget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(chatsListWidget);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (tt2 instanceof cnd) {
                CharSequence b2 = ((cnd) tt2).a.b(chatsListWidget.getContext());
                if (b2 != null) {
                    wha wha2 = new wha((Widget) chatsListWidget);
                    wha2.e(nia.a);
                    wha2.h(b2);
                    wha2.f(pia.a);
                    uu3 parentController = chatsListWidget.getParentController();
                    wha2.c(new eia(0, 0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                    wha2.d(new rxd(9, tt2));
                    wha2.i();
                }
            } else if (tt2 instanceof knd) {
                ((cn3) chatsListWidget.y0.getValue()).a(chatsListWidget.requireActivity(), ((knd) tt2).a);
            } else if (tt2 instanceof d33) {
                bc7[] bc7Arr4 = BottomSheetWidget.x0;
                lg3 e2 = wg0.e(j0c.chat_list_confirm_clear_saved_messages_history_title, 6, (Bundle) null);
                e2.f(new eqe(j0c.chat_list_confirm_clear_saved_messages_history_subtitle));
                e2.b(uvb.oneme_saved_messages_clear_history, new eqe(j0c.chat_list_confirm_clear_saved_messages_history_negative_button));
                e2.c(hpc.a, new eqe(jpc.r));
                ConfirmationBottomSheet e3 = e2.e();
                e3.setTargetController(chatsListWidget);
                uu3 uu32 = chatsListWidget;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
                if (foc2 != null) {
                    znc = foc2.T();
                }
                e3.z0(chatsListWidget);
                if (znc != null) {
                    coc coc2 = new coc(e3, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
