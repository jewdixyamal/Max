package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bqe  reason: default package */
public final class bqe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new cqe(parcel.readArrayList(Object.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new cqe[i];
    }
}
