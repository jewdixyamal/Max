package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fqe  reason: default package */
public final class fqe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new gqe(parcel.readInt(), parcel.readArrayList(Object.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new gqe[i];
    }
}
