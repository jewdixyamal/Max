package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rk9  reason: default package */
public final class rk9 implements Parcelable {
    public static final Parcelable.Creator<rk9> CREATOR = new uk7(29);
    public final int a;
    public final boolean b;
    public final boolean c;

    public rk9(qk9 qk9) {
        this.a = qk9.a;
        this.b = qk9.b;
        this.c = qk9.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
    }

    public rk9(Parcel parcel) {
        this.a = parcel.readInt();
        boolean z = false;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0 ? true : z;
    }
}
