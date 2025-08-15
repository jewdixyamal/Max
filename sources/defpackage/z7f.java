package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: z7f  reason: default package */
public final class z7f extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ UploadFileAttachWorker Z;
    public UploadFileAttachWorker o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z7f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Z = uploadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.k(this);
    }
}
