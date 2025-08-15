package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: bhg  reason: default package */
public final class bhg extends a {
    public final qpd K0 = new qpd(0);
    public final qpd L0 = new qpd(0);
    public final qpd M0 = new qpd(0);

    public bhg(Context context, Looper looper, kad kad, ge6 ge6, he6 he6) {
        super(context, looper, 23, kad, ge6, he6);
    }

    public final int g() {
        return 11717000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof nkg ? (nkg) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    public final pe5[] m() {
        return fm9.i;
    }

    public final String p() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String q() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void s() {
        System.currentTimeMillis();
        synchronized (this.K0) {
            this.K0.clear();
        }
        synchronized (this.L0) {
            this.L0.clear();
        }
        synchronized (this.M0) {
            this.M0.clear();
        }
    }

    public final boolean t() {
        return true;
    }
}
