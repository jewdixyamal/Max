package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = a14.O("ConstrntProxyUpdtRecvr");

    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            a14.u().n(a, wg0.i("Ignoring unknown action ", action));
        } else {
            s7g.d(context).d.l(new wi3(intent, context, goAsync(), 0));
        }
    }
}
