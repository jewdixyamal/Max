package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: fo9  reason: default package */
public final class fo9 extends PhoneStateListener {
    public final /* synthetic */ go9 a;

    public fo9(go9 go9) {
        this.a = go9;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        go9.b(this.a, b == 3 || b == 4 ? 10 : 5);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        go9.b(this.a, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
