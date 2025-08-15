package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aef  reason: default package */
public final class aef extends bef {
    public static final Parcelable.Creator<aef> CREATOR = new etd(25);
    public final xdf a;

    public aef(xdf xdf) {
        this.a = xdf;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
