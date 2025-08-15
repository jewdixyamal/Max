package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: xx2  reason: default package */
public final class xx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xx2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xx2 xx2 = new xx2(continuation, this.Y);
        xx2.X = obj;
        return xx2;
    }

    public final Object o(Object obj) {
        View view;
        od2.a0(obj);
        ln3 ln3 = (ln3) this.X;
        boolean z = ln3 instanceof end;
        ChatsListWidget chatsListWidget = this.Y;
        if (z) {
            end end = (end) ln3;
            bc7[] bc7Arr = ChatsListWidget.M0;
            chatsListWidget.getClass();
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            lg3 a = od2.a(end.b, dy7.g(new kpa("selected.contactId.Action", Long.valueOf(end.a))), 4);
            a.f(end.c);
            end.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 4), 3));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(chatsListWidget);
            uu3 uu3 = chatsListWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            znc znc = null;
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
        } else if (ln3 instanceof dnd) {
            dnd dnd = (dnd) ln3;
            bc7[] bc7Arr3 = ChatsListWidget.M0;
            chatsListWidget.getClass();
            CharSequence b = dnd.a.b(chatsListWidget.getContext());
            if (b != null) {
                wha wha = new wha((Widget) chatsListWidget);
                wha.h(b);
                wha.e(nia.a);
                wha.f(pia.a);
                uu3 parentController = chatsListWidget.getParentController();
                wha.c(new eia(0, 0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                wha.d(new px2(dnd, 0));
                wha.i();
            }
        }
        return e5f.a;
    }
}
