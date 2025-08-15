package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: afc  reason: default package */
public final class afc implements Parcelable {
    public static final Parcelable.Creator<afc> CREATOR = new e9b(11);
    public final Long X;
    public final String a;
    public final String b;
    public final String c;
    public final String o;

    public afc(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = str4;
        this.X = l;
    }

    public static afc a(afc afc, Long l) {
        String str = afc.a;
        String str2 = afc.b;
        String str3 = afc.c;
        String str4 = afc.o;
        afc.getClass();
        return new afc(str, str2, str3, str4, l);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afc)) {
            return false;
        }
        afc afc = (afc) obj;
        return tpa.f(this.a, afc.a) && tpa.f(this.b, afc.b) && tpa.f(this.c, afc.c) && tpa.f(this.o, afc.o) && tpa.f(this.X, afc.X);
    }

    public final int hashCode() {
        int d = rh4.d(rh4.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o);
        Long l = this.X;
        return d + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "RegistrationData(token=" + this.a + ", phone=" + this.b + ", name=" + this.c + ", surname=" + this.o + ", photoId=" + this.X + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        Long l = this.X;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
