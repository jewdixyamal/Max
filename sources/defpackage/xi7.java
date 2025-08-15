package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xi7  reason: default package */
public final class xi7 implements ej7, cj7 {
    public static final Parcelable.Creator<xi7> CREATOR = new dj6(24);
    public final long a;
    public final String b;

    public xi7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
