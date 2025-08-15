package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hdb  reason: default package */
public enum hdb implements Parcelable, qu0 {
    LOCAL_CHAT("local_chat"),
    SERVER_CHAT("server_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<hdb> CREATOR = null;
    public static final dp3 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [dp3, java.lang.Object] */
    static {
        hdb[] hdbArr;
        Z = new v25(hdbArr);
        b = new Object();
        CREATOR = new e9b(4);
    }

    /* access modifiers changed from: public */
    hdb(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return dp3.c(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
