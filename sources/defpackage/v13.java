package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: v13  reason: default package */
public final class v13 {
    public final ojg a;

    public v13(ojg ojg) {
        fp3.n(ojg);
        this.a = ojg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof v13)) {
            return false;
        }
        try {
            ojg ojg = this.a;
            ojg ojg2 = ((v13) obj).a;
            fjg fjg = (fjg) ojg;
            Parcel G0 = fjg.G0();
            agg.c(G0, ojg2);
            Parcel R = fjg.R(G0, 17);
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
            fjg fjg = (fjg) this.a;
            Parcel R = fjg.R(fjg.G0(), 18);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
