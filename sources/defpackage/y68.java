package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: y68  reason: default package */
public final class y68 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ gaa Y;
    public final /* synthetic */ b78 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public y68(int i, int i2, c78 c78, gaa gaa, Bundle bundle, String str) {
        this.Y = gaa;
        this.a = c78;
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = bundle;
    }

    public final void run() {
        b78 b78 = this.a;
        IBinder binder = ((c78) b78).a.getBinder();
        gaa gaa = this.Y;
        ((cj8) gaa.a).X.remove(binder);
        s68 s68 = new s68((cj8) gaa.a, this.b, this.c, this.o, (c78) b78);
        cj8 cj8 = (cj8) gaa.a;
        cj8.Y = s68;
        ph4 b2 = cj8.b(this.X);
        cj8.Y = null;
        if (b2 == null) {
            try {
                ((c78) b78).a(2, (Bundle) null);
            } catch (RemoteException unused) {
            }
        } else {
            try {
                cj8.X.put(binder, s68);
                binder.linkToDeath(s68, 0);
                ai8 ai8 = cj8.s0;
                if (ai8 != null) {
                    Bundle bundle = (Bundle) b2.b;
                    c78 c78 = (c78) b78;
                    c78.getClass();
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("extra_service_version", 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
                    bundle2.putParcelable("data_media_session_token", mf7.a(ai8, MediaSessionCompat.Token.CREATOR));
                    bundle2.putBundle("data_root_hints", bundle);
                    c78.a(1, bundle2);
                }
            } catch (RemoteException unused2) {
                cj8.X.remove(binder);
            }
        }
    }
}
