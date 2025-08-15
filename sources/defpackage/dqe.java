package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqe  reason: default package */
public final class dqe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new eqe(parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new eqe[i];
    }
}
