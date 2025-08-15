package defpackage;

import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: gp8  reason: default package */
public final class gp8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gp8) n((jo8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gp8 gp8 = new gp8(continuation, this.Y);
        gp8.X = obj;
        return gp8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jo8 jo8 = (jo8) this.X;
        boolean z = jo8 instanceof ho8;
        MembersListWidget membersListWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = MembersListWidget.D0;
            bp8 p0 = membersListWidget.p0();
            Collection collection = ((ho8) jo8).a;
            vxd vxd = p0.v0;
            if (vxd == null || !vxd.isActive()) {
                p0.v0 = pnf.n(p0, ((w9a) ((kke) p0.Z.getValue())).a(), (vx3) null, new yo8(p0, collection, (Continuation) null), 2);
            }
        } else if (jo8 instanceof io8) {
            bc7[] bc7Arr2 = MembersListWidget.D0;
            bp8 p02 = membersListWidget.p0();
            vn8 vn8 = new vn8(p02.b, p02.c, p02.u0);
            do8 do8 = p02.Y;
            do8.getClass();
            j47.T(do8.b, (lx3) null, (vx3) null, new co8(do8, vn8, (Continuation) null), 3);
            p02.u0 = wz4.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
