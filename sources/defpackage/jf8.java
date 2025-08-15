package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: jf8  reason: default package */
public final class jf8 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ kf8 a;

    public jf8(kf8 kf8) {
        this.a = kf8;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        tg8 tg8 = (tg8) this.a.v0.remove(routingController);
        if (tg8 != null) {
            ah8 ah8 = (ah8) this.a.u0.b;
            if (tg8 == ah8.s) {
                dh8 c = ah8.c();
                if (ah8.f() != c) {
                    ah8.i(c, 2);
                }
            } else if (eh8.c) {
                Objects.toString(tg8);
            }
        } else {
            Objects.toString(routingController);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        dh8 dh8;
        this.a.v0.remove(routingController);
        if (routingController2 == this.a.t0.getSystemController()) {
            ah8 ah8 = (ah8) this.a.u0.b;
            dh8 c = ah8.c();
            if (ah8.f() != c) {
                ah8.i(c, 3);
                return;
            }
            return;
        }
        List u = routingController2.getSelectedRoutes();
        if (!u.isEmpty()) {
            String r = c4.i(u.get(0)).getId();
            this.a.v0.put(routingController2, new gf8(this.a, routingController2, r));
            ah8 ah82 = (ah8) this.a.u0.b;
            Iterator it = ah82.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dh8 = null;
                    break;
                }
                dh8 = (dh8) it.next();
                if (dh8.c() == ah82.e && TextUtils.equals(r, dh8.b)) {
                    break;
                }
            }
            if (dh8 != null) {
                ah82.i(dh8, 3);
            }
            this.a.k(routingController2);
        }
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
    }
}
