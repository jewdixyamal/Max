package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* renamed from: ms1  reason: default package */
public final class ms1 extends ffe implements a66 {
    public final /* synthetic */ m5d X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms1(m5d m5d, Continuation continuation) {
        super(2, continuation);
        this.X = m5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ms1(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String uuid = UUID.randomUUID().toString();
        k4a k4a = (k4a) ((pk) ((je7) this.X.b).getValue());
        return new Long(k4a.v(k4a, new ei7(((p7b) k4a.y()).a.o(), uuid)));
    }
}
