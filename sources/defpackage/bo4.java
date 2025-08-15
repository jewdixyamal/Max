package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: bo4  reason: default package */
public final class bo4 extends hu3 {
    public cu8 X;
    public long Y;
    public /* synthetic */ Object Z;
    public DownloadFileAttachWorker o;
    public final /* synthetic */ DownloadFileAttachWorker s0;
    public int t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.s0 = downloadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.h((cu8) null, (d20) null, 0, 0, 0, (File) null, this);
    }
}
