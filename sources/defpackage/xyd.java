package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: xyd  reason: default package */
public final class xyd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xyd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xyd) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xyd xyd = new xyd(continuation, this.Y);
        xyd.X = obj;
        return xyd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.Y;
        CharSequence m0 = startConversationScreen.m0();
        boolean z = !(m0 == null || m0.length() == 0);
        e5f e5f = e5f.a;
        if (z) {
            return e5f;
        }
        startConversationScreen.y0.E(list);
        return e5f;
    }
}
