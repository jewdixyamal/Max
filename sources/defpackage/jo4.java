package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: jo4  reason: default package */
public final class jo4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DownloadFileFromWebAppWorker Y;
    public int Z;
    public DownloadFileFromWebAppWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(continuation);
        this.Y = downloadFileFromWebAppWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
