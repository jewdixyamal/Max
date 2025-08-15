package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: un6  reason: default package */
public final class un6 implements Parcelable {
    public static final Parcelable.Creator<un6> CREATOR = new dj6(3);
    public final String X;
    public final String Y;
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public un6(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || un6.class != obj.getClass()) {
            return false;
        }
        un6 un6 = (un6) obj;
        return this.a == un6.a && this.b == un6.b && TextUtils.equals(this.c, un6.c) && TextUtils.equals(this.o, un6.o) && TextUtils.equals(this.X, un6.X) && TextUtils.equals(this.Y, un6.Y);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        int i2 = 0;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.X;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.Y;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }

    public un6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
    }
}
