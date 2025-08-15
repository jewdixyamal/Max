package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: god  reason: default package */
public final class god extends z {
    public static final Parcelable.Creator<god> CREATOR = new y(9);
    public final int c;

    public god(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
    }

    public god(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
    }

    public god(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.c = sideSheetBehavior.h;
    }
}
