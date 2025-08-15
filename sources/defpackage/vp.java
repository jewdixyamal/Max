package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: vp  reason: default package */
public final /* synthetic */ class vp implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ vp(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                if (((sp) obj).a == 2) {
                    str = "https://play.google.com/store/apps/details?id=ru.oneme.app";
                } else {
                    up.a.getClass();
                    str = tp.b;
                }
                nd7.A(this.b, str);
                return e5f.a;
            default:
                return Boolean.valueOf(((WeakReference) obj).get() == this.b);
        }
    }
}
