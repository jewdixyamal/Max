package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: z5  reason: default package */
public final class z5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ ActLocalMedias b;

    public z5(ActLocalMedias actLocalMedias, Rect rect) {
        this.b = actLocalMedias;
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

    public final void onRejectSharedElements(List list) {
        if (list != null && !list.isEmpty()) {
            this.b.c1.postDelayed(new b(4, (Object) this), 100);
        }
    }
}
