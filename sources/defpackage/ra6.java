package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ra6  reason: default package */
public final class ra6 extends dt6 {
    public static final Parcelable.Creator<ra6> CREATOR = new f73(29);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public ra6(String str, byte[] bArr, String str2, String str3) {
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
        if (obj == null || ra6.class != obj.getClass()) {
            return false;
        }
        ra6 ra6 = (ra6) obj;
        return oaf.a(this.b, ra6.b) && oaf.a(this.c, ra6.c) && oaf.a(this.o, ra6.o) && Arrays.equals(this.X, ra6.X);
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
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public ra6(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
