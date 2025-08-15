package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i16  reason: default package */
public final class i16 implements Parcelable {
    public static final Parcelable.Creator<i16> CREATOR = new f73(22);
    public String a;
    public int b;

    public i16(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
