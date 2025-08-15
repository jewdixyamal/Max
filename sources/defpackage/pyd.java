package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: pyd  reason: default package */
public enum pyd implements Parcelable, qu0 {
    CHAT("chat"),
    CHANNEL("channel");
    
    public static final Parcelable.Creator<pyd> CREATOR = null;
    public static final yxc b = null;
    public final String a;

    static {
        pyd[] pydArr;
        Y = new v25(pydArr);
        b = new yxc(17);
        CREATOR = new etd(11);
    }

    /* access modifiers changed from: public */
    pyd(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        pyd pyd;
        b.getClass();
        Iterator it = Y.iterator();
        do {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                pyd = (pyd) u1Var.next();
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } while (!tpa.f(pyd.a, str));
        return pyd;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
