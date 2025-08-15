package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: mn2  reason: default package */
public final class mn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ChatScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mn2(w7c w7c, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = w7c;
        this.s0 = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mn2) n((p35) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mn2 mn2 = new mn2((w7c) this.Y, continuation, this.s0);
        mn2.X = obj;
        return mn2;
    }

    public final Object o(Object obj) {
        Object obj2;
        sy8 sy8;
        ChatScreen chatScreen = this.s0;
        od2.a0(obj);
        Object a = ((p35) this.X).a();
        Throwable a2 = pjc.a(a);
        e5f e5f = e5f.a;
        if (a2 == null) {
            try {
                e5f e5f2 = (e5f) a;
                bc7[] bc7Arr = ChatScreen.k1;
                p35 p35 = (p35) chatScreen.F0().D0.a.getValue();
                if (p35 == null || (sy8 = (sy8) p35.a) == null || !sy8.a) {
                    xz8.y(chatScreen.F0(), true, false, 2);
                    chatScreen.y0();
                } else {
                    xz8.z(chatScreen.F0(), 0, 3);
                }
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
