package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qeb  reason: default package */
public enum qeb implements Parcelable {
    CREATE("create");
    
    public static final Parcelable.Creator<qeb> CREATOR = null;
    public static final o84 b = null;
    public final String a;

    static {
        qeb[] qebArr;
        X = new v25(qebArr);
        b = new o84(15);
        CREATOR = new e9b(6);
    }

    /* access modifiers changed from: public */
    qeb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
