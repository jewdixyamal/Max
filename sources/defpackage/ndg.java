package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: ndg  reason: default package */
public final class ndg extends BroadcastReceiver {
    public Context a;
    public final djb b;

    public ndg(djb djb) {
        this.b = djb;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            ((gwe) this.b.c).getClass();
            throw null;
        }
    }
}
