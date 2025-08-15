package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hwd  reason: default package */
public final class hwd extends tvd {
    public static final Parcelable.Creator<hwd> CREATOR = new etd(7);
    public final List a;

    public hwd(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new fwd(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            fwd fwd = (fwd) list.get(i2);
            parcel.writeLong(fwd.a);
            parcel.writeByte(fwd.b ? (byte) 1 : 0);
            parcel.writeByte(fwd.c ? (byte) 1 : 0);
            parcel.writeByte(fwd.d ? (byte) 1 : 0);
            List list2 = fwd.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                dwd dwd = (dwd) list2.get(i3);
                parcel.writeInt(dwd.a);
                parcel.writeLong(dwd.b);
            }
            parcel.writeLong(fwd.e);
            parcel.writeByte(fwd.g ? (byte) 1 : 0);
            parcel.writeLong(fwd.h);
            parcel.writeInt(fwd.i);
            parcel.writeInt(fwd.j);
            parcel.writeInt(fwd.k);
        }
    }

    public hwd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
