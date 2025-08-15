package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: zo3  reason: default package */
public final class zo3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zo3) n((jqe) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zo3 zo3 = new zo3(this.Y, continuation);
        zo3.X = obj;
        return zo3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ContactListWidget contactListWidget = this.Y;
        CharSequence b = ((jqe) this.X).b(contactListWidget.getContext());
        String obj2 = b != null ? b.toString() : null;
        if (obj2 == null) {
            obj2 = "";
        }
        eha searchView = contactListWidget.o0().getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(obj2);
        }
        return e5f.a;
    }
}
