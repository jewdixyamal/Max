package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* renamed from: tgg  reason: default package */
public final class tgg extends idg {
    public a d;
    public final int e;

    public tgg(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.d = aVar;
        this.e = i;
    }

    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            kgg.b(parcel);
            fp3.o(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            aVar.getClass();
            xhg xhg = new xhg(aVar, parcel.readInt(), parcel.readStrongBinder(), (Bundle) kgg.a(parcel, Bundle.CREATOR));
            vfg vfg = aVar.X;
            vfg.sendMessage(vfg.obtainMessage(1, this.e, -1, xhg));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) kgg.a(parcel, Bundle.CREATOR);
            kgg.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            vig vig = (vig) kgg.a(parcel, vig.CREATOR);
            kgg.b(parcel);
            a aVar2 = this.d;
            fp3.o(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fp3.n(vig);
            aVar2.F0 = vig;
            if (aVar2.t()) {
                wh3 wh3 = vig.o;
                wmc h = wmc.h();
                xmc xmc = wh3 == null ? null : wh3.a;
                synchronized (h) {
                    if (xmc == null) {
                        xmc = wmc.c;
                    } else {
                        xmc xmc2 = (xmc) h.a;
                        if (xmc2 != null) {
                            if (xmc2.a < xmc.a) {
                            }
                        }
                    }
                    h.a = xmc;
                }
            }
            Bundle bundle2 = vig.a;
            fp3.o(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            aVar3.getClass();
            xhg xhg2 = new xhg(aVar3, readInt, readStrongBinder, bundle2);
            vfg vfg2 = aVar3.X;
            vfg2.sendMessage(vfg2.obtainMessage(1, this.e, -1, xhg2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
