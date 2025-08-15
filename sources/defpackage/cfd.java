package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cfd  reason: default package */
public final class cfd extends hfd {
    public static final Parcelable.Creator<cfd> CREATOR = new e9b(21);
    public static final cfd a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cfd);
    }

    public final int hashCode() {
        return 1237842843;
    }

    public final String toString() {
        return "Arrow";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
