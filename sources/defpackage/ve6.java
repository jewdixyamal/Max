package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ve6  reason: default package */
public final class ve6 extends BroadcastReceiver {
    public final /* synthetic */ we6 a;

    public ve6(we6 we6) {
        this.a = we6;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            we6 we6 = this.a;
            if (status == null || status.a != 0) {
                String str = we6.e;
                Set<String> keySet = extras != null ? extras.keySet() : null;
                hm9.r(str, new Error("onMessageReceived: error; status = " + status + ", " + keySet), (String) null, new Object[0]);
                return;
            }
            j47.T(we6.d, (lx3) null, (vx3) null, new ue6(we6, extras, (Continuation) null), 3);
        }
    }
}
