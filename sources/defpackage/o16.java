package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o16  reason: default package */
public final class o16 implements Parcelable {
    public static final Parcelable.Creator<o16> CREATOR = new f73(23);
    public String X = null;
    public ArrayList Y = new ArrayList();
    public ArrayList Z = new ArrayList();
    public ArrayList a;
    public ArrayList b;
    public ie0[] c;
    public int o;
    public ArrayList s0;

    public o16(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (ie0[]) parcel.createTypedArray(ie0.CREATOR);
        this.o = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createTypedArrayList(je0.CREATOR);
        this.s0 = parcel.createTypedArrayList(i16.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedList(this.Z);
        parcel.writeTypedList(this.s0);
    }
}
