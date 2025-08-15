package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: zse  reason: default package */
public final class zse extends ffe implements a66 {
    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zse) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wva G = z7.G();
        hm9.l("ThreadsDeveloperTools", "Threads count: " + ((Map) G.b), (Throwable) G.c);
        return e5f.a;
    }
}
