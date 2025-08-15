package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: sza  reason: default package */
public final class sza implements d99 {
    public static final Parcelable.Creator<sza> CREATOR = new fn9(25);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] s0;

    public sza(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.s0 = bArr;
    }

    public static sza a(wpa wpa) {
        int g = wpa.g();
        String l = ia9.l(wpa.s(wpa.g(), b52.a));
        String s = wpa.s(wpa.g(), b52.c);
        int g2 = wpa.g();
        int g3 = wpa.g();
        int g4 = wpa.g();
        int g5 = wpa.g();
        int g6 = wpa.g();
        byte[] bArr = new byte[g6];
        wpa.e(0, bArr, g6);
        return new sza(g, l, s, g2, g3, g4, g5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sza.class != obj.getClass()) {
            return false;
        }
        sza sza = (sza) obj;
        return this.a == sza.a && this.b.equals(sza.b) && this.c.equals(sza.c) && this.o == sza.o && this.X == sza.X && this.Y == sza.Y && this.Z == sza.Z && Arrays.equals(this.s0, sza.s0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s0) + ((((((((rh4.d(rh4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public final void w(ed8 ed8) {
        ed8.b(this.a, this.s0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeByteArray(this.s0);
    }

    public sza(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.createByteArray();
    }
}
