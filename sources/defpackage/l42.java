package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: l42  reason: default package */
public final class l42 extends ct6 {
    public static final Parcelable.Creator<l42> CREATOR = new d6(19);
    public final long X;
    public final long Y;
    public final ct6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public l42(String str, int i, int i2, long j, long j2, ct6[] ct6Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = ct6Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l42.class != obj.getClass()) {
            return false;
        }
        l42 l42 = (l42) obj;
        return this.c == l42.c && this.o == l42.o && this.X == l42.X && this.Y == l42.Y && maf.a(this.b, l42.b) && Arrays.equals(this.Z, l42.Z);
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.o) * 31) + ((int) this.X)) * 31) + ((int) this.Y)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        ct6[] ct6Arr = this.Z;
        parcel.writeInt(ct6Arr.length);
        for (ct6 writeParcelable : ct6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public l42(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int readInt = parcel.readInt();
        this.Z = new ct6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Z[i2] = (ct6) parcel.readParcelable(ct6.class.getClassLoader());
        }
    }
}
