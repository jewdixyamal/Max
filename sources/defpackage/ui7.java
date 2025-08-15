package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ui7  reason: default package */
public final class ui7 implements ej7 {
    public static final Parcelable.Creator<ui7> CREATOR = new dj6(21);
    public final long a;
    public final String b;

    public ui7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
