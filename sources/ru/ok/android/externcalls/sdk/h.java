package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class h implements qj3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ rj3 b;
    public final /* synthetic */ rj3 c;

    public /* synthetic */ h(ConversationImpl conversationImpl, rj3 rj3, rj3 rj32) {
        this.a = conversationImpl;
        this.b = rj3;
        this.c = rj32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepareJoinByLink$9(this.b, this.c, (Prepare.PrepareResult) obj);
    }
}
