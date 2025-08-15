package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zhg  reason: default package */
public abstract class zhg {
    public static final /* synthetic */ int a = 0;

    static {
        zhg.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
