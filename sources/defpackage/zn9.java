package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: zn9  reason: default package */
public abstract class zn9 {
    public static final String a = a14.O("NetworkStateTracker");

    public static final xn9 a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities a2 = mn9.a(connectivityManager, nn9.a(connectivityManager));
            if (a2 != null) {
                z = mn9.b(a2, 16);
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new xn9(z3, z, isActiveNetworkMetered, z2);
            }
        } catch (SecurityException e) {
            a14.u().r(a, "Unable to validate active network", e);
        }
        z = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        z2 = false;
        return new xn9(z3, z, isActiveNetworkMetered2, z2);
    }
}
