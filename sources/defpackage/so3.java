package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: so3  reason: default package */
public final class so3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((so3) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        so3 so3 = new so3(this.Y, continuation);
        so3.X = obj;
        return so3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        ContactListWidget contactListWidget = this.Y;
        mr0.G(contactListWidget);
        if (wm9 instanceof c64) {
            tr3.c.R1((c64) wm9);
        } else if (wm9 instanceof wla) {
            wha wha = new wha((Widget) contactListWidget);
            wha.h("Ещё не реализовано");
            wha.i();
        } else if (wm9 instanceof fyd) {
            bc7[] bc7Arr = ContactListWidget.P0;
            fyd fyd = (fyd) wm9;
            ((bt1) contactListWidget.c.getValue()).e(zs1.CONTACT, fyd.c);
            mr0.G(contactListWidget);
            long j = fyd.b;
            boolean z = fyd.c;
            ((rg1) contactListWidget.D0.getValue()).l(j, z, new ro3(j, z));
        }
        return e5f.a;
    }
}
