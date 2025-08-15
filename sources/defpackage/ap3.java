package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: ap3  reason: default package */
public final class ap3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ap3) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ap3 ap3 = new ap3(this.Y, continuation);
        ap3.X = obj;
        return ap3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        dn3 dn3 = (dn3) this.X;
        bc7[] bc7Arr = ContactListWidget.P0;
        ContactListWidget contactListWidget = this.Y;
        contactListWidget.s0();
        CharSequence n0 = contactListWidget.n0();
        e5f e5f = e5f.a;
        a3g a3g = contactListWidget.s0;
        a3g a3g2 = contactListWidget.Z;
        a3g a3g3 = contactListWidget.Y;
        if (n0 == null || n0.length() == 0) {
            a3g3.E(((dn3) contactListWidget.p0().z0.a.getValue()).a);
            a3g2.E(nz4.a);
            a3g.E(((dn3) contactListWidget.p0().z0.a.getValue()).c);
            return e5f;
        }
        a3g3.E(dn3.a);
        a3g2.E(dn3.b);
        a3g.E(dn3.c);
        return e5f;
    }
}
