package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: tr6  reason: default package */
public final class tr6 implements ur6 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void l(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(ur6.a);
            obtain.writeStringArray(strArr);
            this.c.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
