package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h73  reason: default package */
public final class h73 extends dt6 {
    public static final Parcelable.Creator<h73> CREATOR = new f73(0);
    public final String b;
    public final String c;
    public final String o;

    public h73(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h73.class != obj.getClass()) {
            return false;
        }
        h73 h73 = (h73) obj;
        return oaf.a(this.c, h73.c) && oaf.a(this.b, h73.b) && oaf.a(this.o, h73.o);
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
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public h73(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
