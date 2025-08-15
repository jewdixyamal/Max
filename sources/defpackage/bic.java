package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* renamed from: bic  reason: default package */
public final class bic extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ gb0 c;

    public bic(gb0 gb0) {
        this.c = gb0;
    }

    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new aic(this, 0));
    }

    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            ((Handler) this.c.e).post(new aic(this, 1));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        gb0 gb0 = this.c;
        if (!z || this.b != hasCapability) {
            this.a = true;
            this.b = hasCapability;
            ((Handler) gb0.e).post(new aic(this, 0));
        } else if (hasCapability) {
            ((Handler) gb0.e).post(new aic(this, 1));
        }
    }

    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new aic(this, 0));
    }
}
