package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: g87  reason: default package */
public final class g87 extends h87 {
    public final JobInfo c;
    public final JobScheduler d;

    public g87(Context context, ComponentName componentName, int i) {
        a(i);
        this.c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
        this.d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
