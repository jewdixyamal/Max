package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;

/* renamed from: kh8  reason: default package */
public final class kh8 extends MediaRouter.Callback {
    public final gh8 a;

    public kh8(gh8 gh8) {
        this.a = gh8;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        nie nie = (nie) this.a;
        if (nie.i(routeInfo)) {
            nie.s();
        }
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        nie nie = (nie) this.a;
        nie.getClass();
        if (nie.n(routeInfo) == null && (j = nie.j(routeInfo)) >= 0) {
            lie lie = (lie) nie.B0.get(j);
            String str = lie.b;
            CharSequence name = ((MediaRouter.RouteInfo) lie.a).getName(nie.a);
            vq7 vq7 = new vq7(str, name != null ? name.toString() : "");
            nie.o(lie, vq7);
            lie.c = vq7.k();
            nie.s();
        }
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display display;
        jie jie = (jie) ((jh8) this.a);
        int j = jie.j(routeInfo);
        if (j >= 0) {
            lie lie = (lie) jie.B0.get(j);
            ArrayList arrayList = null;
            try {
                display = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            int displayId = display != null ? display.getDisplayId() : -1;
            if (displayId != lie.c.a.getInt("presentationDisplayId", -1)) {
                zf8 zf8 = lie.c;
                if (zf8 != null) {
                    Bundle bundle = new Bundle(zf8.a);
                    ArrayList arrayList2 = !zf8.b().isEmpty() ? new ArrayList(zf8.b()) : null;
                    zf8.a();
                    if (!zf8.c.isEmpty()) {
                        arrayList = new ArrayList(zf8.c);
                    }
                    bundle.putInt("presentationDisplayId", displayId);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    lie.c = new zf8(bundle);
                    jie.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        nie nie = (nie) this.a;
        nie.getClass();
        if (nie.n(routeInfo) == null && (j = nie.j(routeInfo)) >= 0) {
            nie.B0.remove(j);
            nie.s();
        }
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        dh8 a2;
        nie nie = (nie) this.a;
        if (routeInfo == ((MediaRouter) nie.u0).getSelectedRoute(8388611)) {
            mie n = nie.n(routeInfo);
            if (n != null) {
                n.a.l();
                return;
            }
            int j = nie.j(routeInfo);
            if (j >= 0) {
                String str = ((lie) nie.B0.get(j)).b;
                ah8 ah8 = (ah8) nie.t0;
                ah8.m.removeMessages(262);
                ch8 d = ah8.d(ah8.c);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        nie nie = (nie) this.a;
        nie.getClass();
        if (nie.n(routeInfo) == null && (j = nie.j(routeInfo)) >= 0) {
            lie lie = (lie) nie.B0.get(j);
            int volume = routeInfo.getVolume();
            if (volume != lie.c.a.getInt("volume")) {
                zf8 zf8 = lie.c;
                if (zf8 != null) {
                    Bundle bundle = new Bundle(zf8.a);
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = !zf8.b().isEmpty() ? new ArrayList(zf8.b()) : null;
                    zf8.a();
                    if (!zf8.c.isEmpty()) {
                        arrayList = new ArrayList(zf8.c);
                    }
                    bundle.putInt("volume", volume);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    lie.c = new zf8(bundle);
                    nie.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
