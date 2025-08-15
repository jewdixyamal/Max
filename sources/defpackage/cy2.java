package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: cy2  reason: default package */
public final class cy2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cy2(ChatsListWidget chatsListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListWidget;
        this.Z = j;
        this.s0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cy2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cy2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        List list = null;
        long j = this.Z;
        ChatsListWidget chatsListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ChatsListWidget.M0;
            nx2 p0 = chatsListWidget.p0();
            this.X = 1;
            obj = j47.t0(((w9a) p0.Y).a(), new jw2(p0, j, (Continuation) null), this);
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
            bc7[] bc7Arr2 = ChatsListWidget.M0;
            chatsListWidget.getClass();
            bc7 bc7 = ChatsListWidget.M0[0];
            chatsListWidget.c.b(chatsListWidget, l);
            qt3 Y2 = dy7.c(2).I(list2).Y(this.s0);
            ChatsListWidget.m0(chatsListWidget, Y2);
            Y2.build().q(chatsListWidget);
        }
        return e5f.a;
    }
}
