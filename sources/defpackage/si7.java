package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: si7  reason: default package */
public final class si7 implements ej7 {
    public static final Parcelable.Creator<si7> CREATOR = new dj6(19);
    public final Uri a;

    public si7(Uri uri) {
        this.a = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si7) && tpa.f(this.a, ((si7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenBrowser(uri=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
