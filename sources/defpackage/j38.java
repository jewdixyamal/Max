package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: j38  reason: default package */
public final class j38 implements c99 {
    public static final Parcelable.Creator<j38> CREATOR = new uk7(7);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public j38(byte[] bArr, int i, int i2, String str) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.o = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j38.class != obj.getClass()) {
            return false;
        }
        j38 j38 = (j38) obj;
        return this.a.equals(j38.a) && Arrays.equals(this.b, j38.b) && this.c == j38.c && this.o == j38.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + rh4.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public j38(Parcel parcel) {
        String readString = parcel.readString();
        int i = maf.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
