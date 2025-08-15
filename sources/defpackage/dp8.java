package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: dp8  reason: default package */
public final class dp8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp8(Continuation continuation, MembersListWidget membersListWidget, View view) {
        super(2, continuation);
        this.Y = membersListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dp8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dp8 dp8 = new dp8(continuation, this.Y, this.Z);
        dp8.X = obj;
        return dp8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        so8 so8 = (so8) this.X;
        boolean z = so8.d;
        List list = nz4.a;
        MembersListWidget membersListWidget = this.Y;
        List list2 = so8.a;
        if (z) {
            membersListWidget.u0.E(list);
            membersListWidget.v0.E(list);
            y51 y51 = membersListWidget.x0;
            if (list2.isEmpty()) {
                list = Collections.singletonList(tz4.a);
            }
            y51.E(list);
        } else {
            membersListWidget.u0.E(so8.b);
            membersListWidget.x0.E(list);
            membersListWidget.v0.E(so8.c);
        }
        bc7[] bc7Arr = MembersListWidget.D0;
        membersListWidget.n0().setOverScrollMode(membersListWidget.o != null ? 2 : 1);
        membersListWidget.t0.E(list2);
        if (this.Z != null) {
            membersListWidget.n0().setRefreshingNext(so8.e);
        }
        return e5f.a;
    }
}
