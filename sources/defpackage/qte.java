package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qte  reason: default package */
public final class qte implements Parcelable {
    public static final Parcelable.Creator<qte> CREATOR = new etd(17);
    public final int a;
    public final String b;

    public qte(int i) {
        this.a = i;
        this.b = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qte) && this.a == ((qte) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
