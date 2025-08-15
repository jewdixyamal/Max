package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c18  reason: default package */
public final class c18 extends z {
    public static final Parcelable.Creator<c18> CREATOR = new y(6);
    public boolean c;

    public c18(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c18.class.getClassLoader();
        }
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
