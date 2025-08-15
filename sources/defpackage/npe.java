package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: npe  reason: default package */
public final class npe extends z {
    public static final Parcelable.Creator<npe> CREATOR = new y(10);
    public CharSequence c;
    public boolean o;

    public npe(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
