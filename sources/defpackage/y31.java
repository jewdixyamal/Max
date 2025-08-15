package defpackage;

import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* renamed from: y31  reason: default package */
public final /* synthetic */ class y31 implements m56 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ lk a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a41 c;
    public final /* synthetic */ m56 o;

    public /* synthetic */ y31(lk lkVar, long j, a41 a41, lr1 lr1, f fVar) {
        this.a = lkVar;
        this.b = j;
        this.c = a41;
        this.o = lr1;
        this.X = fVar;
    }

    public final Object invoke(Object obj) {
        lk lkVar = this.a;
        AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj).setOpponentId(mqa.c(lkVar.a));
        String str = lkVar.c;
        if (str != null) {
            opponentId.setConversationParams(str);
        }
        return (AnswerCallParams) opponentId.setConversationId(lkVar.b).setMyId(mqa.c(this.b)).setEventListener((ConversationEventsListener) (os1) this.c.b.getValue()).setOnPrepared(this.o).setOnError(this.X).build();
    }
}
