package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = a14.O("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a14 u = a14.u();
            String str = a;
            u.n(str, "Requesting diagnostics");
            try {
                s7g.d(context).a((rla) new qla(DiagnosticsWorker.class).build());
            } catch (IllegalStateException e) {
                a14.u().r(str, "WorkManager is not initialized", e);
            }
        }
    }
}
