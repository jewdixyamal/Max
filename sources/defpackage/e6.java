package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e6  reason: default package */
public final class e6 implements Parcelable {
    public static final Parcelable.Creator<e6> CREATOR = new d6(0);
    public final String a;
    public final List b;
    public final String c;

    public e6(List list, String str) {
        this.b = list;
        this.c = str;
        this.a = (String) nd7.r(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        byte b2 = list != null ? (byte) 1 : 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeInt(list.size());
            parcel.writeStringList(list);
        }
        f8.H(parcel, this.c);
    }

    public e6(Parcel parcel) {
        List list;
        if (parcel.readByte() != 1 ? false : true) {
            list = new ArrayList(parcel.readInt());
            parcel.readStringList(list);
        } else {
            list = null;
        }
        list = list == null ? Collections.emptyList() : list;
        this.b = list;
        this.c = f8.x(parcel);
        this.a = (String) nd7.r(list);
    }
}
