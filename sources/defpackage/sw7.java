package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: sw7  reason: default package */
public final class sw7 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((sw7) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sw7 sw7 = new sw7(this.Y, continuation);
        sw7.X = ((Boolean) obj).booleanValue();
        return sw7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (this.X) {
            ProcessPhoenix.b(this.Y);
        }
        return e5f.a;
    }
}
