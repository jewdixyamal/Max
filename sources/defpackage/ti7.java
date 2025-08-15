package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ti7  reason: default package */
public final class ti7 implements ej7 {
    public static final Parcelable.Creator<ti7> CREATOR = new dj6(20);
    public final String a;

    public ti7(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
