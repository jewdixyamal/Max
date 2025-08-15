package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: kcf  reason: default package */
public final class kcf extends jcf {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARNING: type inference failed for: r5v0, types: [qpd, us] */
    /* JADX WARNING: type inference failed for: r6v0, types: [qpd, us] */
    /* JADX WARNING: type inference failed for: r7v0, types: [qpd, us] */
    public kcf(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new qpd(), new qpd(), new qpd());
    }

    public final kcf a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new kcf(parcel, dataPosition, i2, zr6.l(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    public final boolean e(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    public final void i(int i2) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public kcf(Parcel parcel, int i2, int i3, String str, us usVar, us usVar2, us usVar3) {
        super(usVar, usVar2, usVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }
}
