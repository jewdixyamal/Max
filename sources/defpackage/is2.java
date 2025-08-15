package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: is2  reason: default package */
public final class is2 extends ffe implements a66 {
    public final /* synthetic */ ks2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is2(ks2 ks2, Continuation continuation) {
        super(2, continuation);
        this.X = ks2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((is2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new is2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ks2 ks2 = this.X;
        AtomicLong atomicLong = ks2.C0;
        String str = ks2.G0;
        String str2 = ks2.H0;
        k4a k4a = (k4a) ((pk) ks2.X.getValue());
        atomicLong.set(k4a.v(k4a, new g32(((p7b) k4a.y()).a.o(), str, str2)));
        return e5f.a;
    }
}
