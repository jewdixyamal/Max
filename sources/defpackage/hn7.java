package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: hn7  reason: default package */
public final /* synthetic */ class hn7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveLocationWorker b;

    public /* synthetic */ hn7(LiveLocationWorker liveLocationWorker, int i) {
        this.a = i;
        this.b = liveLocationWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1));
            case 1:
                return (gn7) ((jyc) this.b.getTamComponent()).getAccessor().c(gn7.class);
            default:
                return (cn7) ((jyc) this.b.getTamComponent()).getAccessor().c(cn7.class);
        }
    }
}
