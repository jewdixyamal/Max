package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: dg3  reason: default package */
public final /* synthetic */ class dg3 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ dg3(int i) {
        this.a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                return eg3.b.a(charSequence) ? charSequence : "";
            default:
                bc7[] bc7Arr = sv8.Q0;
                return "";
        }
    }
}
