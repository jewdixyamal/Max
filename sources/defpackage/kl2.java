package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kl2  reason: default package */
public enum kl2 implements Parcelable {
    DEFAULT;
    
    public static final Parcelable.Creator<kl2> CREATOR = null;
    public static final lq9 b = null;
    public final khe a;

    /* JADX WARNING: type inference failed for: r0v2, types: [lq9, java.lang.Object] */
    static {
        b = new Object();
        CREATOR = new d6(25);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
