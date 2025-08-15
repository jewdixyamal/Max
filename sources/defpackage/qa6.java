package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qa6  reason: default package */
public final class qa6 extends ct6 {
    public static final Parcelable.Creator<qa6> CREATOR = new f73(28);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public qa6(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa6.class != obj.getClass()) {
            return false;
        }
        qa6 qa6 = (qa6) obj;
        return maf.a(this.b, qa6.b) && maf.a(this.c, qa6.c) && maf.a(this.o, qa6.o) && Arrays.equals(this.X, qa6.X);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Arrays.hashCode(this.X) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(36, str);
        String str2 = this.b;
        int e2 = rh4.e(e, str2);
        String str3 = this.c;
        int e3 = rh4.e(e2, str3);
        String str4 = this.o;
        StringBuilder sb = new StringBuilder(rh4.e(e3, str4));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public qa6(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
