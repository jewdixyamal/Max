package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: bp3  reason: default package */
public final class bp3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp3(ContactListWidget contactListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = j;
        this.s0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bp3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bp3(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        List list = null;
        long j = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ContactListWidget.P0;
            oo3 p0 = contactListWidget.p0();
            this.X = 1;
            obj = j47.t0(((w9a) p0.c).a(), new fo3(p0, j, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((List) obj).isEmpty()) {
            list = obj;
        }
        List list2 = list;
        if (list2 != null) {
            Long l = new Long(j);
            bc7[] bc7Arr2 = ContactListWidget.P0;
            contactListWidget.getClass();
            bc7 bc7 = ContactListWidget.P0[4];
            contactListWidget.J0.b(contactListWidget, l);
            dy7.c(2).I(list2).Y(this.s0).R(fk4.d().getDisplayMetrics().density * 12.0f).build().q(contactListWidget);
        }
        return e5f.a;
    }
}
