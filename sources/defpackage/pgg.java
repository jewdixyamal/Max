package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pgg  reason: default package */
public final class pgg implements thg, IInterface {
    public final IBinder c;

    public pgg(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void o(String str, Bundle bundle, akg akg) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = dgg.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(akg);
        try {
            this.c.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
