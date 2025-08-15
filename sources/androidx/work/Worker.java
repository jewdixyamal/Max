package androidx.work;

import android.content.Context;

public abstract class Worker extends gm7 {
    public dcd a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract fm7 b();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, bm7] */
    public final bm7 getForegroundInfoAsync() {
        ? obj = new Object();
        getBackgroundExecutor().execute(new h76((Object) this, (Object) obj, false, 29));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dcd, java.lang.Object] */
    public final bm7 startWork() {
        this.a = new Object();
        getBackgroundExecutor().execute(new gwe(6, (Object) this));
        return this.a;
    }
}
