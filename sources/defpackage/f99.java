package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: f99  reason: default package */
public final class f99 implements Parcelable {
    public static final Parcelable.Creator<f99> CREATOR = new uk7(21);
    public final d99[] a;
    public final long b;

    public f99(d99... d99Arr) {
        this(-9223372036854775807L, d99Arr);
    }

    public final f99 a(d99... d99Arr) {
        if (d99Arr.length == 0) {
            return this;
        }
        int i = oaf.a;
        d99[] d99Arr2 = this.a;
        Object[] copyOf = Arrays.copyOf(d99Arr2, d99Arr2.length + d99Arr.length);
        System.arraycopy(d99Arr, 0, copyOf, d99Arr2.length, d99Arr.length);
        return new f99(this.b, (d99[]) copyOf);
    }

    public final f99 b(f99 f99) {
        return f99 == null ? this : a(f99.a);
    }

    public final d99 c(int i) {
        return this.a[i];
    }

    public final int d() {
        return this.a.length;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f99.class != obj.getClass()) {
            return false;
        }
        f99 f99 = (f99) obj;
        return Arrays.equals(this.a, f99.a) && this.b == f99.b;
    }

    public final int hashCode() {
        return pag.p(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        d99[] d99Arr = this.a;
        parcel.writeInt(d99Arr.length);
        for (d99 writeParcelable : d99Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.b);
    }

    public f99(long j, d99... d99Arr) {
        this.b = j;
        this.a = d99Arr;
    }

    public f99(List list) {
        this((d99[]) list.toArray(new d99[0]));
    }

    public f99(Parcel parcel) {
        this.a = new d99[parcel.readInt()];
        int i = 0;
        while (true) {
            d99[] d99Arr = this.a;
            if (i < d99Arr.length) {
                d99Arr[i] = (d99) parcel.readParcelable(d99.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
