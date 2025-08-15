package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: gm7  reason: default package */
public abstract class gm7 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public gm7(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [dcd, java.lang.Object, bm7] */
    public bm7 getForegroundInfoAsync() {
        ? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final d24 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.o;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public wne getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public p8g getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, bm7] */
    public final bm7 setForegroundAsync(ay5 ay5) {
        dy5 dy5 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        k7g k7g = (k7g) dy5;
        k7g.getClass();
        ? obj = new Object();
        k7g.a.l(new z68(k7g, obj, id, ay5, applicationContext, 2));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, bm7] */
    public bm7 setProgressAsync(d24 d24) {
        hnb hnb = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        b8g b8g = (b8g) hnb;
        b8g.getClass();
        ? obj = new Object();
        b8g.b.l(new r8g((Object) b8g, (Object) id, (Object) d24, (Object) obj, 7));
        return obj;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract bm7 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
