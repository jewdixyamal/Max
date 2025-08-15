package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: ln2  reason: default package */
public final class ln2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ln2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ln2(continuation, this.Y);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ChatScreen chatScreen = this.Y;
            if (chatScreen.getView() == null) {
                return obj3;
            }
            mn5 x = od2.x(new j31(chatScreen.J0().Y, chatScreen.P0().d1, new c3(chatScreen, (Continuation) null, 6), 4));
            kn2 kn2 = new kn2((Continuation) null, chatScreen);
            this.X = 1;
            Object d = x.d(new yn5(gr9.a, kn2, 4), this);
            if (d != obj2) {
                d = obj3;
            }
            if (d != obj2) {
                d = obj3;
            }
            if (d == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
