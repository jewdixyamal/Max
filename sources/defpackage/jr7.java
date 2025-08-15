package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jr7  reason: default package */
public final class jr7 implements Parcelable {
    public static final Parcelable.Creator<jr7> CREATOR = new uk7(4);
    public final ir7 a;

    public jr7(ir7 ir7) {
        this.a = ir7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ir7 ir7 = this.a;
        parcel.writeByte(ir7 == null ? (byte) 1 : 0);
        if (ir7 != null) {
            parcel.writeByte(ir7.a ? (byte) 1 : 0);
            parcel.writeByte(ir7.b ? (byte) 1 : 0);
            parcel.writeInt(au1.s(ir7.c));
            parcel.writeInt(au1.s(ir7.d));
            parcel.writeInt(ir7.e.ordinal());
            parcel.writeLong(ir7.h);
            parcel.writeByte(ir7.i ? (byte) 1 : 0);
            parcel.writeByte(ir7.f ? (byte) 1 : 0);
            parcel.writeByte(ir7.g ? (byte) 1 : 0);
            parcel.writeByte(ir7.j ? (byte) 1 : 0);
            parcel.writeByte(ir7.k ? (byte) 1 : 0);
            parcel.writeByte(ir7.l ? (byte) 1 : 0);
            parcel.writeByte(ir7.m ? (byte) 1 : 0);
            parcel.writeByte(ir7.n ? (byte) 1 : 0);
            parcel.writeLong(ir7.o);
            parcel.writeLong(ir7.p);
            parcel.writeLong(ir7.q);
            parcel.writeByte(ir7.r ? (byte) 1 : 0);
        }
    }

    public jr7(Parcel parcel) {
        if (!f8.w(parcel)) {
            gr7 gr7 = new gr7();
            boolean z = false;
            gr7.a = parcel.readByte() == 1;
            gr7.b = parcel.readByte() == 1;
            gr7.c = au1.v(3)[parcel.readInt()];
            gr7.d = au1.v(3)[parcel.readInt()];
            gr7.e = hr7.values()[parcel.readInt()];
            gr7.f = parcel.readByte() == 1;
            gr7.g = parcel.readByte() == 1;
            gr7.h = parcel.readLong();
            gr7.i = parcel.readByte() == 1;
            gr7.j = parcel.readByte() == 1;
            gr7.k = parcel.readByte() == 1;
            gr7.l = parcel.readByte() == 1;
            gr7.m = parcel.readByte() == 1;
            gr7.n = parcel.readByte() == 1;
            gr7.o = parcel.readLong();
            gr7.p = parcel.readLong();
            gr7.q = parcel.readLong();
            gr7.r = parcel.readByte() == 1 ? true : z;
            this.a = new ir7(gr7);
            return;
        }
        this.a = null;
    }
}
