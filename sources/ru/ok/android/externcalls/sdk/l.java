package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class l implements qj3 {
    public final /* synthetic */ rj3 X;
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rj3 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ l(ConversationImpl conversationImpl, boolean z, rj3 rj3, boolean z2, rj3 rj32) {
        this.a = conversationImpl;
        this.b = z;
        this.c = rj3;
        this.o = z2;
        this.X = rj32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepare$7(this.b, this.c, this.o, this.X, (Prepare.PrepareResult) obj);
    }
}
