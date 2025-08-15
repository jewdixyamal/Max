package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t22  reason: default package */
public final class t22 extends n3 {
    public static final Parcelable.Creator<t22> CREATOR = new d6(18);
    public final up7 a;
    public final String b;

    public t22(up7 up7, String str) {
        this.a = up7;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
