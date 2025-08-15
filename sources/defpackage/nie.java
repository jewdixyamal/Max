package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: nie  reason: default package */
public abstract class nie extends pie implements gh8, hh8 {
    public static final ArrayList D0;
    public static final ArrayList E0;
    public boolean A0;
    public final ArrayList B0 = new ArrayList();
    public final ArrayList C0 = new ArrayList();
    public final oie t0;
    public final Object u0;
    public final Object v0;
    public final ih8 w0;
    public final MediaRouter.RouteCategory x0;
    public int y0;
    public boolean z0;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        D0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        E0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public nie(Context context, oie oie) {
        super(context, new ey1(21, new ComponentName("android", pie.class.getName())));
        this.t0 = oie;
        Object systemService = context.getSystemService("media_router");
        this.u0 = systemService;
        this.v0 = new kh8((jie) this);
        this.w0 = new ih8(this);
        this.x0 = ((MediaRouter) systemService).createRouteCategory(context.getResources().getString(n1c.mr_user_route_category_name), false);
        v();
    }

    public static mie n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof mie) {
            return (mie) tag;
        }
        return null;
    }

    public final void a(int i, Object obj) {
        mie n = n(obj);
        if (n != null) {
            n.a.k(i);
        }
    }

    public final void b(int i, Object obj) {
        mie n = n(obj);
        if (n != null) {
            n.a.j(i);
        }
    }

    public final tg8 d(String str) {
        int k = k(str);
        if (k >= 0) {
            return new kie(((lie) this.B0.get(k)).a);
        }
        return null;
    }

    public final void f(bg8 bg8) {
        boolean z;
        int i = 0;
        if (bg8 != null) {
            bg8.a();
            ArrayList b = bg8.b.b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = bg8.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.y0 != i || this.z0 != z) {
            this.y0 = i;
            this.z0 = z;
            v();
        }
    }

    public final boolean i(Object obj) {
        String str;
        String str2;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo m = m();
        String str3 = "";
        Context context = this.a;
        if (m == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            str = String.format(locale, "ROUTE_%08x", new Object[]{Integer.valueOf((name != null ? name.toString() : str3).hashCode())});
        }
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i;
                if (k(str2) < 0) {
                    break;
                }
                i++;
            }
            str = str2;
        }
        lie lie = new lie(obj, str);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        vq7 vq7 = new vq7(str, str3);
        o(lie, vq7);
        lie.c = vq7.k();
        this.B0.add(lie);
        return true;
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lie) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lie) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(dh8 dh8) {
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mie) arrayList.get(i)).a == dh8) {
                return i;
            }
        }
        return -1;
    }

    public abstract MediaRouter.RouteInfo m();

    public void o(lie lie, vq7 vq7) {
        int supportedTypes = ((MediaRouter.RouteInfo) lie.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            vq7.h(D0);
        }
        if ((supportedTypes & 2) != 0) {
            vq7.h(E0);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) lie.a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = (Bundle) vq7.b;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public final void p(dh8 dh8) {
        ug8 c = dh8.c();
        Object obj = this.u0;
        if (c != this) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.x0);
            mie mie = new mie(dh8, createUserRoute);
            createUserRoute.setTag(mie);
            createUserRoute.setVolumeCallback(this.w0);
            w(mie);
            this.C0.add(mie);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int j = j(((MediaRouter) obj).getSelectedRoute(8388611));
        if (j >= 0 && ((lie) this.B0.get(j)).b.equals(dh8.b)) {
            dh8.l();
        }
    }

    public final void q(dh8 dh8) {
        int l;
        if (dh8.c() != this && (l = l(dh8)) >= 0) {
            mie mie = (mie) this.C0.remove(l);
            ((MediaRouter.UserRouteInfo) mie.b).setTag((Object) null);
            Object obj = mie.b;
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) null);
            try {
                ((MediaRouter) this.u0).removeUserRoute((MediaRouter.UserRouteInfo) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void r(dh8 dh8) {
        if (dh8.g()) {
            if (dh8.c() != this) {
                int l = l(dh8);
                if (l >= 0) {
                    t(((mie) this.C0.get(l)).b);
                    return;
                }
                return;
            }
            int k = k(dh8.b);
            if (k >= 0) {
                t(((lie) this.B0.get(k)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        int i = 0;
        while (i < size) {
            zf8 zf8 = ((lie) arrayList.get(i)).c;
            if (zf8 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                } else if (arrayList2.contains(zf8)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList2.add(zf8);
                i++;
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        g(new vg8(arrayList2, false));
    }

    public abstract void t(Object obj);

    public abstract void u();

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.u0;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= i(it.next());
        }
        if (z) {
            s();
        }
    }

    public void w(mie mie) {
        int i;
        Object obj = mie.b;
        dh8 dh8 = mie.a;
        ((MediaRouter.UserRouteInfo) obj).setName(dh8.d);
        int i2 = dh8.k;
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) mie.b;
        userRouteInfo.setPlaybackType(i2);
        userRouteInfo.setPlaybackStream(dh8.l);
        userRouteInfo.setVolume(dh8.o);
        userRouteInfo.setVolumeMax(dh8.p);
        if (dh8.e()) {
            if (eh8.d == null) {
                i = 0;
                userRouteInfo.setVolumeHandling(i);
            }
            eh8.c().getClass();
        }
        i = dh8.n;
        userRouteInfo.setVolumeHandling(i);
    }
}
