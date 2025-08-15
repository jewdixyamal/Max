package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* renamed from: uad  reason: default package */
public final /* synthetic */ class uad implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ uad(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = m56;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$7(this.b, this.c, jSONObject);
                return;
        }
    }
}
