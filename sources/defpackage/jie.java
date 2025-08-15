package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;

/* renamed from: jie  reason: default package */
public final class jie extends nie implements jh8 {
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.u0).getDefaultRoute();
    }

    public final void o(lie lie, vq7 vq7) {
        z(lie, vq7);
        ((Bundle) vq7.b).putInt("deviceType", ((MediaRouter.RouteInfo) lie.a).getDeviceType());
    }

    public final void t(Object obj) {
        ((MediaRouter) this.u0).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    public final void u() {
        boolean z = this.A0;
        Object obj = this.v0;
        Object obj2 = this.u0;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.A0 = true;
        ((MediaRouter) obj2).addCallback(this.y0, (MediaRouter.Callback) obj, this.z0 | true ? 1 : 0);
    }

    public final void w(mie mie) {
        super.w(mie);
        ((MediaRouter.UserRouteInfo) mie.b).setDescription(mie.a.e);
    }

    public final boolean x(lie lie) {
        return ((MediaRouter.RouteInfo) lie.a).isConnecting();
    }

    public final void y(lie lie, vq7 vq7) {
        Display display;
        super.o(lie, vq7);
        Object obj = lie.a;
        boolean isEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
        Bundle bundle = (Bundle) vq7.b;
        if (!isEnabled) {
            bundle.putBoolean("enabled", false);
        }
        if (x(lie)) {
            bundle.putInt("connectionState", 1);
        }
        try {
            display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError unused) {
            display = null;
        }
        if (display != null) {
            bundle.putInt("presentationDisplayId", display.getDisplayId());
        }
    }

    public final void z(lie lie, vq7 vq7) {
        y(lie, vq7);
        CharSequence description = ((MediaRouter.RouteInfo) lie.a).getDescription();
        if (description != null) {
            ((Bundle) vq7.b).putString("status", description.toString());
        }
    }
}
