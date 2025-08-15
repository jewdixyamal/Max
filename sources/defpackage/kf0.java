package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: kf0  reason: default package */
public final class kf0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;
    public final /* synthetic */ int Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf0(BacklogWorker backlogWorker, int i, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kf0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kf0(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return this.X.e().g().getItemsForRunning(this.Y);
    }
}
