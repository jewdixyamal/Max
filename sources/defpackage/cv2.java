package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: cv2  reason: default package */
public final class cv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ mx8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cv2(ChatsListSearchScreen chatsListSearchScreen, mx8 mx8, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = mx8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cv2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        mx8 mx8 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ChatsListSearchScreen.J0;
            gw2 n0 = this.Y.n0();
            long j = mx8.Y.a;
            this.X = 1;
            obj = j47.t0(((w9a) n0.Z).b(), new sv2(n0, j, mx8.X, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = (Long) obj;
        if (l != null) {
            gy2.b2(gy2.c, mx8.Y.a, "local", new Long(l.longValue()), (Long) null, mx8.b, (String) null, 104);
        }
        return e5f.a;
    }
}
