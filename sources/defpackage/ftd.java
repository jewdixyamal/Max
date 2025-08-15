package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ftd  reason: default package */
public final class ftd implements Parcelable {
    public static final Parcelable.Creator<ftd> CREATOR = new e9b(29);
    public final long a;
    public final long b;
    public final int c;

    public ftd(long j, long j2, int i) {
        np8.d(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ftd.class != obj.getClass()) {
            return false;
        }
        ftd ftd = (ftd) obj;
        return this.a == ftd.a && this.b == ftd.b && this.c == ftd.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = maf.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
