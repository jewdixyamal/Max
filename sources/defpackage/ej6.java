package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

/* renamed from: ej6  reason: default package */
public final class ej6 extends RelativeSizeSpan implements yz7, Parcelable {
    public static final Parcelable.Creator<ej6> CREATOR = new dj6(0);
    public final float a;
    public final int b;

    public /* synthetic */ ej6() {
        this(1.3f);
    }

    public final uw3 copy() {
        return new ej6(this.a);
    }

    public final int getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }

    public ej6(float f) {
        super(f);
        this.a = f;
        this.b = 8;
    }
}
