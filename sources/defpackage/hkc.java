package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hkc  reason: default package */
public abstract class hkc implements Parcelable {
    public static final Parcelable.Creator<hkc> CREATOR = new vqf(29);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zeg zeg = (zeg) this;
        parcel.writeParcelable(zeg.a, 0);
        parcel.writeInt(zeg.b ? 1 : 0);
    }
}
