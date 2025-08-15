package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m33  reason: default package */
public final class m33 extends n3 {
    public static final Parcelable.Creator<m33> CREATOR = new vqf(3);
    public final int a;
    public final String b;

    public m33(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m33)) {
            return false;
        }
        m33 m33 = (m33) obj;
        return m33.a == this.a && s36.l(m33.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 2, this.b);
        ay7.W(parcel, T);
    }
}
