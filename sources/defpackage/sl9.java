package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* renamed from: sl9  reason: default package */
public final class sl9 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sl9) n((Long) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [sl9, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        MyTracker.getTrackerParams().setCustomUserId(String.valueOf(((Long) this.X).longValue()));
        return e5f.a;
    }
}
