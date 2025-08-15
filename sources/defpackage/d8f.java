package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: d8f  reason: default package */
public final class d8f extends hu3 {
    public UploadFileAttachWorker X;
    public long Y;
    public long Z;
    public UploadFileAttachWorker o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ UploadFileAttachWorker t0;
    public int u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d8f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.t0 = uploadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.l(this);
    }
}
