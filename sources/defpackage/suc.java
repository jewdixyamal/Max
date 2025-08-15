package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: suc  reason: default package */
public final class suc implements Parcelable {
    public static final Parcelable.Creator<suc> CREATOR = new e9b(17);
    public final String a;

    public /* synthetic */ suc(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof suc)) {
            return false;
        }
        return tpa.f(this.a, ((suc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ScopeId(value="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
