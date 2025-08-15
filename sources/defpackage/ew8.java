package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ew8  reason: default package */
public final class ew8 implements Parcelable {
    public static final Parcelable.Creator<ew8> CREATOR = new uk7(18);
    public final bw8 a;

    public ew8(bw8 bw8) {
        this.a = bw8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bw8 bw8 = this.a;
        parcel.writeByte(bw8 == null ? (byte) 1 : 0);
        if (bw8 != null) {
            parcel.writeParcelable(new xw8(bw8.c), i);
            parcel.writeInt(bw8.a);
            parcel.writeLong(bw8.b);
            parcel.writeString(bw8.d);
            parcel.writeString(bw8.e);
            parcel.writeLong(bw8.f);
            parcel.writeLong(bw8.g);
        }
    }

    public ew8(Parcel parcel) {
        if (!f8.w(parcel)) {
            this.a = new bw8(parcel.readInt(), parcel.readLong(), ((xw8) parcel.readParcelable(xw8.class.getClassLoader())).a, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            return;
        }
        this.a = null;
    }
}
