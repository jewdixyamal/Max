package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dfd  reason: default package */
public final class dfd extends hfd {
    public static final Parcelable.Creator<dfd> CREATOR = new e9b(22);
    public final jqe a;
    public final Integer b;

    public dfd(jqe jqe, Integer num) {
        this.a = jqe;
        this.b = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfd)) {
            return false;
        }
        dfd dfd = (dfd) obj;
        return tpa.f(this.a, dfd.a) && tpa.f(this.b, dfd.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Property(text=" + this.a + ", icon=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
