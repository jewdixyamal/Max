package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lgm7;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoroutineWorker extends gm7 {
    public final y77 a = pag.a();
    public final dcd b;
    public final jd4 c;

    /* JADX WARNING: type inference failed for: r2v2, types: [dcd, l1, java.lang.Object] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ? obj = new Object();
        this.b = obj;
        obj.d(new cu1(21, this), (qm) ((bkb) getTaskExecutor()).a);
        this.c = ql4.a;
    }

    public abstract Object doWork(Continuation continuation);

    public final bm7 getForegroundInfoAsync() {
        y77 a2 = pag.a();
        ContextScope a3 = j1e.a(this.c.plus(a2));
        j87 j87 = new j87(a2);
        j47.T(a3, (lx3) null, (vx3) null, new wx3(j87, this, (Continuation) null), 3);
        return j87;
    }

    public final void onStopped() {
        this.b.cancel(false);
    }

    public final bm7 startWork() {
        j47.T(j1e.a(this.c.plus(this.a)), (lx3) null, (vx3) null, new xx3(this, (Continuation) null), 3);
        return this.b;
    }
}
