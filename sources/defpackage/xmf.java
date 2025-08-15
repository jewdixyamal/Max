package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: xmf  reason: default package */
public final class xmf implements OnReceiveContentListener {
    public final v3a a;

    public xmf(v3a v3a) {
        this.a = v3a;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        bt3 bt3 = new bt3(new wd6(contentInfo));
        bt3 a2 = this.a.a(view, bt3);
        if (a2 == null) {
            return null;
        }
        if (a2 == bt3) {
            return contentInfo;
        }
        ContentInfo p = a2.a.p();
        Objects.requireNonNull(p);
        return m30.m(p);
    }
}
