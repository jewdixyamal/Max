package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: e8b  reason: default package */
public final class e8b implements Parcelable {
    public static final Parcelable.Creator<e8b> CREATOR = new fn9(29);
    public final Map a;
    public final List b;
    public final qo9 c;

    public e8b(LinkedHashMap linkedHashMap, ArrayList arrayList, qo9 qo9) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = qo9;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8b)) {
            return false;
        }
        e8b e8b = (e8b) obj;
        return tpa.f(this.a, e8b.a) && tpa.f(this.b, e8b.b) && tpa.f(this.c, e8b.c);
    }

    public final int hashCode() {
        int g = k7d.g(this.b, this.a.hashCode() * 31, 31);
        qo9 qo9 = this.c;
        return g + (qo9 == null ? 0 : qo9.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        List<qo9> list = this.b;
        parcel.writeInt(list.size());
        for (qo9 writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        qo9 qo9 = this.c;
        if (qo9 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        qo9.writeToParcel(parcel, i);
    }
}
