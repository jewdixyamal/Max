package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: nn9  reason: default package */
public abstract class nn9 {
    public static final Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}
