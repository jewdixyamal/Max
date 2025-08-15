package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qqb  reason: default package */
public final class qqb implements Parcelable {
    public static final Parcelable.Creator<qqb> CREATOR = new e9b(9);
    public final nqb a;

    public qqb(nqb nqb) {
        this.a = nqb;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqb) && tpa.f(this.a, ((qqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualityParc(value=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        nqb nqb = this.a;
        parcel.writeString(nqb.a.a);
        parcel.writeInt(nqb.b);
        parcel.writeInt(nqb.c);
        parcel.writeInt(nqb.d);
        parcel.writeLong(nqb.e);
        parcel.writeByte(nqb.f ? (byte) 1 : 0);
    }
}
