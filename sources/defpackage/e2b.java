package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import java.util.Set;

/* renamed from: e2b  reason: default package */
public final class e2b extends n0 {
    public final iv6 p;
    public final ty2 q;
    public ImagePerfDataListener r;

    public e2b(Context context, ty2 ty2, iv6 iv6, Set set, Set set2) {
        super(context, set, set2);
        this.p = iv6;
        this.q = ty2;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            this.e = null;
            return;
        }
        xv6 d = xv6.d(uri);
        d.e = anc.c;
        this.e = d.a();
    }
}
