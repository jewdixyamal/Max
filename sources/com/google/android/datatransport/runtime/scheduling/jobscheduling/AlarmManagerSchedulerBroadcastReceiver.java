package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import org.apache.commons.logging.LogFactory;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o2f.b(context);
        vq7 a2 = hc0.a();
        a2.t(queryParameter);
        a2.o = d9b.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        t8f t8f = o2f.a().d;
        hc0 j = a2.j();
        kc kcVar = new kc(0);
        t8f.getClass();
        t8f.e.execute(new t05(t8f, j, i, kcVar));
    }
}
