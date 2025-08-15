package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: g9b  reason: default package */
public final class g9b extends dt6 {
    public static final Parcelable.Creator<g9b> CREATOR = new e9b(1);
    public final String b;
    public final byte[] c;

    public g9b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g9b.class != obj.getClass()) {
            return false;
        }
        g9b g9b = (g9b) obj;
        return oaf.a(this.b, g9b.b) && Arrays.equals(this.c, g9b.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public g9b(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = oaf.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
