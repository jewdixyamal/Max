package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.apache.http.cookie.ClientCookie;

/* renamed from: pe5  reason: default package */
public final class pe5 extends n3 {
    public static final Parcelable.Creator<pe5> CREATOR = new ufg(4);
    public final String a;
    public final int b;
    public final long c;

    public pe5(long j, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pe5) {
            pe5 pe5 = (pe5) obj;
            String str = this.a;
            return ((str != null && str.equals(pe5.a)) || (str == null && pe5.a == null)) && b() == pe5.b();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(this.a, "name");
        qz7.h(Long.valueOf(b()), ClientCookie.VERSION_ATTR);
        return qz7.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.Q(parcel, 1, this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b2 = b();
        ay7.X(parcel, 3, 8);
        parcel.writeLong(b2);
        ay7.W(parcel, T);
    }

    public pe5(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
