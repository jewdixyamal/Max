package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: uba  reason: default package */
public final class uba {
    public final Context a;
    public final ida b;

    public uba(Context context, ida ida) {
        this.a = context;
        this.b = ida;
    }

    public final CharSequence a(String str, List list, boolean z, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            CharSequence charSequence = "";
            ida ida = this.b;
            if (i < length) {
                String str2 = strArr[i];
                if (str2 == null || str2.length() == 0 || !ema.x(str2, list)) {
                    i++;
                } else {
                    CharSequence e = ida.j.e(str);
                    if (ema.x(str2.toString(), list)) {
                        String obj = str2.toString();
                        charSequence = ema.u(obj, jyc.a.r().d(obj.toString(), list), qp4.u0.b(this.a).i());
                    }
                    return TextUtils.concat(new CharSequence[]{e, " ", charSequence});
                }
            } else if (!z) {
                return charSequence;
            } else {
                if (!(!(strArr.length == 0))) {
                    return charSequence;
                }
                CharSequence e2 = ida.j.e(str);
                if (strArr.length != 0) {
                    return TextUtils.concat(new CharSequence[]{e2, " ", strArr[0]});
                }
                throw new NoSuchElementException("Array is empty.");
            }
        }
    }
}
