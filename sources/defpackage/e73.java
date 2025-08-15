package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e73  reason: default package */
public final class e73 implements Parcelable {
    public static final Parcelable.Creator<e73> CREATOR = new d6(28);
    public final int a;
    public final int b;

    public e73(int i) {
        this.a = 1;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e73.class != obj.getClass()) {
            return false;
        }
        e73 e73 = (e73) obj;
        if (this.b != e73.b) {
            return false;
        }
        return this.a == e73.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? au1.s(i) : 0) * 31) + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a == 1) {
            parcel.writeString("ADD");
            return;
        }
        throw null;
    }

    public e73(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            throw new NullPointerException("Name is null");
        } else if (readString.equals("ADD")) {
            this.a = 1;
        } else {
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.CommandState.Type.".concat(readString));
        }
    }
}
