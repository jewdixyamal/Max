package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;

/* renamed from: z77  reason: default package */
public final class z77 {
    public final Context a;
    public final h45 b;
    public final pb0 c;

    public z77(Context context, h45 h45, pb0 pb0) {
        this.a = context;
        this.b = h45;
        this.c = pb0;
    }

    /* JADX INFO: finally extract failed */
    public final void a(hc0 hc0, int i, boolean z) {
        hc0 hc02 = hc0;
        int i2 = i;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(hc02.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        z8b z8b = hc02.c;
        adler32.update(allocate.putInt(d9b.a(z8b)).array());
        byte[] bArr = hc02.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        j1e.m("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", hc02);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase m = ((gqc) this.b).m();
        String valueOf = String.valueOf(d9b.a(z8b));
        String str = hc02.a;
        Cursor rawQuery = m.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            pb0 pb0 = this.c;
            JobScheduler jobScheduler2 = jobScheduler;
            int i4 = value;
            builder.setMinimumLatency(pb0.a(z8b, longValue, i2));
            Set set = ((qb0) pb0.b.get(z8b)).c;
            if (set.contains(cuc.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(cuc.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(cuc.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, d9b.a(z8b));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {hc02, Integer.valueOf(i4), Long.valueOf(pb0.a(z8b, longValue, i2)), valueOf2, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler2.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
