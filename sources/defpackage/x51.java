package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: x51  reason: default package */
public final class x51 extends hqd {
    public final /* synthetic */ int F0 = 2;
    public final Object G0;

    public x51(v51 v51) {
        super(v51);
        this.G0 = v51;
    }

    public final void A(ol7 ol7) {
        List list;
        switch (this.F0) {
            case 0:
                ((v51) this.G0).setLabel(((u51) ol7).b);
                return;
            case 1:
                qv5 qv5 = (qv5) ol7;
                View view = this.a;
                kv5 kv5 = view instanceof kv5 ? (kv5) view : null;
                if (kv5 != null) {
                    kv5.setIcon(woc.A0);
                    kv5.setTitle(new eqe(j0c.chats_list_empty_state_title));
                    kv5.x(kv5.getContext().getString(j0c.chats_list_empty_state_action), new c5(29, (Object) this));
                    return;
                }
                return;
            default:
                qv5 qv52 = (qv5) ol7;
                View view2 = this.a;
                wv5 wv5 = null;
                uv5 uv5 = view2 instanceof uv5 ? (uv5) view2 : null;
                if (uv5 != null) {
                    if (qv52 instanceof wv5) {
                        wv5 = (wv5) qv52;
                    }
                    if (wv5 != null && (list = wv5.a) != null) {
                        uv5.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        uv5.V1.E(list);
                        uv5.setListener((sv5) this.G0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x51(Context context, ExecutorService executorService, v02 v02) {
        super(new uv5(context, executorService));
        this.G0 = v02;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x51(android.content.Context r3, defpackage.ox2 r4) {
        /*
            r2 = this;
            r0 = 1
            r2.F0 = r0
            kv5 r0 = new kv5
            r1 = 0
            r0.<init>(r3, r1)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r3.<init>(r1, r1)
            r0.setLayoutParams(r3)
            r2.<init>(r0)
            r2.G0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x51.<init>(android.content.Context, ox2):void");
    }
}
