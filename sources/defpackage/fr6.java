package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fr6  reason: default package */
public final class fr6 implements hr6, IInterface {
    public final IBinder c;

    public fr6(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final Bundle k(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = nbg.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.c.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
