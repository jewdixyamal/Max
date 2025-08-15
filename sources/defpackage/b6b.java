package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b6b  reason: default package */
public final class b6b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new c6b(parcel);
    }

    public final Object[] newArray(int i) {
        return new c6b[i];
    }
}
