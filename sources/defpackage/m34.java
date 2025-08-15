package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* renamed from: m34  reason: default package */
public final class m34 implements Parcelable {
    public static final Parcelable.Creator<m34> CREATOR = new f73(6);
    public final x34 a;
    public final qte b;
    public final qte c;

    public m34(x34 x34, qte qte, qte qte2) {
        this.a = x34;
        this.b = qte;
        this.c = qte2;
    }

    public static m34 a(m34 m34, x34 x34, qte qte, qte qte2, int i) {
        if ((i & 1) != 0) {
            x34 = m34.a;
        }
        if ((i & 2) != 0) {
            qte = m34.b;
        }
        if ((i & 4) != 0) {
            qte2 = m34.c;
        }
        return new m34(x34, qte, qte2);
    }

    public final long b() {
        Calendar instance = Calendar.getInstance();
        x34 x34 = this.a;
        instance.set(1, x34.o);
        instance.set(2, x34.c);
        instance.set(5, x34.b);
        instance.set(11, this.b.a);
        instance.set(12, this.c.a);
        instance.set(13, 0);
        instance.set(14, 0);
        hm9.m("DateTime", instance.getTime().toString(), new Object[0]);
        return instance.getTimeInMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m34)) {
            return false;
        }
        m34 m34 = (m34) obj;
        return tpa.f(this.a, m34.a) && tpa.f(this.b, m34.b) && tpa.f(this.c, m34.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
