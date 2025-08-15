package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: iu6  reason: default package */
public final class iu6 {
    public final p7b a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public iu6(p7b p7b, je7 je7, je7 je72, je7 je73) {
        this.a = p7b;
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    public static String a(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        String queryParameter = uri.getQueryParameter("bid");
        String queryParameter2 = uri.getQueryParameter("t");
        return (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) ? uri.toString() : rh4.k("ok-image-cache:bid=", queryParameter, "&t=", queryParameter2);
    }
}
