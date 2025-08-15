package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wn6  reason: default package */
public final class wn6 implements c99 {
    public static final Parcelable.Creator<wn6> CREATOR = new dj6(1);
    public final String a;
    public final String b;
    public final List c;

    public wn6(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wn6.class != obj.getClass()) {
            return false;
        }
        wn6 wn6 = (wn6) obj;
        return TextUtils.equals(this.a, wn6.a) && TextUtils.equals(this.b, wn6.b) && this.c.equals(wn6.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            int e = rh4.e(5, str2);
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(rh4.e(e, str3));
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public wn6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((un6) parcel.readParcelable(un6.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }
}
