package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nia  reason: default package */
public final class nia implements oia {
    public static final Parcelable.Creator<nia> CREATOR = new fn9(14);
    public static final nia a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nia);
    }

    public final int hashCode() {
        return -2008676385;
    }

    public final String toString() {
        return "Timer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
