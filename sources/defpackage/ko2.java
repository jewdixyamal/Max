package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: ko2  reason: default package */
public final class ko2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ChatScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko2(w7c w7c, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = w7c;
        this.s0 = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko2) n((p35) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ko2 ko2 = new ko2((w7c) this.Y, continuation, this.s0);
        ko2.X = obj;
        return ko2;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        Object a = ((p35) this.X).a();
        Throwable a2 = pjc.a(a);
        e5f e5f = e5f.a;
        if (a2 == null) {
            try {
                e5f e5f2 = (e5f) a;
                ChatScreen chatScreen = this.s0;
                bc7[] bc7Arr = ChatScreen.k1;
                chatScreen.T0();
                obj2 = e5f;
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
            if (!this.Z) {
                od2.a0(obj2);
            }
        }
        return e5f;
    }
}
