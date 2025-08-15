package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rdb  reason: default package */
public enum rdb implements Parcelable {
    SETUP_NEW_ADMIN("setup_new_admin"),
    CHANGE_ADMIN("change_admin");
    
    public static final Parcelable.Creator<rdb> CREATOR = null;
    public static final sp3 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [sp3, java.lang.Object] */
    static {
        rdb[] rdbArr;
        Y = new v25(rdbArr);
        b = new Object();
        CREATOR = new e9b(5);
    }

    /* access modifiers changed from: public */
    rdb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
