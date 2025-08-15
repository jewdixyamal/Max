package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;

/* renamed from: w31  reason: default package */
public final /* synthetic */ class w31 implements m56 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ m56 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lyd c;
    public final /* synthetic */ a41 o;

    public /* synthetic */ w31(Object obj, long j, lyd lyd, a41 a41, lr1 lr1, f fVar, int i) {
        this.a = i;
        this.Z = obj;
        this.b = j;
        this.c = lyd;
        this.o = a41;
        this.X = lr1;
        this.Y = fVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (CreateConfParams) ((CreateConfParams.Builder) obj).setPayload(((JSONObject) this.Z).toString()).setMyId(mqa.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) (os1) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
            default:
                return (JoinByLinkParams) ((JoinByLinkParams.Builder) obj).setLink((String) this.Z).setMyId(mqa.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) (os1) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
        }
    }
}
