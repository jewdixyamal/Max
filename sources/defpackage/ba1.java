package defpackage;

import android.content.Context;
import android.graphics.PointF;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: ba1  reason: default package */
public final class ba1 implements aa1, um1 {
    public final je7 a;
    public final PointF b;
    public final je7 c;

    public ba1(je7 je7, je7 je72) {
        this.a = je7;
        this.c = tu0.r(3, new z30(2, je7));
        ((os1) je72.getValue()).d(this);
        this.b = dy7.y((Context) je7.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        PointF y = dy7.y((Context) this.a.getValue());
        PointF pointF = this.b;
        pointF.x = y.x;
        pointF.y = y.y;
    }
}
