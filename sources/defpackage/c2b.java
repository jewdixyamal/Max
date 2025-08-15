package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.services.PipWorker;

/* renamed from: c2b  reason: default package */
public final class c2b extends hu3 {
    public PipWorker X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ PipWorker Z;
    public PipWorker o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c2b(PipWorker pipWorker, Continuation continuation) {
        super(continuation);
        this.Z = pipWorker;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.doWork(this);
    }
}
