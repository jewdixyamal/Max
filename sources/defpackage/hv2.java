package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: hv2  reason: default package */
public final class hv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hv2) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hv2 hv2 = new hv2(continuation, this.Y);
        hv2.X = obj;
        return hv2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        mr0.G(this.Y);
        if (wm9 instanceof vla) {
            gy2 gy2 = gy2.c;
            long longValue = ((Number) ((vla) wm9).a).longValue();
            f64 P1 = gy2.P1();
            P1.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (wm9 instanceof yc9) {
            gy2.c.P1().b(ey8.i(((Number) ((yc9) wm9).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), (Bundle) null);
        } else if (wm9 instanceof c64) {
            gy2.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
