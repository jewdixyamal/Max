package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* renamed from: x31  reason: default package */
public final /* synthetic */ class x31 implements m56 {
    public final /* synthetic */ a41 X;
    public final /* synthetic */ m56 Y;
    public final /* synthetic */ m56 Z;
    public final /* synthetic */ zm1 a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ lyd o;

    public /* synthetic */ x31(zm1 zm1, JSONObject jSONObject, long j, lyd lyd, a41 a41, lr1 lr1, f fVar) {
        this.a = zm1;
        this.b = jSONObject;
        this.c = j;
        this.o = lyd;
        this.X = a41;
        this.Y = lr1;
        this.Z = fVar;
    }

    public final Object invoke(Object obj) {
        return (StartCallParams) ((StartCallParams.Builder) obj).setOpponentId(mqa.c(this.a.d)).setPayload(this.b.toString()).setWatchTogetherEnabledForAll(false).setMyId(mqa.c(this.c)).setStartWithVideo(this.o.b).setEventListener((ConversationEventsListener) (os1) this.X.b.getValue()).setOnPrepared(this.Y).setOnError(this.Z).build();
    }
}
