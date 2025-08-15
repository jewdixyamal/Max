package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/* renamed from: tx0  reason: default package */
public final class tx0 implements Parcelable {
    public static final Parcelable.Creator<tx0> CREATOR = new d6(14);
    public final int X;
    public final int Y;
    public final int Z;
    public final kc9 a;
    public final kc9 b;
    public final v34 c;
    public final kc9 o;

    public tx0(kc9 kc9, kc9 kc92, v34 v34, kc9 kc93, int i) {
        Objects.requireNonNull(kc9, "start cannot be null");
        Objects.requireNonNull(kc92, "end cannot be null");
        Objects.requireNonNull(v34, "validator cannot be null");
        this.a = kc9;
        this.b = kc92;
        this.o = kc93;
        this.X = i;
        this.c = v34;
        if (kc93 != null && kc9.a.compareTo(kc93.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (kc93 != null && kc93.a.compareTo(kc92.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > jaf.d((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.Z = kc9.d(kc92) + 1;
            this.Y = (kc92.c - kc9.c) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx0)) {
            return false;
        }
        tx0 tx0 = (tx0) obj;
        return this.a.equals(tx0.a) && this.b.equals(tx0.b) && Objects.equals(this.o, tx0.o) && this.X == tx0.X && this.c.equals(tx0.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.o, Integer.valueOf(this.X), this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.X);
    }
}
