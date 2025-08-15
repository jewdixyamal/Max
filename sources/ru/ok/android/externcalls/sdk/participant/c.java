package ru.ok.android.externcalls.sdk.participant;

import org.json.JSONObject;

public final /* synthetic */ class c implements qod {
    public final /* synthetic */ AddParticipantsCommands a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ c(AddParticipantsCommands addParticipantsCommands, m56 m56, m56 m562) {
        this.a = addParticipantsCommands;
        this.b = m56;
        this.c = m562;
    }

    public final void j(JSONObject jSONObject) {
        AddParticipantsCommands$addParticipants$1.invoke$lambda$4(this.a, this.b, this.c, jSONObject);
    }
}
