package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mkf  reason: default package */
public final class mkf extends okf {
    public static final Parcelable.Creator<mkf> CREATOR = new etd(26);
    public static final mkf a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
