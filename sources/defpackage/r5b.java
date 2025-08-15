package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: r5b  reason: default package */
public abstract class r5b {
    public static final int a = exb.pooling_container_listener_holder_tag;
    public static final int b = exb.is_pooling_container_tag;

    public static final void a(View view) {
        f6d u = m6d.u((a66) lz7.m(view).b);
        while (u.hasNext()) {
            View view2 = (View) u.next();
            int i = a;
            s5b s5b = (s5b) view2.getTag(i);
            if (s5b == null) {
                s5b = new s5b();
                view2.setTag(i, s5b);
            }
            ArrayList arrayList = s5b.a;
            int L = y53.L(arrayList);
            if (-1 < L) {
                au1.r(arrayList.get(L));
                throw null;
            }
        }
    }
}
