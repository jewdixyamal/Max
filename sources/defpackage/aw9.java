package defpackage;

import android.content.Context;

/* renamed from: aw9  reason: default package */
public final class aw9 {
    public final Context a;
    public final xv9 b;

    public aw9(Context context, xv9 xv9) {
        this.a = context;
        this.b = xv9;
    }

    public final String a(String str, String str2, String str3, boolean z) {
        if (z) {
            return rh4.j(str2, ": ", str3);
        }
        if (str == null || str.length() == 0) {
            String string = this.a.getString(c2c.tt_in_chat);
            return str2 + " " + string + ": " + str3;
        }
        return str2 + " | " + str + ": " + str3;
    }
}
