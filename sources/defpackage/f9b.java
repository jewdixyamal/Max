package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: f9b  reason: default package */
public final class f9b extends ct6 {
    public static final Parcelable.Creator<f9b> CREATOR = new e9b(0);
    public final String b;
    public final byte[] c;

    public f9b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f9b.class != obj.getClass()) {
            return false;
        }
        f9b f9b = (f9b) obj;
        return maf.a(this.b, f9b.b) && Arrays.equals(this.c, f9b.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(8, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(e, str2));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public f9b(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = maf.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
