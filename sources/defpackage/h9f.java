package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h9f  reason: default package */
public final class h9f extends ct6 {
    public static final Parcelable.Creator<h9f> CREATOR = new etd(22);
    public final String b;
    public final String c;

    public h9f(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h9f.class != obj.getClass()) {
            return false;
        }
        h9f h9f = (h9f) obj;
        return this.a.equals(h9f.a) && maf.a(this.b, h9f.b) && maf.a(this.c, h9f.c);
    }

    public final int hashCode() {
        int d = rh4.d(527, 31, this.a);
        int i = 0;
        String str = this.b;
        int hashCode = (d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(6, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(e, str2));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h9f(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.maf.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9f.<init>(android.os.Parcel):void");
    }
}
