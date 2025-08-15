package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qia  reason: default package */
public final class qia implements tia {
    public static final Parcelable.Creator<qia> CREATOR = new fn9(16);
    public static final qia a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qia);
    }

    public final int hashCode() {
        return 1634881352;
    }

    public final String toString() {
        return "Chevron";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
