package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class m implements qod {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ oy0 c;
    public final /* synthetic */ rj3 o;

    public /* synthetic */ m(ConversationImpl conversationImpl, boolean z, oy0 oy0, rj3 rj3) {
        this.a = conversationImpl;
        this.b = z;
        this.c = oy0;
        this.o = rj3;
    }

    public final void j(JSONObject jSONObject) {
        this.a.lambda$setCallOptionEnabled$23(this.b, this.c, this.o, jSONObject);
    }
}
