package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yq4  reason: default package */
public final class yq4 implements Parcelable {
    public static final Parcelable.Creator<yq4> CREATOR = new f73(11);
    public final int a;
    public final float[] b;

    public yq4(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq4.class != obj.getClass()) {
            return false;
        }
        yq4 yq4 = (yq4) obj;
        if (this.a != yq4.a) {
            return false;
        }
        return Arrays.equals(this.b, yq4.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? au1.s(i) : 0) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloatArray(this.b);
        int i2 = this.a;
        if (i2 == 1) {
            str = "LINE";
        } else if (i2 == 2) {
            str = "CUBIC_BEZIER";
        } else {
            throw null;
        }
        parcel.writeString(str);
    }

    public yq4(Parcel parcel) {
        int i;
        this.b = parcel.createFloatArray();
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("LINE")) {
                i = 1;
            } else if (readString.equals("CUBIC_BEZIER")) {
                i = 2;
            } else {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.DrawingPrimitive.Type.".concat(readString));
            }
            this.a = i;
            return;
        }
        throw new NullPointerException("Name is null");
    }
}
