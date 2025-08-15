package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.tamtam.nano.ProtoException;

/* renamed from: tp3  reason: default package */
public final class tp3 implements Parcelable {
    public static final Parcelable.Creator<tp3> CREATOR = new f73(3);
    public final uj3 a;

    public tp3(uj3 uj3) {
        this.a = uj3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 0;
        uj3 uj3 = this.a;
        parcel.writeByte(uj3 == null ? (byte) 1 : 0);
        if (uj3 != null) {
            ql3 ql3 = uj3.a;
            parcel.writeLong(ql3.b);
            byte[] d = ql3.c.d();
            if (d != null) {
                b = 1;
            }
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(d.length);
                parcel.writeByteArray(d);
            }
            parcel.writeParcelable(new x7b(ql3.o), i);
            parcel.writeByte(uj3.Y ? (byte) 1 : 0);
        }
    }

    public tp3(Parcel parcel) {
        try {
            byte[] bArr = null;
            if (!f8.w(parcel)) {
                long readLong = parcel.readLong();
                boolean z = true;
                if (parcel.readByte() == 1) {
                    bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                }
                pl3 b = pl3.b(bArr);
                x7b x7b = (x7b) parcel.readParcelable(x7b.class.getClassLoader());
                if (parcel.readByte() != 1) {
                    z = false;
                }
                ql3 ql3 = new ql3(readLong, b, x7b.a);
                jke.a().getClass();
                this.a = new uj3(ql3, z, ((jyc) jke.b()).o());
                return;
            }
            this.a = null;
        } catch (ProtoException e) {
            throw new IllegalStateException(e);
        }
    }
}
