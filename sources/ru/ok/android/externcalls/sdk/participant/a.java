package ru.ok.android.externcalls.sdk.participant;

import org.json.JSONObject;

public final /* synthetic */ class a implements qod {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ a(Runnable runnable) {
        this.a = runnable;
    }

    public final void j(JSONObject jSONObject) {
        AddParticipantsCommands$addParticipantByLink$2.invoke$lambda$0(this.a, jSONObject);
    }
}
