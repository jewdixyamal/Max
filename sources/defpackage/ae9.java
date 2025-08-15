package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ae9  reason: default package */
public final class ae9 implements d99 {
    public static final Parcelable.Creator<ae9> CREATOR = new uk7(27);
    public final float a;
    public final float b;

    public ae9(float f, float f2) {
        fm9.e("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ae9.class != obj.getClass()) {
            return false;
        }
        ae9 ae9 = (ae9) obj;
        return this.a == ae9.a && this.b == ae9.b;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public ae9(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }
}
