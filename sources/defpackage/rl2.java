package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rl2  reason: default package */
public enum rl2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator<rl2> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, rl2] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, rl2] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, rl2] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, rl2] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, rl2] */
    static {
        CREATOR = new d6(26);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
