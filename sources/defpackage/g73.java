package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g73  reason: default package */
public final class g73 extends ct6 {
    public static final Parcelable.Creator<g73> CREATOR = new d6(29);
    public final String b;
    public final String c;
    public final String o;

    public g73(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g73.class != obj.getClass()) {
            return false;
        }
        g73 g73 = (g73) obj;
        return maf.a(this.c, g73.c) && maf.a(this.b, g73.b) && maf.a(this.o, g73.o);
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
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(25, str);
        String str2 = this.b;
        int e2 = rh4.e(e, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(e2, str3));
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public g73(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
