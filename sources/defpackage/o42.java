package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: o42  reason: default package */
public final class o42 extends dt6 {
    public static final Parcelable.Creator<o42> CREATOR = new d6(22);
    public final String[] X;
    public final dt6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public o42(String str, boolean z, boolean z2, String[] strArr, dt6[] dt6Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = dt6Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o42.class != obj.getClass()) {
            return false;
        }
        o42 o42 = (o42) obj;
        return this.c == o42.c && this.o == o42.o && oaf.a(this.b, o42.b) && Arrays.equals(this.X, o42.X) && Arrays.equals(this.Y, o42.Y);
    }

    public final int hashCode() {
        int i = (((true + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeStringArray(this.X);
        dt6[] dt6Arr = this.Y;
        parcel.writeInt(dt6Arr.length);
        for (dt6 writeParcelable : dt6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public o42(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.Y = new dt6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Y[i2] = (dt6) parcel.readParcelable(dt6.class.getClassLoader());
        }
    }
}
