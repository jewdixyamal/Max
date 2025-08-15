package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: reb  reason: default package */
public enum reb implements Parcelable {
    LOCAL_CHAT("local_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<reb> CREATOR = null;
    public static final vu4 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [vu4, java.lang.Object] */
    static {
        reb[] rebArr;
        Y = new v25(rebArr);
        b = new Object();
        CREATOR = new e9b(7);
    }

    /* access modifiers changed from: public */
    reb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
