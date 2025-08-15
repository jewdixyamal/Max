package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: r7f  reason: default package */
public final class r7f extends hu3 {
    public fm7 X;
    public UploadExternalGifWorker Y;
    public /* synthetic */ Object Z;
    public UploadExternalGifWorker o;
    public final /* synthetic */ UploadExternalGifWorker s0;
    public int t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r7f(UploadExternalGifWorker uploadExternalGifWorker, Continuation continuation) {
        super(continuation);
        this.s0 = uploadExternalGifWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.doForegroundWork(this);
    }
}
