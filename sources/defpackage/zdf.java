package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zdf  reason: default package */
public final class zdf extends bef {
    public static final Parcelable.Creator<zdf> CREATOR = new etd(24);
    public static final zdf a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
