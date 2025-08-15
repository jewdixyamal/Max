package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: nfc  reason: default package */
public final class nfc implements hx3 {
    public final float a;

    public nfc(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfc)) {
            return false;
        }
        return this.a == ((nfc) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
