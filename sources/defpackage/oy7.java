package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oy7  reason: default package */
public final class oy7 implements Parcelable {
    public static final Parcelable.Creator<oy7> CREATOR = new uk7(5);
    public final ny7 a;

    public oy7(ny7 ny7) {
        this.a = ny7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ny7 ny7 = this.a;
        parcel.writeByte(ny7 == null ? (byte) 1 : 0);
        if (ny7 != null) {
            parcel.writeDouble(ny7.a);
            parcel.writeDouble(ny7.b);
            parcel.writeByte(ny7.c ? (byte) 1 : 0);
            parcel.writeByte(ny7.d ? (byte) 1 : 0);
            parcel.writeByte(ny7.e ? (byte) 1 : 0);
            parcel.writeInt(ny7.f);
            parcel.writeFloat(ny7.g);
            parcel.writeFloat(ny7.h);
            parcel.writeFloat(ny7.i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ny7] */
    public oy7(Parcel parcel) {
        if (!f8.w(parcel)) {
            ? obj = new Object();
            obj.a = parcel.readDouble();
            obj.b = parcel.readDouble();
            boolean z = false;
            obj.c = parcel.readByte() == 1;
            obj.d = parcel.readByte() == 1;
            obj.e = parcel.readByte() == 1 ? true : z;
            obj.f = parcel.readInt();
            obj.g = parcel.readFloat();
            obj.h = parcel.readFloat();
            obj.i = parcel.readFloat();
            this.a = new ny7(obj);
            return;
        }
        this.a = null;
    }
}
