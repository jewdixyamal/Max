package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ee7  reason: default package */
public final class ee7 implements Parcelable {
    public static final Parcelable.Creator<ee7> CREATOR = new dj6(12);
    public final List X;
    public final int a;
    public final int b;
    public final int c;
    public final float o;

    public ee7(int i, int i2, float f, ArrayList arrayList) {
        this.a = i;
        this.b = 1;
        this.c = i2;
        this.o = f;
        this.X = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee7.class != obj.getClass()) {
            return false;
        }
        ee7 ee7 = (ee7) obj;
        if (this.a != ee7.a || this.c != ee7.c || Float.compare(ee7.o, this.o) != 0 || this.b != ee7.b) {
            return false;
        }
        List list = ee7.X;
        List list2 = this.X;
        return list2 != null ? list2.equals(list) : list == null;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = 0;
        int i3 = this.b;
        int s = (((i + (i3 != 0 ? au1.s(i3) : 0)) * 31) + this.c) * 31;
        float f = this.o;
        int floatToIntBits = (s + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        List list = this.X;
        if (list != null) {
            i2 = list.hashCode();
        }
        return floatToIntBits + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == 1) {
            parcel.writeString("DRAWING");
            parcel.writeInt(this.a);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.o);
            parcel.writeTypedList(this.X);
            return;
        }
        throw null;
    }

    public ee7(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw new NullPointerException("Name is null");
        } else if (readString.equals("DRAWING")) {
            this.b = 1;
            this.a = parcel.readInt();
            this.c = parcel.readInt();
            this.o = parcel.readFloat();
            this.X = parcel.createTypedArrayList(yq4.CREATOR);
        } else {
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.LayerState.Type.".concat(readString));
        }
    }
}
