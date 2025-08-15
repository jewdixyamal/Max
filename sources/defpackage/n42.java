package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: n42  reason: default package */
public final class n42 extends ct6 {
    public static final Parcelable.Creator<n42> CREATOR = new d6(21);
    public final String[] X;
    public final ct6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public n42(String str, boolean z, boolean z2, String[] strArr, ct6[] ct6Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = ct6Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n42.class != obj.getClass()) {
            return false;
        }
        n42 n42 = (n42) obj;
        return this.c == n42.c && this.o == n42.o && maf.a(this.b, n42.b) && Arrays.equals(this.X, n42.X) && Arrays.equals(this.Y, n42.Y);
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
        ct6[] ct6Arr = this.Y;
        parcel.writeInt(ct6Arr.length);
        for (ct6 writeParcelable : ct6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public n42(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.Y = new ct6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Y[i2] = (ct6) parcel.readParcelable(ct6.class.getClassLoader());
        }
    }
}
