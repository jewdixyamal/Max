package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: vs6  reason: default package */
public final class vs6 implements c99 {
    public static final Parcelable.Creator<vs6> CREATOR = new dj6(7);
    public final byte[] a;
    public final String b;
    public final String c;

    public vs6(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vs6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((vs6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void p(dd8 dd8) {
        String str = this.b;
        if (str != null) {
            dd8.a = str;
        }
    }

    public final String toString() {
        int length = this.a.length;
        return "ICY: title=\"" + this.b + "\", url=\"" + this.c + "\", rawMetadata.length=\"" + length + "\"";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public vs6(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.a = createByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
