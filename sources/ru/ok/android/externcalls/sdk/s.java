package ru.ok.android.externcalls.sdk;

import java.util.Collection;

public final /* synthetic */ class s implements rj3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ m56 d;
    public final /* synthetic */ m56 e;

    public /* synthetic */ s(ConversationImpl conversationImpl, Boolean bool, boolean z, m56 m56, m56 m562) {
        this.a = conversationImpl;
        this.b = bool;
        this.c = z;
        this.d = m56;
        this.e = m562;
    }

    public final void accept(Object obj) {
        this.a.lambda$addParticipants$30(this.b, this.c, this.d, this.e, (Collection) obj);
    }
}
