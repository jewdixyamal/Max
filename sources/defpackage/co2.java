package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: co2  reason: default package */
public final class co2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ChatScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Z = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((co2) n(obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        co2 co2 = new co2(continuation, this.Z);
        co2.Y = obj;
        return co2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ChatScreen.k1;
            ChatScreen chatScreen = this.Z;
            yce yce = (yce) chatScreen.G0.getValue();
            Context context = chatScreen.getContext();
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) yce.Y.getValue())).a(), new vce((j92) this.Y, yce, context, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
