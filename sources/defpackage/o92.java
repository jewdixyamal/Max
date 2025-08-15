package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o92  reason: default package */
public enum o92 implements Parcelable, qu0 {
    LOCAL_ID("local");
    
    public static final Parcelable.Creator<o92> CREATOR = null;
    public static final oz7 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, oz7] */
    static {
        o92[] o92Arr;
        X = new v25(o92Arr);
        b = new Object();
        CREATOR = new d6(23);
    }

    /* access modifiers changed from: public */
    o92(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return oz7.j(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
