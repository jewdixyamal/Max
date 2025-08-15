package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: jea  reason: default package */
public final /* synthetic */ class jea implements InputFilter {
    public final /* synthetic */ lea a;

    public /* synthetic */ jea(lea lea) {
        this.a = lea;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return this.a.o.a(charSequence) ? charSequence : "";
    }
}
