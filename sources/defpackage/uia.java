package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: uia  reason: default package */
public final class uia implements Parcelable {
    public static final Parcelable.Creator<uia> CREATOR = new fn9(6);
    public static final uia Z = new uia(lia.a, "", (CharSequence) null, ria.a, new eia(0, 0, 0, 7), gia.b);
    public final eia X;
    public final iia Y;
    public final oia a;
    public final CharSequence b;
    public final CharSequence c;
    public final tia o;

    public uia(oia oia, CharSequence charSequence, CharSequence charSequence2, tia tia, eia eia, iia iia) {
        this.a = oia;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = tia;
        this.X = eia;
        this.Y = iia;
    }

    public static uia a(uia uia, oia oia, CharSequence charSequence, CharSequence charSequence2, tia tia, eia eia, iia iia, int i) {
        if ((i & 1) != 0) {
            oia = uia.a;
        }
        oia oia2 = oia;
        if ((i & 2) != 0) {
            charSequence = uia.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = uia.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            tia = uia.o;
        }
        tia tia2 = tia;
        if ((i & 16) != 0) {
            eia = uia.X;
        }
        eia eia2 = eia;
        if ((i & 32) != 0) {
            iia = uia.Y;
        }
        uia.getClass();
        return new uia(oia2, charSequence3, charSequence4, tia2, eia2, iia);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uia)) {
            return false;
        }
        uia uia = (uia) obj;
        return tpa.f(this.a, uia.a) && tpa.f(this.b, uia.b) && tpa.f(this.c, uia.c) && tpa.f(this.o, uia.o) && tpa.f(this.X, uia.X) && tpa.f(this.Y, uia.Y);
    }

    public final int hashCode() {
        int f = rh4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        int hashCode2 = this.o.hashCode();
        return this.Y.hashCode() + ((this.X.hashCode() + ((hashCode2 + ((f + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + this.b + ", caption=" + this.c + ", right=" + this.o + ", params=" + this.X + ", duration=" + this.Y + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.o, i);
        this.X.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, i);
    }

    public /* synthetic */ uia(oia oia, String str, String str2, eia eia) {
        this(oia, str, str2, ria.a, eia, gia.b);
    }
}
