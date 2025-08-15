package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: i87  reason: default package */
public abstract class i87 extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, h87> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<c87> mCompatQueue = null;
    h87 mCompatWorkEnqueuer;
    a87 mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    b87 mJobImpl;
    boolean mStopped = false;

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static h87 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, h87> hashMap = sClassWorkEnqueuer;
        h87 h87 = hashMap.get(componentName);
        if (h87 != null) {
            return h87;
        }
        if (z) {
            g87 g87 = new g87(context, componentName, i);
            hashMap.put(componentName, g87);
            return g87;
        }
        throw new IllegalArgumentException("Can't be here without a job id");
    }

    public abstract d87 dequeueWork();

    public boolean doStopCurrentWork() {
        a87 a87 = this.mCurProcessor;
        if (a87 != null) {
            a87.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a87(this);
            h87 h87 = this.mCompatWorkEnqueuer;
            if (h87 != null && z) {
                h87.getClass();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        b87 b87 = this.mJobImpl;
        if (b87 != null) {
            return b87.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new f87(this, 0);
        this.mCompatWorkEnqueuer = null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<c87> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<c87> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c87(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<c87> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<c87> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                h87 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.a(i);
                g87 g87 = (g87) workEnqueuer;
                g87.d.enqueue(g87.c, new JobWorkItem(intent));
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
