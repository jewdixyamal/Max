package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: c45  reason: default package */
public final class c45 implements c99 {
    public static final Parcelable.Creator<c45> CREATOR = new f73(17);
    public static final oy5 Z;
    public static final oy5 s0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        my5 my5 = new my5();
        my5.k = "application/id3";
        Z = my5.a();
        my5 my52 = new my5();
        my52.k = "application/x-scte35";
        s0 = my52.a();
    }

    public c45(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.o = j2;
        this.X = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c45.class != obj.getClass()) {
            return false;
        }
        c45 c45 = (c45) obj;
        return this.c == c45.c && this.o == c45.o && maf.a(this.a, c45.a) && maf.a(this.b, c45.b) && Arrays.equals(this.X, c45.X);
    }

    public final int hashCode() {
        if (this.Y == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.o;
            this.Y = Arrays.hashCode(this.X) + ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.Y;
    }

    public final oy5 k() {
        String str = this.a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return s0;
            case 1:
            case 2:
                return Z;
            default:
                return null;
        }
    }

    public final byte[] o() {
        if (k() != null) {
            return this.X;
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(79, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(e, str2));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.o);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public c45(Parcel parcel) {
        String readString = parcel.readString();
        int i = maf.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
