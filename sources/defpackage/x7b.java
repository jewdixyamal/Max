package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x7b  reason: default package */
public final class x7b implements Parcelable {
    public static final Parcelable.Creator<x7b> CREATOR = new fn9(28);
    public final r7b a;

    public x7b(r7b r7b) {
        this.a = r7b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        r7b r7b = this.a;
        parcel.writeInt(r7b.a);
        parcel.writeInt(r7b.b);
    }

    public x7b(Parcel parcel) {
        this.a = new r7b(parcel.readInt(), parcel.readInt());
    }
}
