package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: to3  reason: default package */
public final class to3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((to3) n((ln3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        to3 to3 = new to3(this.Y, continuation);
        to3.X = obj;
        return to3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ln3 ln3 = (ln3) this.X;
        boolean z = ln3 instanceof p9;
        e5f e5f = e5f.a;
        znc znc = null;
        ContactListWidget contactListWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = ContactListWidget.P0;
            if (contactListWidget.m0().b(eua.e)) {
                an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_ADD);
                tr3 tr3 = tr3.c;
                tr3.getClass();
                tr3.P1().b(":contact-list/create-contact", (Bundle) null);
            } else {
                contactListWidget.r0();
            }
        } else if (ln3 instanceof end) {
            end end = (end) ln3;
            bc7[] bc7Arr2 = ContactListWidget.P0;
            contactListWidget.getClass();
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            lg3 a = od2.a(end.b, dy7.g(new kpa("selected.contactId.Action", Long.valueOf(end.a))), 4);
            a.f(end.c);
            end.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 5), 4));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(contactListWidget);
            uu3 uu3 = contactListWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(contactListWidget);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (ln3 instanceof jnd) {
            ((cn3) contactListWidget.H0.getValue()).a(contactListWidget.requireActivity(), ((jnd) ln3).a);
        } else if (ln3 instanceof dnd) {
            dnd dnd = (dnd) ln3;
            bc7[] bc7Arr4 = ContactListWidget.P0;
            contactListWidget.getClass();
            CharSequence b = dnd.a.b(contactListWidget.getContext());
            if (b != null) {
                wha wha = new wha((Widget) contactListWidget);
                wha.h(b);
                wha.e(nia.a);
                wha.f(pia.a);
                wha.d(new px2(dnd, 1));
                wha.i();
            }
        } else if (ln3 instanceof dz3) {
            tr3 tr32 = tr3.c;
            tr32.getClass();
            tr32.P1().b(":start-conversation/chat", (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
