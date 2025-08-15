package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p68  reason: default package */
public final class p68 implements Parcelable {
    public static final Parcelable.Creator<p68> CREATOR = new uk7(9);
    public final int a;
    public final ja8 b;

    public p68(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = ja8.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
