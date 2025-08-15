package defpackage;

import android.os.Parcel;

/* renamed from: eqe  reason: default package */
public final class eqe extends jqe {
    public static final dqe CREATOR = new Object();
    public final int b;

    public eqe(int i) {
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqe) && this.b == ((eqe) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Resource(resId="), this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
