package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: hkg  reason: default package */
public final class hkg implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hkg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                mkg mkg = (mkg) this.b;
                mkg.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                mkg.a().post(new uhg(this, iBinder));
                return;
            default:
                ykg ykg = (ykg) this.b;
                ykg.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                ykg.a().post(new lkg(this, iBinder));
                return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                mkg mkg = (mkg) this.b;
                mkg.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                mkg.a().post(new ljg(1, this));
                return;
            default:
                ykg ykg = (ykg) this.b;
                ykg.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                ykg.a().post(new gkg(1, this));
                return;
        }
    }
}
