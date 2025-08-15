package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* renamed from: gy5  reason: default package */
public final class gy5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForegroundWorker Y;
    public int Z;
    public ForegroundWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gy5(ForegroundWorker foregroundWorker, Continuation continuation) {
        super(continuation);
        this.Y = foregroundWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.getForegroundInfo(this);
    }
}
