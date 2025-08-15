package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: rb  reason: default package */
public final class rb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rb rbVar = new rb(continuation, this.Y);
        rbVar.X = obj;
        return rbVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = AdminsFromContactsScreen.u0;
        AdminsFromContactsScreen adminsFromContactsScreen = this.Y;
        boolean q = ((bc) adminsFromContactsScreen.c.getValue()).q();
        if (q) {
            RecyclerView n0 = adminsFromContactsScreen.n0();
            h8e h8e = adminsFromContactsScreen.Z;
            if (h8e != null) {
                n0.p0(h8e);
            }
            adminsFromContactsScreen.Z = null;
        } else {
            RecyclerView n02 = adminsFromContactsScreen.n0();
            h8e h8e2 = adminsFromContactsScreen.Z;
            if (h8e2 != null) {
                n02.p0(h8e2);
            }
            adminsFromContactsScreen.Z = null;
            adminsFromContactsScreen.m0(adminsFromContactsScreen.n0());
        }
        int i = 0;
        boolean z = q && list.isEmpty();
        ((EmptySearchView) adminsFromContactsScreen.X.T0(adminsFromContactsScreen, AdminsFromContactsScreen.u0[2])).setVisibility(z ? 0 : 8);
        RecyclerView n03 = adminsFromContactsScreen.n0();
        if (!(!z)) {
            i = 8;
        }
        n03.setVisibility(i);
        adminsFromContactsScreen.t0.E(list);
        return e5f.a;
    }
}
