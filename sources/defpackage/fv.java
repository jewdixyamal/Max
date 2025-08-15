package defpackage;

import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;

/* renamed from: fv  reason: default package */
public final class fv implements CompletionHandler {
    public static final fv b = new fv(0);
    public static final fv c = new fv(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fv(int i) {
        this.a = i;
    }

    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ry1) obj2).resumeWith(obj);
                return;
            default:
                Void voidR = (Void) obj;
                ((ry1) obj2).resumeWith(e5f.a);
                return;
        }
    }

    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                ry1 ry1 = (ry1) obj;
                if (!(th instanceof AsynchronousCloseException) || !ry1.isCancelled()) {
                    ry1.resumeWith(new njc(th));
                    return;
                }
                return;
            default:
                ry1 ry12 = (ry1) obj;
                if (!(th instanceof AsynchronousCloseException) || !ry12.isCancelled()) {
                    ry12.resumeWith(new njc(th));
                    return;
                }
                return;
        }
    }
}
