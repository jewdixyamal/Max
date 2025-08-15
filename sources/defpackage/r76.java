package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r76  reason: default package */
public final class r76 extends n3 {
    public static final Parcelable.Creator<r76> CREATOR = new f73(26);
    public final String a;

    public r76(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r76) && tpa.f(this.a, ((r76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("AsString(string="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
