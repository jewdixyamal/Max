package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mze  reason: default package */
public final class mze implements Parcelable {
    public static final Parcelable.Creator<mze> CREATOR = new etd(20);
    public static final mze c = new mze(lze.u0, Collections.emptyList());
    public final lze a;
    public final List b;

    public mze(lze lze, List list) {
        this.a = lze;
        this.b = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mze.class != obj.getClass()) {
            return false;
        }
        mze mze = (mze) obj;
        if (!this.a.equals(mze.a)) {
            return false;
        }
        return this.b.equals(mze.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackContainer{videoTrack=" + this.a + ", audioTracks=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public mze(Parcel parcel) {
        this.a = (lze) parcel.readParcelable(lze.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readTypedList(arrayList, lze.CREATOR);
    }
}
