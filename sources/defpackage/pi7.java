package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pi7  reason: default package */
public final class pi7 implements ej7, cj7 {
    public static final Parcelable.Creator<pi7> CREATOR = new dj6(16);
    public final Uri a;
    public final String b;

    public pi7(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new m64(this.a), i);
        parcel.writeString(this.b);
    }
}
