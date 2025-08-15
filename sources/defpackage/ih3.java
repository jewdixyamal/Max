package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

/* renamed from: ih3  reason: default package */
public final /* synthetic */ class ih3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh3 b;

    public /* synthetic */ ih3(lh3 lh3, int i) {
        this.a = i;
        this.b = lh3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ConnectivityManager) this.b.a.getSystemService("connectivity");
            default:
                return (TelephonyManager) this.b.a.getSystemService("phone");
        }
    }
}
