package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: ep8  reason: default package */
public final class ep8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ep8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ep8 ep8 = new ep8(continuation, this.Y);
        ep8.X = obj;
        return ep8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Set set = (Set) this.X;
        bc7[] bc7Arr = MembersListWidget.D0;
        MembersListWidget membersListWidget = this.Y;
        if (!membersListWidget.o0().r()) {
            c03 c03 = membersListWidget.B0;
            if (c03 != null) {
                membersListWidget.n0().p0(c03);
            }
            membersListWidget.B0 = null;
            w54 w54 = membersListWidget.C0;
            if (w54 != null) {
                membersListWidget.n0().r0(w54);
            }
            membersListWidget.C0 = null;
        } else if (membersListWidget.B0 == null) {
            wz7 wz7 = new wz7(5, membersListWidget);
            c03 c032 = new c03(new cp8(membersListWidget, 0), new ga(wz7, 18, membersListWidget), new a42(3, wz7), new a42(4, wz7));
            membersListWidget.n0().j(c032);
            membersListWidget.B0 = c032;
            w54 w542 = new w54(membersListWidget.n0());
            membersListWidget.n0().l(w542);
            membersListWidget.C0 = w542;
        }
        membersListWidget.n0().Y();
        return e5f.a;
    }
}
