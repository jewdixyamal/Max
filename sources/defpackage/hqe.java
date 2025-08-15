package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: hqe  reason: default package */
public final class hqe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return tpa.f(charSequence, "") ? jqe.a : new iqe(charSequence);
    }

    public final Object[] newArray(int i) {
        return new iqe[i];
    }
}
