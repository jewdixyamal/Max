package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: i81  reason: default package */
public final class i81 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ CallHistoryPageScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i81(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callHistoryPageScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((i81) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i81 i81 = new i81(this.Y, continuation);
        i81.X = ((Boolean) obj).booleanValue();
        return i81;
    }

    public final Object o(Object obj) {
        Object value;
        od2.a0(obj);
        boolean z = this.X;
        buc buc = CallHistoryPageScreen.u0;
        q0e q0e = this.Y.o0().v0;
        do {
            value = q0e.getValue();
            ((Boolean) value).getClass();
        } while (!q0e.c(value, Boolean.valueOf(z)));
        return e5f.a;
    }
}
