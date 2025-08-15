package defpackage;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: mcg  reason: default package */
public final class mcg implements Runnable {
    public final /* synthetic */ roa X;
    public final String a;
    public final Runnable b;
    public volatile boolean c = false;
    public int o = 0;

    public mcg(roa roa, String str, Runnable runnable) {
        this.X = roa;
        this.a = str;
        this.b = runnable;
    }

    public final void run() {
        Handler handler = this.X.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = this;
            this.X.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        }
        this.b.run();
        this.c = true;
    }
}
