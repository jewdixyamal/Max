package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* renamed from: lkg  reason: default package */
public final class lkg extends pjg {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ hkg c;

    public lkg(hkg hkg, IBinder iBinder) {
        this.c = hkg;
        this.b = iBinder;
    }

    public final void a() {
        thg thg;
        hkg hkg = this.c;
        ykg ykg = (ykg) hkg.b;
        int i = jhg.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            thg = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            thg = queryLocalInterface instanceof thg ? (thg) queryLocalInterface : new pgg(iBinder);
        }
        ykg.m = thg;
        ykg ykg2 = (ykg) hkg.b;
        ykg2.b.b("linkToDeath", new Object[0]);
        try {
            ykg2.m.asBinder().linkToDeath(ykg2.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            boolean isLoggable = Log.isLoggable("PlayCore", 6);
            o97 o97 = ykg2.b;
            if (isLoggable) {
                o97.c(o97.b, "linkToDeath failed", objArr);
            } else {
                o97.getClass();
            }
        }
        ykg2.g = false;
        Iterator it = ykg2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ykg2.d.clear();
    }
}
