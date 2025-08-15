package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: yid  reason: default package */
public final class yid extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yid) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, yid] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ihd.c.P1().b(":settings/privacy/pincode?mode=confirm&hash=".concat((String) this.X), (Bundle) null);
        return e5f.a;
    }
}
