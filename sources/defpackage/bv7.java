package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: bv7  reason: default package */
public final class bv7 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((bv7) n((File) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [bv7, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return new mqc(new rje(new aab(((File) this.X).getAbsolutePath()), (Continuation) null));
    }
}
