package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yec  reason: default package */
public final class yec extends ug8 implements ServiceConnection {
    public static final boolean B0 = Log.isLoggable("MediaRouteProviderProxy", 3);
    public yt8 A0;
    public final ComponentName t0;
    public final fc9 u0;
    public final ArrayList v0 = new ArrayList();
    public boolean w0;
    public boolean x0;
    public tec y0;
    public boolean z0;

    public yec(Context context, ComponentName componentName) {
        super(context, new ey1(21, componentName));
        this.t0 = componentName;
        this.u0 = new fc9();
    }

    public final sg8 c(String str) {
        if (str != null) {
            vg8 vg8 = this.Z;
            if (vg8 != null) {
                List list = vg8.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((zf8) list.get(i)).c().equals(str)) {
                        wec wec = new wec(this, str);
                        this.v0.add(wec);
                        if (this.z0) {
                            wec.b(this.y0);
                        }
                        m();
                        return wec;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final tg8 d(String str) {
        if (str != null) {
            return j(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final tg8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return j(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public final void f(bg8 bg8) {
        if (this.z0) {
            tec tec = this.y0;
            int i = tec.d;
            tec.d = i + 1;
            tec.b(10, i, 0, bg8 != null ? bg8.a : null, (Bundle) null);
        }
        m();
    }

    public final void i() {
        if (!this.x0) {
            boolean z = B0;
            if (z) {
                toString();
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.t0);
            try {
                boolean bindService = this.a.bindService(intent, this, 4097);
                this.x0 = bindService;
                if (!bindService && z) {
                    toString();
                }
            } catch (SecurityException unused) {
                if (z) {
                    toString();
                }
            }
        }
    }

    public final xec j(String str, String str2) {
        vg8 vg8 = this.Z;
        if (vg8 == null) {
            return null;
        }
        List list = vg8.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((zf8) list.get(i)).c().equals(str)) {
                xec xec = new xec(this, str, str2);
                this.v0.add(xec);
                if (this.z0) {
                    xec.b(this.y0);
                }
                m();
                return xec;
            }
        }
        return null;
    }

    public final void k() {
        if (this.y0 != null) {
            g((vg8) null);
            this.z0 = false;
            ArrayList arrayList = this.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((uec) arrayList.get(i)).c();
            }
            tec tec = this.y0;
            tec.b(2, 0, 0, (Bundle) null, (Bundle) null);
            tec.b.b.clear();
            tec.a.getBinder().unlinkToDeath(tec, 0);
            tec.i.u0.post(new sec(tec, 0));
            this.y0 = null;
        }
    }

    public final void l() {
        if (this.x0) {
            if (B0) {
                toString();
            }
            this.x0 = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void m() {
        if (!this.w0 || (this.X == null && this.v0.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = B0;
        if (z) {
            toString();
        }
        if (this.x0) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        tec tec = new tec(this, messenger);
                        int i = tec.d;
                        tec.d = i + 1;
                        tec.g = i;
                        if (tec.b(1, i, 4, (Bundle) null, (Bundle) null)) {
                            try {
                                tec.a.getBinder().linkToDeath(tec, 0);
                                this.y0 = tec;
                                return;
                            } catch (RemoteException unused) {
                                tec.binderDied();
                            }
                        }
                        if (z) {
                            toString();
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (B0) {
            toString();
        }
        k();
    }

    public final String toString() {
        return "Service connection " + this.t0.flattenToShortString();
    }
}
