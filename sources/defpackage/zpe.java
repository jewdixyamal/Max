package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zpe  reason: default package */
public final class zpe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new aqe(parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new aqe[i];
    }
}
