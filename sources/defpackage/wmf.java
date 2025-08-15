package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: wmf  reason: default package */
public abstract class wmf {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bt3 b(View view, bt3 bt3) {
        ContentInfo p = bt3.a.p();
        Objects.requireNonNull(p);
        ContentInfo m = m30.m(p);
        ContentInfo performReceiveContent = view.performReceiveContent(m);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m ? bt3 : new bt3(new wd6(performReceiveContent));
    }

    public static void c(View view, String[] strArr, v3a v3a) {
        if (v3a == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new xmf(v3a));
        }
    }
}
