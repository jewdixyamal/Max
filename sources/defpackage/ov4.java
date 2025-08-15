package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ov4  reason: default package */
public final class ov4 implements Parcelable {
    public static final Parcelable.Creator<ov4> CREATOR = new f73(16);
    public final List a;
    public final List b;
    public final Rect c;
    public final boolean o;

    public ov4(ArrayList arrayList, ArrayList arrayList2, Rect rect, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = rect;
        this.o = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ov4.class != obj.getClass()) {
            return false;
        }
        ov4 ov4 = (ov4) obj;
        List list = ov4.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = ov4.b;
        List list4 = this.b;
        if (list4 == null ? list3 != null : !list4.equals(list3)) {
            return false;
        }
        if (this.o != ov4.o) {
            return false;
        }
        Rect rect = ov4.c;
        Rect rect2 = this.c;
        return rect2 != null ? rect2.equals(rect) : rect == null;
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Rect rect = this.c;
        if (rect != null) {
            i = rect.hashCode();
        }
        return Boolean.valueOf(this.o).hashCode() + ((hashCode2 + i) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public ov4(Parcel parcel) {
        this.a = parcel.createTypedArrayList(ee7.CREATOR);
        this.b = parcel.createTypedArrayList(e73.CREATOR);
        this.c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.o = parcel.readInt() != 1 ? false : true;
    }
}
