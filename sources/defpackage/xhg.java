package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* renamed from: xhg  reason: default package */
public final class xhg extends bfg {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xhg(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    public final void b(ph3 ph3) {
        gpf gpf = this.h.z0;
        if (gpf != null) {
            ((he6) gpf.a).k(ph3);
        }
        System.currentTimeMillis();
    }

    public final boolean c() {
        IInterface l;
        IBinder iBinder = this.g;
        try {
            fp3.n(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (aVar.p().equals(interfaceDescriptor) && (l = aVar.l(iBinder)) != null && (a.u(aVar, 2, 4, l) || a.u(aVar, 3, 4, l))) {
                aVar.D0 = null;
                oof oof = aVar.y0;
                if (oof == null) {
                    return true;
                }
                ((ge6) oof.a).onConnected();
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }
}
