package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d45  reason: default package */
public final class d45 implements d99 {
    public static final Parcelable.Creator<d45> CREATOR = new f73(18);
    public static final qy5 Z;
    public static final qy5 s0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        ny5 ny5 = new ny5();
        ny5.m = ia9.l("application/id3");
        Z = ny5.a();
        ny5 ny52 = new ny5();
        ny52.m = ia9.l("application/x-scte35");
        s0 = ny52.a();
    }

    public d45(String str, String str2, long j, long j2, byte[] bArr) {
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
        if (obj == null || d45.class != obj.getClass()) {
            return false;
        }
        d45 d45 = (d45) obj;
        return this.c == d45.c && this.o == d45.o && oaf.a(this.a, d45.a) && oaf.a(this.b, d45.b) && Arrays.equals(this.X, d45.X);
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

    public final qy5 k() {
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
        return "EMSG: scheme=" + this.a + ", id=" + this.o + ", durationMs=" + this.c + ", value=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public d45(Parcel parcel) {
        String readString = parcel.readString();
        int i = oaf.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
