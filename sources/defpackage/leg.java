package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: leg  reason: default package */
public final class leg extends n3 implements rjc {
    public static final Parcelable.Creator<leg> CREATOR = new vqf(8);
    public final List a;
    public final String b;

    public leg(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final Status a() {
        return this.b != null ? Status.X : Status.t0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        List list = this.a;
        if (list != null) {
            int T2 = ay7.T(parcel, 1);
            parcel.writeStringList(list);
            ay7.W(parcel, T2);
        }
        ay7.Q(parcel, 2, this.b);
        ay7.W(parcel, T);
    }
}
