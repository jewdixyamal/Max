package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: h5  reason: default package */
public final class h5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;

    public h5(Rect rect) {
        this.a = rect;
    }

    public final void onMapSharedElements(List list, Map map) {
        Rect rect;
        if (map != null && (rect = this.a) != null) {
            for (View s : map.values()) {
                j47.s(rect, s);
            }
        }
    }
}
