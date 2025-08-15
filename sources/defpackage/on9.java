package defpackage;

import android.net.ConnectivityManager;

/* renamed from: on9  reason: default package */
public abstract class on9 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
