package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: eo9  reason: default package */
public final class eo9 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final ho9 a;

    public eo9(ho9 ho9) {
        this.a = ho9;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = b == 3 || b == 4 || b == 5;
        ho9 ho9 = this.a;
        if (z) {
            i = 10;
        }
        ho9.g(i, ho9);
    }
}
