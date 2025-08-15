package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: ape  reason: default package */
public final class ape extends u2 {
    public static final ape c = new u2(12, (Object) null);

    public final boolean N1() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
