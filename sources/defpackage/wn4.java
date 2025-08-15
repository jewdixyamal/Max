package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: wn4  reason: default package */
public final class wn4 extends ffe implements a66 {
    public final /* synthetic */ DownloadFileAttachWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wn4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wn4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wn4(this.X, continuation);
    }

    public final Object o(Object obj) {
        s10 s10;
        String str;
        od2.a0(obj);
        DownloadFileAttachWorker downloadFileAttachWorker = this.X;
        if (downloadFileAttachWorker.g().c > 0) {
            return ((kk5) downloadFileAttachWorker.d()).s(downloadFileAttachWorker.g().c);
        } else if (downloadFileAttachWorker.g().d > 0) {
            return ((kk5) downloadFileAttachWorker.d()).d(downloadFileAttachWorker.g().d);
        } else if (downloadFileAttachWorker.g().e > 0) {
            return ((kk5) downloadFileAttachWorker.d()).k(downloadFileAttachWorker.g().e);
        } else if (downloadFileAttachWorker.g().f > 0) {
            zi5 d = downloadFileAttachWorker.d();
            long j = downloadFileAttachWorker.g().f;
            kk5 kk5 = (kk5) d;
            kk5.getClass();
            return new File(kk5.g(kk5.b(), "stickerCache"), ey8.h(j, "sticker_"));
        } else {
            File file = null;
            if (downloadFileAttachWorker.g().j > 0) {
                cu8 q = downloadFileAttachWorker.e().q(downloadFileAttachWorker.g().a);
                if (q != null) {
                    k8g k8g = q.z0;
                    if (k8g != null) {
                        l20 k = k8g.k(g20.u0);
                        if (!(k == null || (s10 = k.j) == null || (str = k.s) == null || str.length() == 0)) {
                            File file2 = new File(str);
                            if (file2.exists() && file2.length() == s10.b && file2.lastModified() == k.w) {
                                file = file2;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (file == null) {
                    return ((kk5) downloadFileAttachWorker.d()).i(downloadFileAttachWorker.g().k);
                }
            }
            return file;
        }
    }
}
