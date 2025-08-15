package defpackage;

import java.util.HashSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: if0  reason: default package */
public final class if0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;
    public final /* synthetic */ HashSet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if0(BacklogWorker backlogWorker, HashSet hashSet, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
        this.Y = hashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((if0) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new if0(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.e().g().updateState(0, x53.D0(this.Y));
        return e5f.a;
    }
}
