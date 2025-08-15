package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: c6b  reason: default package */
public final class c6b extends View.BaseSavedState {
    public static final b6b CREATOR = new Object();
    public final int a;
    public final boolean b;

    public c6b(Parcelable parcelable, int i, boolean z) {
        super(parcelable);
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
    }

    public c6b(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() > 0;
    }
}
