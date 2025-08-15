package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bm5  reason: default package */
public final class bm5 implements Parcelable {
    public static final Parcelable.Creator<bm5> CREATOR = new f73(19);
    public final String a;
    public final x06 b;

    public bm5(String str, x06 x06) {
        this.a = str;
        this.b = x06;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public bm5(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (x06) parcel.readParcelable(x06.class.getClassLoader());
    }
}
