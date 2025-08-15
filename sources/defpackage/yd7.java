package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yd7  reason: default package */
public final class yd7 extends n3 {
    public static final Parcelable.Creator<yd7> CREATOR = new vqf(16);
    public final long a;
    public final int b;
    public final boolean c;
    public final ghg o;

    public yd7(long j, int i, boolean z, ghg ghg) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.o = ghg;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yd7)) {
            return false;
        }
        yd7 yd7 = (yd7) obj;
        return this.a == yd7.a && this.b == yd7.b && this.c == yd7.c && s36.l(this.o, yd7.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder l = au1.l("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            l.append("maxAge=");
            nhg.a(j, l);
        }
        int i = this.b;
        if (i != 0) {
            l.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else if (i == 2) {
                str = "GRANULARITY_FINE";
            } else {
                throw new IllegalArgumentException();
            }
            l.append(str);
        }
        if (this.c) {
            l.append(", bypass");
        }
        ghg ghg = this.o;
        if (ghg != null) {
            l.append(", impersonation=");
            l.append(ghg);
        }
        l.append(']');
        return l.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 8);
        parcel.writeLong(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ay7.P(parcel, 5, this.o, i);
        ay7.W(parcel, T);
    }
}
