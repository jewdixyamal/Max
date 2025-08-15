package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;

public final /* synthetic */ class g implements qod {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ Conversation.ChatHistoryCallback b;

    public /* synthetic */ g(ConversationImpl conversationImpl, Conversation.ChatHistoryCallback chatHistoryCallback) {
        this.a = conversationImpl;
        this.b = chatHistoryCallback;
    }

    public final void j(JSONObject jSONObject) {
        this.a.lambda$queryChatHistory$38(this.b, jSONObject);
    }
}
