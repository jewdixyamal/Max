package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: m42  reason: default package */
public final class m42 extends dt6 {
    public static final Parcelable.Creator<m42> CREATOR = new d6(20);
    public final long X;
    public final long Y;
    public final dt6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public m42(String str, int i, int i2, long j, long j2, dt6[] dt6Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = dt6Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m42.class != obj.getClass()) {
            return false;
        }
        m42 m42 = (m42) obj;
        return this.c == m42.c && this.o == m42.o && this.X == m42.X && this.Y == m42.Y && oaf.a(this.b, m42.b) && Arrays.equals(this.Z, m42.Z);
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
        dt6[] dt6Arr = this.Z;
        parcel.writeInt(dt6Arr.length);
        for (dt6 writeParcelable : dt6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public m42(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int readInt = parcel.readInt();
        this.Z = new dt6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Z[i2] = (dt6) parcel.readParcelable(dt6.class.getClassLoader());
        }
    }
}
