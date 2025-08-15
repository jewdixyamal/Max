package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.ContactsPickerScreen;

/* renamed from: wr3  reason: default package */
public final class wr3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactsPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr3(Continuation continuation, ContactsPickerScreen contactsPickerScreen) {
        super(2, continuation);
        this.Y = contactsPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wr3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wr3 wr3 = new wr3(continuation, this.Y);
        wr3.X = obj;
        return wr3;
    }

    public final Object o(Object obj) {
        y16 y16;
        Object obj2;
        od2.a0(obj);
        ur3 ur3 = (ur3) this.X;
        if (ur3 instanceof ur3) {
            qp3 qp3 = ur3.a;
            bc7[] bc7Arr = ContactsPickerScreen.v0;
            ContactsPickerScreen contactsPickerScreen = this.Y;
            ArrayList e = contactsPickerScreen.getRouter().e();
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                y16 = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((coc) obj2).a instanceof y16) {
                    break;
                }
            }
            coc coc = (coc) obj2;
            uu3 uu3 = coc != null ? coc.a : null;
            if (uu3 instanceof y16) {
                y16 = (y16) uu3;
            }
            if (y16 != null) {
                bc7[] bc7Arr2 = ContactsPickerScreen.v0;
                bc7 bc7 = bc7Arr2[0];
                fs fsVar = contactsPickerScreen.t0;
                if (((Number) fsVar.a(contactsPickerScreen)).intValue() != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("contacts.picker.result.key", qp3);
                    bc7 bc72 = bc7Arr2[0];
                    y16.R(((Number) fsVar.a(contactsPickerScreen)).intValue(), -1, intent);
                    i3a onBackPressedDispatcher = contactsPickerScreen.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.d();
                    }
                    mr0.G(contactsPickerScreen);
                }
            }
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
