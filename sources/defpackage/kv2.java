package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: kv2  reason: default package */
public final class kv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kv2(ChatsListSearchScreen chatsListSearchScreen, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = j;
        this.s0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kv2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        long j = this.Z;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ChatsListSearchScreen.J0;
            gw2 n0 = chatsListSearchScreen.n0();
            this.X = 1;
            obj = j47.t0(((w9a) n0.Z).a(), new qv2(n0, j, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = new Long(j);
        bc7[] bc7Arr2 = ChatsListSearchScreen.J0;
        chatsListSearchScreen.getClass();
        bc7 bc7 = ChatsListSearchScreen.J0[0];
        chatsListSearchScreen.o.b(chatsListSearchScreen, l);
        float f = (float) 6;
        dy7.c(2).I((List) obj).Y(this.s0).w(new Rect(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0), fk4.d().getDisplayMetrics().density * 12.0f).build().q(chatsListSearchScreen);
        return e5f.a;
    }
}
