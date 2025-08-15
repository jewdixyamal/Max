package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: ko4  reason: default package */
public final class ko4 extends ffe implements a66 {
    public final /* synthetic */ DownloadFileFromWebAppWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileFromWebAppWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ko4(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.X;
        return ((kk5) ((zi5) downloadFileFromWebAppWorker.c.getValue())).i(downloadFileFromWebAppWorker.c().d);
    }
}
