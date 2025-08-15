package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: mse  reason: default package */
public final class mse extends CharacterStyle implements UpdateAppearance, kre {
    public final m56 a;
    public int b;

    public mse(fka fka, m56 m56) {
        this.a = m56;
        this.b = ((Number) m56.invoke(fka)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mse) && this.b == ((mse) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + mse.class.hashCode();
    }

    public final void onThemeChanged(fka fka) {
        this.b = ((Number) this.a.invoke(fka)).intValue();
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}
