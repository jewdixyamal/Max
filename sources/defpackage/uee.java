package defpackage;

import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* renamed from: uee  reason: default package */
public final /* synthetic */ class uee implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Semaphore a;

    public /* synthetic */ uee(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final void onPixelCopyFinished(int i) {
        this.a.release();
    }
}
