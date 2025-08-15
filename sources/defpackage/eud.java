package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eud  reason: default package */
public final class eud implements d99 {
    public static final Parcelable.Creator<eud> CREATOR = new etd(2);
    public final float a;
    public final int b;

    public eud(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eud.class != obj.getClass()) {
            return false;
        }
        eud eud = (eud) obj;
        return this.a == eud.a && this.b == eud.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public eud(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
