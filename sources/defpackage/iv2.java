package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: iv2  reason: default package */
public final class iv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iv2) n((tt2) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iv2 iv2 = new iv2(continuation, this.Y);
        iv2.X = obj;
        return iv2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        tt2 tt2 = (tt2) this.X;
        boolean z = tt2 instanceof exc;
        e5f e5f = e5f.a;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = ChatsListSearchScreen.J0;
            chatsListSearchScreen.q0();
            ((exc) tt2).getClass();
            xx6 xx6 = (xx6) ys2.a.getAccessor().e();
            if (xx6 != null) {
                xx6.f(Collections.singleton(new wx6(ux6.MADE_2_PIN, 1)), wuc.CHATS_LIST_SEARCH_RESULT);
            }
        } else if (tt2 instanceof rnd) {
            CharSequence b = ((rnd) tt2).a.b(chatsListSearchScreen.getContext());
            if (b == null) {
                return e5f;
            }
            vha vha = chatsListSearchScreen.I0;
            if (vha != null) {
                vha.a();
            }
            wha wha = new wha((Widget) chatsListSearchScreen);
            wha.h(b);
            chatsListSearchScreen.I0 = wha.i();
        } else if (tt2 instanceof gnd) {
            gnd gnd = (gnd) tt2;
            bc7[] bc7Arr2 = ChatsListSearchScreen.J0;
            chatsListSearchScreen.getClass();
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            lg3 a = od2.a(gnd.b, dy7.g(new kpa("selected.chatId.Action", Long.valueOf(gnd.a))), 4);
            a.f(gnd.c);
            gnd.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 2), 1));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(chatsListSearchScreen);
            uu3 uu3 = chatsListSearchScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            znc znc = null;
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(chatsListSearchScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        }
        return e5f;
    }
}
