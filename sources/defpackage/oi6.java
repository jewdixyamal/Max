package defpackage;

import android.view.View;

/* renamed from: oi6  reason: default package */
public interface oi6 {
    int a();

    void b(View view) {
        Object obj;
        try {
            obj = Boolean.valueOf(pag.F(view, this));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj2;
        }
        Boolean bool = (Boolean) obj;
    }
}
