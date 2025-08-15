package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: hp8  reason: default package */
public final class hp8 extends ffe implements a66 {
    public final /* synthetic */ MembersListWidget X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp8(MembersListWidget membersListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.X = membersListWidget;
        this.Y = j;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hp8(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MembersListWidget.D0;
        MembersListWidget membersListWidget = this.X;
        ro8 o0 = membersListWidget.o0();
        long j = this.Y;
        List list = (List) o0.b.invoke(Long.valueOf(j));
        boolean z = membersListWidget.m0().c;
        e5f e5f = e5f.a;
        if (z && !list.isEmpty()) {
            Long l = new Long(j);
            bc7 bc7 = MembersListWidget.D0[2];
            membersListWidget.Z.b(membersListWidget, l);
            dy7.c(2).I(list).Y(this.Z).R(fk4.d().getDisplayMetrics().density * 12.0f).build().q(membersListWidget);
        }
        return e5f;
    }
}
