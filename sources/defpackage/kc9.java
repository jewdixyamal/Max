package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: kc9  reason: default package */
public final class kc9 implements Comparable, Parcelable {
    public static final Parcelable.Creator<kc9> CREATOR = new uk7(24);
    public final int X;
    public final long Y;
    public String Z;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int o;

    public kc9(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = jaf.b(calendar);
        this.a = b2;
        this.b = b2.get(2);
        this.c = b2.get(1);
        this.o = b2.getMaximum(7);
        this.X = b2.getActualMaximum(5);
        this.Y = b2.getTimeInMillis();
    }

    public static kc9 a(int i, int i2) {
        Calendar d = jaf.d((Calendar) null);
        d.set(1, i);
        d.set(2, i2);
        return new kc9(d);
    }

    public static kc9 b(long j) {
        Calendar d = jaf.d((Calendar) null);
        d.setTimeInMillis(j);
        return new kc9(d);
    }

    public final String c() {
        if (this.Z == null) {
            this.Z = jaf.a("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.Z;
    }

    public final int compareTo(Object obj) {
        return this.a.compareTo(((kc9) obj).a);
    }

    public final int d(kc9 kc9) {
        if (this.a instanceof GregorianCalendar) {
            return (kc9.b - this.b) + ((kc9.c - this.c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc9)) {
            return false;
        }
        kc9 kc9 = (kc9) obj;
        return this.b == kc9.b && this.c == kc9.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
