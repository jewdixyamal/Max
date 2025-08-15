package defpackage;

import android.app.job.JobParameters;
import android.net.Network;

/* renamed from: hie  reason: default package */
public abstract class hie {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
