package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r22  reason: default package */
public final class r22 extends n3 {
    public static final Parcelable.Creator<r22> CREATOR = new d6(16);
    public final up7 a;
    public final Uri b;

    public r22(up7 up7, Uri uri) {
        this.a = up7;
        this.b = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
