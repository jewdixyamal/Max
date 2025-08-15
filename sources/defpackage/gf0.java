package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: gf0  reason: default package */
public final class gf0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gf0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gf0(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return new Integer(this.X.e().g().count(0));
    }
}
