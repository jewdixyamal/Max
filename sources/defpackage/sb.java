package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: sb  reason: default package */
public final class sb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sb sbVar = new sb(continuation, this.Y);
        sbVar.X = obj;
        return sbVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = AdminsFromContactsScreen.u0;
        ((bc) this.Y.c.getValue()).Z.setValue((String) this.X);
        return e5f.a;
    }
}
