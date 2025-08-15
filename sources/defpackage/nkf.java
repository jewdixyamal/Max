package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nkf  reason: default package */
public final class nkf extends okf {
    public static final Parcelable.Creator<nkf> CREATOR = new etd(27);
    public final mqb a;

    public nkf(mqb mqb) {
        this.a = mqb;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
