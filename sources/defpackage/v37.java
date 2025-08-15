package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v37  reason: default package */
public final class v37 extends dt6 {
    public static final Parcelable.Creator<v37> CREATOR = new dj6(11);
    public final String b;
    public final String c;
    public final String o;

    public v37(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v37.class != obj.getClass()) {
            return false;
        }
        v37 v37 = (v37) obj;
        return oaf.a(this.c, v37.c) && oaf.a(this.b, v37.b) && oaf.a(this.o, v37.o);
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
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public v37(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
