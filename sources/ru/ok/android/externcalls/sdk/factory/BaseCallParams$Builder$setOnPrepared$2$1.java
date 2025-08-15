package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class BaseCallParams$Builder$setOnPrepared$2$1 extends p66 implements m56 {
    public BaseCallParams$Builder$setOnPrepared$2$1(Object obj) {
        super(1, 0, rj3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Conversation) obj);
        return e5f.a;
    }

    public final void invoke(Conversation conversation) {
        ((rj3) this.receiver).accept(conversation);
    }
}
