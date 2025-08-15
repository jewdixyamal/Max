package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import org.apache.commons.logging.LogFactory;

public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o2f.b(getApplicationContext());
        vq7 a2 = hc0.a();
        a2.t(string);
        a2.o = d9b.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        t8f t8f = o2f.a().d;
        hc0 j = a2.j();
        vs5 vs5 = new vs5(this, 9, jobParameters);
        t8f.getClass();
        t8f.e.execute(new t05(t8f, j, i2, vs5));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
