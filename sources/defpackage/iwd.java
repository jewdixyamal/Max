package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iwd  reason: default package */
public final class iwd extends uvd {
    public static final Parcelable.Creator<iwd> CREATOR = new etd(8);
    public final List a;

    public iwd(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new gwd(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            gwd gwd = (gwd) list.get(i2);
            parcel.writeLong(gwd.a);
            parcel.writeByte(gwd.b ? (byte) 1 : 0);
            parcel.writeByte(gwd.c ? (byte) 1 : 0);
            parcel.writeByte(gwd.d ? (byte) 1 : 0);
            List list2 = gwd.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ewd ewd = (ewd) list2.get(i3);
                parcel.writeInt(ewd.a);
                parcel.writeLong(ewd.b);
            }
            parcel.writeLong(gwd.e);
            parcel.writeByte(gwd.g ? (byte) 1 : 0);
            parcel.writeLong(gwd.h);
            parcel.writeInt(gwd.i);
            parcel.writeInt(gwd.j);
            parcel.writeInt(gwd.k);
        }
    }

    public iwd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
