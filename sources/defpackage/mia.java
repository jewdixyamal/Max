package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mia  reason: default package */
public final class mia implements oia {
    public static final Parcelable.Creator<mia> CREATOR = new fn9(13);
    public final int a;

    public mia(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mia) && this.a == ((mia) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("NegativeIcon(iconRes="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
