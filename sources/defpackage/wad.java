package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* renamed from: wad  reason: default package */
public final /* synthetic */ class wad implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ wad(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, m56 m56, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = m56;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$3(this.b, this.c, jSONObject);
                return;
            case 1:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
