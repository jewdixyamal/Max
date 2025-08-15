package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ih2  reason: default package */
public enum ih2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator<ih2> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [ih2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [ih2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [ih2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [ih2, java.lang.Enum] */
    static {
        ih2[] ih2Arr;
        o = new v25(ih2Arr);
        CREATOR = new d6(24);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
