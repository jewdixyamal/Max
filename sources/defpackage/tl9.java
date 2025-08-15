package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* renamed from: tl9  reason: default package */
public final class tl9 extends ffe implements a66 {
    public /* synthetic */ long X;

    public final Object invoke(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Number) obj).longValue());
        e5f e5f = e5f.a;
        ((tl9) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [tl9, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = ((Number) obj).longValue();
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        MyTracker.trackLoginEvent(String.valueOf(this.X), (String) null);
        return e5f.a;
    }
}
