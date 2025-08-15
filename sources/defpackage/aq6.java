package defpackage;

import one.me.sdk.transfer.exceptions.HttpErrorException;

/* renamed from: aq6  reason: default package */
public final /* synthetic */ class aq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq6 b;

    public /* synthetic */ aq6(cq6 cq6, int i) {
        this.a = i;
        this.b = cq6;
    }

    public final void run() {
        cq6 cq6 = this.b;
        switch (this.a) {
            case 0:
                if (!cq6.Y.get()) {
                    hm9.p("dq6", "onFileDownloadInterrupted", (Throwable) null);
                    cq6.X.onError(new HttpErrorException("url expired", (eq6) null));
                    cq6.c(false);
                    return;
                }
                return;
            case 1:
                if (!cq6.Y.get()) {
                    hm9.p("dq6", "onFileDownloadFailed", (Throwable) null);
                    cq6.X.onError(new HttpErrorException("onFileDownloadFailed", (eq6) null));
                    cq6.c(false);
                    return;
                }
                return;
            default:
                if (!cq6.Y.get()) {
                    hm9.p("dq6", "onFileDownloadInterrupted", (Throwable) null);
                    cq6.X.onError(new HttpErrorException("onFileDownloadInterrupted", (eq6) null));
                    cq6.c(false);
                    return;
                }
                return;
        }
    }
}
