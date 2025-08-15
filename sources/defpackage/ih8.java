package defpackage;

import android.media.MediaRouter;

/* renamed from: ih8  reason: default package */
public final class ih8 extends MediaRouter.VolumeCallback {
    public final hh8 a;

    public ih8(hh8 hh8) {
        this.a = hh8;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(i, routeInfo);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(i, routeInfo);
    }
}
