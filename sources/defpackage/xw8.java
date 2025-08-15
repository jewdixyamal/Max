package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xw8  reason: default package */
public final class xw8 implements Parcelable {
    public static final Parcelable.Creator<xw8> CREATOR = new uk7(19);
    public final es8 a;

    public xw8(es8 es8) {
        this.a = es8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        es8 es8 = this.a;
        parcel.writeByte(es8 == null ? (byte) 1 : 0);
        if (es8 != null) {
            parcel.writeParcelable(new du8(es8.a), i);
            parcel.writeParcelable(new tp3(es8.b), i);
            parcel.writeParcelable(new ew8(es8.c), i);
            parcel.writeParcelable(new xw8(es8.o), i);
        }
    }

    public xw8(Parcel parcel) {
        if (!f8.w(parcel)) {
            cu8 cu8 = ((du8) parcel.readParcelable(du8.class.getClassLoader())).a;
            uj3 uj3 = ((tp3) parcel.readParcelable(tp3.class.getClassLoader())).a;
            bw8 bw8 = ((ew8) parcel.readParcelable(ew8.class.getClassLoader())).a;
            jke.a().getClass();
            jyc jyc = (jyc) jke.b();
            this.a = new es8(cu8, uj3, bw8, ((xw8) parcel.readParcelable(xw8.class.getClassLoader())).a, ((t6b) jyc.getAccessor().c(t6b.class)).c(cu8), (sw8) jyc.getAccessor().c(sw8.class), (zx8) jyc.getAccessor().c(zx8.class), (lr2) jyc.getAccessor().c(lr2.class));
            return;
        }
        this.a = null;
    }
}
