package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eaa  reason: default package */
public final class eaa implements Parcelable {
    public static final Parcelable.Creator<eaa> CREATOR = new fn9(3);
    public final String a;
    public final int b;
    public final int c;
    public final Integer o;

    public eaa(int i, int i2, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.o = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa)) {
            return false;
        }
        eaa eaa = (eaa) obj;
        return tpa.f(this.a, eaa.a) && this.b == eaa.b && this.c == eaa.c && tpa.f(this.o, eaa.o);
    }

    public final int hashCode() {
        int e = k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.o;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OneMeCountryModel(countryNameCode=" + this.a + ", countryPhoneCode=" + this.b + ", countryName=" + this.c + ", flagDrawable=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
