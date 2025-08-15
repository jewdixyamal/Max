package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: hia  reason: default package */
public final class hia extends iia {
    public static final Parcelable.Creator<hia> CREATOR = new fn9(9);
    public static final hia b = new iia(MultiFileUploader.UPLOAD_NEXT_INTERVAL);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hia);
    }

    public final int hashCode() {
        return -950206676;
    }

    public final String toString() {
        return "Timer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
