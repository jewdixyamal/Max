package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: l9e  reason: default package */
public final class l9e extends CharacterStyle implements yz7, UpdateAppearance {
    public final /* synthetic */ int a;
    public final int b;

    public l9e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 4;
                return;
            default:
                this.b = 7;
                return;
        }
    }

    public final uw3 copy() {
        switch (this.a) {
            case 0:
                return new l9e(0);
            default:
                return new l9e(1);
        }
    }

    public final int getType() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setStrikeThruText(true);
                return;
            default:
                textPaint.setUnderlineText(true);
                return;
        }
    }
}
