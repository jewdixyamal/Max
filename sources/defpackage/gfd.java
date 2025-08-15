package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gfd  reason: default package */
public final class gfd extends hfd {
    public static final Parcelable.Creator<gfd> CREATOR = new e9b(25);
    public final jqe a;

    public gfd(jqe jqe) {
        this.a = jqe;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfd) && tpa.f(this.a, ((gfd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Text(text="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
