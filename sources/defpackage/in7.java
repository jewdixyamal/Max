package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: in7  reason: default package */
public final class in7 extends hu3 {
    public String X;
    public LiveLocationWorker Y;
    public /* synthetic */ Object Z;
    public LiveLocationWorker o;
    public final /* synthetic */ LiveLocationWorker s0;
    public int t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in7(LiveLocationWorker liveLocationWorker, Continuation continuation) {
        super(continuation);
        this.s0 = liveLocationWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.doWork(this);
    }
}
