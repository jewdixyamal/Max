package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: ahc  reason: default package */
public final class ahc implements Application.ActivityLifecycleCallbacks {
    public static final zgc Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new ahc());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        int i = bhc.a;
        ju0.l(activity, eg7.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
