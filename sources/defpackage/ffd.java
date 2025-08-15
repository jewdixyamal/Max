package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ffd  reason: default package */
public final class ffd extends hfd {
    public static final Parcelable.Creator<ffd> CREATOR = new e9b(24);
    public boolean a;
    public final boolean b;

    public ffd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffd)) {
            return false;
        }
        ffd ffd = (ffd) obj;
        return this.a == ffd.a && this.b == ffd.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        boolean z = this.a;
        return "Switch(isChecked=" + z + ", isEnabled=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
