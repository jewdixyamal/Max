package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gg1  reason: default package */
public final class gg1 implements Parcelable {
    public static final Parcelable.Creator<gg1> CREATOR = new d6(15);
    public static final gg1 c = new gg1(0, 0);
    public final long a;
    public final int b;

    public gg1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg1)) {
            return false;
        }
        gg1 gg1 = (gg1) obj;
        return this.a == gg1.a && this.b == gg1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
