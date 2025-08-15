package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: fm0  reason: default package */
public final class fm0 extends dt6 {
    public static final Parcelable.Creator<fm0> CREATOR = new d6(13);
    public final byte[] b;

    public fm0(byte[] bArr, String str) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fm0.class != obj.getClass()) {
            return false;
        }
        fm0 fm0 = (fm0) obj;
        return this.a.equals(fm0.a) && Arrays.equals(this.b, fm0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + rh4.d(527, 31, this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fm0(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.oaf.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm0.<init>(android.os.Parcel):void");
    }
}
