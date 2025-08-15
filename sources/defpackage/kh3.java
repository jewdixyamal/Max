package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: kh3  reason: default package */
public final class kh3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                lh3 lh3 = (lh3) this.b;
                hm9.m(lh3.l, "onAvailable", new Object[0]);
                lh3.n(jh3.a((jh3) lh3.k.get(), true, true, 28));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                lh3 lh3 = (lh3) this.b;
                lh3.getClass();
                lh3.h = lh3.j(networkCapabilities);
                lh3 lh32 = (lh3) this.b;
                String str = lh32.l;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    zh3 zh3 = lh32.h;
                    ir6.d(us7, str, "onCapabilitiesChanged, current connection is " + zh3 + ", capabilities=" + networkCapabilities, (Throwable) null);
                }
                ((lh3) this.b).o(network, networkCapabilities);
                return;
            default:
                a14 u = a14.u();
                String str2 = zn9.a;
                u.n(str2, "Network capabilities changed: " + networkCapabilities);
                yn9 yn9 = (yn9) this.b;
                yn9.q(zn9.a(yn9.Y));
                return;
        }
    }

    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                String str = ((lh3) this.b).l;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, "onLost", (Throwable) null);
                }
                lh3 lh3 = (lh3) this.b;
                lh3.n(jh3.a((jh3) lh3.k.get(), false, false, 30));
                return;
            default:
                a14.u().n(zn9.a, "Network connection lost");
                yn9 yn9 = (yn9) this.b;
                yn9.q(zn9.a(yn9.Y));
                return;
        }
    }
}
