package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: t43  reason: default package */
public final class t43 extends CharacterStyle implements UpdateAppearance, Parcelable, yz7 {
    public static final Parcelable.Creator<t43> CREATOR = new d6(27);
    public final int a;
    public final int b;

    public /* synthetic */ t43() {
        this(-65536);
    }

    public final uw3 copy() {
        return new t43();
    }

    public final int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public t43(int i) {
        this.a = i;
        this.b = 9;
    }

    public t43(Parcel parcel) {
        this(parcel.readInt());
    }
}
