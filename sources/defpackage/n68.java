package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;

/* renamed from: n68  reason: default package */
public final class n68 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ jo7 a;

    public n68(jo7 jo7) {
        this.a = jo7;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [nr6, java.lang.Object] */
    public final void onConnected() {
        pr6 pr6;
        jo7 jo7 = this.a;
        o68 o68 = (o68) jo7.b;
        boolean z = true;
        if (o68 != null) {
            MediaBrowser mediaBrowser = o68.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        y7g y7g = new y7g(binder, o68.c);
                        o68.f = y7g;
                        m68 m68 = o68.d;
                        Messenger messenger = new Messenger(m68);
                        o68.g = messenger;
                        m68.getClass();
                        m68.c = new WeakReference(messenger);
                        try {
                            Context context = o68.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) y7g.c);
                            y7g.E(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = uh8.d;
                    if (binder2 == null) {
                        pr6 = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof pr6)) {
                            ? obj = new Object();
                            obj.c = binder2;
                            pr6 = obj;
                        } else {
                            pr6 = (pr6) queryLocalInterface;
                        }
                    }
                    if (pr6 != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        fm9.k(sessionToken != null);
                        if (sessionToken instanceof MediaSession.Token) {
                            o68.h = new ai8(sessionToken, pr6);
                        } else {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        da8 da8 = (da8) jo7.c;
        q68 q68 = da8.h;
        if (q68 != null) {
            o68 o682 = q68.a;
            if (o682.h == null) {
                MediaSession.Token sessionToken2 = o682.b.getSessionToken();
                if (sessionToken2 == null) {
                    z = false;
                }
                fm9.k(z);
                if (sessionToken2 instanceof MediaSession.Token) {
                    o682.h = new ai8(sessionToken2, (pr6) null);
                } else {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
            }
            vs5 vs5 = new vs5(da8, 16, o682.h);
            a98 a98 = da8.b;
            a98.G(vs5);
            a98.X.post(new aa8(da8, 0));
        }
    }

    public final void onConnectionFailed() {
        jo7 jo7 = this.a;
        Object obj = jo7.b;
        ((da8) jo7.c).b.release();
    }

    public final void onConnectionSuspended() {
        jo7 jo7 = this.a;
        o68 o68 = (o68) jo7.b;
        if (o68 != null) {
            o68.f = null;
            o68.g = null;
            o68.h = null;
            m68 m68 = o68.d;
            m68.getClass();
            m68.c = new WeakReference((Object) null);
        }
        ((da8) jo7.c).b.release();
    }
}
