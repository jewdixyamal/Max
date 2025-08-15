package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ria  reason: default package */
public final class ria implements tia {
    public static final Parcelable.Creator<ria> CREATOR = new fn9(17);
    public static final ria a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ria);
    }

    public final int hashCode() {
        return -1194056294;
    }

    public final String toString() {
        return "Empty";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
