package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ai8  reason: default package */
public final class ai8 implements Parcelable {
    public static final Parcelable.Creator<ai8> CREATOR = new uk7(14);
    public final Object a = new Object();
    public final Object b;
    public pr6 c;
    public lcf o;

    public ai8(Object obj, pr6 pr6) {
        this.b = obj;
        this.c = pr6;
        this.o = null;
    }

    public final pr6 a() {
        pr6 pr6;
        synchronized (this.a) {
            pr6 = this.c;
        }
        return pr6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai8)) {
            return false;
        }
        ai8 ai8 = (ai8) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return ai8.b == null;
        }
        Object obj3 = ai8.b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
