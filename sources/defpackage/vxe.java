package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: vxe  reason: default package */
public final class vxe extends BroadcastReceiver {
    public wxe a;

    public final synchronized void onReceive(Context context, Intent intent) {
        wxe wxe = this.a;
        if (wxe != null) {
            if (wxe.c()) {
                wxe wxe2 = this.a;
                ((uxe) wxe2.Y).f.schedule(wxe2, 0, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }
}
