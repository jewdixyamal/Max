package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class k implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ k(rj3 rj3, int i) {
        this.a = i;
        this.b = rj3;
    }

    public final void j(JSONObject jSONObject) {
        int i = this.a;
        rj3 rj3 = this.b;
        switch (i) {
            case 0:
                ConversationImpl.lambda$addParticipant$25(rj3, jSONObject);
                return;
            case 1:
                ConversationImpl.lambda$setCallOptionEnabled$24(rj3, jSONObject);
                return;
            default:
                ConversationImpl.lambda$addParticipant$27(rj3, jSONObject);
                return;
        }
    }
}
