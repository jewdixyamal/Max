package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: roa  reason: default package */
public final class roa implements Handler.Callback {
    public static final ThreadLocal X = new ThreadLocal();
    public static final ExecutorService o;
    public final ExecutorService a = o;
    public final Handler b = null;
    public final d4c c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        o = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new kc(10));
    }

    public roa(d4c d4c) {
        this.c = d4c;
    }

    public final boolean handleMessage(Message message) {
        mcg mcg = (mcg) message.obj;
        if (mcg.c) {
            return true;
        }
        mcg.o++;
        this.c.log(e0e.app_event, "rtc.long.executor.task." + mcg.o, mcg.a);
        if (mcg.o >= 4) {
            return true;
        }
        Handler handler = this.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = mcg;
            this.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            return true;
        }
        throw new IllegalStateException("No task duration check thread");
    }
}
