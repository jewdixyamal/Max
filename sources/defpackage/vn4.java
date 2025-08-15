package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: vn4  reason: default package */
public final class vn4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DownloadFileAttachWorker Y;
    public int Z;
    public DownloadFileAttachWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Y = downloadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
