package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: dv2  reason: default package */
public final class dv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dv2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dv2 dv2 = new dv2(continuation, this.Y);
        dv2.X = obj;
        return dv2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ov2 ov2 = (ov2) this.X;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        bc7[] bc7Arr = ChatsListSearchScreen.J0;
        chatsListSearchScreen.getClass();
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        String name = cls.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "updateState " + ov2, (Throwable) null);
        }
        int ordinal = ov2.a.ordinal();
        nz4 nz4 = nz4.a;
        if (ordinal == 0) {
            chatsListSearchScreen.m0();
            chatsListSearchScreen.A0.E(nz4);
            chatsListSearchScreen.C0.E(nz4);
            chatsListSearchScreen.B0.E(Collections.singletonList(ro7.a));
        } else if (ordinal != 2) {
            wuc wuc = wuc.CHATS_LIST_SEARCH_RESULT;
            if (ordinal == 3) {
                List list = ov2.d;
                boolean z = ov2.e;
                chatsListSearchScreen.B0.E(nz4);
                chatsListSearchScreen.m0();
                chatsListSearchScreen.C0.E(nz4);
                chatsListSearchScreen.A0.F(list, new u60(z, (Object) chatsListSearchScreen, 8));
                an9.g((an9) chatsListSearchScreen.b.getValue(), wuc);
            } else if (ordinal == 4) {
                chatsListSearchScreen.B0.E(nz4);
                chatsListSearchScreen.m0();
                chatsListSearchScreen.A0.E(nz4);
                chatsListSearchScreen.C0.F(Collections.singletonList(uz4.a), new cu1(13, chatsListSearchScreen));
                an9.g((an9) chatsListSearchScreen.b.getValue(), wuc);
            }
        } else {
            it6 it6 = ov2.c;
            boolean z2 = ov2.e;
            chatsListSearchScreen.B0.E(nz4);
            chatsListSearchScreen.A0.E(nz4);
            chatsListSearchScreen.C0.E(nz4);
            String name2 = cls.getName();
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, name2, "idleSearchData.recentContacts = ".concat(x53.n0(it6.a, (String) null, (String) null, (String) null, (m56) null, 63)), (Throwable) null);
            }
            chatsListSearchScreen.v0.F(Collections.singletonList(it6.a), new av2(z2, chatsListSearchScreen, it6));
            an9.g((an9) chatsListSearchScreen.b.getValue(), wuc.CHATS_LIST_SEARCH_INITIAL);
        }
        return e5f.a;
    }
}
