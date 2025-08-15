package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: n9b  reason: default package */
public abstract class n9b {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
