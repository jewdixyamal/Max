package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m64  reason: default package */
public final class m64 implements Parcelable {
    public static final Parcelable.Creator<m64> CREATOR = new f73(9);
    public final Uri a;

    public /* synthetic */ m64(Uri uri) {
        this.a = uri;
    }

    public static final String a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return w9e.K0(path, "/");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m64)) {
            return false;
        }
        return tpa.f(this.a, ((m64) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
