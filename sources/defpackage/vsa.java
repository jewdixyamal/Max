package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vsa  reason: default package */
public final class vsa implements Parcelable {
    public static final Parcelable.Creator<vsa> CREATOR = new fn9(21);
    public final String a;
    public final String[] b;
    public final int c;

    public vsa(String str, String[] strArr, int i) {
        this.a = str;
        this.b = strArr;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeInt(this.c);
    }
}
