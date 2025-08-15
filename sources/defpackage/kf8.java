package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: kf8  reason: default package */
public final class kf8 extends ug8 {
    public ArrayList A0 = new ArrayList();
    public final ArrayMap B0 = new ArrayMap();
    public final MediaRouter2 t0;
    public final re6 u0;
    public final ArrayMap v0 = new ArrayMap();
    public final if8 w0 = new if8(this);
    public final jf8 x0 = new jf8(this);
    public final ff8 y0 = new ff8(this);
    public final a84 z0;

    public kf8(Context context, re6 re6) {
        super(context, (ey1) null);
        this.t0 = MediaRouter2.getInstance(context);
        this.u0 = re6;
        this.z0 = new a84(new Handler(Looper.getMainLooper()), 0);
    }

    public final sg8 c(String str) {
        for (Map.Entry value : this.v0.entrySet()) {
            gf8 gf8 = (gf8) value.getValue();
            if (TextUtils.equals(str, gf8.f)) {
                return gf8;
            }
        }
        return null;
    }

    public final tg8 d(String str) {
        return new hf8((String) this.B0.get(str), (gf8) null);
    }

    public final tg8 e(String str, String str2) {
        String str3 = (String) this.B0.get(str);
        for (gf8 gf8 : this.v0.values()) {
            zf8 zf8 = gf8.o;
            if (TextUtils.equals(str2, zf8 != null ? zf8.c() : gf8.g.getId())) {
                return new hf8(str3, gf8);
            }
        }
        return new hf8(str3, (gf8) null);
    }

    public final void f(bg8 bg8) {
        ArrayList arrayList;
        wg8 wg8;
        RouteDiscoveryPreference routeDiscoveryPreference;
        int i = eh8.d == null ? 0 : eh8.c().y;
        ff8 ff8 = this.y0;
        jf8 jf8 = this.x0;
        if8 if8 = this.w0;
        if (i > 0) {
            eh8.c();
            if (bg8 == null) {
                bg8 = new bg8(wg8.c, false);
            }
            bg8.a();
            ArrayList b = bg8.b.b();
            b.remove("android.media.intent.category.LIVE_AUDIO");
            if (!b.isEmpty()) {
                Iterator it = b.iterator();
                arrayList = null;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                wg8 = wg8.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                wg8 = new wg8(arrayList, bundle);
            }
            boolean b2 = bg8.b();
            if (wg8 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", wg8.a);
                bundle2.putBoolean("activeScan", b2);
                MediaRouter2 mediaRouter2 = this.t0;
                wg8.a();
                if (!(!wg8.b.contains((Object) null))) {
                    ef8.n();
                    routeDiscoveryPreference = ef8.f(new ArrayList()).build();
                } else {
                    boolean z = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = wg8.b().iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        str2.getClass();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str2 = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str2 = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList2.add(str2);
                    }
                    routeDiscoveryPreference = ef8.g(arrayList2, z).build();
                }
                a84 a84 = this.z0;
                mediaRouter2.registerRouteCallback(a84, if8, routeDiscoveryPreference);
                this.t0.registerTransferCallback(a84, jf8);
                this.t0.registerControllerCallback(a84, ff8);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.t0.unregisterRouteCallback(if8);
        this.t0.unregisterTransferCallback(jf8);
        this.t0.unregisterControllerCallback(ff8);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info i = c4.i(it.next());
            if (TextUtils.equals(i.getId(), str)) {
                return i;
            }
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (Object i : this.t0.getRoutes()) {
            MediaRoute2Info i2 = c4.i(i);
            if (i2 != null && !arraySet.contains(i2) && !i2.isSystemRoute()) {
                arraySet.add(i2);
                arrayList.add(i2);
            }
        }
        if (!arrayList.equals(this.A0)) {
            this.A0 = arrayList;
            ArrayMap arrayMap = this.B0;
            arrayMap.clear();
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                MediaRoute2Info i3 = c4.i(it.next());
                Bundle j = i3.getExtras();
                if (j == null || j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    i3.toString();
                } else {
                    arrayMap.put(i3.getId(), j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = this.A0.iterator();
            while (it2.hasNext()) {
                MediaRoute2Info i4 = c4.i(it2.next());
                zf8 N = np8.N(i4);
                if (i4 != null) {
                    arrayList2.add(N);
                }
            }
            ArrayList arrayList3 = null;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    zf8 zf8 = (zf8) it3.next();
                    if (zf8 != null) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        } else if (arrayList3.contains(zf8)) {
                            throw new IllegalArgumentException("route descriptor already added");
                        }
                        arrayList3.add(zf8);
                    } else {
                        throw new IllegalArgumentException("route must not be null");
                    }
                }
            }
            g(new vg8(arrayList3, true));
        }
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        gf8 gf8 = (gf8) this.v0.get(routingController);
        if (gf8 == null) {
            Objects.toString(routingController);
            return;
        }
        List u = routingController.getSelectedRoutes();
        if (u.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList x = np8.x(u);
        zf8 N = np8.N(c4.i(u.get(0)));
        Bundle k = routingController.getControlHints();
        String string = this.a.getString(n1c.mr_dialog_default_group_name);
        zf8 zf8 = null;
        if (k != null) {
            try {
                String string2 = k.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = k.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    zf8 = new zf8(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (zf8 == null) {
            vq7 vq7 = new vq7(routingController.getId(), string);
            Bundle bundle2 = (Bundle) vq7.b;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            bundle2.putInt("volume", routingController.getVolume());
            bundle2.putInt("volumeMax", routingController.getVolumeMax());
            bundle2.putInt("volumeHandling", routingController.getVolumeHandling());
            N.a();
            vq7.h(N.c);
            if (!x.isEmpty()) {
                Iterator it = x.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        if (((ArrayList) vq7.c) == null) {
                            vq7.c = new ArrayList();
                        }
                        if (!((ArrayList) vq7.c).contains(str)) {
                            ((ArrayList) vq7.c).add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            zf8 = vq7.k();
        }
        ArrayList x2 = np8.x(routingController.getSelectableRoutes());
        ArrayList x3 = np8.x(routingController.getDeselectableRoutes());
        vg8 vg8 = this.Z;
        if (vg8 != null) {
            ArrayList arrayList = new ArrayList();
            List<zf8> list = vg8.c;
            if (!list.isEmpty()) {
                for (zf8 zf82 : list) {
                    String c = zf82.c();
                    arrayList.add(new rg8(zf82, x.contains(c) ? 3 : 1, x3.contains(c), x2.contains(c), true));
                }
            }
            gf8.o = zf8;
            gf8.l(zf8, arrayList);
        }
    }
}
