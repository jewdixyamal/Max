package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: b08  reason: default package */
public class b08 {
    public final lfg a;

    public b08(lfg lfg) {
        this.a = lfg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof b08)) {
            return false;
        }
        try {
            lfg lfg = this.a;
            lfg lfg2 = ((b08) obj).a;
            jfg jfg = (jfg) lfg;
            Parcel G0 = jfg.G0();
            agg.c(G0, lfg2);
            Parcel R = jfg.R(G0, 16);
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
            jfg jfg = (jfg) this.a;
            Parcel R = jfg.R(jfg.G0(), 17);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
