package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: djg  reason: default package */
public final class djg extends Binder implements IInterface {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;

    public djg(ydg ydg) {
        this.d = ydg;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean z2 = false;
        mp mpVar = null;
        switch (this.c) {
            case 0:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = jgg.a;
                    mqd.G((Status) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel)), (Object) null, (qne) ((ydg) this.d).e);
                    z2 = true;
                }
                return z2;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = igg.a;
                    Status status = (Status) (parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel));
                    lgg lgg = (lgg) (parcel.readInt() == 0 ? null : lgg.CREATOR.createFromParcel(parcel));
                    if (lgg != null) {
                        mpVar = new mp(lgg.a, lgg.b);
                    }
                    mqd.G(status, mpVar, (qne) this.d);
                    z2 = true;
                }
                return z2;
        }
    }

    public djg(qne qne) {
        this.d = qne;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
