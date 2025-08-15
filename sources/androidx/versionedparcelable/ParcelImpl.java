package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new fn9(19);
    public final lcf a;

    public ParcelImpl(lcf lcf) {
        this.a = lcf;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new kcf(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new kcf(parcel).h();
    }
}
