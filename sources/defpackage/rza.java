package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: rza  reason: default package */
public final class rza implements c99 {
    public static final Parcelable.Creator<rza> CREATOR = new fn9(24);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] s0;

    public rza(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.s0 = bArr;
    }

    public static rza a(yaf yaf) {
        int h = yaf.h();
        String t = yaf.t(yaf.h(), b52.a);
        String t2 = yaf.t(yaf.h(), b52.c);
        int h2 = yaf.h();
        int h3 = yaf.h();
        int h4 = yaf.h();
        int h5 = yaf.h();
        int h6 = yaf.h();
        byte[] bArr = new byte[h6];
        yaf.g(0, bArr, h6);
        return new rza(h, t, t2, h2, h3, h4, h5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rza.class != obj.getClass()) {
            return false;
        }
        rza rza = (rza) obj;
        return this.a == rza.a && this.b.equals(rza.b) && this.c.equals(rza.c) && this.o == rza.o && this.X == rza.X && this.Y == rza.Y && this.Z == rza.Z && Arrays.equals(this.s0, rza.s0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s0) + ((((((((rh4.d(rh4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final void p(dd8 dd8) {
        dd8.a(this.a, this.s0);
    }

    public final String toString() {
        String str = this.b;
        int e = rh4.e(32, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(e, str2));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
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

    public rza(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.createByteArray();
    }
}
