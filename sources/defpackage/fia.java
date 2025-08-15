package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fia  reason: default package */
public final class fia extends iia {
    public static final Parcelable.Creator<fia> CREATOR = new fn9(7);
    public static final fia b = new iia(Long.MAX_VALUE);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fia);
    }

    public final int hashCode() {
        return 1868500386;
    }

    public final String toString() {
        return "Indeterminate";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
