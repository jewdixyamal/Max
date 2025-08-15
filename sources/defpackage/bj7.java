package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bj7  reason: default package */
public final class bj7 implements ej7 {
    public static final Parcelable.Creator<bj7> CREATOR = new dj6(28);
    public final long a;

    public bj7(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
