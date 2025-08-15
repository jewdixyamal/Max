package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zvd  reason: default package */
public final class zvd extends tvd {
    public static final Parcelable.Creator<zvd> CREATOR = new etd(3);
    public final boolean X;
    public final long Y;
    public final long Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final List s0;
    public final boolean t0;
    public final long u0;
    public final int v0;
    public final int w0;
    public final int x0;

    public zvd(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = z4;
        this.Y = j2;
        this.Z = j3;
        this.s0 = Collections.unmodifiableList(list);
        this.t0 = z5;
        this.u0 = j4;
        this.v0 = i;
        this.w0 = i2;
        this.x0 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeByte(this.X ? (byte) 1 : 0);
        parcel.writeLong(this.Y);
        parcel.writeLong(this.Z);
        List list = this.s0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            xvd xvd = (xvd) list.get(i2);
            parcel.writeInt(xvd.a);
            parcel.writeLong(xvd.b);
            parcel.writeLong(xvd.c);
        }
        parcel.writeByte(this.t0 ? (byte) 1 : 0);
        parcel.writeLong(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
    }

    public zvd(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = true;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.o = parcel.readByte() == 1;
        this.X = parcel.readByte() == 1;
        this.Y = parcel.readLong();
        this.Z = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new xvd(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.s0 = Collections.unmodifiableList(arrayList);
        this.t0 = parcel.readByte() != 1 ? false : z;
        this.u0 = parcel.readLong();
        this.v0 = parcel.readInt();
        this.w0 = parcel.readInt();
        this.x0 = parcel.readInt();
    }
}
