package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: h5b  reason: default package */
public final class h5b {
    public final qfg a;

    public h5b(qfg qfg) {
        fp3.n(qfg);
        this.a = qfg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof h5b)) {
            return false;
        }
        try {
            qfg qfg = this.a;
            qfg qfg2 = ((h5b) obj).a;
            ofg ofg = (ofg) qfg;
            Parcel G0 = ofg.G0();
            agg.c(G0, qfg2);
            Parcel R = ofg.R(G0, 15);
            if (R.readInt() != 0) {
                z = true;
            }
            R.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            ofg ofg = (ofg) this.a;
            Parcel R = ofg.R(ofg.G0(), 16);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
